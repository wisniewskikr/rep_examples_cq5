<%@include file="/libs/foundation/global.jsp" %>
<%%>
<%@taglib prefix="sling2" uri="http://sling.apache.org/taglibs/sling" %>
<sling2:adaptTo adaptable="${resource}" adaptTo="pl.kwi.model.input.InputTitleModel" var="model"/>



<div class="title"><h2 id="title">${model.textHelloWorld}</h2></div>