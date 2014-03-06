<%@include file="/libs/foundation/global.jsp" %>
<%%>
<%@taglib prefix="sling2" uri="http://sling.apache.org/taglibs/sling" %>
<sling2:adaptTo adaptable="${slingRequest}" adaptTo="pl.kwi.model.output.OutputContentModel" var="model"/>



<div class="content">
	<div class="contentElementOutput">
		<div>&nbsp;</div>
		<div class="text" id="textHelloWorld"> ${model.textHelloWorld} <b id="name">${model.name}</b> </div>
	</div>	
</div>