package Myfirstpack;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chromecheckbox {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Venkata\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.spicejet.com");
		
		ArrayList<WebElement>check=(ArrayList<WebElement>) driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		System.out.println("No of Checkbox in this pages is"+"   "+ check.size());
		
		
		for (int i=0;i<check.size();i++){
			
			System.out.println("Checkbox name is"+ "  "+check.get(i).getAttribute("name"));
		}
		
		
		
		
		
		
		WebElement family =driver.findElement(By.name("ctl00$mainContent$chk_friendsandfamily"));
		family.click();
			
			if(family.isSelected()){
				
				
				System.out.println("Active Check box is"+ "  "+family);
			} else {
				
				System.out.println("Inactive check box is"+ "   "+ family);
			}
		}
		
		
		
	}


