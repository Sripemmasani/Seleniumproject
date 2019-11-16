package Myfirstpack;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeRadio {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Venkata\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver =new ChromeDriver();
		
		
		driver.get("https://www.mercurytravels.co.in/flights");
		
		ArrayList<WebElement> radio=(ArrayList<WebElement>) driver.findElements(By.xpath("//input[@type='radio']"));
		
		System.out.println("No of Radio buttons in this page is"+"  "+radio.size());
		
		for(int i=0;i<radio.size();i++){
			
			System.out.println("Name of the Radio is"+ "  "+ radio.get(i).getAttribute("name"));
		}
		
		
		for(int j=0;j<radio.size();j++){
			
			if(radio.get(j).isSelected()){
				
				System.out.println("Active Radio is "+ "  "+ radio.get(j).getAttribute("name"));
				
				
			}else{
				
				System.out.println("NotActive Radio is"+" "+radio.get(j).getAttribute("name"));
			}
			
		}
		
		
		
		
	}

}
