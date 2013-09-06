<%@include file="/libs/foundation/global.jsp" %>
<%%>
<%@page import="pl.kwi.services.intf.IResourceService" %>
<%%>
<sling:defineObjects />
<% IResourceService resourceService = sling.getService(IResourceService.class);%> 
<c:set var="submitText" value="<%= resourceService.getResourceProperty(resource, "submitText") %>"/>
<c:set var="submitHint" value="<%= resourceService.getResourceProperty(resource, "submitHint") %>"/>


<div class="buttons">
	<input type="submit" id="submit" name="submit" value="${submitText}" title="${submitHint}"/>
</div>

