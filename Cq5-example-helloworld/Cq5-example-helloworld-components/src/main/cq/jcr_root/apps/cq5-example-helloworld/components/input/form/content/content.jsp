<%@include file="/libs/foundation/global.jsp" %>
<%%>
<c:set var="currentPagePath" value="<%= currentPage.getPath() %>"/>
<c:set var="errorField" value="<%= request.getParameter("errorField") %>"/>
<c:set var="textName" value="<%= currentNode.getProperty("textName").getString() %>"/>
<c:set var="nameErrorMessage" value="<%= currentNode.getProperty("nameErrorMessage").getString() %>"/>
<c:set var="nameDescription" value="<%= currentNode.getProperty("nameDescription").getString() %>"/>



<div class="content">

	<input type="hidden" id="currentPagePath" name="currentPagePath" value="${currentPagePath}"/>

	<div class="contentElement">
		<div class="text">
			${textName} * 
			<c:if test="${errorField == 'name'}"><span class="error" id="nameErrorMessage">${nameErrorMessage}</span></c:if>
		</div>
		<div class="input"><input type="text" id="name" name="name"/></div>
		<div class="description" id="nameDescription">${nameDescription}</div>
	</div>
	
</div>