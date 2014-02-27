<%@include file="/libs/foundation/global.jsp" %>
<%%>
<%@taglib prefix="sling2" uri="http://sling.apache.org/taglibs/sling" %>
<sling2:adaptTo adaptable="${resource}" adaptTo="pl.kwi.model.output.OutputContentModel" var="model"/>

<c:set var="name" value="<%=request.getParameter("name")%>"/>



<div class="content">
	<div class="contentElementOutput">
		<div>&nbsp;</div>
		<div class="text" id="textHelloWorld"> ${model.textHelloWorld} <b id="name">${name}</b> </div>
	</div>	
</div>