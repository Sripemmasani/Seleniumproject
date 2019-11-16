package Myfirstpack;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chromedisplay {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Venkata\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.bing.com");
		
		
		ArrayList<WebElement>links= (ArrayList<WebElement>) driver.findElements(By.tagName("a"));
		
		int count=0;
		
		
		for(int i=0;i<links.size();i++) {
			
						
			if(links.get(i).isDisplayed()) {
				count++;
				
			}		
			
		
		}
	
		
		System.out.println("Visable linlks are"+ " "+ count);
		
		int n=links.size()-count;
		
		System.out.println("Hidden links are "+ "  "+ n);
		
	}
	
}
