package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePageElements;
import testBase.BaseClass;

public class TC_001_SearchOptionEnabled extends BaseClass {

    @Test(groups ={"Master","Sanity"})
    public void testSearchOptionEnabled(){

        logger.info("****** Starting TC_001_SearchOptionEnabled ******");
        HomePageElements hp = new HomePageElements(driver);
        boolean result=hp.isSearchButtonEnabled();
        Assert.assertTrue(result);
        logger.info("****** End TC_001_SearchOptionEnabled *****");

    }
}
