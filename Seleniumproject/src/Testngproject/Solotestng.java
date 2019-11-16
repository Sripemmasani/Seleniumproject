package Testngproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Solotestng {
	
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
		
		
		driver.findElement(By.linkText("Form Authentication")).click();
	}	
	
	
	@Test(priority=0)
	
	public void correctusername(){
		
		driver.findElement((By.id("username"))).sendKeys("tomsmith");
			driver.findElement(By.id("password")).sendKeys("abcd");
			driver.findElement(By.xpath("//*[@id='login']/button/i")).click();
			

			String actual=driver.findElement(By.xpath("//*[@id='content']/div/h4")).getText();	  
			  

			 String expected="Welcome to the Secure Area. When you are done click logout below.";
			
			  Assert.assertEquals(actual, expected,"you Enterd invalid Password");
			
			
	}
	
	
	
	
	@Test (priority=1)
	
	public void correctpassword(){
		
		
    driver.findElement((By.id("username"))).sendKeys("smark");
	driver.findElement(By.id("password")).sendKeys("SupperSecretPassword!");
    driver.findElement(By.xpath("//*[@id='login']/button/i")).click(); 
		
    String actual=driver.findElement(By.xpath("//*[@id='content']/div/h4")).getText();	  
	  

	 String expected="Welcome to the Secure Area. When you are done click logout below.";
      
	
	  Assert.assertEquals(actual, expected,"you Enterd invalid UserName");
    
    
    
    
		
	}
	

	
	@Test (priority=2)
	
	public void bothcorrect() {
		
		driver.findElement((By.id("username"))).sendKeys("tomsmith");
		driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
		driver.findElement(By.xpath("//*[@id='login']/button/i")).click();
		
		
		String actual=driver.findElement(By.xpath("//*[@id='content']/div/h4")).getText();	  
		  

		 String expected="Welcome to the Secure Area. When you are done click logout below.";
		 
		 Assert.assertEquals(actual, expected,"Welcome to the secure area");
		
		
		
	}
	
	@Test (priority=3)
	
	public void logout(){
		
		driver.findElement(By.xpath("//*[@id='content']/div/a")).click();
	}
	
	@AfterTest
	public  void close() {
	 driver.close();	
}


}
