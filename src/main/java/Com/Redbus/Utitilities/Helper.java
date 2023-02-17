package Com.Redbus.Utitilities;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Helper {

	public Helper (WebDriver driver) {
		
		File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	}
}
