package Tests;

import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.ItemOverviewPage;
import pages.MyCartPage;
import pages.ResultsPage;


public class FirstTest extends BaseTest{

    @Test
    public void TestingFlipkart(){

        
        HomePage initialSearch = PageFactory.initElements(driver,HomePage.class);
        initialSearch.closingPopupLogin();
        initialSearch.searchForItem("AKG Headphones");

        ResultsPage manageResults = PageFactory.initElements(driver,ResultsPage.class);
        manageResults.validateResult();
        manageResults.iterateResults();
        manageResults.clickOnElement();

        ItemOverviewPage itemOverview = PageFactory.initElements(driver,ItemOverviewPage.class);
        itemOverview.switchingWindows();
        itemOverview.addingToCart();

        MyCartPage placingOrder = PageFactory.initElements(driver, MyCartPage.class);
        placingOrder.proceedToCheckOut();













    }
}
