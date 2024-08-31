package MainClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CombinedTests {
    public static void mainTest(String email) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://automationexercise.com/login");
        RegisterScript.regMain(email, driver);

    }
}
