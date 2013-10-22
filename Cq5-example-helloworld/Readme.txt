CQ5 AND EXAMPLE HELLO WORLD





DESCRIPTION
===========


This is Hello World project for CQ. This project consists of two pages:
- input page		: user types here his name;
- output page		: text "Hello World <user_name>" is displayed here.

This project shows additionally:
- validation		: user can not send empty name;
- java script		: hints/titles for buttons are handled by jquery

This project can be deployed in two different ways. These ways are:
- Default Content	: already existing default content of project will be deployed on CQ servers here.
					  This is described in section "Deployment of Default Content";
- User Own Content	: here user has to first deploy components on CQ servers and then build his
					  own content from these components. This is described in section "Deployment
					  of User Own Content".

Recommended deployment of project:
----------------------
- on Author server
  mvn clean install crx:install -Pauthor,full
- on Publish server
  mvn clean install crx:install -Ppublish,full 
  
Recommended usage of project:
-----------------
- English language: 
  http://localhost:4503/cq5-example-helloworld/en
- Polish language:
  http://localhost:4503/cq5-example-helloworld/pl   





CONFIGURATION
=============


All flexible configuration of project (server`s urls, logins, passwords etc.) can be changed in file:
<project_home>/project.properties





DEPLOYMENT OF DEFAULT CONTENT
=============================


After launching CQ servers and adjusting configuration file "project.properties" user can deploy 
default content of project using following maven commands:
- on Author server 
  mvn clean install crx:install -Pauthor,content
- on Publish server
  mvn clean install crx:install -Ppublish,content
  
To use this project see section "Usage".
  

  
  

DEPLOYMENT OF USER OWN CONTENT
==============================


After launching CQ servers and adjusting configuration file "project.properties" user can deploy 
his own content by following steps:

Step 1. Deployment of components
--------------------------------

User can deploy project components using following maven command:
- on Author server 
  mvn clean install crx:install -Pauthor,components
- on Publish server
  mvn clean install crx:install -Ppublish,components
  
Step 2. Creation of user own content
------------------------------------           	

After deployment components on Author CQ server user can build his own content using following 
project elements:
 
Templates:
- Hello World - Redirect Template		: template for pages which should not be displayed
										  but are only part of tree. These pages should redirect to 
										  other pages. For instance: pl, en etc.
- Hello World - Page Template			: template for Hello World pages. Here components can be added.


Components:
All components are in group "Hello World". User can choose here following components:
- Form									: this if component with form of Hello World. This form is valid
										  for Input and for Output. User should put all others components
										  inside this form.
										  In this form user should choose Edit -> Advanced and then:
										  * Action Type: "Hello World Input Action" or "Hello World Output Action"
										  * Action Configuration: location of input or output page
- Title									: component with title of page. English template is: "Hello World".
- Subtitle								: component with subtitle of page. English template is: "Page: Input/Output"
- Content Input							: component with content of input page. This content contains field where
										  user can type his/her name, error message and field description; 
- Content Output						: component with content of output page. User`s name is displayed after
										  text "Hello World";
- Submit button							: component with submit button. User can set here also hint/title of this
										  button.

Step 3. Replication content on Publish server
---------------------------------------------

After creating his own content on Author server user has to replicate his changes to Publish
server (link "Replication").

Step 4. Usage
-------------

To use this project see section "Usage".
										  




USAGE
=====


After deployment user can work with this project using following links:

- Author Server:
  -------------
http://localhost:4502/cf#/content/cq5-example-helloworld/en/input.html
http://localhost:4502/cf#/content/cq5-example-helloworld/en/output.html
or
http://localhost:4502/cf#/content/cq5-example-helloworld/pl/wejscie.html
http://localhost:4502/cf#/content/cq5-example-helloworld/pl/wyjscie.html

- Publish Server:
  --------------
http://localhost:4503/content/cq5-example-helloworld/en/input.html
http://localhost:4503/content/cq5-example-helloworld/en/output.html
or
http://localhost:4503/content/cq5-example-helloworld/pl/wejscie.html
http://localhost:4503/content/cq5-example-helloworld/pl/wyjscie.html





MAPPING
=======


CQ mapping enables using shorter path in browser. It should be used only on Publish server.

To deploy mapping on Publish server user can use following maven command:
	mvn clean install -Ppublish,mapping
and then he can use shorter project paths:
	http://localhost:4503/cq5-example-helloworld
or
	http://localhost:4503/cq5-example-helloworld/en
or
	http://localhost:4503/cq5-example-helloworld/pl	
									  