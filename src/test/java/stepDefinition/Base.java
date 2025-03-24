package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Base {
	
	public static WebDriver driver;

    @Before
    public void setUp() {
       
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://95.216.202.227:8000/login");
       
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}


