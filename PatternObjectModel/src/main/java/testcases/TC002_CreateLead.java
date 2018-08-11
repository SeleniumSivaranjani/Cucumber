package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC002_CreateLead extends ProjectMethods{	

	@BeforeTest
	public void setData() {
		browserName = "chrome";
		testCaseName = "TC002";
		testDescription = "CreateLead";
		testNodes = "MyHome";
		category = "smoke";
		authors = "sivaranjani";
		dataSheetName  = "TC002_CreateLead";

	}

	@Test(dataProvider="fetchData")
	public void createLead(String uName,String pwd,String cmpName, String fName, String lName) {
		new LoginPage()
		.typeUserName(uName)
		.typePassword(pwd)
		.clickLogin()
		.clickCRMSFA()
		.clickCreateLead()
		.typeCmpName(cmpName)
		.typeFirstName(fName)
		.typeLastName(lName)
		.clickCreateLead();	
	}
}
