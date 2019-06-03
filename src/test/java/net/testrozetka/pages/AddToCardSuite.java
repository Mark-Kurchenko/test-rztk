package net.testrozetka.pages;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class AddToCardSuite {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;
    @Ignore
    public void setUp() {

    }
    @Ignore
    public void tearDown() {
        driver.quit();
    }

    @Ignore
    public void AddToCard() throws InterruptedException {
        // Test name: AddToCard
        // Step # | name | target | value | comment
        // 1 | open | https://rozetka.com.ua/mobile-phones/c80003/ |  |


//        driver.get("https://rozetka.com.ua/mobile-phones/c80003/");
        // 2 | setWindowSize | 1440x900 |  |
//        driver.manage().window().setSize(new Dimension(1440, 900));
        // 3 | click | css=.hub-i-cart-link-count |  |
//        {
//            WebElement element = driver.findElement(By.className("hub-i-link hub-i-cart-link-count sprite-side whitelink"));
//            Actions builder = new Actions(driver);
//            builder.moveToElement(element).perform();
//        }
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
        driver.get("https://rozetka.com.ua/mobile-phones/c80003/");
        // 2 | setWindowSize | 1440x900 |  |
        driver.manage().window().fullscreen();// setSize(new Dimension(1440, 900));
        // 3 | click | linkText=Samsung Galaxy M20 4/64GB Ocean Blue (SM-M205FZBWSEK) |  |
        driver.findElement(By.linkText("Samsung Galaxy M20 4/64GB Ocean Blue (SM-M205FZBWSEK)")).click();
        // 4 | mouseOver | css=.btn-link-i:nth-child(2) |  |
//        {
//            WebElement element = driver.findElement(By.cssSelector(".btn-link-i:nth-child(2)"));
//            Actions builder = new Actions(driver);
//            builder.moveToElement(element).perform();
//        }
        // 5 | click | css=.btn-link-i:nth-child(2) |  |
        driver.findElement(By.cssSelector(".btn-link-i:nth-child(2)")).click();

//        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        {
            WebElement element = driver.findElement(By.cssSelector(".header-actions__button_type_cart > .header-actions__button-icon-wrap"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        driver.findElement(By.className("cart-check-button")).click();

//        driver.findElement(By.className("hub-i-link hub-i-cart-link-count sprite-side whitelink")).click();
        // 4 | click | id=popup-checkout |  |
//        driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
//        driver.findElement(By.id("popup-checkout")).click();
//        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//        driver.findElement(By.id("reciever_name")).click();
        // 5 | type | id=reciever_name | Nizovets Ivanna |
        driver.findElement(By.id("reciever_name")).sendKeys("Nizovets Ivanna");
        // 6 | click | id=reciever_phone |  |
//        driver.findElement(By.id("reciever_phone")).click();
        // 7 | type | id=reciever_phone | +380680137096 |
        driver.findElement(By.id("reciever_phone")).sendKeys("+380680137096");
        // 8 | click | id=reciever_email |  |
//        driver.findElement(By.id("reciever_email")).click();
//        // 9 | type | id=reciever_email | avksentev5@ |
//        driver.findElement(By.id("reciever_email")).sendKeys("avksentev5@");
//        // 10 | click | id=reciever_email |  |
//        driver.findElement(By.id("reciever_email")).click();
//        // 11 | click | id=reciever_email |  |
//        driver.findElement(By.id("reciever_email")).click();
//        // 12 | mouseOver | css=.opaque > .btn-link-i |  |
//        {
//            WebElement element = driver.findElement(By.cssSelector(".opaque > .btn-link-i"));
//            Actions builder = new Actions(driver);
//            builder.moveToElement(element).perform();
//        }
        driver.findElement(By.id("reciever_email")).sendKeys("avksentiev5@gmail.com");
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        driver.findElement(By.className("btn-link-i")).click();

        driver.findElement(By.linkText("Выберите подходящее отделение")).click();
        driver.findElement(By.linkText("№5, пр-т. Победы, д. 24 (ТРЦ Smart Plaza, м. Политехнический институт)")).click();

        // 17 | mouseDownAt | id=make-order | 11.265625,17.046875 |
        {
            WebElement element = driver.findElement(By.id("make-order"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).clickAndHold().perform();
        }
        // 18 | mouseMoveAt | css=html | 1204,563 |
        {
            WebElement element = driver.findElement(By.cssSelector("html"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        // 19 | mouseUpAt | css=html | 1204,563 |
        {
            WebElement element = driver.findElement(By.cssSelector("html"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).release().perform();
        }
        // 20 | click | css=body |  |
        driver.findElement(By.cssSelector("body")).click();
    }
}
