package Myfirstpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefoxdrop {

	public static void main(String[] args) {

		
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Venkata\\Downloads\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		
		
		WebDriver driver =new FirefoxDriver();
		
		
		driver.get("https://www.mercurytravels.co.in/indian-holidays");
		
		
		
      driver.findElement(By.xpath("//*[@id='duration_d']")).sendKeys("2Nights+3Days");
		
      
    
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
