package Testngproject;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Firefoxwebelements {
	
	ProfilesIni pr;
	WebDriver driver;
	FirefoxOptions op;
	FirefoxProfile fp;
	
	
	ArrayList<WebElement>links;
	
	@BeforeTest
	
	public void open(){
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Venkata\\Downloads\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		
		pr= new ProfilesIni();
		
	     fp=pr.getProfile("TestNg");
		
		
		 op=new FirefoxOptions();
		
		op.setProfile(fp);
		
		driver= new FirefoxDriver(op);
		
		driver.get("https://www.spicejet.com");
		
	}
	
	@Test (priority=0)
	
	public void links(){
		
		links=(ArrayList<WebElement>) driver.findElements(By.tagName("a"));
		
		System.out.println("no of links in this page is"+ " "+links.size());
		
		
		for(int i=0;i<links.size();i++){
			
			System.out.println("Names of the links"+ "  "+ links.get(i).getText());
			
		}
		
		int count =0;
		
		for(int j=0;j<links.size();j++){
			
			if(links.get(j).isDisplayed()) {
				count++;
				
				System.out.println("Displayed links are "+ "  "+ links.get(j).getText());
				
			}
				else{
					System.out.println("not Displayed links are "+ "  "+ links.get(j).getText());
			}
			
		}
		
		System.out.println("No of Visiable links are "+ "  "+ count);
		
		int n=links.size()-count;
		
		System.out.println("No of hidden links are " + "  "+ n);
		
	}
	
	
	@Test (priority=1)
	
	public void drops(){
		
		links=(ArrayList<WebElement>) driver.findElements(By.tagName("select"));
		
		
		System.out.println("No of Dropdowns are"+ "  "+links.size());
		
		
		for( int i=0;i<links.size();i++){
			
			System.out.println("Name of dropdown is "+ "  "+ links.get(i).getAttribute("name"));
		}
		
		
		for(int j=0;j<links.size();j++){
			
			if(links.get(j).isDisplayed()){
				
				System.out.println("This drown is visiable"+" "+ links.get(j).getAttribute("name"));
			}else
			{
				System.out.println("This drown is not visiable"+" "+ links.get(j).getAttribute("name"));
				
			}

		}
		
		
	}
	
	
	
	

}
