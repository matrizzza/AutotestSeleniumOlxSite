package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage extends ParentPage {
    @FindBy(id = "topLoginLink")
    private WebElement hrefMyProfile;

    public LandingPage(WebDriver webDriver) {
        super(webDriver);
    }
}
