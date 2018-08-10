#save the feature file with .feature extension
#Scenario is used when the data is hard coded
#Scenario outline is used when data is passed in run time
#Common steps are kept in Background
Feature: Create Lead in Leaf taps 
#Background is for specific feature file.@Before works for all the feature files.
#Background: # When using the common @Before in Hook(similar to project methods) , back ground shouldn't be used, so commented.
#	Given Launch the browser
#	And load the URL 
#	And Set Implicit wait 
#	And Maximize the window 

Scenario Outline: Create Lead
	And Enter the Username as <userName> 
	And Enter the Password as <passWord> 
	And Click the Login Button 
	And Click CRMSFA
 	And Click Create Lead
 	And Enter Company Name <cmpyName>
 	And Enter First Name <fName>
 	And Enter Last Name <lName>
	And Click Create Lead Button
	
	Examples: 
	#Examples are used to pass data in runtime
		|userName|passWord|cmpyName|fName|lName|
		|DemoSalesManager|crmsfa|CompanyNew|Sivaranjani|Selvaraj|
		|DemoCSR|crmsfa|Company2|Sivaranjani|S|
