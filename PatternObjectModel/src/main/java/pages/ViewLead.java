package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class ViewLead extends ProjectMethods {
public  ViewLead()
{
	PageFactory.initElements(driver, this);
}
	@FindBy (how=How.LINK_TEXT,using ="Edit")
	private WebElement eleEdit;
	@FindBy (how=How.LINK_TEXT, using ="Delete")
	private WebElement eleDelete;
	@FindBy (how=How.LINK_TEXT, using ="Duplicate Lead")
	private WebElement eleDuplicate;
	@FindBy (how=How.LINK_TEXT, using ="Find Leads")
	private WebElement eleFindLeads;
	
	public EditLead clickEdit() {
		click(eleEdit);
		return new EditLead();
	}
	 public MyLead clickDelete() {
		 click(eleDelete);
		 return new MyLead();
	 }
	 public DuplicateLead clickDuplicate() {
		 click (eleDuplicate);
		 return new DuplicateLead();
	 }
	 public FindLead clickFindLead() {
		 click(eleFindLeads);
		 return new FindLead();
	 }
}
