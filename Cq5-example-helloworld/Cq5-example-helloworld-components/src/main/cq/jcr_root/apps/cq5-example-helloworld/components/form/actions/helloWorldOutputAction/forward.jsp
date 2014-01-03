<%@include file="/libs/foundation/global.jsp"%>
<%%>
<%@page import="pl.kwi.actions.OutputAction"%>



<% OutputAction.handleAction(slingRequest, slingResponse, resource); %>