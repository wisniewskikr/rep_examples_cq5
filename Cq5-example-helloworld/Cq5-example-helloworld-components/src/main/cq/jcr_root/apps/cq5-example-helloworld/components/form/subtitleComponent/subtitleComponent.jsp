<%@include file="/libs/foundation/global.jsp" %>
<%%>
<%@page import="pl.kwi.services.IResourceService" %>
<%%>
<sling:defineObjects />
<% IResourceService resourceService = sling.getService(IResourceService.class);%> 
<c:set var="textPage" value="<%= resourceService.getResPropWithDefaultValue(resource, "textPage", "Page")%>"/>
<c:set var="pageName" value="<%= resourceService.getResPropWithDefaultValue(resource, "pageName", "Page Name")%>"/>


<div class="subtitle"><h3 id="subtitle">${textPage}: <b>${pageName}</b></h3></div>

