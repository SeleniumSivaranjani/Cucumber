package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC004_DeleteLead extends ProjectMethods{	

	@BeforeTest
	public void setData() {
		browserName = "chrome";
		testCaseName = "TC004";
		testDescription = "DeleteLead";
		testNodes = "DeleteLead";
		category = "smoke";
		authors = "sivaranjani";
		dataSheetName  = "TC004_DeleteLead";

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
		.clickDelete();
	}
}
