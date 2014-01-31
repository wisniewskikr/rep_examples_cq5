<%@include file="/libs/foundation/global.jsp" %>
<%%>
<c:set var="fileReference" value="<%= properties.get("fileReference") %>"/>



<div class="helloImage">
	<c:choose>
		<c:when test="${not empty fileReference}">
			<img id="duke" alt="duke" src="${fileReference}">
		</c:when>
		<c:otherwise>
			<img id="duke" alt="duke" src="/libs/cq/ui/widgets/themes/default/placeholders/img.png">
		</c:otherwise>
	</c:choose>	
	
</div>