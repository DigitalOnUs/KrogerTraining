package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.*;


public class FirstTest2 extends BaseTest{

    @Test
    public void TestingFlipkart(){

        HomePage2 initialSearch = new HomePage2(driver);
        initialSearch.closingPopupLogin();
        initialSearch.searchForItem("AKG Headphones");

        ResultsPage2 manageResults = new ResultsPage2(driver);
        manageResults.validateResult();
        manageResults.iterateResults();
        manageResults.clickOnElement();

        ItemOverviewPage2 itemOverviewPage = new ItemOverviewPage2(driver);
        itemOverviewPage.switchingWindows();
        itemOverviewPage.addingToCart();

        MyCartPage2 myCartPage = new MyCartPage2(driver);
       // myCartPage.proceedToCheckOut();


    }
}
