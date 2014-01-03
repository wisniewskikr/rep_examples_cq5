<%@include file="/libs/foundation/global.jsp" %>
<%%>
<c:set var="textPage" value="<%= currentNode.getProperty("textPage").getString() %>"/>
<c:set var="textInput" value="<%= currentNode.getProperty("textInput").getString() %>"/>



<div class="subtitle"><h3 id="subtitle">${textPage}: <b>${textInput}</b></h3></div>