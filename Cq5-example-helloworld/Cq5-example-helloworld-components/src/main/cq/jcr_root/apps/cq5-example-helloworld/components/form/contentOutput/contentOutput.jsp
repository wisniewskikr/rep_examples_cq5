<%@include file="/libs/foundation/global.jsp" %>
<%%>
<%@page import="pl.kwi.services.intf.IResourceService" %>
<%%>
<c:set var="name" value="<%=request.getParameter("name")%>"/>
<%%>
<sling:defineObjects />
<% IResourceService resourceService =   sling.getService(IResourceService.class);%> 
<c:set var="helloWorldText" value="<%= resourceService.getResourceProperty(resource, "helloWorldText")%>"/>


<div class="content">
	<div class="contentElement">
		<div>&nbsp;</div>
		<div class="text" id="textHelloWorld"> ${helloWorldText} <b id="name">${name}</b> </div>
		<div>&nbsp;</div>
	</div>	
</div>

