package Testngproject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Chrometestng {
	WebDriver driver;
	
	@BeforeTest
	
	public void open(){
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Venkata\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	driver =new ChromeDriver();
	
	driver.get("http://www.newtours.demoaut.com");
	
	}
	
	
	@Test
	
	public void login(){
		
		
		driver.findElement(By.name("userName")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("login")).click();
		
	}
	
	
	
	
	
	@Test (priority=1)
	
	public void verify() {
		
		String acc=driver.findElement(By.name("tripType")).getAttribute("name");
		
		//String acc1=ac.getAttribute("name");
		
		String ex="tripType";
		
		
		
		
		if(acc.contains(ex)){
			
			System.out.println("pass");
		}else {
			
			System.out.println("fail");
		}
		
	}
		
		@Test (priority=2)
		
		public void logout ()  {
			
			driver.findElement(By.linkText("SIGN-OFF")).click();
		} 
		
		
		@AfterTest
		public  void close() {
		 driver.close();	
			
		}
		
		
		
		
	}
	
	

	


