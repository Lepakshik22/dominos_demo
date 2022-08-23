package homePage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ourMenu extends baseUI {
	 
	
	@Test(groups= {"veg"})
	public void vegpizza()
	{
		invokebrowser("Chrome");
		openURL("websiteURL");
		clickelement("ourmenu");
		elementclick("//*[text()=\"veg pizzas\"]");
		elementclick("//*[text()=\"Double Cheese Margherita\"]");
		List<WebElement> item = driver.findElements(By.xpath("//*[@id=\"main-section\"]//tbody/tr"));
		System.out.println("Double Cheese Margherita");
		System.out.println(item.size());
		for(WebElement i : item)
		{
			System.out.println(i.getText());
		}
		quitbrowser();
	}
	
	@Test(groups= {"nonveg"})
	public void nonvegpizza()
	{
		invokebrowser("Chrome");
		openURL("websiteURL");
		elementclick("//*[@class=\"explore-heading\"]");
		elementclick("//*[text()=\"non veg pizzas\"]");
		elementclick("//*[text()=\"Chicken Dominator\"]");
		List<WebElement> item2 = driver.findElements(By.xpath("//*[@id=\"main-section\"]//tbody/tr"));
		System.out.println("Chicken Dominator");
		System.out.println(item2.size());
		for(WebElement j : item2)
		{
			System.out.println(j.getText());
		}
		quitbrowser();
	}
	
	@Test(groups= {"veg"})
	public void beverage()
	{
		invokebrowser("Chrome");
		openURL("websiteURL");
		elementclick("//*[@class=\"explore-heading\"]");
		elementclick("//a[text()='Beverages']");
		elementclick("//a[text()='Pepsi (500ml)']");
		WebElement price = driver.findElement(By.xpath("//*[@id=\"main-section\"]//span/text()"));
		System.out.println("price of pepsi is "+ price);
		quitbrowser();
	}

}
