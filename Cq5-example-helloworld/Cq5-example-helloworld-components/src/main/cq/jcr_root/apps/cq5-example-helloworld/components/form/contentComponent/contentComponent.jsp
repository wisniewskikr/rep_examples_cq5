<%@include file="/libs/foundation/global.jsp" %>
<%%>
<%@page import="pl.kwi.utils.ResourceUtil" %>
<%%>
<c:set var="errorField" value="<%= request.getParameter("errorField") %>"/>
<c:set var="nameText" value="<%= ResourceUtil.getResPropWithDefaultValue(resource, "nameText", "Name") %>"/>
<c:set var="nameErrorMessage" value="<%= ResourceUtil.getResPropWithDefaultValue(resource, "nameErrorMessage", "Error Message") %>"/>
<c:set var="nameDescription" value="<%= ResourceUtil.getResPropWithDefaultValue(resource, "nameDescription", "Type your name here") %>"/>


<div class="content">
	<div class="contentElement">
		<div class="text">
			${nameText} * 
			<c:if test="${errorField == 'name'}"><span class="error" id="nameErrorMessage">${nameErrorMessage}</span></c:if>
		</div>
		<div class="input"><input type="text" id="name" name="name"/></div>
		<div class="description" id="nameDescription">${nameDescription}</div>
	</div>
	
</div>

