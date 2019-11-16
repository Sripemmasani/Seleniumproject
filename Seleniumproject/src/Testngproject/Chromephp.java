package Testngproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Chromephp {

	
	WebDriver driver;
	
	@BeforeTest
	public void open(){
		
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Venkata\\Downloads\\chromedriver_win32\\chromedriver.exe");	
	
	driver= new ChromeDriver();
	
	driver.get("https://phptravels.com/demo/");
	
	
	
	driver.get("https://www.phptravels.net/login");
	
	}
	
	@Test (priority=0)
	
	public void login(){
			
			
		
		
		driver.findElement(By.name("username")).sendKeys("user@phptravels.com");
		
		
		driver.findElement(By.name("password")).sendKeys("demouser");
		
		driver.findElement(By.xpath("//*[@id='loginfrm']/button")).click();
		
		
	}

		
	
	@Test (priority=1)
	
	public void verify(){
				
    
		String ac=driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul[2]/ul/li[1]/a")).getText();
				
		
		String ex="MY ACCOUNT";
		
		  Assert.assertEquals(ac, ex);	
		
	
	}
	
	@Test  (priority=2)
	public void logoff(){
		
			
	
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	
		driver.findElement(By.linkText("Logout")).click();
	}
	
	
	@AfterTest
	
	public void close(){
		
		driver.close();
	}
	
	
}
