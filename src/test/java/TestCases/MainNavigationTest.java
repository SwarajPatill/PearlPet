package TestCases;

import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.MainNavigation;
import TestBase.BaseClass;

public class MainNavigationTest extends BaseClass {
	 
	public MainNavigation Mn;
	
	@Test(priority=1,groups= {"sanity","Regression","smoke"})
	public void Verify_HomeNavigationMenu() {

		Mn = new MainNavigation (driver);
		Mn.click_home();;
	
		log.info("Home Navigation verified successfully....");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
	
	
	@Test(priority=2,groups= {"sanity","Regression","smoke"})
	public void Verify_ShopNavigationMenu() {

		Mn = new MainNavigation (driver);
		Mn.click_Shop();
	
		log.info("Shop Navigation verified successfully....");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@Test(priority=3,groups= {"sanity","Regression","smoke"})
	public void Verify_ContactUsMenu() {

		Mn = new MainNavigation (driver);
		Mn.click_ContactUs();
	
		log.info("ContactUs Navigation verified successfully....");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	
	@Test(priority=4,groups= {"sanity","Regression","smoke"})
	public void Verify_AboutUsMenu() {

		Mn = new MainNavigation (driver);
		Mn.click_AboutUs();
	
		log.info("AboutUs Navigation verified successfully....");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
