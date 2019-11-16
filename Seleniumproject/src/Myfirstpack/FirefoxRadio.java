package Myfirstpack;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;

public class FirefoxRadio {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Venkata\\Downloads\\geckodriver-v0.21.0-win64\\geckodriver.exe ");
		
		
		WebDriver driver;
		
		ProfilesIni pr= new ProfilesIni();
		
		FirefoxProfile fp= pr.getProfile("TestNg");
		
		FirefoxOptions op =new FirefoxOptions();
		
		op.setProfile(fp);
		
		driver= new FirefoxDriver();
		
		driver.get("https://www.mercurytravels.co.in/flights");
		
		
		
		ArrayList<WebElement> radio=(ArrayList<WebElement>) driver.findElements(By.xpath("//input[@type='radio']"));
		
		System.out.println("No od Radio Buttons in this page is"+ "  "+ radio.size());
		
		
		for(int i=0;i<radio.size();i++){
			
			System.out.println("Name of the Radio Button is "+ "  "+ radio.get(i).getAttribute("name"));
		}
		
		for(int j=0;j<radio.size();j++){
			
			
			
			if (radio.get(j).isSelected()){
				
				
				System.out.println("Active radio button is"+ "  "+ radio.get(j).getAttribute("name"));
				
				
			}else {
				
				System.out.println("Inactive radio button is "+ "   "+ radio.get(j).getAttribute("name"));
			}
			
			
			
		}
		
	}

}
