<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"
	integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7"
	crossorigin="anonymous">
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"
	integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS"
	crossorigin="anonymous"></script>
<jsp:include page="../menu.jsp"></jsp:include>
<%@ taglib uri="/struts-tags" prefix="s" %>
<div
	class="container col-xs-12 col-sm-offset-2 col-sm-8 col-md-offset-3 col-md-6 col-lg-offset-4 col-lg-4">
	<br />
	<div class="login-panel panel panel-default">
		<div class="panel-heading">
			<h3 class="panel-title">Sign In</h3>
		</div>
		<div class="panel-body">
			<s:form action="loginprocess" role="from">
				<fieldset>
					<div class="form-group">
						<input class="form-control input-lg" type="email"
							placeholder="Email" name="userMail">
					</div>
					<div class="form-group">
						<input class="form-control input-lg" type="password"
							name="userPass" placeholder="Password min 5 char">
					</div>
					<button type="submit" class="btn btn-default">Zaloguj</button>
				</fieldset>
			</s:form>
		</div>
	</div>
</div>



