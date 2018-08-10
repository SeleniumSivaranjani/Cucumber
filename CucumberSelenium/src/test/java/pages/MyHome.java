package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.SeMethods;


public class MyHome extends SeMethods{
	
	public MyHome() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.LINK_TEXT,using = "Create Lead")
	private WebElement CreateLead;
	@FindBy(how=How.LINK_TEXT,using="Leads")
	private WebElement Lead;
	
	@And ("Click Create Lead")
	public CreateLead clickCreateLead() {
		click(CreateLead);
		return new CreateLead();
	}
	@And ("Click Lead")
	public MyLead clickLead() {
		click(Lead);
		return new MyLead();
	}

}
