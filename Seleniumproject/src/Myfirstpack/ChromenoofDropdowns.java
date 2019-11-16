package Myfirstpack;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromenoofDropdowns {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Venkata\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.mercurytravels.co.in/international-holidays");
		
		ArrayList<WebElement>drops= (ArrayList<WebElement>)  driver.findElements(By.tagName("select"));
		
		
		System.out.println("No of Dropdwons in this page are"+ "  "+drops.size());
		
		
		
		
		for(int j=0;j<drops.size();j++){
			
			System.out.println("Names of the Dropdrowns are"+"  "+ drops.get(j).getAttribute("name"));
			
			
		}
		
		
		WebElement values =driver.findElement(By.xpath("//*[@id='continent']"));
		
		ArrayList<WebElement>list=(ArrayList<WebElement>) values.findElements(By.tagName("option"));
		
		
		
		System.out.println("No of values in continent" + "  "+ list.size());
		
		
		for (int i=0 ;i<list.size();i++) {
			
			
			System.out.println("values"+ "  "+list.get(i).getText());
		}
		
		
		
		
		
		
		
	}

}
