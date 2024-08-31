package MainClasses;

import base.Utils.Tiime;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage {
    public static void prodMain(WebDriver driver){
        Tiime.c(500);
        driver.findElement(By.cssSelector("[href=\"/product_details/33\"]")).click();

        Tiime.c(500);
        WebElement quantity = driver.findElement(By.cssSelector("#quantity"));
        Tiime.c(500);
        quantity.clear();
        Tiime.c(500);
        quantity.sendKeys("2");
        Tiime.c(500);
        driver.findElement(By.cssSelector(".cart")).click();
        Tiime.c(500);
        WebElement modal = driver.findElement(By.id("cartModal"));
        Tiime.c(1000);
        modal.findElement(By.cssSelector("[href=\"/view_cart\"]")).click();

        CartPage.cartMain(driver);

    }
}
