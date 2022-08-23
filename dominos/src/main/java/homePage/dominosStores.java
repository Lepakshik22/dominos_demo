package homePage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class dominosStores extends baseUI {
	
    @Test
	public void selectLocation() throws InterruptedException
	{

		invokebrowser("Chrome");
		openURL("websiteURL");
		elementclick("//a[text()=\"DOMINO'S STORES\"]");
		
		try 
		{
		    // WebDriverWait wait = new WebDriverWait(driver, 20);
		    // wait.until(ExpectedConditions.alertIsPresent());
			 Thread.sleep(4000);
		     Alert alt = driver.switchTo().alert();
		     alt.accept();
		}
		catch(Exception e)
		{
			System.out.println("no alert");
		}
	    WebElement location = driver.findElement(By.id("normal-search-block"));
	    location.sendKeys("chennai");
	    Thread.sleep(3000);
	    location.sendKeys(Keys.ARROW_DOWN);
	    location.sendKeys(Keys.ENTER);
		
		driver.quit();
    }
    

	
    
    @Test
    public void advanceSearch()
    {

		invokebrowser("Chrome");
		openURL("websiteURL");
		elementclick("//a[text()=\"DOMINO'S STORES\"]");
 
		
		driver.findElement(By.xpath("//a[@href=\"#advsearch\"]")).click();
    	WebElement state = driver.findElement(By.xpath("//*[@id='advanced-search-block-state']"));
    	
    	Select select = new Select(state);
    	select.selectByValue("20");
    	
    	WebElement city = driver.findElement(By.id("advanced-search-block-city"));
    	Select select1 = new Select(city);
    	select1.selectByValue("90");
    	
    	WebElement locality = driver.findElement(By.id("advanced-search-block-locality"));
    	Select select2 = new Select(locality);
    	select2.selectByValue("5793");
    	
    	driver.findElement(By.id("advanced-search-block-submit")).click();
    	
    }

}
