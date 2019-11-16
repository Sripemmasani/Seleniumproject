package Myfirstpack;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;

public class Firefoxtext {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Venkata\\Downloads\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		
		WebDriver driver;
		
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("TestNg");
		
		FirefoxOptions op=new FirefoxOptions();
		op.setProfile(fp);
		
		driver= new FirefoxDriver(op);
		
		driver.get("http://www.newtours.demoaut.com");
		
		
		ArrayList<WebElement> bname=(ArrayList<WebElement>) driver.findElements(By.tagName("b"));
		
		System.out.println("No of Boldtext are"+ "  "+ bname.size());
		
		
		
		
		ArrayList<WebElement> pname= (ArrayList<WebElement>) driver.findElements(By.tagName("p"));
		
		System.out.println("No of Normal Text"+ "  "+ pname.size());
		
		WebElement text= driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[1]/font"));
		
		String ex="b";
		String ac= text.getTagName();
		
		if(ex.contains(ac)){
			
			System.out.println("This is Bold text");
		}else {
			System.out.println("This is normal text");
		}
		
		
	}

}
