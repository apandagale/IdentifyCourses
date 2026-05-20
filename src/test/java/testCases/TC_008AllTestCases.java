package testCases;


import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.CoursesPage;
import pageObjects.ForBusinessesPage;
import pageObjects.FormPage;
import pageObjects.HomePageElements;
import testBase.BaseClass;
import utilities.ExcelUtility;

import java.io.IOException;
import java.util.List;

public class TC_008AllTestCases extends BaseClass {

    @Test(groups ={"Master","Sanity","Regression"})
    public void testAllTestCases() throws IOException {

        logger.info("****** Start TC_008_AllTestCases ******");

        HomePageElements hp = new HomePageElements(driver);
        boolean result=hp.setSerachBox();
        logger.info("****** Entered Data in search box ******");

        CoursesPage cs = new CoursesPage(driver);

        ExcelUtility ex=new ExcelUtility(System.getProperty("user.dir")+"\\ResultData\\OutputData.xlsx");
        ex.setCellData("CoursesInfo",0,0,"Course Name");
        ex.setCellData("CoursesInfo",0,1,"Course Ratings");
        ex.setCellData("CoursesInfo",0,2,"Course Duration");

        cs.clickLanguageDropdown();
        logger.info("****** Clicked on Language Dropdown ******");

        cs.clickEnglishLanguageDropdownCheckbox();
        logger.info("****** English Language Checkbox Clicked ******");

        cs.clickViewButton();
        logger.info("****** View Button Clicked ******");

        cs.clickLevelDropdown();
        logger.info("****** Clicked on Level Dropdown ******");

        cs.clickBigginerLevelDropdownCheckbox();
        logger.info("****** Bigginer Level Checkbox Clicked ******");

        cs.clickViewButton2();
        logger.info("****** View Button Clicked ******");

        List<WebElement> courseTitle=cs.getCourseTitle();
//        System.out.println(courseTitle.size());
        for(int i=0; i<2; i++){
            ex.setCellData("CoursesInfo",i+1,0,courseTitle.get(i).getText());
//            System.out.println("Course Name:"+courseTitle.get(i).getText());
        }

        List<WebElement> ratings=cs.getRatings();
//        System.out.println(ratings.size());
        for(int i=0; i<2; i++){
            ex.setCellData("CoursesInfo",i+1,1,ratings.get(i).getText());
//            System.out.println("Course Ratings:"+ratings.get(i).getText());
        }

        List<WebElement> duration=cs.getDuration();
//        System.out.println(duration.size());
        for(int i=0; i<2; i++){
            ex.setCellData("CoursesInfo",i+1,2,duration.get(i).getText());
//            System.out.println("Course Duration:"+duration.get(i).getText());
        }

        logger.info("****** All course info is written in excel ******");

        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
//        HomePageElements hp = new HomePageElements(driver);
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
