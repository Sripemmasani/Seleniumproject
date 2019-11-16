package Testngproject;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demotest {
	
	
	@BeforeTest
	public void open(){
	System.out.println(" Open the URL");
	}
	
	@Test
	
	public void Register(){
		
		System.out.println("Register for new Accounnt");
		
	}
	
    @Test
	
	public void login(){
		
		System.out.println("Login here");
		
	
    }
    
     @Test
	
	public void drepoerts(){
		
		System.out.println("Send daliy reports");
		
  }

   @Test

    public void sendreports(){
	
	System.out.println("send reports");
	
  }


  @Test

    public void logout(){
	
	System.out.println("Log off");
	
  }
  
  
  @AfterTest
	
	public void close(){
		
		System.out.println("Close the website");
		


  }






}
