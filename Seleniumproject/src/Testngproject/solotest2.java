package Testngproject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class solotest2 {

	
	
	
	ProfilesIni pr;
	FirefoxProfile fp;
	FirefoxOptions op;
	WebDriver driver;
	JavascriptExecutor js;
	
	
	@BeforeTest
	
		public void open(){
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Venkata\\Downloads\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		
			
		 pr= new ProfilesIni();
		
	     fp=pr.getProfile("TestNg");
		
		
		 op=new FirefoxOptions();
		
		op.setProfile(fp);
		
		driver= new FirefoxDriver(op);
	
		
		driver.get("http://the-internet.herokuapp.com/");
		
		driver.findElement(By.linkText("Infinite Scroll")).click();
		
		driver.manage().window().maximize();
		
		js = (JavascriptExecutor) driver;
	
}
	
	@Test(priority=0)
	public void scrolldown() throws InterruptedException{
		
		for(int i=1;i<3;i++){
			 
			 
			 js.executeScript("window.scrollTo(0,2000)");
			 
			 Thread.sleep(2000);
		 }	
	}	
		
	@Test(priority=1)	
	public void scrollup() throws InterruptedException{
		
		 for(int j=1;j<3;j++){
			 
             js.executeScript("window.scrollTo(0,-1500)");
				 
				 Thread.sleep(2000);
				 
			 }
		
	}
	
	
	@Test(priority=2)
	public void check(){
		
		 String actual=driver.findElement(By.xpath("//*[@id='content']/div/h3")).getText();
			
		  String expected="Infinite Scroll";
		  
		  Assert.assertEquals(actual, expected,"You are at top of the page");
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
}