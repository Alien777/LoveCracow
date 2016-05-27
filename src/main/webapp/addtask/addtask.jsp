<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<html>
<head>
<title>Date Picker</title>

<sj:head />
<jsp:include page="../body/menu.jsp"></jsp:include>
</head>
<hr />

<body>
	<h3>Struts2 Date Picker example</h3>
	<s:form action="addtaskprocess" theme="xhtml">
		<s:textfield name="title" label="Title" size="20" />
		<s:textfield name="describe" label="Describe" size="20" />
		<sj:datepicker name="date" label="Data:" timepicker="true"
			datepicker="false" timepickerAaPm="true" minDate="dateToday"
			minTime="timeToday" />
		<s:submit value="newtask" name="newtask" />
	</s:form>
</body>
</html>