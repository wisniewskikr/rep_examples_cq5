<%@include file="/libs/foundation/global.jsp" %>
<%%>
<%@taglib prefix="sling2" uri="http://sling.apache.org/taglibs/sling" %>
<sling2:adaptTo adaptable="${resource}" adaptTo="pl.kwi.model.output.OutputBackModel" var="model"/>

<c:set var="backTarget" value="<%= resourceResolver.map(properties.get("backTarget", currentPage.getPath())) %>"/>
<c:set var="currentPath" value="<%= currentPage.getPath() %>"/>



<div class="buttons">
	<input type="button" onclick="goTo('${backTarget}');" id="back" name="back" value="${model.textBack}" title="${model.backHint}"/>
	
	<c:if test="${backTarget == currentPath}">
		<div class="errorMessages">
			Please fill mandatory field: Edit -> Back button -> Button 'Back' target 
		</div>
	</c:if>

</div>