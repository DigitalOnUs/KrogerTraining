package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LocatorsRepository {

    WebDriver driver;

    public LocatorsRepository(WebDriver driver){
        this.driver=driver;
    }

    private WebElement exitPopUp = driver.findElement(By.cssSelector("button[class='_2AkmmA _29YdH8']"));

    @FindBy(how= How.CSS, using="button[class='_2AkmmA _29YdH8']") private WebElement exitLoginPopUp;
    @FindBy(how=How.CSS, using="input[type='text']") private WebElement inputTextField;
    @FindBy(how=How.CSS, using="button[type='submit']") private WebElement searchButton;


//hellotesttest
    public WebElement getExitPopUp(){
        return exitPopUp;
    }

    public WebElement getInputTextField(){
        return inputTextField;
    }

    public WebElement getSearchButton(){
        return searchButton;
    }
}
