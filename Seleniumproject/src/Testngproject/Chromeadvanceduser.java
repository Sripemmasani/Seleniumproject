package Testngproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Chromeadvanceduser {
	
	
	WebDriver driver;
	
	@BeforeTest
public void open(){
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Venkata\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	driver=new ChromeDriver();
	
	driver.get("https://www.mercurytravels.co.in");
	

}
	
	@Test
	
	public void dclic(){
		
		Actions ac=new Actions(driver);
		WebElement click=driver.findElement(By.linkText("Luxury Rails"));
		
		ac.doubleClick(click).build().perform();
		
		
	}
	
	
	
	@Test
	
	public void rclick(){
		
		Actions ac=new Actions(driver);
		WebElement rc=driver.findElement(By.xpath(" //*[@id='bs-example-navbar-collapse-1']/ul/li[7]/a"));
		
		ac.contextClick(rc).build().perform();
		
		
		
	}
	
	@Test
	
	public void mouse(){
		
		Actions ac=new Actions(driver);
		WebElement mc=driver.findElement(By.xpath("//*[@id='bs-example-navbar-collapse-1']/ul/li[8]/a"));
		
		ac.moveToElement(mc).build().perform();
	}
}