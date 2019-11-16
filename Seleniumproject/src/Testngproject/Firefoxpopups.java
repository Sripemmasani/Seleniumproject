package Testngproject;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Firefoxpopups {
	
	
	
	ProfilesIni pr;
	FirefoxOptions op;
	FirefoxProfile fp;
	WebDriver driver;
	
	@BeforeTest
	
	public void open(){
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Venkata\\Downloads\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		
		
		pr=new ProfilesIni();
		fp=pr.getProfile("TestNg");
		
		
		op=new FirefoxOptions();
		op.setProfile(fp);
		
		
		driver=new FirefoxDriver(op);
		
	   driver.get("https://www.icicibank.com/nri-banking/nri-banking.page?");
		
		
		}
	
	@Test
	
	public void popup(){
		
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
				
		String parent=driver.getWindowHandle();
		
		Set<String>pops=driver.getWindowHandles();
		
		Iterator <String> it=pops.iterator();
		
		while(it.hasNext()){
			
			String popup=it.next().toString();
			if(!popup.contains(parent)){
				driver.switchTo().window(popup);
				driver.close();
			}
		}
		
	}
	

}
