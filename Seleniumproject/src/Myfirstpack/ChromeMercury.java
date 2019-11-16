package Myfirstpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeMercury {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Venkata\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.mercurytravels.co.in/indian-holidays");
		
		
		driver.findElement(By.linkText("International Holidays")).click();
		
		String url=driver.getCurrentUrl();
		
		System.out.println(url);
		
		
		
	}

}
