package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.SeMethods;

public class FindLead extends SeMethods {
	
	public FindLead() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how=How.LINK_TEXT, using ="Find Leads")
	private WebElement eleFindLead;
	@FindBy(how=How.ID, using = "ext-gen27")
	private WebElement elefName;
	@FindBy (how=How.XPATH,using = "//button[text()='Find Leads']")
	private WebElement eleFindLeadButton;
	@FindBy (how=How.XPATH, using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")
	private WebElement elefRecord;
	@FindBy (how=How.NAME, using ="id")
	private WebElement eleLeadId;
	@FindBy (how=How.XPATH, using ="//div[text()='No records to display']")
	private WebElement eleNoRecords;

	public  FindLead clickFindLeads(){
		click(eleFindLead);
		return this;
	}
	@And ("Type First Name (.*)")
	public FindLead typeFirstName(String data) {
		type(elefName, data); 
		return this;
	}
	@And ("Click Find Leads Button")
	public FindLead clickFindLeadButton() {
		click(eleFindLeadButton);
		return this;
	}
	@And ("Click the First Lead Id")
	public ViewLead clickFirstRecord() {
		click(elefRecord);
		return new ViewLead();
	}
	public FindLead getLead() {
		getLeadId = elefRecord.getText();
		return this;
	}
	public MergeLeads clickLeadToMerge() {
		click(elefRecord);
		switchToWindow(0);
		return new MergeLeads();
	}
	public FindLead verifyMergedLead() {
		type(eleLeadId,getLeadId);
		click (eleFindLeadButton);
		verifyExactText(eleNoRecords, "No records to display");
		return this;
	}
	
	}

