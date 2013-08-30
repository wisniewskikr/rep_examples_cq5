<%@include file="/libs/foundation/global.jsp" %>
<%%>
<%@page import="pl.kwi.utils.ResourceUtil" %>
<%%>
<c:set var="pageTitle" value="<%= ResourceUtil.getResPropWithDefaultValue(resource, "pageTitle", "Hello World") %>"/>


<div class="title"><h2 id="title">${pageTitle}</h2></div>

