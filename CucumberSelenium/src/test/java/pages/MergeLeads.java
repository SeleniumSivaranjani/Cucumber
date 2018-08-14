package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.SeMethods;

public class MergeLeads extends SeMethods {
	public  MergeLeads()
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy (how=How.XPATH,using ="(//img[@src='/images/fieldlookup.gif'])[1]")
	private WebElement eleFromLead;
	@FindBy (how=How.XPATH, using ="(//img[@src='/images/fieldlookup.gif'])[2]")
	private WebElement eleToLead;
	@FindBy (how=How.LINK_TEXT, using ="Merge")
	private WebElement eleMerge;
	@And ("Select From Lead")
	public FindLead clickFromLead() {
		click(eleFromLead);
		switchToWindow(1);

		return new FindLead();
	}
	@And ("Select To Lead")
	public FindLead clickToLead() {
		switchToWindow(0);
		click(eleToLead);
		switchToWindow(1);
		return new FindLead();
	}
	@And ("Click Merge Button")
	public ViewLead clickMerge() {
		switchToWindow(0);
		click(eleMerge);
		acceptAlert();
		return new ViewLead();
	}
}
