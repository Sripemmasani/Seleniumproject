package Myfirstpack;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chromedropselect {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Venkata\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.mercurytravels.co.in/indian-holidays");
		
		
		WebElement values= driver.findElement(By.id("theme_param"));
		
		ArrayList<WebElement> list=(ArrayList<WebElement>) values.findElements(By.tagName("option"));
		
		
		for(int i=0;i<list.size();i++){
			
		if(	list.get(i).isDisplayed()) {
			
			
			System.out.println(list.get(i).getText()+"is Active");
		} else {
			
			System.out.println(list.get(i).getText()+"is not active");
			
		}
			
		}
		
		
		
		
	}

}
