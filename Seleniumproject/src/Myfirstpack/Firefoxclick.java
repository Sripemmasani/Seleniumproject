package Myfirstpack;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefoxclick {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Venkata\\Downloads\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		
		WebDriver driver =new FirefoxDriver();
		
		driver.get("https://www.bing.com");
		
		
		ArrayList<WebElement> links=(ArrayList<WebElement>) driver.findElements(By.tagName("a"));
		
		
		for(int i=0;i<links.size();i++){
					
			
			if(links.get(i).isDisplayed()){
				
				String name=links.get(i).getText();
				
				links.get(i).click();
				
				String url=driver.getCurrentUrl();
				
				
				driver.navigate().back();
				
				links=(ArrayList<WebElement>) driver.findElements(By.tagName("a"));
				
				System.out.println("Before select"+"    "+name);
				
				System.out.println("After select"+ "   "+ url);
				
				
				
				
			}
		}
		
		
		
	}

}
