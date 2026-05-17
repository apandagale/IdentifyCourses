package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CoursesPage extends BaseObject {

    public CoursesPage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//button[@data-testid='filter-dropdown-language']")
    WebElement languageDropdown;

    @FindBy(xpath = "//div[@class='cds-checkboxAndRadio-labelText']")
    WebElement englishLanguageDropdownCheckbox;

    @FindBy(xpath = "//div[@class='css-ksf52d']")
    List<WebElement> languages;

    @FindBy(xpath = "//button[@class='cds-149 cds-button-disableElevation cds-button-primary css-jqo50y']")
    WebElement viewButton;


    @FindBy(xpath = "//button[@data-testid='filter-dropdown-productDifficultyLevel']")
    WebElement levelDropdown;

    @FindBy(xpath = "//div[@class='cds-checkboxAndRadio-labelText']")
    WebElement bigginerLevelDropdownCheckbox;

    @FindBy(xpath = "//div[@class='css-ksf52d']")
    List<WebElement> levels;

    @FindBy(xpath = "//button[@class='cds-149 cds-button-disableElevation cds-button-primary css-jqo50y']")
    WebElement viewButton2;



    @FindBy(xpath = "//h3[@class='cds-CommonCard-title css-6ecy9b']")
    List<WebElement> courseTitle;

    @FindBy(xpath = "//div[@class='cds-RatingStat-meter']")
    List<WebElement> ratings;

    @FindBy(xpath = "//div[@class='cds-CommonCard-metadata']")
    List<WebElement> duration;


    public void clickLanguageDropdown()
    {
        languageDropdown.click();
    }

    public  void clickEnglishLanguageDropdownCheckbox()
    {
        englishLanguageDropdownCheckbox.click();
    }

    public List<WebElement> getLanguagesList()
    {
        return languages;
    }
    public  boolean clickViewButton()
    {
        boolean b=englishLanguageDropdownCheckbox.isSelected();
        viewButton.click();
        return b;
    }

    public void clickLevelDropdown()
    {
        levelDropdown.click();
    }
    public void   clickBigginerLevelDropdownCheckbox()
    {
        bigginerLevelDropdownCheckbox.click();
    }

    public List<WebElement> getLevelList()
    {
        return levels;
    }
    public void  clickViewButton2()
    {
        viewButton2.click();
    }

    public List<WebElement> getCourseTitle()
    {
        return courseTitle;
    }

    public List<WebElement> getRatings()
    {
        return ratings;
    }

    public  List<WebElement> getDuration()
    {
        return duration;
    }
}
