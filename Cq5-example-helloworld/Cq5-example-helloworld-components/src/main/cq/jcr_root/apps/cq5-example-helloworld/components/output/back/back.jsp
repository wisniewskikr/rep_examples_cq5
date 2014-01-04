<%@include file="/libs/foundation/global.jsp" %>
<%%>
<c:set var="textBack" value="<%= currentNode.getProperty("textBack").getString() %>"/>
<c:set var="backHint" value="<%= currentNode.getProperty("backHint").getString() %>"/>



<div class="buttons">
	<input type="button" id="back" name="back" value="${textBack}" title="${backHint}"/>
</div>