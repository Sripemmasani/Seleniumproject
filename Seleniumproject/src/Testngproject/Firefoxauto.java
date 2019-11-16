package Testngproject;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Firefoxauto {

	ProfilesIni pr;
	FirefoxProfile fp;
	FirefoxOptions op;
	WebDriver driver;
	
	
	@BeforeTest
	
		public void open(){
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Venkata\\Downloads\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		
			
		 pr= new ProfilesIni();
		
	     fp=pr.getProfile("TestNg");
		
		
		 op=new FirefoxOptions();
		
		op.setProfile(fp);
		
		driver= new FirefoxDriver(op);
		
	      driver.get("http://tinyupload.com/");
		
		//this is upload file --need to work on
	

}
	
@Test
	
	public void cutebaby() throws IOException{
		
		 
		 
	   driver.findElement(By.xpath("/html/body/table/tbody/tr[4]/td/table/tbody/tr/td[2]/form/table/tbody/tr[2]/td[1]/input[2]")).click();
		 
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
		java.lang.Runtime.getRuntime().exec("C:\\Users\\Venkata\\Desktop\\OIVAuto\\autofile4.exe");
		
		
		
		
		
	}
	
	
	
	
}
