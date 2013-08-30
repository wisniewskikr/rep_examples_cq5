<%@include file="/libs/foundation/global.jsp" %>
<%%>
<%@page import="pl.kwi.utils.ResourceUtil" %>
<%%>
<c:set var="textPage" value="<%= ResourceUtil.getResPropWithDefaultValue(resource, "textPage", "Page") %>"/>
<c:set var="pageName" value="<%= ResourceUtil.getResPropWithDefaultValue(resource, "pageName", "Page Name") %>"/>


<div class="subtitle"><h3 id="subtitle">${textPage}: <b>${pageName}</b></h3></div>

