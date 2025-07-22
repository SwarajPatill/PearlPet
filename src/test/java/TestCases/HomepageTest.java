package TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import TestBase.BaseClass;

public class HomepageTest extends BaseClass {
	public HomePage Hp;
	
	@Test(priority=1,groups= {"sanity","Regression","smoke"})
	public void Verify_WebPage() {

		Hp = new HomePage (driver);
		Hp.click_home();;
	
		log.info("HomePage verified successfully....");
		
	
	}
	
	@Test(priority=2,groups= {"sanity","Regression","smoke"})
	public void Verify_title() {
		Hp = new HomePage (driver);
		String Actual_Title = Hp.get_Title();
		String Expected_Title = p.getProperty("title");
		Assert.assertEquals(Actual_Title, Expected_Title);
		System.out.println("Title verified successfully...");
		System.out.println(Actual_Title);
		log.info("Title verified successfully....");

	}
}
