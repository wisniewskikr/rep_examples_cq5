<%@page import="pl.kwi.actions.OutputAction"%>
<%@page session="false"%>
<%%>
<%@include file="/libs/foundation/global.jsp"%>
<%@taglib prefix="sling" uri="http://sling.apache.org/taglibs/sling/1.0" %>
<%%>

<sling:defineObjects/><%	
	new OutputAction().handleAction(slingRequest, slingResponse, resource);
%>
