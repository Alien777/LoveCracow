<jsp:include page="../index.jsp"></jsp:include>
<hr/>
<%@ taglib uri="/struts-tags" prefix="s" %>
<s:form action="loginprocess">
<s:textfield name="userMail" label="Mail"></s:textfield>
<s:password name="userPass" label="Password"></s:password>
<s:submit value="login"></s:submit>
</s:form>