package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MergeLeads extends ProjectMethods {
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

	public FindLead clickFromLead() {
		click(eleFromLead);
		switchToWindow(1);
		
		return new FindLead();
	}
	public FindLead clickToLead() {
		click(eleToLead);
		switchToWindow(1);
		return new FindLead();
	}
	public ViewLead clickMerge() {
		click(eleMerge);
		acceptAlert();
		return new ViewLead();
	}
}
