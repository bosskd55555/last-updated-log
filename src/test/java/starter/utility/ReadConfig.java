package starter.utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig{
	
	Properties pro;
	
	public ReadConfig()
	{
		File src=new File("./Configuration/config.properties");
		
		try
		{
			FileInputStream fis=new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);
		}
		catch (Exception e)
		{
			
			System.out.println("Exception is"+ e.getMessage());
		
		}
	}
		public String getApplicationURL()
		{
			
			String url=pro.getProperty("baseURL");
			return url;
		}
		
		public String getUsername()
		{
			
			String username=pro.getProperty("username");
			return username;
		}
		
		public String getPassword()
		{
			
			String password=pro.getProperty("password");
			return password;
		}
		
		public String getChromepath()
		{
			
			String chromepath=pro.getProperty("chromepath");
			return chromepath;
		}
		
		public String getdeal_title()
		{
			
			String deal_title=pro.getProperty("deal_title");
			return deal_title;
		}
		
		public String getdeal_amount()
		{
			
			String deal_amount=pro.getProperty("deal_amount");
			return deal_amount;
		}
		
		public String getdeal_prob()
		{
			
			String deal_prob=pro.getProperty("deal_prob");
			return deal_prob;
		}
		
		public String getdeal_comm()
		{
			
			String deal_comm=pro.getProperty("deal_comm");
			return deal_comm;
		}
		
		
		
		
		
	}
	
	
	
