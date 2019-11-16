package Myfirstpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;

public class Firefoxprofile {

	public static void main(String[] args) {

			
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Venkata\\Downloads\\geckodriver-v0.21.0-win64\\geckodriver.exe");	
	
	
		WebDriver driver;
		
		ProfilesIni pr= new ProfilesIni();
		
		FirefoxProfile fp=pr.getProfile("TestNg");
		
		
		FirefoxOptions op=new FirefoxOptions();
		 op.setProfile(fp);
		 
		 driver=new FirefoxDriver(op);
		 
		 driver.get("https://www.mercurytravels.co.in/indian-holidays");
		
		
		
		
		
	}

}
