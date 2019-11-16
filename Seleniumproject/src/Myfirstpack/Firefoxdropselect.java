package Myfirstpack;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefoxdropselect {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Venkata\\Downloads\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		
		driver.get("https://www.mercurytravels.co.in/indian-holidays");
		
		
		WebElement values=driver.findElement(By.id("theme_param"));
		
		
		ArrayList<WebElement> list=(ArrayList<WebElement>) values.findElements(By.tagName("option"));
		
		for(int i=0;i<list.size();i++){
			
			if(list.get(i).isDisplayed()) {
				
				System.out.println(list.get(i).getText()+"is Active");
			}else {
				
				
				System.out.println(list.get(i).getText()+"is not Active");
			}
				
		}
		
		
		
		
		
	}

}
