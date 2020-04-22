package pageobject;

import java.util.logging.Logger;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class deals_crm {

	static Logger log = Logger.getLogger("devpinoyLogger");
/*	WebDriver ldriver;
	
	public deals_crm(WebDriver rdriver) {
		
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}*/
	
	WebDriver ldriver;
	
	public deals_crm(WebDriver ndriver) {
		
		ldriver=ndriver;
		PageFactory.initElements(ndriver,this);
	}

	
	
	@FindBy(xpath="//*[@id=\"main-nav\"]/a[5]/span")
					
	WebElement deals_link;
	

	@FindBy(xpath="//*[@id=\"dashboard-toolbar\"]/div[2]/div/a[3]/button")
	WebElement new_button;


	@FindBy(name="title")
	WebElement deals_title;
	
	
	@FindBy(name="amount")
	WebElement deals_amount;
	

/*	@FindBy(xpath="//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[1]/div[1]/div/div/input")
	WebElement deals_probability;
	*/
	@FindBy(name="probability")
	WebElement deals_probability;


	@FindBy(name="commission")
	WebElement deals_commision;
	
	
	@FindBy(xpath="//*[@id=\"dashboard-toolbar\"]/div[2]/div/button[2]")
	WebElement deals_save_button;
	
	
	
	public void deals_link() throws InterruptedException
	{
		
	log.info("deals link clicked inside");
		Thread.sleep(10000);
		deals_link.click();
	}
	
	
	public void new_button()
	{
		
		new_button.click();
	}
	
	
public void deals_title(String dl_title)
{
	
	deals_title.sendKeys(dl_title);
}

public void deals_amount(String dl_amnt)
{
	
	deals_amount.sendKeys(dl_amnt);
}

public void deals_probability(String prob)
{
	
	deals_probability.sendKeys(prob);
}

public void deals_commision(String comm)
{
	
	deals_commision.sendKeys(comm);
}

public void deals_save_button()
{
	
	deals_save_button.click();
}

}
