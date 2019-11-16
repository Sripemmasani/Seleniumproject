package Myfirstpack;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefoxlinks {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver","C:\\Users\\Venkata\\Downloads\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		
		
		WebDriver driver= new FirefoxDriver();
		
		driver.get("https://www.icicibank.com");
		
	ArrayList<WebElement> links=(ArrayList<WebElement>)	driver.findElements(By.tagName("a"));
		
		System.out.println("no of links"+ "  "+ links.size());
		
		for(int i=0;i<links.size();i++){
			
			System.out.println(links.get(i).getText());
			
			
		}
		
		
	}

}
