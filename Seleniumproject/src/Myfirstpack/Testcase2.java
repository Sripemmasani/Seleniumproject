package Myfirstpack;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Testcase2 {

	public static void main(String[] args) {
		
System.setProperty("webdriver.gecko.driver","C:\\Users\\Venkata\\Downloads\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		
		
		WebDriver driver = new FirefoxDriver();
		
			
		
		driver.get("http://the-internet.herokuapp.com/");
		
		driver.findElement(By.linkText("Key Presses")).click();
		
		
		
		
    driver.findElement(By.id("target")).sendKeys(Keys.ENTER);
		
		String acctual= driver.findElement(By.id("result")).getText();
		
		System.out.println(acctual);
		
		String expected ="You entered: ENTER";
		
		Assert.assertEquals(acctual, expected,"You entered: ENTER");
		
		
       driver.findElement(By.id("target")).sendKeys(Keys.TAB);
		
		String t2= driver.findElement(By.id("result")).getText();
		
		System.out.println(t2); 
		
		Assert.assertEquals(t2, "You entered: TAB"); 

		
     driver.findElement(By.id("target")).sendKeys(Keys.ESCAPE);
		
		String t3= driver.findElement(By.id("result")).getText();
		
		System.out.println(t3);
		
		Assert.assertEquals(t3, "You entered: ESCAPE");
		
		
		 driver.findElement(By.id("target")).sendKeys(Keys.SPACE);
			
			String t4= driver.findElement(By.id("result")).getText();
			
			System.out.println(t4);
				
		
		Assert.assertEquals(t4, "You entered: SPACE");  
		
		
		
		
		
		
		
	}

}
