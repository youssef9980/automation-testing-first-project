package MainClasses;

import base.Utils.Tiime;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class CartPage {
    public static void cartMain(WebDriver driver){
        Tiime.c(500);
        driver.findElement(By.cssSelector(".check_out")).click();
        Tiime.c(500);
        driver.findElement(By.cssSelector("[rows=\"6\"]")).sendKeys("Please don't be late");
        Tiime.c(500);
        driver.findElement(By.cssSelector("[href=\"/payment\"]")).click();

        PaymentPage.paymentMain(driver);
    }
}
