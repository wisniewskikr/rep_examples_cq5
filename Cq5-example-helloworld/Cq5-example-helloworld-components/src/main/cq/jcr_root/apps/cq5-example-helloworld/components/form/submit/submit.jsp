<%@include file="/libs/foundation/global.jsp" %>
<%%>
<c:set var="submitText" value="<%= currentNode.getProperty("submitText").getString() %>"/>
<c:set var="submitHint" value="<%= currentNode.getProperty("submitHint").getString() %>"/>



<div class="buttons">
	<input type="submit" id="submit" name="submit" value="${submitText}" title="${submitHint}"/>
</div>