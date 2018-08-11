package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_EditLead extends ProjectMethods{	

	@BeforeTest
	public void setData() {
		browserName = "chrome";
		testCaseName = "TC003";
		testDescription = "EditLead";
		testNodes = "EditLead";
		category = "smoke";
		authors = "sivaranjani";
		dataSheetName  = "TC003_EditLead";

	}

	@Test(dataProvider="fetchData")
	public void editLead(String uName,String pwd,String fName, String fNameEdit) {
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
		.clickEdit()
		.typefirstName(fNameEdit)
		.clickUpdate();
	
	}
}
