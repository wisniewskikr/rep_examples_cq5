<%@include file="/libs/foundation/global.jsp" %>
<%%>
<%@page import="pl.kwi.utils.ResourceUtil" %>
<%%>
<c:set var="name" value="<%= request.getParameter("name") %>"/>
<c:set var="helloWorldText" value="<%= ResourceUtil.getResPropWithDefaultValue(resource, "helloWorldText", "Hello World") %>"/>


<div class="content">
	<div class="contentElement">
		<div>&nbsp;</div>
		<div class="text" id="textHelloWorld"> ${helloWorldText} <b id="name">${name}</b> </div>
		<div>&nbsp;</div>
	</div>	
</div>

