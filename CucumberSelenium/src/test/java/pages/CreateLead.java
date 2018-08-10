package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.SeMethods;


public class CreateLead extends SeMethods {

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

	@ And ("Enter Company Name (.*)")
	public  CreateLead typeCmpName(String data) {
		type(elecmyName, data);
		return this;
	}
	@And ("Enter First Name (.*)")
	public CreateLead typeFirstName(String data) {
		type(elefName, data);
		return this;
	}
	@ And ("Enter Last Name (.*)")	
	public CreateLead typeLastName(String data) {
		type(elelName, data);
		return this;
	}
	@ And ("Click Create Lead Button")
	public ViewLead clickCreateLead() {
		click(elesubmit);
		return new ViewLead();
	}
}
