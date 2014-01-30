<%@include file="/libs/foundation/global.jsp"%>
<%%>
<%@page session="false" contentType="text/html; charset=utf-8" %>
<%%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html>


<head>
	<title>Hello World - Output</title>
	<cq:includeClientLib js="myproject.all" />
	<cq:includeClientLib css="myproject.all" />
</head>
<cq:include script="head.jsp"/>


<body>
	<div class="page">
		<cq:include path="titleParsys" resourceType="cq5-example-helloworld/components/parsys/emptyTextParsys"/>
		<cq:include path="subtitleParsys" resourceType="cq5-example-helloworld/components/parsys/emptyTextParsys"/>
		<cq:include path="contentParsys" resourceType="cq5-example-helloworld/components/parsys/emptyTextParsys"/>
		<cq:include path="imageParsys" resourceType="cq5-example-helloworld/components/parsys/emptyTextParsys"/>
		<cq:include path="backParsys" resourceType="cq5-example-helloworld/components/parsys/emptyTextParsys"/>
	</div>		
</body>

</html>



