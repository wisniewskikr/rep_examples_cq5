<%@include file="/libs/foundation/global.jsp" %>
<%%>
<%@page import="pl.kwi.services.intf.IResourceService" %>
<%%>
<sling:defineObjects />
<% IResourceService resourceService =   sling.getService(IResourceService.class);%>
<c:set var="pageTitle" value="<%= resourceService.getResPropWithDefaultValue(resource, "pageTitle", "Hello World")%>"/>


<div class="title"><h2 id="title">${pageTitle}</h2></div>

