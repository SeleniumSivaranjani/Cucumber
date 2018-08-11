package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class DuplicateLead extends ProjectMethods {
public DuplicateLead()
{
	PageFactory.initElements(driver, this);
}
	@FindBy (how=How.LINK_TEXT,using ="Create Lead")
	private WebElement eleCreateDuplicateLead;
	
	public ViewLead clickCreateLead() {
		click(eleCreateDuplicateLead);
		return new ViewLead();
	}
	 
}
