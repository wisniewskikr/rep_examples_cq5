<%@page import="pl.kwi.services.impl.ResourceService"%>
<%@include file="/libs/foundation/global.jsp" %>
<%%>
<%@page import="pl.kwi.services.intf.IResourceService" %>
<%%>
<c:set var="currentPagePath" value="<%= currentPage.getPath() %>"/>
<c:set var="errorField" value="<%= request.getParameter("errorField") %>"/>
<%%>
<sling:defineObjects />
<% IResourceService resourceService =   sling.getService(IResourceService.class);%> 
<c:set var="nameText" value="<%= resourceService.getResourceProperty(resource, "nameText") %>"/>
<c:set var="nameErrorMessage" value="<%= resourceService.getResourceProperty(resource, "nameErrorMessage") %>"/>
<c:set var="nameDescription" value="<%= resourceService.getResourceProperty(resource, "nameDescription") %>"/>


<div class="content">

	<input type="hidden" id="currentPagePath" name="currentPagePath" value="${currentPagePath}"/>

	<div class="contentElement">
		<div class="text">
			${nameText} * 
			<c:if test="${errorField == 'name'}"><span class="error" id="nameErrorMessage">${nameErrorMessage}</span></c:if>
		</div>
		<div class="input"><input type="text" id="name" name="name"/></div>
		<div class="description" id="nameDescription">${nameDescription}</div>
	</div>
	
</div>

