package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.SeMethods;

public class MyLead extends SeMethods{

	public MyLead() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how=How.LINK_TEXT,using = "Find Leads")
	private WebElement FindLeads;
	@FindBy (how=How.LINK_TEXT, using = "Merge Leads")
	private WebElement MergeLeads;

	@And ("Click Find Leads")
	public FindLead clickFindLeads() {
		click(FindLeads);
		return new FindLead();
	}
	public MergeLeads clickMergeLeads() {
		click(MergeLeads);
		return new MergeLeads();
	}
}
