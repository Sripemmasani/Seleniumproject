package Testngproject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Solotest3 {
	

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
	
		
		driver.get("http://the-internet.herokuapp.com/");
		
		driver.findElement(By.linkText("Key Presses")).click();
	
	}
	
	@Test (priority=0)
	
	public void tab() {
		
      driver.findElement(By.id("target")).sendKeys(Keys.TAB);
		
		String actual= driver.findElement(By.id("result")).getText();
		
		String expected="You entered: TAB";
		
		Assert.assertEquals(actual, expected,"You entered:TAB");
		
		
	}

	
	@Test(priority=1)
	
	public void space(){
		
		
		driver.findElement(By.id("target")).sendKeys(Keys.SPACE);
		
		String actual= driver.findElement(By.id("result")).getText();
		
		String expected="You entered: SPACE";
		
		Assert.assertEquals(actual, expected,"You entered:SPACE");
	}
	
	
	
	@Test (priority=2)
	
	public void enter(){
		
driver.findElement(By.id("target")).sendKeys(Keys.ENTER);
		
		String actual= driver.findElement(By.id("result")).getText();
		
		String expected="You entered: ENTER";
				
		Assert.assertEquals(actual, expected,"You entered:Enter");
	}
	
	
	@Test(priority=3)
	
	public void escape(){
		
		 driver.findElement(By.id("target")).sendKeys(Keys.ESCAPE);
		 
			
			String actual= driver.findElement(By.id("result")).getText();
								
			String expected="You entered: ESCAPE";
			
			Assert.assertEquals(actual, expected,"You entered:Escape");
		
	}
	
	
	@AfterTest
	public  void close() {
	 driver.close();	
}
}