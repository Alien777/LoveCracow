<jsp:include page="showtasks.jsp"></jsp:include>
<%@ taglib prefix="s" uri="/struts-tags"%>
<br />
<s:iterator value="list">

	<s:property value="title" />
	<s:property value="description" />
	<s:property value="date" />
	<s:url id="deletetask" action="deletetask.action">
		<s:param name="id">
			<s:property value="id" />
		</s:param>
	</s:url>
	<s:a href="%{deletetask}">delete</s:a>

	<s:url id="edittask" action="edittask.action">
		<s:param name="id">
			<s:property value="id" />
		</s:param>
	</s:url>
	<s:a href="%{edittask}">edit</s:a>

	<br />
</s:iterator>
