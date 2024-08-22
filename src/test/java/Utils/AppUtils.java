package Utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class AppUtils {
	public static WebDriver driver;
	public static String url = "http:\\primusbank.qedgetech.com";
	@BeforeSuite
	public static void launchApp() {
		driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
			}
	@AfterSuite
	public static void teardown() {
		driver.close();
		
		
		
	}
	
	
	

}
