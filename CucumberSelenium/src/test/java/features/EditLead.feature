Feature: Create Lead in Leaf taps 

Scenario Outline: Edit Lead
	And Enter the Username as <userName> 
	And Enter the Password as <passWord> 
	And Click the Login Button 
	And Click CRMSFA
 	And Click Lead
 	And Click Find Leads
 	And Type First Name <fName>
 	And Click Find Leads Button
 	And Click the First Lead Id
 	And Click Edit
 	And Edit the First name <newFirstName>
 	And Click Update Button
 	
	
	Examples:
		|userName|passWord|fName|newFirstName|
		|DemoSalesManager|crmsfa|Sivaranjani|Siva|
		|DemoCSR|crmsfa|Sivaranjani|S|
