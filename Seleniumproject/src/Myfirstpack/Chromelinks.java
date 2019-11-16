package Myfirstpack;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chromelinks {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Venkata\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.icicibank.com");
		
		ArrayList<WebElement> links= (ArrayList<WebElement>) driver.findElements(By.tagName("a"));
		
		System.out.println("No of Links are"+ "  "+links.size());
		
		
		for(int i=0;i<links.size();i++){
			
			System.out.println(links.get(i).getText());
		}
		
	}

}
