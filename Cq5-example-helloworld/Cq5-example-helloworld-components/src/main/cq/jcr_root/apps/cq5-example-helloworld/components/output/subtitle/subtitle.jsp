<%@include file="/libs/foundation/global.jsp" %>
<%%>
<c:set var="textPage" value="<%= currentNode.getProperty("textPage").getString() %>"/>
<c:set var="textOutput" value="<%= currentNode.getProperty("textOutput").getString() %>"/>



<div class="subtitle"><h3 id="subtitle">${textPage}: <b>${textOutput}</b></h3></div>