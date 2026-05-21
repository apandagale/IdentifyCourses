package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class FormPage extends BaseObject{

    public FormPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "FirstName")
    WebElement firstName;

    @FindBy(id = "LastName")
    WebElement lastName;

    @FindBy(id="Email")
    WebElement email;

    @FindBy(id="Phone")
    WebElement phone;

    @FindBy(id="rentalField9")
    WebElement organization;

    @FindBy(id="Title")
    WebElement jobtitle;

    @FindBy(id="Company")
    WebElement company;

    @FindBy(id="Employee_Range__c")
    WebElement company_size;

    @FindBy(id="Self_Reported_Needs__c")
    WebElement describe;

    @FindBy(id="Country")
    WebElement country;

    @FindBy(id="State")
    WebElement state;

    @FindBy(className = "mktoButton")
    WebElement submitButton;

    @FindBy(id="ValidMsgEmail")
    WebElement validEmail;

    public void setFirstName(String fName){
        firstName.sendKeys(fName);
    }
    public void setLastName(String lName){
        lastName.sendKeys(lName);
    }
    public void setEmail(String mail){
        email.sendKeys(mail);
    }
    public void setPhone(String no){
        phone.sendKeys(no);
    }
    public void setOrganization(String org){
        Select organizationSelect = new Select(organization);
        organizationSelect.selectByVisibleText(org);
    }
    public void setJobTitle(String title){
        jobtitle.sendKeys(title);
    }

    public void setCompany(String c){
        company.sendKeys(c);
    }
    public void setCompanySize(String size){
        Select companySize = new Select(company_size);
        companySize.selectByVisibleText(size);
    }
    public void setDescribe(String d){
        Select desc= new Select(describe);
        desc.selectByVisibleText(d);
    }
    public void setCountry(String ctry){
        Select countrySelect=new Select(country);
        countrySelect.selectByVisibleText(ctry);
    }
    public void setState(String st){
        Select stateSelect=new Select(state);
        stateSelect.selectByVisibleText(st);
    }
    public void clickSubmitButton(){
//        submitButton.click();
//        Actions actions=new Actions(driver);
//        actions.moveToElement(submitButton).click().perform();
        JavascriptExecutor ex=(JavascriptExecutor)driver;
        ex.executeScript("arguments[0].click();", submitButton);
    }

    public String getInvalidEmailMessage(){
        return validEmail.getText();
    }

}
