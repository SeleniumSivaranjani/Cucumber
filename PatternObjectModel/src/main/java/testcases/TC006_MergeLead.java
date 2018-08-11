package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.FindLead;
import pages.LoginPage;
import pages.MergeLeads;
import wdMethods.ProjectMethods;

public class TC006_MergeLead extends ProjectMethods{	

	@BeforeTest
	public void setData() {
		browserName = "chrome";
		testCaseName = "TC006";
		testDescription = "MergeLead";
		testNodes = "MergeLead";
		category = "smoke";
		authors = "sivaranjani";
		dataSheetName  = "TC006_MergeLead";

	}

	@Test(dataProvider="fetchData")
	public void editLead(String uName,String pwd,String fMerge,String lMerge) {
		new LoginPage()
		.typeUserName(uName)
		.typePassword(pwd)
		.clickLogin()
		.clickCRMSFA()
		.clickLead()
		.clickMergeLeads()
		.clickFromLead()
		.typeFirstName(fMerge)
		.clickFindLeadButton()
		.getLead()
		.clickLeadToMerge()
		.clickToLead()
		.typeFirstName(lMerge)
		.clickFindLeadButton()
		.clickLeadToMerge()
		.clickMerge()
		.clickFindLead()
		.verifyMergedLead();
	}
}
