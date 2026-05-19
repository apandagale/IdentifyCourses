package testCases;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pageObjects.CoursesPage;
import pageObjects.HomePageElements;
import testBase.BaseClass;
import utilities.ExcelUtility;

import java.io.IOException;
import java.util.List;

public class TC_005_ExtractAllLanguagesAndLevels extends BaseClass {

    @Test
    public void testExtractAllLanguagesAndLevels () throws IOException {

        logger.info("****** Starting TC_005_ExtractAllLanguagesAndLevels ******");

        HomePageElements hp = new HomePageElements(driver);
        boolean result=hp.setSerachBox();
        logger.info("****** Entered Data in search box ******");

        CoursesPage cs = new CoursesPage(driver);

//        ExcelUtility ex=new ExcelUtility("C:\\Users\\2483954\\IdeaProjects\\IdentifyCourses\\ResultData\\OutputData.xlsx");
        ExcelUtility ex=new ExcelUtility(System.getProperty("user.dir")+"\\ResultData\\OutputData.xlsx");
        ex.setCellData("Languages",0,0,"Languages Names");

        cs.clickLanguageDropdown();
        logger.info("****** Clicked on Language Dropdown ******");

        List<WebElement> languagesList=cs.getLanguagesList();
//        System.out.println("languagesList.size():"+languagesList.size());
        for (int i=0;i<languagesList.size();i++){
            ex.setCellData("Languages",i+1,0,languagesList.get(i).getText());
//            System.out.println("languagesList.get(i):"+languagesList.get(i).getText());
        }
        logger.info("****** Language Data is Written in excel ******");

        boolean isSelectedEnglish=cs.clickViewButton();
        logger.info("****** View Button Clicked ******");


        ExcelUtility ex2=new ExcelUtility(System.getProperty("user.dir")+"\\ResultData\\OutputData.xlsx");
        ex2.setCellData("Levels",0,0,"Levels");
        cs.clickLevelDropdown();
        logger.info("****** Clicked on Level Dropdown ******");

        List<WebElement> levelList=cs.getLevelList();
//        System.out.println("levelList.size():"+levelList.size());
        for (int i=0;i<languagesList.size();i++){
            ex2.setCellData("Levels",i+1,0,levelList.get(i).getText());
//            System.out.println("levelList.get(i):"+levelList.get(i).getText());
        }
        logger.info("****** Level Data is Written in excel ******");

        cs.clickViewButton2();
        logger.info("****** View Button Clicked ******");

        logger.info("****** End TC_004_ExtractAllLanguagesAndLevels ******");

    }
}
