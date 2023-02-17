package Com.Redbus.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com.Redbus.BaseClass.BaseClass;
import Com.Redbus.Configuration.ConfigDataProvider;
import Com.Redbus.PageClass.BookTicket;
import Com.Redbus.Utitilities.BrowserFactory;

public class BookTicket_TestClass extends BaseClass {


	@Test
	public void Search() {
		System.out.println();
	//	config = new ConfigDataProvider();
//		driver = BrowserFactory.StartBrowser(driver, config.Browsername(), config.getURL());

		
	//	BookTicket BT = new BookTicket(driver);
		BookTicket BT = PageFactory.initElements(driver, BookTicket.class);
	
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}

		BT.Source("Pune","Mumbai");
	//	BT.destination();
		// BT.Destination("Mumbai");
		BT.ClickDate();
		BT.CurrentDay();
		BT.Searchbtn();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		BT.Title(driver);
		
//		BrowserFactory.Quit(driver);

	}

}
