#save the feature file with .feature extension
#Scenario is used when the data is hard coded
#Scenario outline is used when data is passed in run time
#Common steps are kept in Background
Feature: Deal with Leaf taps Login credentials

#Background: 
#	Given Launch the browser 
#	And load the URL 
#	And Set Implicit wait 
#	And Maximize the window 
@smoke @sanity	
Scenario Outline: Login Positive 
	And Enter the Username as <userName> 
	And Enter the Password as <passWord> 
	When Click the Login Button 
#	Then Close the browser 
	
	Examples: 
	#Examples are used to pass data in runtime
		|userName|passWord|
		|DemoSalesManager|crmsfa|
		|DemoCSR|crmsfa|
		
#@sanity		
#Scenario: Login Negative 
#	And Enter the Username as Sivaranjani 
#	And Enter the Password as Crmsfa 
#	When Click the Login Button 
#	But Close the browser
#for negative scenario use But, for positive scenario use And