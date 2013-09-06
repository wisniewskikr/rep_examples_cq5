CQ5 AND EXAMPLE HELLO WORLD





DESCRIPTION
===========


This is Hello World project for CQ. This project consists of two pages:
- input page: user types here his name;
- output page: text "Hello World <user_name>" is displayed here.

This project shows additionally:
- validation: user can not send empty name;
- java script: hints/titles for buttons are handled by jquery





CONFIGURATION
=============


All flexible configuration of project (server`s urls, logins, passwords etc.) can be changed in file:
<project_home>/project.properties





DEPLOYMENT
==========


User can deploy project using following maven commands:
- Author
  ------	
* mvn clean install crx:install -Pauthor,components		: installing components on author server
* mvn clean install crx:install -Pauthor,content		: installing content on author server 
														  (components are installed automatically)
- Publish
  -------
* mvn clean install crx:install -publish,components		: installing components on publish server
* mvn clean install crx:install -Ppublish,content		: installing content on publish server 
														  (components are installed automatically)

Deployment Template
Template of maven command looks like:

mvn clean install crx:install -P<location_profile>,<action_profile>
-------------------------------------------------------------------

Location profiles:
- author				: indicates author server as location
- publish				: indicates publish server as location


Action profiles:
- components			: deploys components
- content				: deploys content





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
http://localhost:4503/content/cq5-example-helloworld.html





CONTENT MANUALLY
================


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