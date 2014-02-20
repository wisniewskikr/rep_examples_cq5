<%@include file="/libs/foundation/global.jsp" %>
<%%>
<c:set var="fileReference" value="<%= properties.get("fileReference") %>"/>



<div class="helloImage">
	<c:choose>
		<c:when test="${not empty fileReference}">
			<img id="duke" alt="duke" src="${fileReference}">
		</c:when>
		<c:otherwise>
			<img id="duke" alt="duke" src="/apps/cq5-example-helloworld/components/output/image/duke.jpg">
		</c:otherwise>
	</c:choose>	
	
</div>