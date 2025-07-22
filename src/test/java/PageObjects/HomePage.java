package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//span[text()=\"Home\"]")
	private WebElement HomeButton;
	
	@FindBy(xpath="//title[text()=\"Pearlpet - Storing Happiness!\"]")
	private WebElement title;
	
	

	public void click_home() {
		HomeButton.click();
	}
	
	
	public String get_Title() {
		// TODO Auto-generated method stub
		String ActualTitle = driver.getTitle();
		//System.out.println(ActualTitle);
		return ActualTitle;
	}
	
	

}
