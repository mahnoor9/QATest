package Testing;
import browser.BrowserGetter;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class FirstClass {
    private BrowserGetter browserGetter = new BrowserGetter();
    private WebDriver driver;
    @BeforeAll
    public void beforeAll(){
       driver= browserGetter.getChromeDriver();


    }

    @AfterAll
    public void afterAll()
    {
        driver.quit();

    }

    @Test
    public void testOne(){
        String expectedTitle = "Example title";
        driver.get("https://google.com");
        assertEquals(expectedTitle, driver.getTitle());


    }


}
