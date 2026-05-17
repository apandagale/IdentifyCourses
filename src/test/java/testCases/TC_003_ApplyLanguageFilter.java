package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.CoursesPage;
import pageObjects.HomePageElements;
import testBase.BaseClass;

public class TC_003_ApplyLanguageFilter extends BaseClass {

    @Test
    public void testApplyLanguageFilter(){

        logger.info("****** Starting TC_003_ApplyLanguageFilter ******");
        HomePageElements hp = new HomePageElements(driver);
        boolean result=hp.setSerachBox();
        logger.info("****** Entered Data in search box ******");

        CoursesPage cs = new CoursesPage(driver);
        cs.clickLanguageDropdown();
        logger.info("****** Clicked on Language Dropdown ******");

        cs.clickEnglishLanguageDropdownCheckbox();
        logger.info("****** Clicked on Language Dropdown ******");

        boolean isSelectedEnglish=cs.clickViewButton();
        logger.info("****** View Button Clicked ******");

        Assert.assertFalse(isSelectedEnglish);
        logger.info("****** End TC_003_ApplyLanguageFilter ******");
    }
}
