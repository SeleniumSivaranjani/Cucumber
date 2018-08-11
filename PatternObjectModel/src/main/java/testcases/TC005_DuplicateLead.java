package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC005_DuplicateLead extends ProjectMethods{	

	@BeforeTest
	public void setData() {
		browserName = "chrome";
		testCaseName = "TC005";
		testDescription = "DuplicateLead";
		testNodes = "DuplicateLead";
		category = "smoke";
		authors = "sivaranjani";
		dataSheetName  = "TC005_DuplicateLead";

	}

	@Test(dataProvider="fetchData")
	public void editLead(String uName,String pwd,String fName) {
		new LoginPage()
		.typeUserName(uName)
		.typePassword(pwd)
		.clickLogin()
		.clickCRMSFA()
		.clickLead()
		.clickFindLeads()
		.typeFirstName(fName)
		.clickFindLeadButton()
		.clickFirstRecord()
		.clickDuplicate()
		.clickCreateLead();
	}
}
