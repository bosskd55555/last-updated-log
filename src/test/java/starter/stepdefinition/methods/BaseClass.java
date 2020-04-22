package starter.stepdefinition.methods;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Logger;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import pageobject.Loginpage_crm;
import starter.utility.ReadConfig;

public class BaseClass
{
	
	
	@Managed	
	 static WebDriver driver;
	
	 static Logger log = Logger.getLogger("devpinoyLogger");
	 ReadConfig readconfig=new ReadConfig();
	 
	 
	
	
	

	
	
	/*@Step("launching chrome and URL")
	
	public void dashboard_login()
	{
		String baseURL=readconfig.getApplicationURL();
		System.out.println("the base URL is--------" + baseURL);
		
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
		
	}*/
	
	//public String baseURL=readconfig.getApplicationURL();
	//public String username=readconfig.getUsername();
	
	//public String password=readconfig.getPassword();
	//public static WebDriver driver;*/
	
	/*@Parameters("browser")
	@BeforeClass
	public void setup(String br) throws InterruptedException
	{
		
		 
		
		
		if(br.equals("chrome"))
		{
			
			System.setProperty("webdriver.chrome.driver",readconfig.getChromepath());
			
			//System.setProperty("webdriver.chrome.driver","F://sel//Selenium//drivers//chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			log.info("browser opened");
			
		}
		
		if(br.equals("firefox"))
		{
			
			System.setProperty("webdriver.gecko.driver",readconfig.getChromepath());
			driver=new FirefoxDriver();
			
		}
		
		if(br.equals("ie"))
		{
			
			System.setProperty("webdriver.ie.driver",readconfig.getChromepath());
			driver=new InternetExplorerDriver();
			
		}
		
		
		driver.get(baseURL);
		//driver.get("http://demo.guru99.com/v4/index.php");
		Thread.sleep(4000);
		
		
		
	}*/
	

	
	
	public void captureScreen(WebDriver driver,String tname) throws IOException, InterruptedException
	{
		
		Thread.sleep(3000);
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File target=new File("C://Selenium//HybridFramework//Inetbanking//Screenshots//"+ tname +".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
		log.info("screenshot taken");
		
		
		
	}

	
}