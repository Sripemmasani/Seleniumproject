package Myfirstpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chromedrop {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Venkata\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		
		
		driver.get("https://www.mercurytravels.co.in/");
		
		
		
		
		driver.findElement(By.id("duration_d")).sendKeys("7Nights+*Days");
		
		
		//Select obj = (Select) driver.findElement(By.id("themes"));
		
		//obj.selectByIndex(5);
		
		
		
		
	}

}
