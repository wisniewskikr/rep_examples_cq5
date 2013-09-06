<%@include file="/libs/foundation/global.jsp" %>
<%%>
<%@page import="pl.kwi.services.intf.IResourceService" %>
<%%>
<sling:defineObjects />
<% IResourceService resourceService = sling.getService(IResourceService.class);%> 
<c:set var="submitText" value="<%= resourceService.getResPropWithDefaultValue(resource, "submitText", "Submit") %>"/>
<c:set var="submitHint" value="<%= resourceService.getResPropWithDefaultValue(resource, "submitHint", "Submit button hint") %>"/>


<div class="buttons">
	<input type="submit" id="submit" name="submit" value="${submitText}" title="${submitHint}"/>
</div>

