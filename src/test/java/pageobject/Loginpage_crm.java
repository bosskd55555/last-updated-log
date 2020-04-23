package pageobject;

import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.thucydides.core.annotations.Managed;

	
	public class Loginpage_crm{
		
		static Logger log = Logger.getLogger("devpinoyLogger");
		
		WebDriver ldriver;
		
		public Loginpage_crm(WebDriver rdriver) {
			
			ldriver=rdriver;
			PageFactory.initElements(rdriver,this);
		}

		
		
		@FindBy(xpath="//*[@id=\"ui\"]/div/div/form/div/div[1]/div/input")
		WebElement txtUsername;
		

		@FindBy(xpath="//*[@id=\"ui\"]/div/div/form/div/div[2]/div/input")
		WebElement txtPassword;


		@FindBy(xpath="//*[@id=\"ui\"]/div/div/form/div/div[3]")
		WebElement btnLogin;
		
		
		
		
	public void setUsername(String uname) throws InterruptedException
	{
		
		Thread.sleep(10000);
		txtUsername.sendKeys(uname);
	}

	public void setPassword(String pwd) throws InterruptedException
	{
		Thread.sleep(10000);
		txtPassword.sendKeys(pwd);
	}

	public void clickSubmit()
	{
		log.info("clicking login button");
		btnLogin.click();;
	}
	

}
