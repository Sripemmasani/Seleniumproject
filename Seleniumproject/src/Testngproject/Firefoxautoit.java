package Testngproject;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Firefoxautoit {
	
	
	
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
	
	public void cutebaby() throws IOException{
		
		 
		 
		 driver.findElement(By.xpath("//*[@id='DL']/div")).click();
		 
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
		java.lang.Runtime.getRuntime().exec("C:\\Users\\Venkata\\Desktop\\OIVAuto\\autofile1.exe");
		
		
		
		
		
	}
	
	
	@Test
	public void sedown() throws IOException{
		
		driver.get("https://www.seleniumhq.org/download/");
		
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
		driver.findElement(By.linkText("3.141.59")).click();
		
		
		java.lang.Runtime.getRuntime().exec("C:\\Users\\Venkata\\Desktop\\OIVAuto\\autofile2.exe");
		
		
		
	}
	
	@Test
	
	public void upphoto() throws IOException{
		
     driver.get("https://www.photobox.co.uk/upload");
		 
		 driver.findElement(By.xpath("//*[@id='app']/div/div/fieldset/div/label[1]/div")).click();
		 
		 
		 driver.findElement(By.xpath("//*[@id='device-info']/label")).click();
		 
		 
		java.lang.Runtime.getRuntime().exec("C:\\Users\\Venkata\\Desktop\\OIVAuto\\autofile3.exe");
		
	}

}