package Tests;

import au.com.bytecode.opencsv.CSVReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class BaseTest {
//testing
    WebDriver driver;
    String BaseURL="https://www.flipkart.com";
    String CSV_file = "/Users/victorcarrillo/Victor-Automation/comkrogertrainingtest/TestData.csv";


    @BeforeClass
    public void setup() throws IOException {

        CSVReader reader = new CSVReader(new FileReader(CSV_file));
        String[] cell;
        String URLApp = null;
        while ((cell = reader.readNext()) != null) {
            for (int i = 0; i < 1; i++) {
                URLApp = cell[i];
                String searchData = cell[i + 1];
            }
        }

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URLApp);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

    @AfterClass
    public void tearDown(){

        driver.close();
        driver.quit();


    }
}
