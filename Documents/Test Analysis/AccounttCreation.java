package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AccounttCreation {

	WebDriver driver;
	Login login= new Login(driver);
	
	By firstname = By.name("firstname");
	By lastname = By.name("lastname");
	By emailid = By.name("reg_email__");
	By newpswd = By.name("reg_passwd__");
	By month = By.name("birthday_month");
	By day = By.name("birthday_day");
	By year = By.name("birthday_year");
	By radioBtn_male = By.xpath("//*[@data-name='gender_wrapper']/span[2]/input");
	
	By submitBtn = By.name("websubmit");
	
	public void Firstname(String f_name)
	{
		driver.findElement(firstname).sendKeys(f_name);
	}
	
	public void Lastname(String l_name)
	{
		driver.findElement(lastname).sendKeys(l_name);
	}
	
	public void EmailID(String email_id)
	{
		driver.findElement(emailid).sendKeys(email_id);
	}
	
	public void NewPassword(String new_pwd)
	{
		driver.findElement(newpswd).sendKeys(new_pwd);
	}
	
	public void Month(String mnth)
	{
		Select se = new Select(driver.findElement(month));
		se.selectByVisibleText(mnth);
	}
	
	public void Day(String birth_day)
	{
		Select se = new Select(driver.findElement(day));
		se.selectByVisibleText(birth_day);
	}
	
	public void Year(String yr)
	{
		Select se = new Select(driver.findElement(year));
		se.selectByVisibleText(yr);
	}
	
	public void SelectMaleRadioButton()
	{
		WebElement we = driver.findElement(radioBtn_male);
		we.click();
	}
	
	
	public void SubmitButton()
	{
		WebElement we = driver.findElement(submitBtn);
		we.click();
	}
	
}
