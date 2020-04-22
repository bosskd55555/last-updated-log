package starter.stepdefinition.methods;

import org.openqa.selenium.chrome.ChromeDriver;

import net.thucydides.core.annotations.Step;
import pageobject.Loginpage_crm;

public class Loginpage_pageobject extends BaseClass   {
	
	/*@Managed	
	 WebDriver driver;*/
	
	
	@Step("launching chrome and URL")
	
	public void dashboard_login()
	{
		 System.setProperty("webdriver.chrome.driver","F://sel//Selenium//drivers//chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://ui.freecrm.com/");
		
		
			Loginpage_crm lp=new Loginpage_crm(driver);	
		lp.setUsername("kannan21109444@gmail.com");
		lp.setPassword("Aswath555.");
	}
	
	@Step("login the app")
	
	public void login()
	{
		
		Loginpage_crm lp=new Loginpage_crm(driver);	
		lp.clickSubmit();
		
	}

}
