package Com.Redbus.PageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Redbus.Configuration.ConfigDataProvider;

public class BookTicket {

	WebDriver driver;

	public BookTicket(WebDriver Cdriver) {
	this.driver = Cdriver;
		//PageFactory.initElements(driver, this);
	
	}
	
	
	
	@FindBy(id="src")
	public WebElement Source1;
	
	@FindBy(xpath="//*[contains(text(),'Shivaji Nagar, Pune')]")
	public WebElement SelectSrc;
	
	@FindBy(id = "dest")
	public WebElement Destination1;
	
	@FindBy(xpath="//*[contains(text(),'Borivali East, Mumbai')]")
	public WebElement SelectDest;
	
	@FindBy(id = "onward_cal")
	public WebElement ClickDate1;
	
	@FindBy(xpath="//td[@class=\"current day\"]")
	public WebElement CurrentDay1;
	
	@FindBy(id="search_btn")
	public WebElement Searchbtn1;
	
	
	
	public void Source(String src,String dest) {
		Source1.sendKeys(src);
		SelectSrc.click();
		Destination1.sendKeys(dest);
		SelectDest.click();
	}
	
		
//	public void Destination(String dest) {
//		Destination1.sendKeys(dest);
	//}
	
	public void ClickDate() {
		ClickDate1.click();
	}
	
	public void CurrentDay() {
		CurrentDay1.click();
	}
	
	public void Searchbtn() {
		Searchbtn1.click();
	}
  public void Title(WebDriver driver) {
	 String  ExpectedTitle = driver.getTitle();
	 
	 if(ExpectedTitle.equals("Search Bus Tickets")) {
		 System.out.println("Title Verified");
	 }
	 else {
		 System.out.println("Title not verified");
	 }
		 
  }


}

