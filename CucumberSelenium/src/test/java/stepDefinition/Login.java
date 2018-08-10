package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class Login {

	/*RemoteWebDriver driver;
	@Given("Launch the browser")
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver = new ChromeDriver();
	}
	@And("load the URL")
	public void loadURL() {
		driver.get("http://leaftaps.com/opentaps/control/main");
	}
	@And("Set Implicit wait")
	public void setWait() {
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	@And("Maximize the window")
	public void maximize() {
		driver.manage().window().maximize();
	}
	@And("Enter the Username as (.*)")
	public void enterUserName(String data) {
		driver.findElementById("username").sendKeys(data);
	}
	@And("Enter the Password as (.*)")
	public void enterPassword(String data) {
		driver.findElementById("password").sendKeys(data);
	}
	@And("Click the Login Button")
	public void clickLogin() {
		driver.findElementByClassName("decorativeSubmit").click();
	}
	/*@And("Close the browser")
	public void closeBrowser() {
		driver.close();
	}*/
}
