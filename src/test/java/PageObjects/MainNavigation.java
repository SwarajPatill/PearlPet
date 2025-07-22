package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainNavigation extends BasePage{

	public MainNavigation(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//span[text()=\"Home\"]")
	private WebElement HomeButton;
	
	@FindBy(xpath="//span[text()=\"Shop\"]")
	private WebElement ShopButton ;
	
	@FindBy(xpath="//span[text()=\"About us\"]")
	private WebElement About_UsButton ;
	
	@FindBy(xpath="//span[text()=\"Contact Us\"]")
	private WebElement Contact_UsButton;

	public void click_home() {
		HomeButton.click();
	}
	
	public void click_Shop() {
		ShopButton.click();
	}
	
	public void click_AboutUs() {
		About_UsButton.click();
	}
	
	public void click_ContactUs() {
		Contact_UsButton.click();
	}
	
	public String get_Title() {
		// TODO Auto-generated method stub
		String ActualTitle = driver.getTitle();
		//System.out.println(ActualTitle);
		return ActualTitle;
	}
	
	

}
