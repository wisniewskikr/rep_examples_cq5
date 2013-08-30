<%@include file="/libs/foundation/global.jsp" %>
<%%>
<%@page import="pl.kwi.utils.ResourceUtil" %>
<%%>
<c:set var="submitText" value="<%= ResourceUtil.getResPropWithDefaultValue(resource, "submitText", "Submit") %>"/>
<c:set var="submitHint" value="<%= ResourceUtil.getResPropWithDefaultValue(resource, "submitHint", "Submit button hint") %>"/>


<div class="buttons">
	<input type="submit" id="submit" name="submit" value="${submitText}" title="${submitHint}"/>
</div>

