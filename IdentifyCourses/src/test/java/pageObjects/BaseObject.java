package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import testBase.BaseClass;

public class BaseObject {

    WebDriver driver;

    public BaseObject(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

}
