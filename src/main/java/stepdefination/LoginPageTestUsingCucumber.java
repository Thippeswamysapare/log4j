
package stepdefination;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import junit.*;
public class LoginPageTestUsingCucumber 

{
	WebDriver driver;
	@Given("^user entered in login page$")
	public void user_entered_in_login_page()
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://202.138.101.166/Calllogsystem");
				
	}
	
	@When("^verifying login page$")
	public void verifying_login_page()
	{
		String title=driver.getTitle();
		Assert.assertEquals("Login Page", title); //Login Page
		
	}
	
	
	@Then("^login with valid user name and password$")
	public void login_with_valid_user_name_and_password()
	{
		driver.findElement(By.name("txtuser")).sendKeys("3693014");
		driver.findElement(By.name("txtpwd")).sendKeys("Bhoomi@123");
		
	}
	
	@Then("^click on login button$")
	public void click_on_login_button()
	{
		driver.findElement(By.name("btnlgn")).click();
	}
	
	
	//Main Menu Page
	@Then("^varifying home page$")
	public void varifying_home_page()
	{
		String homePageTitle=driver.getTitle();
		Assert.assertEquals("Main Menu Page",homePageTitle);
	}
	
	@Then("^click on logout button$")
	public void click_on_logout_button()
	{
	 driver.findElement(By.xpath("//a[@class='Menu1_1 Menu1_3 Menu1_12']"));
	}
	
	@And("^logout the application$")
	public void logout_the_application()
	{
		driver.quit();
	}
}
