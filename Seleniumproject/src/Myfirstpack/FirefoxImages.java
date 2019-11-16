package Myfirstpack;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;

public class FirefoxImages {

	public static void main(String[] args) {

		
		
	System.setProperty("webdriver.gecko.driver","C:\\Users\\Venkata\\Downloads\\geckodriver-v0.21.0-win64\\geckodriver.exe");
	
	
	
	WebDriver driver ;
	
	ProfilesIni pr=new ProfilesIni();
	
	FirefoxProfile fp=pr.getProfile("TestNg");
	
	FirefoxOptions op=new FirefoxOptions();
	
	op.setProfile(fp);
	
	driver= new FirefoxDriver();
	
	
	driver.get("https://www.flipkart.com");
		
	
	ArrayList<WebElement>images=(ArrayList<WebElement>) driver.findElements(By.tagName("img"));
	
	System.out.println("No of images in this page is"+  "   "+ images.size());
	
	for( int i=0;i<images.size();i++){
		
		
		System.out.println("Name of the image is"+"  "+ images.get(i).getAttribute("src"));
		
	}
	
	
	}

}
