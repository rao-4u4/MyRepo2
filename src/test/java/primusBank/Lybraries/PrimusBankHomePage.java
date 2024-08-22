package primusBank.Lybraries;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Utils.AppUtils;

public class PrimusBankHomePage extends AppUtils{

public boolean AdminLoginPage(String username,String paswrd)
{
	driver.findElement(By.id("txtuId")).sendKeys(username);
	driver.findElement(By.id("txtPword")).sendKeys(paswrd);
	driver.findElement(By.id("login")).click();
	
	String expecturl, acturl;
	
	expecturl = "adminflow";
	acturl = driver.getCurrentUrl();
	if(acturl.toLowerCase().contains(expecturl.toLowerCase())) {
		return true;
	}else {
		return false;
	}
	
}

public boolean bankerLogin(String branchname,String username,String paswrd) 
{
	WebElement brn = driver.findElement(By.id("drlist"));
	Select brlist = new Select(brn);
	brlist.selectByValue("Ameerpet");
	driver.findElement(By.id("txtuId")).sendKeys(username);
	driver.findElement(By.id("txtPword")).sendKeys(paswrd);
	driver.findElement(By.id("login")).click();
	String exptdelmt = "Payments";
	String actlelment = "Payments";
	if(exptdelmt.equals(actlelment))
	{
		return true;
	}else 
	{
		return false;
	}
}

}
