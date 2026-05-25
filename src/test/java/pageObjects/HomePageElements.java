package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageElements extends BaseObject{

    public HomePageElements(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(id = "search-autocomplete-input")
    public WebElement serachBox;

    @FindBy(xpath = "//button[@class='cds-149 cds-iconButton-small cds-iconButton-primary cds-iconButton-small cds-iconButton-primary css-pneq06']")
    public WebElement searchButton;

    @FindBy(partialLinkText = "For Businesses")
    public WebElement linkForBusinesses;

    public boolean isSearchButtonEnabled()
    {
        return searchButton.isEnabled();
    }

    public boolean setSerachBox() {
        serachBox.click();
        serachBox.sendKeys("Web Developement Courses");
        searchButton.click();
        boolean result = searchButton.isDisplayed();
        return result;
    }

    public void clickLinkForBusinesses()
    {
        linkForBusinesses.click();
    }
}
