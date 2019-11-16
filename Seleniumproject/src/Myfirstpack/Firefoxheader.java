package Myfirstpack;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefoxheader {

	public static void main(String[] args) {

		
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Venkata\\Downloads\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		
		driver.get("https://www.bing.com");
		
		WebElement header=driver.findElement(By.id("hp_sw_hdr"));
		
		ArrayList<WebElement> links= (ArrayList<WebElement>) header.findElements(By.tagName("a"));
		
		
		System.out.println("Header links are"+ "   "+links.size());
		
		
		
		for(int i=0;i<links.size();i++) {
			
			
			System.out.println(links.get(i).getText());
		}
		
		
	
		
		
		
		
		
		
		
		
	}

}
