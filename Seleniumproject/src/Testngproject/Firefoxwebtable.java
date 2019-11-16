package Testngproject;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Firefoxwebtable {

	
	ProfilesIni pr;
	FirefoxOptions op;
	FirefoxProfile fp;
	WebDriver driver;
	
	
	@BeforeTest
	
	public void open(){
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Venkata\\Downloads\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		
		pr=new ProfilesIni();
		
		fp=pr.getProfile("TestNg");
		
		op=new FirefoxOptions();
		
		op.setProfile(fp);
		
		driver=new FirefoxDriver();
		
		driver.get("https://www.timeanddate.com/worldclock/");
		
				
	}
	
	@Test (priority=0)
	
	public void table(){
		
		ArrayList<WebElement>table=(ArrayList<WebElement>) driver.findElements(By.tagName("table"));
		System.out.println("no of webtales are "+ "  "+table.size());
		
		
	}
	
	
	@Test (priority=1)
	public void rows(){
		
		ArrayList<WebElement>trows=(ArrayList<WebElement>) driver.findElements(By.tagName("tr"));
		
		System.out.println("No of rows are"+ " "+ trows.size());
	}
	
	
	@Test (priority=2)
	public void col(){
		
		ArrayList<WebElement>tcol= (ArrayList<WebElement>) driver.findElements(By.tagName("td"));
		
		System.out.println("no od Coloum are"+ "  "+tcol.size());
	}
	
	
	
	@Test (priority=3)
	
	public void rome(){
		
		String rome=driver.findElement(By.linkText("Rome")).getText();
		
		System.out.println("Rome Data is "+ "  "+ rome);
	}
	
	
	@Test (priority=4)
	
	public void firstrowdata(){
		
		String part1= "/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[";
				
		String part2="]/td[1]/a";		
				
		for( int i=1;i<37;i++){
			
			String data=driver.findElement(By.xpath(part1+i+part2)).getText();
			
			System.out.println(data);
			
	}
				
	}
	@Test (priority=5)
	
	public void cdata(){
		
		String p1="/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[";
		
		String p2="]/td[";
		
		String p3="]/a";
		
		for(int i=1;i<37;i++){
			
			for(int j=1;j<8;j++){
				
				String data1=driver.findElement(By.xpath(p1+i+p2+j+p3)).getText();
				
				System.out.println(data1);
			}
			
		}
	}		
		
		
		@Test (priority=6)
		
		public void randomtable(){
			
			driver.get("https://www.countries-ofthe-world.com/world-currencies.html");
			
			WebElement  rtable=driver.findElement(By.xpath("//*[@id='content']/div[2]/table"));
			
			
			ArrayList<WebElement>nrows=(ArrayList<WebElement>) rtable.findElements(By.tagName("tr"));
			
			for(int i=0;i<nrows.size();i++){
				
				ArrayList<WebElement>ncol=(ArrayList<WebElement>) nrows.get(i).findElements(By.tagName("td"));
				
				for(int n=0;n<ncol.size();n++){
					
					
					System.out.println(ncol.get(n).getText());
				}
				
			
		}
	}
		
		
}
				
				
				
				
				
				
				
				
				

	
	
	

