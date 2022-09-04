package stepdefinitions;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class AddCustomerStepDefinition {
//	WebDriver driver;
//
//	@Given("^User is already on login Page$")
//	public void user_is_already_on_login_Page() {
//		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//		driver.get("https://techfios.com/billing/?ng=admin/");	
//		driver.manage().window().maximize();
//
//	}
//
//	@When("^Title of Login Page is Free CRM$")
//	public void title_of_Login_Page_is_Free_CRM(){
//		String title = driver.getTitle();
//		System.out.println(title);
//		Assert.assertEquals("Login - iBilling", title);
//	}
//
//	@Then("^User enters username and password$")
//	public void user_enters_username_and_password(DataTable credentials) {
//		for(Map<String, String > data : credentials.asMaps(String.class, String.class)) {
//		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(data.get("username"));		// don't give hard code value: username
//		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(data.get("password"));	
//		}
//
//	}
//
//	@Then("^User clicks on Login Button$")
//	public void user_clicks_on_Login_Button(){
//		driver.findElement(By.xpath("//button[@name='login']")).click();
//	}
//
//	@SuppressWarnings("deprecation")
//	@Then("^User is on Home Page$")
//	public void user_is_on_Home_Page() throws InterruptedException{
//		String title = driver.getTitle();
//		Assert.assertEquals("Dashboard- iBilling", title);
//		Thread.sleep(2000);
//
//	}
//
//	
//	@SuppressWarnings("deprecation")
//	@Given("^User is already on Login Page$")
//	public void user_is_already_on_Login_Page() throws Throwable {
//		WebElement verifyDashboard = driver.findElement(By.xpath("//h2[text()=' Dashboard ']"));
//		String dashboard = verifyDashboard.getText();
//		Assert.assertEquals("Dashboard", dashboard);
//	}
//
//	@Then("^User is on Add Customer Page$")
//	public void user_is_on_Add_Customer_Page() {
//		driver.findElement(By.xpath("//span[text()='Customers']")).click();
//		driver.findElement(By.xpath("//a[text()='Add Customer']")).click();
//	}
//
//	@Then("^User fill out all information$")
//	public void user_fill_out_all_information() {
//		driver.findElement(By.xpath("//input[@id='account']")).sendKeys("sokoeurn chhay");
//		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sokoeurn.chhay@gmail.com");
//		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("5012153790");
//	}
//
//	@Then("^User clicks on Save Button$")
//	public void user_clicks_on_Save_Button() throws Throwable {
//		driver.findElement(By.xpath("//button[@id='submit']")).click();
//	}
//
//	@Then("^user close Browser$")
//	public void user_close_Browser()  {
//		driver.quit();
//	}

}
