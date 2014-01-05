<%@include file="/libs/foundation/global.jsp" %>
<%%>
<c:set var="name" value="<%=request.getParameter("name")%>"/>
<c:set var="textHelloWorld" value="<%= properties.get("textHelloWorld") %>"/>



<div class="content">
	<div class="contentElementOutput">
		<div>&nbsp;</div>
		<div class="text" id="textHelloWorld"> ${textHelloWorld} <b id="name">${name}</b> </div>
	</div>	
</div>