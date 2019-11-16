package Myfirstpack;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeImage {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Venkata\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.flipkart.com");
		
		
		ArrayList<WebElement>images=(ArrayList<WebElement>) driver.findElements(By.tagName("img"));
		
		
		System.out.println("No of images in this page"+ "  "+ images.size());
		
		
		for(int i=0;i<images.size();i++) {
			
			
			System.out.println("Name of the Image"+ "  "+ images.get(i).getAttribute("src"));
		}
		
		
	}

}
