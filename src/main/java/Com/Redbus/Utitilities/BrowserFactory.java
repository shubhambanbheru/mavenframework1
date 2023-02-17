package Com.Redbus.Utitilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class BrowserFactory {

	public static WebDriver driver;
	public static WebDriver StartBrowser(WebDriver driver , String Browsername , String URL) {

		if (Browsername.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

			driver = new ChromeDriver();
		} else if (Browsername.equals("ie")) {

			System.setProperty("webdriver.gecko.driver", "./drivers/IEDriverServer.exe");

			driver = new InternetExplorerDriver();
		}

		else if (Browsername.equals("edge")) {

			System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");

			driver = new EdgeDriver();
		}
			
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		
		driver.get(URL);

		return driver;

	}

	public static  WebDriver Quit(WebDriver driver) {
		
		driver.quit();
		return driver;
	}
	 
}
