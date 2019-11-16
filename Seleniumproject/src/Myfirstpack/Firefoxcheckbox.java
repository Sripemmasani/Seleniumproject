package Myfirstpack;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;


public class Firefoxcheckbox {

	public static void main(String[] args) {

		
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Venkata\\Downloads\\geckodriver-v0.21.0-win64\\geckodriver.exe");	;
		
		WebDriver driver;
		
       ProfilesIni pr= new ProfilesIni();
		
		FirefoxProfile fp=pr.getProfile("TestNg");
		
		
		FirefoxOptions op=new FirefoxOptions();
		 op.setProfile(fp);
		 
		 driver=new FirefoxDriver(op);
		
		
		
		driver.get("https://www.spicejet.com");
		
		ArrayList<WebElement> check= (ArrayList<WebElement>) driver.findElements(By.xpath("//input[@type='checkbox']"));
				
		System.out.println("No of Checkboxs in this is "+"  "+check.size());
		
		
		for(int i=0;i<check.size();i++){
			
			System.out.println("Thiis Checkbox is"+ "  "+ check.get(i).getAttribute("name"));
		}
		
	
		
		
		
		WebElement senior=driver.findElement(By.name("ctl00$mainContent$chk_SeniorCitizenDiscount"));
		
		senior.click();
		
		if(senior.isSelected()){
				
				System.out.println("Name of active check box is "+ "  "+ senior);
			}else {
				
				System.out.println("Name of inactive Check box is "+"  "+senior);
			}
		}
		
		
	}


