<%@include file="/libs/foundation/global.jsp" %>
<%%>
<%@taglib prefix="sling2" uri="http://sling.apache.org/taglibs/sling" %>
<sling2:adaptTo adaptable="${slingRequest}" adaptTo="pl.kwi.model.input.form.InputContentModel" var="model"/>



<div class="content">

	<input type="hidden" id="currentPagePath" name="currentPagePath" value="${model.currentPagePath}"/>

	<div class="contentElementInput">
		<div class="text">
			${model.textName} * 
			<c:if test="${model.errorField == 'name'}"><span class="error" id="nameErrorMessage">${model.nameErrorMessage}</span></c:if>
		</div>
		<div class="input"><input type="text" id="name" name="name"/></div>
		<div class="description" id="nameDescription">${model.nameDescription}</div>
	</div>
	
</div>