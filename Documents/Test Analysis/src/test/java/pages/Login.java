package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {

	WebDriver driver;
	
	By username_FB=By.name("email");
	By password_FB=By.name("pass");
	By loginBtn_FB = By.xpath("//*[@data-testid='royal_login_button']");
	
	
	public Login(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void setUsername(String strusername)
	{
		driver.findElement(username_FB).sendKeys(strusername);
	}
	
	public void setPassword(String strpassword)
	{
		driver.findElement(password_FB).sendKeys(strpassword);
	}
	
	public void clickLogin()
	{
		driver.findElement(loginBtn_FB).click();
	}
	
	public void LoginToFB(String strusername, String strpassword )
	{
		this.setUsername(strusername);
		this.setPassword(strpassword);
		this.clickLogin();
	}
	
}
