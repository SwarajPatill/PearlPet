package PageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchFunctionality extends BasePage{

	public SearchFunctionality(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//summary[@aria-label='Search']//span//*[name()='svg']")
	WebElement SearchIcon ;
	
	@FindBy(xpath="//input[@id=\"Search-In-Modal\"]")
	private WebElement SearchBox;
	
	//ul[@id="predictive-search-results-queries-list"]
	
	@FindBy(xpath = "//ul[@id='predictive-search-results-queries-list']//li")
	private List<WebElement> suggestions;
;
	
	public void click_Search() {
		SearchIcon.click();
	}
	
	public void click_SearchBox() {
		SearchBox.sendKeys("Bottle");
		SearchBox.click();
	}
	
	


	// Method to get all suggestion texts
	public List<String> getAllSuggestionTexts() {
	    List<String> suggestionTexts = new ArrayList<>();
	    for (WebElement suggestion : suggestions) {
	        suggestionTexts.add(suggestion.getText());
	    }
	    return suggestionTexts;
	}



	
	

}
