package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.SeMethods;


public class HomePage extends SeMethods{
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.CLASS_NAME,using = "decorativeSubmit")
	private WebElement eleLogOut;
	@FindBy(how=How.LINK_TEXT, using = "CRM/SFA")
	private WebElement eleCRMSFA;
	
	public LoginPage clickLogOut() {
		click(eleLogOut);
		return new LoginPage();
	}
	@And ("Click CRMSFA")
	public MyHome clickCRMSFA() {
		click(eleCRMSFA);
		return  new MyHome();
	}
	}
