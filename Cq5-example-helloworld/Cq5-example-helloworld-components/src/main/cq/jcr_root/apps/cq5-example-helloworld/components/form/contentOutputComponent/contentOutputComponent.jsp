<%@include file="/libs/foundation/global.jsp" %>
<%%>
<%@page import="pl.kwi.services.IResourceService" %>
<%%>
<c:set var="name" value="<%=request.getParameter("name")%>"/>
<%%>
<sling:defineObjects />
<% IResourceService resourceService =   sling.getService(IResourceService.class);%> 
<c:set var="helloWorldText" value="<%= resourceService.getResPropWithDefaultValue(resource, "helloWorldText", "Hello World")%>"/>


<div class="content">
	<div class="contentElement">
		<div>&nbsp;</div>
		<div class="text" id="textHelloWorld"> ${helloWorldText} <b id="name">${name}</b> </div>
		<div>&nbsp;</div>
	</div>	
</div>

