package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class CreateLead extends ProjectMethods {

	public CreateLead() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how=How.ID, using ="createLeadForm_companyName")
	private WebElement elecmyName;
	@FindBy(how=How.ID, using = "createLeadForm_firstName")
	private WebElement elefName;
	@FindBy (how=How.ID,using = "createLeadForm_lastName")
	private WebElement elelName;
	@FindBy (how=How.NAME, using="submitButton")
	private WebElement elesubmit;

	public  CreateLead typeCmpName(String data) {
		type(elecmyName, data);
		return this;
	}

	public CreateLead typeFirstName(String data) {
		type(elefName, data);
		return this;
	}
	
	public CreateLead typeLastName(String data) {
		type(elelName, data);
		return this;
	}
	
	public ViewLead clickCreateLead() {
		click(elesubmit);
		return new ViewLead();
	}
}
