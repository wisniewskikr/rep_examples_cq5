<%@include file="/libs/foundation/global.jsp" %>
<%%>
<c:set var="textBack" value="<%= properties.get("textBack") %>"/>
<c:set var="backHint" value="<%= properties.get("backHint") %>"/>
<c:set var="backTarget" value="<%= resourceResolver.map(properties.get("backTarget", currentPage.getPath())) %>"/>



<div class="buttons">
	<input type="button" onclick="goTo('${backTarget}');" id="back" name="back" value="${textBack}" title="${backHint}"/>
</div>