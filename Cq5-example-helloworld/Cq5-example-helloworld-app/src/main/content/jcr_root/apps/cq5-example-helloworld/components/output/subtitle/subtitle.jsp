<%@include file="/libs/foundation/global.jsp" %>
<%%>
<%@taglib prefix="sling2" uri="http://sling.apache.org/taglibs/sling" %>
<sling2:adaptTo adaptable="${resource}" adaptTo="pl.kwi.model.output.OutputSubtitleModel" var="model"/>



<div class="subtitle"><h3 id="subtitle">${model.textPage}: <b>${model.textOutput}</b></h3></div>