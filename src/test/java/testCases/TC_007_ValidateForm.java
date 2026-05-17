package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.ForBusinessesPage;
import pageObjects.FormPage;
import pageObjects.HomePageElements;
import testBase.BaseClass;

public class TC_007_ValidateForm extends BaseClass {

    @Test
    public void testValidateForm(){

        logger.info("****** Start TC_007_ValidateForm testValidateForm ******");

        HomePageElements hp = new HomePageElements(driver);
        hp.clickLinkForBusinesses();
        logger.info("****** For Enterprised Clicked ******");

        ForBusinessesPage fb = new ForBusinessesPage(driver);
        fb.getReadyTOTransformForm();
        logger.info("****** Getting form ******");

        FormPage fp = new FormPage(driver);
        fp.setFirstName("ABC");
        fp.setLastName("DEF");
        fp.setEmail("abcd@efg");
        fp.setPhone("1234567890");
        fp.setOrganization("Business");
        fp.setJobTitle("Analyst Trainee");
        fp.setCompany("Cognizant");
        fp.setCompanySize("30001+");
        fp.setDescribe("Courses for myself");
        fp.setCountry("India");
        fp.setState("Maharashtra");
        fp.clickSubmitButton();

        logger.info("****** Data entered in form******");

        String msg=fp.getInvalidEmailMessage();

        Assert.assertEquals(msg, "Invalid Input");
        logger.info("****** Error msg validated ******");

        logger.info("****** End TC_007_ValidateForm ******");
    }
}
