<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<html>
<head>
<sj:head />
<jsp:include page="../body/menu.jsp"></jsp:include>
</head>

<body>

	<div
		class="container col-xs-12 col-sm-offset-2 col-sm-8 col-md-offset-3 col-md-6 col-lg-offset-4 col-lg-4">
		<br />
		<div class="login-panel panel panel-default">
			<div class="panel-heading">
				<h3 class="panel-title">Edit Task</h3>
			</div>
			<div class="panel-body">
				<s:form action="edittaskprocess" role="from" theme="bootstrap">
					<fieldset>

						<s:textfield name="id" label="ID" size="20" />
						<s:textfield name="title" label="Title" size="20" />
						<s:textarea name="describe" label="Describe" cols="40" rows="10" />
						<sj:datepicker name="date" label="Data:" value="%{datee}"
							timepicker="true" datepicker="false" timepickerAaPm="true"
							minDate="dateToday" minTime="timeToday" />
						<button type="submit" class="btn btn-default">Save Task</button>

					</fieldset>
				</s:form>
			</div>
		</div>
	</div>
</body>
</html>