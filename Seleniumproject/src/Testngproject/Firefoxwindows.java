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

public class Firefoxwindows {

	
	
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
		
	driver.get("http://www.hdnicewallpapers.com/Wallpaper-Download/Cute-Baby/Cute-Pink-Baby-Girl-HD-Wallpaper");
		
		
		
	}
	
	 @Test
	 
	 public void cutebaby() throws AWTException{
		 
		 
		 
		 driver.findElement(By.xpath("//*[@id='DL']/div")).click();
		 
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		 
		 Robot rb =new Robot();
		 
		 rb.keyPress(KeyEvent.VK_DOWN);
		 rb.keyPress(KeyEvent.VK_ENTER);
		 
		  
		 
		 
	 }
	 
	 @Test
	 public void sedownload() throws AWTException{
		 
		 driver.get("https://www.seleniumhq.org/download/");
		 driver.findElement(By.linkText("3.141.59")).click();
		 
		 Robot rb= new Robot();
		 
		 rb.keyPress(KeyEvent.VK_TAB);
		 rb.keyPress(KeyEvent.VK_ENTER);
	 }
	 
	 
	 
	 @Test
	 public void photo() throws AWTException{
		 
		 
		 driver.get("https://www.photobox.co.uk/upload");
		 
		 driver.findElement(By.xpath("//*[@id='app']/div/div/fieldset/div/label[1]/div")).click();
		 
		 
		 driver.findElement(By.xpath("//*[@id='device-info']/label")).click();
		 
		 Robot rb=new Robot();
		 
		 rb.keyPress(KeyEvent.VK_P);
		 rb.keyPress(KeyEvent.VK_I);
		 rb.keyPress(KeyEvent.VK_C);
		 rb.keyPress(KeyEvent.VK_PERIOD);
		 rb.keyPress(KeyEvent.VK_J);
		 rb.keyPress(KeyEvent.VK_P);
		 rb.keyPress(KeyEvent.VK_G);
		 rb.keyPress(KeyEvent.VK_ENTER);
		 
		 
		 
		 
		 
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
