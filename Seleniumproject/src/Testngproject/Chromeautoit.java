package Testngproject;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Chromeautoit {
	
	
	WebDriver driver;
	
	
	@BeforeTest
	public void open(){
		
		
		System.setProperty("webdriver,chrome,driver","C:\\Users\\Venkata\\Downloads\\chromedriver_win32\\chromedriver.exe");	
		
		driver=new ChromeDriver();
		
		driver.get("https://www.pexels.com/photo/cottages-in-the-middle-of-beach-753626/");
		
		
	}
	
	@Test
	
	public void cutpic() throws IOException{
		
		
		driver.findElement(By.xpath("//*[@id='photo-page-top']/div/div[2]/div/div/div/div/a/span")).click();
		
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
			
			java.lang.Runtime.getRuntime().exec("C:\\Users\\Venkata\\Desktop\\OIVAuto\\autofile5.exe");
		
				
		
	}

	
	
	
}
