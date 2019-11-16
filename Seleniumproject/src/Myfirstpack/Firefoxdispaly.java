package Myfirstpack;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefoxdispaly {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Venkata\\Downloads\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		
		WebDriver driver =new FirefoxDriver();
		
		driver.get("https://www.bing.com");
		
		
		ArrayList<WebElement> links=(ArrayList<WebElement>) driver.findElements(By.tagName("a"));
		
		int count=0;
		
		
		for(int i=0;i<links.size();i++){
			
			if(links.get(i).isDisplayed()){
				
				count++;
			}
			
			
		}
		
		System.out.println("Visable links are"+"   "+count);
		
		int n=links.size()-count;
		
		System.out.println("Hidenlinks are "+ "  "+n);
		
		
		
		
		
	}

}
