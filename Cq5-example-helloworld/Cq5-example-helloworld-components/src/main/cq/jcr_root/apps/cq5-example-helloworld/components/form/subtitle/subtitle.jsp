<%@include file="/libs/foundation/global.jsp" %>
<%%>
<%@page import="pl.kwi.services.intf.IResourceService" %>
<%%>
<sling:defineObjects />
<% IResourceService resourceService = sling.getService(IResourceService.class);%> 
<c:set var="textPage" value="<%= resourceService.getResourceProperty(resource, "textPage")%>"/>
<c:set var="pageName" value="<%= resourceService.getResourceProperty(resource, "pageName")%>"/>


<div class="subtitle"><h3 id="subtitle">${textPage}: <b>${pageName}</b></h3></div>

