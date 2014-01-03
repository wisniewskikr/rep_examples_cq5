<%@include file="/libs/foundation/global.jsp" %>
<%%>
<c:set var="textPage" value="<%= currentNode.getProperty("textPage").getString() %>"/>
<c:set var="pageName" value="<%= currentNode.getProperty("pageName").getString() %>"/>



<div class="subtitle"><h3 id="subtitle">${textPage}: <b>${pageName}</b></h3></div>