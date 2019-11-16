package Myfirstpack;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testcase3 {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Venkata\\Downloads\\geckodriver-v0.21.0-win64\\geckodriver.exe");
				
				
				WebDriver driver = new FirefoxDriver();	
				
				
				
				driver.get("http://the-internet.herokuapp.com/");
				
				driver.findElement(By.linkText("Infinite Scroll")).click();
				
				driver.manage().window().maximize();

				 JavascriptExecutor js = (JavascriptExecutor) driver;
				 
				
			for(int i=1;i<3;i++){
					 
					 
					 js.executeScript("window.scrollTo(0,2000)");
					 
					 Thread.sleep(2000);
					 
					 
			 }
				
				
				
								
			 for(int j=1;j<3;j++){
					 
                 js.executeScript("window.scrollBy(0,-1500)");
					 
					 Thread.sleep(2000);
					 
				 }
				
				 
				  String actual=driver.findElement(By.xpath("//*[@id='content']/div/h3")).getText();
				
				  System.out.println(actual); 
				  
				  
}
}