package com.exer.table.runner;

 
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.exer.table.allpages.LoginPage;

import AllPageObjects.CommonObjects;



public class Page {
	
	WebDriver driver;
	
	LoginPage objLogin;
	
	CommonObjects objCommonObjects;
	

	@BeforeTest
	public void openURL() {

		System.setProperty("webdriver.chrome.driver", "/Users/saishashanksarikonda/Documents/Sai-Testing/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.linkedin.com/");
		
	}



	
      
	   @Test(priority=0)
       public void HomePageTitle() 
	   
	   {
    	   objLogin = new LoginPage(driver);
    	   String loginpageTitle=driver.getTitle();
    	   Assert.assertTrue(loginpageTitle.contains("LinkedIn: Log In or Sign Up"));
   	   
       }
	
	   
	   @Test(priority=1)
	   public void enterinfo() 
	   
	   {
		  
	objLogin.typefirstname("Shashank");
	objLogin.typelastname("Sai");
	objLogin.typeEmail("abc@gmail.com");
	objLogin.typepassword("abc@123");
		   
		   
	   }
	   
	   
       }
	    

      







