import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestBase {
    WebDriver driver= new ChromeDriver();
    @BeforeTest
    public void openBrowser(){
        driver.get("https://www.vesty.co.il/main/news");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }
@Test
    public void testUntitledTestCase() {
}

    @AfterTest(enabled = false)
    public void quit(){
        driver.quit();
    }
}
