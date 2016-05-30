<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"
	integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7"
	crossorigin="anonymous">
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"
	integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS"
	crossorigin="anonymous"></script>

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
				<h3 class="panel-title">Add new task</h3>
			</div>
			<div class="panel-body">
				<s:form action="addtaskprocess" role="from" theme="bootstrap">
					<fieldset>
						<div class="form-group">
							<input class="form-control input-lg" type="text"
								placeholder="Title" name="title">
						</div>
						<div class="form-group">
							<textarea name="describe" placeholder="Describe"
								class="form-control" rows="5"></textarea>
						</div>

						<div class="form-group">
							<sj:datepicker name="date" timepicker="true" datepicker="false"
								placeholder="Date" class="form-control input-lg"
								timepickerAaPm="true" minDate="dateToday" minTime="timeToday" />
						</div>
						<button type="submit" class="btn btn-default">Dodaj
							Zadanie</button>
					</fieldset>
				</s:form>
			</div>
		</div>
	</div>


</body>
</html>