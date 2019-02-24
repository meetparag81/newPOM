package uiframework.uiframework.Paragcom.Pageobjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import uiframework.uiframework.Paragcom.TestBase.TestBase;
import uiframework.uiframework.Paragcom.freecrm.helper.Actions.ActionsHelper;
import uiframework.uiframework.Paragcom.freecrm.helper.BrowserConfiguration.config.objectreader;
import uiframework.uiframework.Paragcom.freecrm.helper.wait.WaitHelper;
import uiframework.uiframework.Paragcom.freecrm.logger.LoggerHelper;

public class LoginPage {
	
	private WebDriver driver;
	private  Logger log = LoggerHelper.getlogger(LoginPage.class);
	WaitHelper waitHelper;
	ActionsHelper act;
	
	
	@FindBy(xpath="//input[@name='username']")WebElement username;
	@FindBy(xpath="//input[@name='password']")WebElement password;
	@FindBy(xpath="//input[@name='login']")WebElement signin;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper= new WaitHelper(driver);
		waitHelper.waitForElement(signin, objectreader.reader.getexplicitWait());
		new TestBase().navigatetoscreen(driver);
		act = new ActionsHelper(driver);
	}
	
	
	public HomePage EnterValidLoginnameandpassword(String username, String password)
	{
		this.username.sendKeys(username);
		this.password.sendKeys(password);
		act.MovetoElement(signin).click();
		return new HomePage(driver);
		
		
		
	}

}
