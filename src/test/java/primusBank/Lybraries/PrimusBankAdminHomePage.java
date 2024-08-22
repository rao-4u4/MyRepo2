package primusBank.Lybraries;

import org.openqa.selenium.By;

import Utils.AppUtils;

public class PrimusBankAdminHomePage extends AppUtils {

	public boolean AdminlogoutPage() {
		
		driver.findElement(By.xpath("//img[contains(@src, 'images/admin_but_03.jpg')]")).click();
		if(driver.findElement(By.id("login")).isDisplayed())
		{
			return true;
			
		}else {
			return false;
		}
	}
}
