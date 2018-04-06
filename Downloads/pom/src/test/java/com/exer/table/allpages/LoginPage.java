package com.exer.table.allpages;


import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;





public class LoginPage {
	
	
	 WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	By firstname = By.id("reg-firstname");
	By lastname = By.id("reg-lastname");
	By email = By.id("reg-email");
	By password = By.xpath("//*[@id=\"reg-password\"]");

	
public void typefirstname(String fname) {
		
		
		driver.findElement(firstname).sendKeys("fname");
}

public void typelastname(String lname) {
	
	
		driver.findElement(lastname).sendKeys("lname");
		
}

public void typeEmail(String Email) {

		driver.findElement(email).sendKeys("Email");
		
}

public void typepassword(String Password) {
	
		driver.findElement(password).sendKeys("Password");
		
}

		
		
		}


	
	
	
