package homePage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseUI
{
	
	public WebDriver driver;
	public Properties prop;
	
	public void invokebrowser(String browser)
	{
		if(browser.equalsIgnoreCase("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		
	
		
		if(prop == null)
		{
			prop = new Properties();
			try {
				FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\objectrepository\\projectconfig");
				prop.load(file);
			} 
			catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
	public void openURL(String websiteURLKey)
	{
		driver.get(prop.getProperty(websiteURLKey));
	}
	
    public void clickelement(String ourmenuKey)
    {
    	driver.findElement(By.xpath(prop.getProperty(ourmenuKey))).click();
    }
    public void elementclick(String xpath)

    {
    	driver.findElement(By.xpath(xpath)).click();
    }
    
    
    public void quitbrowser()
    {
    	driver.quit();
    }
}