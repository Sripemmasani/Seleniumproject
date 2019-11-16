package Myfirstpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Testcase1 {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.gecko.driver","C:\\Users\\Venkata\\Downloads\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://the-internet.herokuapp.com/");
		
		
		driver.findElement(By.linkText("Form Authentication")).click();
		
		
		// correct UserName and wrong Password
		
		
		
	/*  driver.findElement((By.id("username"))).sendKeys("tomsmith");
		driver.findElement(By.id("password")).sendKeys("abcd");
		driver.findElement(By.xpath("//*[@id='login']/button/i")).click(); 

	   String actual=driver.findElement(By.id("flash")).getText();
			
			
	 

	  String expected= "You logged into a secure area!";
	
	  Assert.assertEquals(actual, expected,"you Enterd invalid Password"); */
	
	
	//Wrong UserName and correct Password
	
	
	
 //    driver.findElement((By.id("username"))).sendKeys("tomsmith");
//	driver.findElement(By.id("password")).sendKeys("SupperSecretPassword!");
	//driver.findElement(By.xpath("//*[@id='login']/button/i")).click(); 
	
	
	
	// Correct UserName and Correct Password
	
	
	
  driver.findElement((By.id("username"))).sendKeys("tomsmith");
	driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
	driver.findElement(By.xpath("//*[@id='login']/button/i")).click(); 
	
	  String actual=driver.findElement(By.xpath("//*[@id='content']/div/h4")).getText();
	  
	  System.out.println(actual);
		

	 String expected="Welcome to the Secure Area. When you are done click logout below.";
	 
	 Assert.assertEquals(actual, expected,"you are logged in Password");
	  
	  
	  
	  
	//driver.findElement(By.xpath("//*[@id='content']/div/a")).click(); 
	
	
	
	
	
	
	
	
	}
}
