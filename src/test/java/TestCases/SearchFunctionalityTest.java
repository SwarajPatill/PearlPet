package TestCases;

import java.util.List;

import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.MainNavigation;
import PageObjects.SearchFunctionality;
import TestBase.BaseClass;

public class SearchFunctionalityTest extends BaseClass {
	 
	public SearchFunctionality Sf;
	
	@Test(priority=1,groups= {"sanity","Regression","smoke"})
	public void Verify_SearchIcon() {

		Sf = new SearchFunctionality (driver);
		Sf.click_Search();
	
		log.info("Search Functionality verified successfully....");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
	
	@Test(priority=2,groups= {"sanity","Regression","smoke"})
	public void Verify_SearchBox() {

		Sf = new SearchFunctionality (driver);
		Sf.click_SearchBox();
	
		log.info("Search Functionality verified successfully....");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
	
	@Test(priority=3,groups= {"sanity","Regression","smoke"})
	public void Verify_Suggestions() {
		System.out.println("All suggestion are :-");
		Sf = new SearchFunctionality (driver);

		// Fetch the list
		List<String> allSuggestions = Sf.getAllSuggestionTexts();

		// Print all suggestions
		for (String suggestion : allSuggestions) {
		    System.out.println(suggestion);
		}

	
		log.info("Suggestion Functionality verified successfully....");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
	
	
	
}
