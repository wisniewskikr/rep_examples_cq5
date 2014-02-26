<%@include file="/libs/foundation/global.jsp" %>
<%%>
<%@taglib prefix="sling2" uri="http://sling.apache.org/taglibs/sling" %>
<sling2:adaptTo adaptable="${resource}" adaptTo="pl.kwi.model.input.form.InputSubmitModel" var="model"/>



<div class="buttons">
	<input type="submit" id="submit" name="submit" value="${model.textSubmit}" title="${model.submitHint}"/>
</div>