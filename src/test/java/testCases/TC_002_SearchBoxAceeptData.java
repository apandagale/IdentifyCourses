package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePageElements;
import testBase.BaseClass;

public class TC_002_SearchBoxAceeptData extends BaseClass {

    @Test
    public void testSearchOptionAcceptData(){

        logger.info("****** Starting TC_002_SearchOptionAcceptData ******");
        HomePageElements hp = new HomePageElements(driver);
        boolean result=hp.setSerachBox();
        logger.info("****** Entered Data in search box ******");
        Assert.assertTrue(result);
        logger.info("****** End TC_002_SearchOptionAcceptData ******");
    }
}
