package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ForBusinessesPage extends BaseObject
{
    public ForBusinessesPage(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(xpath = "//button[@class='cds-149 cds-button-disableElevation cds-button-ghost css-7mewja']//span[text()='Solutions']")
    WebElement soltionBtn;

    @FindBy(partialLinkText = "Skills Tracks")
    WebElement skillsTracksBtn;

    @FindBy(xpath = "//a[@class='cds-149 cds-button-disableElevation cds-button-primary css-g3vqgc']")
    WebElement formBtn;

    public void getReadyTOTransformForm()
    {
        Actions actions = new Actions(driver);
        actions.moveToElement(soltionBtn).perform();
        skillsTracksBtn.click();
        actions.scrollToElement(formBtn).perform();
        actions.moveToElement(formBtn).click().perform();
    }
}
