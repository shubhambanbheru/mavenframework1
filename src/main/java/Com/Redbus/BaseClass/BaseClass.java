package Com.Redbus.BaseClass;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Com.Redbus.Configuration.ConfigDataProvider;
import Com.Redbus.PageClass.BookTicket;
import Com.Redbus.Utitilities.BrowserFactory;

public class BaseClass{

	public WebDriver driver;
    public ConfigDataProvider config;
	
    @BeforeSuite
	public void Suite() {
		config = new ConfigDataProvider();

	}

	@BeforeClass
	public void Setup() {
		driver = BrowserFactory.StartBrowser(driver, config.Browsername(), config.getURL());

	}

	@AfterClass
	public void Teardown() {
		BrowserFactory.Quit(driver);

	}
}
