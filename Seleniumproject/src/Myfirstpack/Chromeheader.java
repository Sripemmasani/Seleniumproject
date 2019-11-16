package Myfirstpack;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chromeheader {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Venkata\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.bing.com");
		
		
		WebElement hearder=driver.findElement(By.id("hp_sw_hdr"));
		
		
		ArrayList<WebElement> links=  (ArrayList<WebElement>) hearder.findElements(By.tagName("a"));
		
		System.out.println("Links in header"+ "  "+links.size());
		
		for(int i=0;i<links.size();i++) {
			
			System.out.println(links.get(i).getText());
		}
		
		
		
		

	}

}
