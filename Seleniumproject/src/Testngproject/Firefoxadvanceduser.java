package Testngproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Firefoxadvanceduser {

	
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
		
	driver.get("https://www.google.com");
		
		
		
	}
	
	@Test (priority=0)
	
	public void rightclick(){
		
		Actions ac=new Actions(driver);
		WebElement gmail=driver.findElement(By.linkText("Gmail"));
		ac.contextClick(gmail).build().perform();
		
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
	
		
	} 
	
	
	@Test (priority=2)
	
	public void about(){
		
		driver.get("https://www.mercurytravels.co.in/indian-holidays");
	
	
		
		Actions ac=new Actions(driver);
		
		WebElement about=driver.findElement(By.xpath("//*[@id='bs-example-navbar-collapse-1']/ul/li[10]"));
		
		ac.moveToElement(about).build().perform();
		
	}
	
	
	@Test (priority=1)
	
	public void doubleclick(){
		
			
		Actions ac=new Actions(driver);
		
		driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div/div[1]/div/div[1]/input")).sendKeys("movie");
		
		WebElement dclick=driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div/div[3]/center/input[1]"));
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS) ;	
				
		ac.doubleClick(dclick).build().perform();
		
		
		
	}
}
