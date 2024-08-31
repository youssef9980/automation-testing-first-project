package MainClasses;

import base.Utils.Tiime;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterScript {

    public static void regMain(String email, WebDriver driver) {


        driver.findElement(By.cssSelector("[name = name")).sendKeys("youssef");
        Tiime.c(500);
        driver.findElement(By.cssSelector("[data-qa = signup-email]")).sendKeys(email);
        Tiime.c(500);
        driver.findElement(By.cssSelector("[data-qa = signup-button]")).click();
        Tiime.c(500);
        driver.findElement(By.id("id_gender1")).click();
        Tiime.c(500);
        driver.findElement(By.cssSelector("#password")).sendKeys("test1234");
        Tiime.c(500);
        Select day = new Select(driver.findElement(By.id("days")));
        Tiime.c(500);
        day.selectByIndex(14);
        Tiime.c(500);
        Select month = new Select(driver.findElement(By.id("months")));
        Tiime.c(500);
        month.selectByValue("12");
        Tiime.c(500);
        Select year = new Select(driver.findElement(By.id("years")));
        Tiime.c(1000);
        year.selectByValue("1999");
        Tiime.c(500);
        driver.findElement(By.id("newsletter")).click();
        Tiime.c(500);
        driver.findElement(By.id("optin")).click();
        Tiime.c(500);
        driver.findElement(By.cssSelector("#first_name")).sendKeys("yousseff");
        Tiime.c(500);
        driver.findElement(By.cssSelector("#last_name")).sendKeys("khaled");
        Tiime.c(500);
        driver.findElement(By.cssSelector("#company")).sendKeys("iqraaly");
        Tiime.c(500);
        driver.findElement(By.cssSelector("#address1")).sendKeys("maadi");
        Tiime.c(500);
        driver.findElement(By.cssSelector("#address2")).sendKeys("grandcity");
        Tiime.c(500);
        Select country = new Select(driver.findElement(By.id("country")));
        Tiime.c(500);
        country.selectByIndex(1);
        Tiime.c(500);
        driver.findElement(By.cssSelector("#state")).sendKeys("california");
        Tiime.c(500);
        driver.findElement(By.cssSelector("#city")).sendKeys("san   ");
        Tiime.c(500);
        driver.findElement(By.cssSelector("#zipcode")).sendKeys("01172");
        Tiime.c(500);
        driver.findElement(By.cssSelector("#mobile_number")).sendKeys("01118985282");
        Tiime.c(500);
        driver.findElement(By.cssSelector("[data-qa=create-account")).click();
        Tiime.c(500);
        driver.findElement(By.cssSelector("[data-qa=continue-button")).click();


        HomePage.homeMain(driver);


    }
}
