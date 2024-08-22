package PrimusBankTestCases;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Utils.AppUtils;
import primusBank.Lybraries.PrimusBankHomePage;
import primusBank.Lybraries.bankerHomePage;

public class bankerLoginTestCase extends AppUtils {
	@Parameters({"brnm","empnm","emppaswrd"})
	@Test
public void checkBankerLogin(String brname,String empname,String passwrd) {
	PrimusBankHomePage lg = new PrimusBankHomePage();
	boolean res = lg.bankerLogin(brname,empname,passwrd);
	Assert.assertTrue(res);
	}
	public void checkBankerlogout() {
	bankerHomePage hp = new bankerHomePage();
	boolean a = hp.bankerlogout();
	Assert.assertTrue(a);
	}
}

