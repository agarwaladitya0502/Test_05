package step_definition_03;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Teststeps_03 {
	WebDriver driver;
	@Given("User is on Home Page")
	public void user_is_on_Home_Page() {
		
	  
	   System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.get("http://localhost:8083/TestMeApp/");
	   driver.manage().window().maximize();
	   
	    
	}

	@When("User Navigate to Login Page")
	public void user_Navigate_to_Login_Page() {
	
	    driver.findElement(By.xpath("//a[text()=' SignIn']")).click();  
	    
	    }
 

@When("User enters {string} and {string}")
	public void user_enters_and(String username, String password) {
		
		  driver.findElement(By.xpath("//input[@type='text']")).sendKeys(username);
		  driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
		  driver.findElement(By.name("Login")).click();
		 
		
	}

@Then("Message displayed Login Successfully")
public void message_displayed_Login_Successfully() {
	
	Assert.assertTrue(driver.findElement(By.xpath("//input[@type='submit']")).isDisplayed());
	driver.findElement(By.partialLinkText("SignOut")).click();
	
	
	}

@When("Users click on category")
public void Users_click_on_category()
{
	  driver.findElement(By.xpath("//button//h4[text()='Add Category']")).click();
}

@When("Users enters {string} and {string}")
public void Users_enters_and(String category, String subcategory)

{
      driver.findElement(By.name("catgName")).sendKeys("Sports");
      driver.findElement(By.name("catgDesc")).sendKeys("Sports");
      driver.findElement(By.xpath("//button//h4[text()='Add Sub Category']")).click();
      
}

}


