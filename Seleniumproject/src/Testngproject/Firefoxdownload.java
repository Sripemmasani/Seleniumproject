package Testngproject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Firefoxdownload {
	
	
	ProfilesIni pr;
	FirefoxOptions op;
	FirefoxProfile fp;
	WebDriver driver;
	
	@BeforeTest
	
	public void download(){
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Venkata\\Downloads\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		
		
		pr=new ProfilesIni();
		fp=pr.getProfile("TestNg");
		
		
		op=new FirefoxOptions();
		op.setProfile(fp);
		
		
		driver=new FirefoxDriver(op);
	driver.get("https://www.betterteam.com/job-description-template");
		
		
		}
		
		
	@Test (priority=0)
		
		public void firstdown() throws AWTException{
			
		driver.findElement(By.linkText("Download Template")).click();
		
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
		Robot rb=new Robot();
		
		
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyPress(KeyEvent.VK_ENTER);
		
		
	} 
	
	
 /*	@Test (priority=1) 
	
	public void imagedown() throws AWTException{
		
		driver.get("https://unsplash.com/photos/DwxiQseMAgk");
		
		driver.findElement(By.xpath("/html/body/div/div/div[3]/div/div[1]/div[1]/header/div[2]/div[3]/a/span")).click();
		
		Robot rb=new Robot();
		
		
		
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyPress(KeyEvent.VK_ENTER);
	
		
		
		
		
	}*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
