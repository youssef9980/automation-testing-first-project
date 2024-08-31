package MainClasses;

import base.Utils.Tiime;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    public static void homeMain(WebDriver driver) {
        Tiime.c(500);
        driver.findElement(By.cssSelector("[href=\"#Men\"]")).click();
        Tiime.c(500);
        driver.findElement(By.cssSelector("[href=\"/category_products/6\"]")).click();

        ProductPage.prodMain(driver);
    }
}

