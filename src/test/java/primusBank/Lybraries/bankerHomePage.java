package primusBank.Lybraries;

import org.openqa.selenium.By;

import Utils.AppUtils;

public class bankerHomePage extends AppUtils{

	public boolean bankerlogout() 
	{
		driver.findElement(By.xpath("//*[@src='images/admin_but_03.jpg']")).click();
		if(driver.findElement(By.id("login")).isDisplayed())
		{
			return true;
		}else
		{
			return false;
		}
		
	}
	

}
