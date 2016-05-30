<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"
	integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7"
	crossorigin="anonymous">
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"
	integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS"
	crossorigin="anonymous"></script>
<div class="alert alert-success" role="alert">
	Poprawnie wyswietlone zostaly zadania<a class="alert-link"></a>
</div>
<jsp:include page="showtasks.jsp"></jsp:include>
<%@ taglib prefix="s" uri="/struts-tags"%>

<table class="table table-striped">
	<thead>
		<tr>
			<th>Title</th>
			<th>Description</th>
			<th>Date</th>
			<th>Option</th>
		</tr>
	</thead>
	<tbody>
		<s:iterator value="list">
			<tr>
				<td><s:property value="title" /></td>
				<td><s:property value="description" /></td>
				<td><s:property value="date" /></td>
				<td><s:url id="deletetask" action="deletetask.action">
						<s:param name="id">
							<s:property value="id" />
						</s:param>
					</s:url> <s:a href="%{deletetask}">delete</s:a> <s:url id="edittask"
						action="edittask.action">
						<s:param name="id">
							<s:property value="id" />
						</s:param>
					</s:url> <s:a href="%{edittask}">edit</s:a></td>
			</tr>
		</s:iterator>
	</tbody>
</table>


