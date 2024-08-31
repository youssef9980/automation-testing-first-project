package MainClasses;

import base.Utils.Tiime;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class PaymentPage {
    public static void paymentMain(WebDriver driver) {

        Tiime.c(500);
        driver.findElement(By.cssSelector("[name=\"name_on_card\"]")).sendKeys("youssef khaled");
        Tiime.c(500);
        driver.findElement(By.cssSelector("[data-qa=\"card-number\"]")).sendKeys("5587968741256325");
        Tiime.c(500);
        driver.findElement(By.cssSelector("[data-qa=\"cvc\"]")).sendKeys("123");
        Tiime.c(500);
        driver.findElement(By.cssSelector("[name=\"expiry_month\"]")).sendKeys("08");
        Tiime.c(500);
        driver.findElement(By.cssSelector("[data-qa=\"expiry-year\"]")).sendKeys("27");
        Tiime.c(500);
        driver.findElement(By.cssSelector("[data-qa=\"pay-button\"]")).click();
        Tiime.c(500);


    }
}
