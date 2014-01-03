<%@include file="/libs/foundation/global.jsp" %>
<%%>
<c:set var="textSubmit" value="<%= currentNode.getProperty("textSubmit").getString() %>"/>
<c:set var="submitHint" value="<%= currentNode.getProperty("submitHint").getString() %>"/>



<div class="buttons">
	<input type="submit" id="submit" name="submit" value="${textSubmit}" title="${submitHint}"/>
</div>