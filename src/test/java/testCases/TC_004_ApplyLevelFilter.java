package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.CoursesPage;
import pageObjects.HomePageElements;
import testBase.BaseClass;

public class TC_004_ApplyLevelFilter extends BaseClass {

    @Test(groups ={"Master","Sanity","Regression"})
    public void testApplyLevelFilter(){

        logger.info("****** Starting TC_004_ApplyLevelFilter ******");

        HomePageElements hp = new HomePageElements(driver);
        boolean result=hp.setSerachBox();
        logger.info("****** Entered Data in search box ******");

        CoursesPage cs = new CoursesPage(driver);

        cs.clickLevelDropdown();
        logger.info("****** Clicked on Level Dropdown ******");

        cs.clickBigginerLevelDropdownCheckbox();
        logger.info("****** Bigginer Level Checkbox Clicked ******");

        cs.clickViewButton2();
        logger.info("****** View Button Clicked ******");

        Assert.assertEquals(result,true);
        logger.info("****** End TC_004_ApplyLevelFilter ******");
    }
}
