<%@include file="/libs/foundation/global.jsp" %>
<%%>
<%@taglib prefix="sling2" uri="http://sling.apache.org/taglibs/sling" %>
<sling2:adaptTo adaptable="${resource}" adaptTo="pl.kwi.model.output.OutputImageModel" var="model"/>



<div class="helloImage">
	<c:choose>
		<c:when test="${not empty model.fileReference}">
			<img id="duke" alt="duke" src="${model.fileReference}">
		</c:when>
		<c:otherwise>
			<img id="duke" alt="duke" src="/apps/cq5-example-helloworld/components/output/image/duke.jpg">
		</c:otherwise>
	</c:choose>	
	
</div>