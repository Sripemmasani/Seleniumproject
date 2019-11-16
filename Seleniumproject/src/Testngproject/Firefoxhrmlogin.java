package Testngproject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Firefoxhrmlogin {
	
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
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		
	}
	
	
	
	@Test (priority=0)
	public void login() {
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
	}
	
	
	
	
	
	@Test (priority=1)
	
	public void verify() {
		
		String ac=driver.findElement(By.linkText("Welcome Admin")).getText();
		
		
		
		String ex="Welcome Admin";
		
		
		
		
		if(ac.contains(ex)){
			
			System.out.println("pass");
		}else {
			
			System.out.println("fail");
		}
		
	} 
		
		@Test (priority=2)
		
		public void logout ()  {
			
			
			driver.findElement(By.linkText("Welcome Admin")).click();
			
			driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[3]/a")).click();
		} 
		
		
		@AfterTest
		public  void close() {
		 driver.close();	
			
		}
		
		
		
		
		
	

	
	}
	
	
	
	


