package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.ArrayList;
import java.util.List;

public class AddressPage extends BasePage{

    public AddressPage(WebDriver driver) {
        super(driver);
        // TODO Auto-generated constructor stub
    }

    @FindBy(xpath = "//span[normalize-space()=\"Contact Us\"]")
    private WebElement ContactUs;

    @FindBy(xpath = "//div[@class=\"image-with-text__text rte body\"]/p")
    private List<WebElement>Address;

    public void clickContactUs() {
        ContactUs.click();
    }

    public List<String> Get_Address(){
        List<String> addressTextList = new ArrayList<>();
        for(WebElement a : Address){
        String Text = a.getText();
            addressTextList.add(Text);
        }

        return addressTextList;
    }

}
