<%@include file="/libs/foundation/global.jsp" %>
<%%>
<%@taglib prefix="sling2" uri="http://sling.apache.org/taglibs/sling" %>
<sling2:adaptTo adaptable="${resource}" adaptTo="pl.kwi.model.output.OutputBackModel" var="model"/>



<div class="buttons">
	<input type="button" onclick="goTo('${model.backTarget}');" id="back" name="back" value="${model.textBack}" title="${model.backHint}"/>
	
	<c:if test="${model.backTargetEmpty}">
		<div class="errorMessages">
			Please fill mandatory field: Edit -> Back button -> Button 'Back' target 
		</div>
	</c:if>

</div>