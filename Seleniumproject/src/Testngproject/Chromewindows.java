package Testngproject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Chromewindows {
	
	WebDriver driver;
	
	@BeforeTest
	public void open(){
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Venkata\\Downloads\\chromedriver_win32\\chromedriver.exe");	
		
		driver=new ChromeDriver();
		
		driver.get("https://www.pexels.com/photo/red-dahlia-flower-60597/");
		
	}
	
	
	@Test (priority=0)
	
	public void picdown() throws AWTException{
		
		driver.findElement(By.xpath("//*[@id='photo-page-top']/div/div[2]/div/div/div/div/a/span")).click();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
		Robot rb=new Robot();
		
		rb.keyPress(KeyEvent.VK_ENTER);
		
		
		
	}
	
	
	@Test (priority=1)
	
	public void sedown() throws AWTException{
		
		
		driver.get("https://www.seleniumhq.org/download/");
		
		driver.findElement(By.linkText("3.141.59")).click();
		
		Robot rb=new Robot();
		
		rb.keyPress(KeyEvent.VK_ENTER);
		
		
	}
	
	
	
	@Test (priority=2)
	
	public void uppic() throws AWTException{
		
		driver.get("https://www.photobox.co.uk/upload");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
		driver.findElement(By.xpath("//*[@id='app']/div/div/fieldset/div/label[1]/div")).click();
		
		driver.findElement(By.xpath("//*[@id='device-info']/label")).click();
		
		Robot rb=new Robot();
		
		rb.keyPress(KeyEvent.VK_P);
		rb.keyPress(KeyEvent.VK_I);
		rb.keyPress(KeyEvent.VK_C);
		rb.keyPress(KeyEvent.VK_PERIOD);
		rb.keyPress(KeyEvent.VK_J);
		rb.keyPress(KeyEvent.VK_P);
		rb.keyPress(KeyEvent.VK_G);
		rb.keyPress(KeyEvent.VK_ENTER);
		
	}

}
