package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class EditLead extends ProjectMethods {

	public EditLead() {
		PageFactory.initElements(driver, this);
	}

	@FindBy( how=How.XPATH,using ="(//input[@name='firstName'])[3]")
	private WebElement elefName;
	@FindBy(how=How.XPATH, using ="//input[@value='Update']")
	private WebElement eleUpdate;

	public  EditLead typefirstName(String data) {
		elefName.clear();
		type(elefName, data);
		return this;
	}

	public ViewLead clickUpdate() {
		click(eleUpdate);
		return new ViewLead();
	}

}
