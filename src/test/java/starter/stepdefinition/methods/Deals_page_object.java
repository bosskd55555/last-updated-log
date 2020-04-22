package starter.stepdefinition.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import pageobject.deals_crm;
import starter.utility.ReadConfig;

public class Deals_page_object extends BaseClass {
	
	/*@Managed	
	 WebDriver driver;*/
	
	ReadConfig readconfig=new ReadConfig();
	
	
	
	@Step("entering username and password")	
	
	public void click_on_deals() throws InterruptedException
	{
		
		deals_crm dl=new deals_crm(driver);	
		Thread.sleep(10000);
		dl.deals_link();
		Thread.sleep(10000);
		dl.new_button();
		log.info("entering user name and password"); 
		 
		 
		 Thread.sleep(10000);
	
		

}
	
	@Step("entering deal details")	
	public void deals_dashboard()
	{
		log.info("entering deal details-entry");
		
		deals_crm dl=new deals_crm(driver);	
		
		dl.deals_title(readconfig.getdeal_title());
		dl.deals_amount(readconfig.getdeal_amount());
		dl.deals_probability(readconfig.getdeal_prob());
		dl.deals_commision(readconfig.getdeal_comm());
		 
		 
		

}

	@Step("saving it")	
	public void dashboard_save() throws InterruptedException
	{
		
		deals_crm dl=new deals_crm(driver);	
		 Thread.sleep(10000);
		  
		dl.deals_save_button();
	}	  

}
