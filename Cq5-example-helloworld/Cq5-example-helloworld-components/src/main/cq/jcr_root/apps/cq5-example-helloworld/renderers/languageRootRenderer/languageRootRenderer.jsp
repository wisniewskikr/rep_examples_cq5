<%@include file="/libs/foundation/global.jsp"%>
<%%>
<%@page session="false" contentType="text/html; charset=utf-8" %>
<%%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html>


<head>
	<title>Hello World</title>
	<cq:includeClientLib js="myproject.all" />
	<cq:includeClientLib css="myproject.all" />
</head>
<cq:include script="head.jsp"/>


<body>
	<div class="page">
		Template of page which should be language root in Hello World project. Example language root names: 'en', 'de', 'pl' etc.
	</div>		
</body>

</html>



