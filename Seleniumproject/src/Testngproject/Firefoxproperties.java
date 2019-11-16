package Testngproject;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Firefoxproperties {

	
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
	public void login() throws IOException {
		
		
		
		FileInputStream fo=new FileInputStream("C:\\Users\\Venkata\\Desktop\\OIVAuto\\Seleniumproject\\Tc1.properties");
		
		Properties pr=new Properties();
		
		pr.load(fo);
		
		
		driver.findElement(By.id(pr.getProperty("user"))).sendKeys("Admin");
		
		driver.findElement(By.id(pr.getProperty("pass"))).sendKeys("admin123");
		
		driver.findElement(By.id(pr.getProperty("log"))).click();
		
	}
	
	
	
	
	
	
}
