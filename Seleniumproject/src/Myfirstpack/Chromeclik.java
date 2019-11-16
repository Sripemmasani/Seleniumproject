package Myfirstpack;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chromeclik {

	public static void main(String[] args) {

		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Venkata\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.bing.com");
		
		
		ArrayList<WebElement> links= (ArrayList<WebElement>) driver.findElements(By.tagName("a"));
		
		for (int i=0;i<links.size();i++) {
			
			
			if(links.get(i).isDisplayed()){
				
				
				String name= links.get(i).getText();
				
				links.get(i).click();
				
				String url=driver.getCurrentUrl();
				
				driver.navigate().back();
				
				links=(ArrayList<WebElement>) driver.findElements(By.tagName("a"));
				
				System.out.println("Before Select"+ "  "+ name);
				
				System.out.println("After Select"+ "  "+ url);
				
			}
		}
		
		
		
		
	}

}
