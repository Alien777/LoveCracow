<jsp:include page="../index.jsp"></jsp:include>
<hr />
<%@ taglib uri="/struts-tags" prefix="s"%>
<s:form action="registryprocess">
	<s:textfield name="userName" label="Name"></s:textfield>
	<s:textfield name="userMail" label="Mail"></s:textfield>
	<s:password name="userPass" label="Password"></s:password>
	<s:submit value="registry"></s:submit>
</s:form>