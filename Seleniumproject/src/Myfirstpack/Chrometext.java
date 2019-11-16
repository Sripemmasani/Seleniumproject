package Myfirstpack;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrometext {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Venkata\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.newtours.demoaut.com");
		
		
		ArrayList<WebElement> bname=(ArrayList<WebElement>) driver.findElements(By.tagName("b"));
		
		System.out.println("No of bold text are "+ "  "+ bname.size());
		
		ArrayList<WebElement> pname=(ArrayList<WebElement>) driver.findElements(By.tagName("p"));
		
		System.out.println("No of normal text"+ "  "+ pname.size());
		
		
		WebElement text=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[1]/table[1]/tbody/tr[3]/td/table/tbody/tr[1]/td[2]/div/font/b"));
		
		String ex="b";
		
		String ac=text.getTagName();
		
		if(ac. contains(ex)) {
		
		System.out.println("this is bold text");
		}else {
			
			System.out.println("this is not bold text");
		}
		
		
		
		
		
	}

}
