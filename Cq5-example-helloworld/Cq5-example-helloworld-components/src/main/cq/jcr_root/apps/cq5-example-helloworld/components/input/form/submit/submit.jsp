<%@include file="/libs/foundation/global.jsp" %>
<%%>
<c:set var="textSubmit" value="<%= properties.get("textSubmit") %>"/>
<c:set var="submitHint" value="<%= properties.get("submitHint") %>"/>



<div class="buttons">
	<input type="submit" id="submit" name="submit" value="${textSubmit}" title="${submitHint}"/>
</div>