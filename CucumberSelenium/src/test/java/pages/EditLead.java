package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.SeMethods;

public class EditLead extends SeMethods {

	public EditLead() {
		PageFactory.initElements(driver, this);
	}

	@FindBy( how=How.XPATH,using ="(//input[@name='firstName'])[3]")
	private WebElement elefName;
	@FindBy(how=How.XPATH, using ="//input[@value='Update']")
	private WebElement eleUpdate;
	@And ("Edit the First name (.*)")
	public  EditLead typefirstName(String data) {
		elefName.clear();
		type(elefName, data);
		return this;
	}
	@And ("Click Update Button")
	public ViewLead clickUpdate() {
		click(eleUpdate);
		return new ViewLead();
	}

}
