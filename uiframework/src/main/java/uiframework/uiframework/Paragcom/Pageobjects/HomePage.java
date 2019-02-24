package uiframework.uiframework.Paragcom.Pageobjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import uiframework.uiframework.Paragcom.freecrm.logger.LoggerHelper;

public class HomePage 
{
	private  Logger log = LoggerHelper.getlogger(HomePage.class);
			private WebDriver driver;
	public  HomePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	

}
