package starter.stepdefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import starter.stepdefinition.methods.Deals_page_object;
import starter.stepdefinition.methods.Loginpage_pageobject;

public class SearchOnDuckDuckGoStepDefinitions{

@Steps
Loginpage_pageobject test;

@Steps
Deals_page_object test2;
	
	
@Managed	
 WebDriver driver;

//Deals_page_object test2=new Deals_page_object();  



  @Given("^user is already on login page$")
 public void user_is_already_on_login_page() throws InterruptedException {
	 
	 /*System.setProperty("webdriver.chrome.driver","F://sel//Selenium//drivers//chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ui.freecrm.com/");*/
	  
	 test.dashboard_login();

     
 }


 @When("^title of the login page is Free CRM$")
 public void title_of_the_login_page_is_Free_CRM() {
     
//	 String title=driver.getTitle();
//	 Assert.assertEquals("Cogmento CRM", title);
	 
	 test.login();
	 
 }
 
 
 @Then("user clicks on deals button")
 public void user_clicks_on_deals_button() throws InterruptedException {
	// Deals_page_object test2=new Deals_page_object(); 
	 test2.click_on_deals();
	 
 }

 
 @Then("^user enters deals details$")
 public void user_enters_deals_details() throws InterruptedException {
 
	// Deals_page_object test2=new Deals_page_object();  
	test2.deals_dashboard();
	test2.dashboard_save();
	   
	   
		
		  
	   } 
	 
	 
	 
 
 
 
 
 @Then("^close the browser$")
 public void close_the_browser() {
     
	 driver.quit();
 }
 	
}

