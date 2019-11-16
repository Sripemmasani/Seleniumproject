package Myfirstpack;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxnoofDropdowns {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Venkata\\Downloads\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		
		
		WebDriver driver =new FirefoxDriver();
		
		driver.get("https://www.mercurytravels.co.in/international-holidays");
		
		
		ArrayList<WebElement> dropdown=(ArrayList<WebElement>) driver.findElements(By.tagName("select"));
		
		System.out.println("No of Dropdowns in this page "+ "  "+ dropdown.size());
		
		for (int i=0; i<dropdown.size();i++){
			
			System.out.println("Names of the dropdown"+ "  "+dropdown.get(i).getAttribute("name"));
		}
		
		
		driver.findElement(By.xpath("//*[@id='bs-example-navbar-collapse-1']/ul/li[2]/a")).click();
		
		ArrayList<WebElement>drops=(ArrayList<WebElement>) driver.findElements(By.tagName("select"));
		
		System.out.println("No of Dropdowns in this page "+ "  "+ drops.size());
		
		
		WebElement values=driver.findElement(By.id("theme_param"));
		
		
		ArrayList<WebElement> list=(ArrayList<WebElement>) values.findElements(By.tagName("option"));
		
		
		System.out.println("no of vales in thris dropdown"+"  "+ list.size());
		
		for(int j=0;j<list.size();j++) {
			
			
			System.out.println("values in this dropdowns"+ "  "+list.get(j).getText());
		}
		
		
		
		
		
	}

}
