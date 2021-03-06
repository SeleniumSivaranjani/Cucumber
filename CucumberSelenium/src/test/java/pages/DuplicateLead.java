package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.SeMethods;

public class DuplicateLead extends SeMethods {
	public DuplicateLead()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy (how=How.LINK_TEXT,using ="Create Lead")
	private WebElement eleCreateDuplicateLead;
	@And ("Click Create Lead for Duplicate Lead")
	public ViewLead clickCreateLead() {
		click(eleCreateDuplicateLead);
		return new ViewLead();
	}

}
