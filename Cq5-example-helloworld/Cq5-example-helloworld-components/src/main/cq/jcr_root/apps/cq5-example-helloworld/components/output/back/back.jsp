<%@include file="/libs/foundation/global.jsp" %>
<%%>
<c:set var="textBack" value="<%= currentNode.getProperty("textBack").getString() %>"/>
<c:set var="backHint" value="<%= currentNode.getProperty("backHint").getString() %>"/>
<c:set var="backTarget" value="<%= properties.get("backTarget", currentPage.getPath()) %>"/>



<div class="buttons">
	<input type="button" onclick="goTo('${backTarget}');" id="back" name="back" value="${textBack}" title="${backHint}"/>
</div>