package TestCases;

import PageObjects.AddressPage;
import TestBase.BaseClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;


public class ReadAddress extends BaseClass {
    public AddressPage Ap;
    List<String> Print_Address = new ArrayList<>();

    @Test(priority=1,groups= {"sanity","Regression","smoke"})
    public void Click_ContactUs(){
        Ap = new AddressPage(driver);
        Ap.clickContactUs();
    }

    @Test(priority=2,groups= {"sanity","Regression","smoke"})
    public void Print_Address(){
        Ap = new AddressPage(driver);

        Print_Address   = Ap.Get_Address();
        for(String text : Print_Address){
            System.out.println(text);

        }
    }


}
