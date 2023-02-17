package Com.Redbus.Configuration;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigDataProvider {

	
	 Properties pro;
	
	public ConfigDataProvider() {
	
		File file = new File("./Config/config.properties");
 		
		try {
			FileInputStream fis = new FileInputStream(file);
			
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
	}



	public  String Browsername() {
		
		
		return pro.getProperty("Browser");
		
	}
	
    public  String getURL() {
    	
    	return pro.getProperty("Url");
    }

	











}




