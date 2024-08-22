package PrimusBankTestCases;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Utils.AppUtils;
import primusBank.Lybraries.PrimusBankAdminHomePage;
import primusBank.Lybraries.PrimusBankHomePage;

public class AdminLoginTest  extends AppUtils{
	@Parameters({"userid","passwrd"})
	@Test
	public void checkAdminLogin(String uid, String paswrd)
	{
		PrimusBankHomePage hp = new PrimusBankHomePage();
		boolean res = hp.AdminLoginPage(uid, paswrd);
		Assert.assertTrue(res);
		
		PrimusBankAdminHomePage ap = new PrimusBankAdminHomePage();
		ap.AdminlogoutPage();
		boolean x = hp.bankerLogin("Ameerpet", "manu", "1234");
		Assert.assertTrue(x);
		
		
	}
	
}
