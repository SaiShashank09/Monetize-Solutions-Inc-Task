package testcases;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import pages.AccounttCreation;

import pages.Login;

public class TestLogin {

	
	
	WebDriver driver;
    Login objLogin;


    @BeforeTest
    public void setup()
    {
    	System.setProperty("webdriver.firefox.marionette","/Users/saishashanksarikonda/Documents/Sai-Testing/geckodriver");
    	driver = new FirefoxDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.facebook.com/");
    }
    
    
    @Test(priority=0)
    public void test_Home_Page_Appear_Correct(){
    objLogin = new Login(driver);
    String loginpageTitle= driver.getTitle();
    Assert.assertTrue(loginpageTitle.contains("Facebook"));
    objLogin.LoginToFB("abcdef", "abcd123");
    
    }
    
	@Test(priority = 1)
	public void Fb_SignUp() {
		AccounttCreation acct_crt = new AccounttCreation();
		String loginpageTitle = driver.getTitle();
		Assert.assertTrue(loginpageTitle.contains("Facebook"));
		acct_crt.Firstname("abcd");
		acct_crt.Lastname("xyz");
		acct_crt.EmailID("qwerty@gmail.com");
		acct_crt.NewPassword("12345");
		acct_crt.Month("Apr");
		acct_crt.Day("16");
		acct_crt.Year("1987");
		acct_crt.SelectMaleRadioButton();

		acct_crt.SubmitButton();

	}
    
    
    
}
