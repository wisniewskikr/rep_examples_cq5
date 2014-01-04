<%@include file="/libs/foundation/global.jsp" %>
<%%>
<c:set var="textHelloWorld" value="<%= currentNode.getProperty("textHelloWorld").getString() %>"/>



<div class="title"><h2 id="title">${textHelloWorld}</h2></div>