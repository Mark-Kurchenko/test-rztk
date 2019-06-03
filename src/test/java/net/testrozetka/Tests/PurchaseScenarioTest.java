package net.testrozetka.Tests;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.testrozetka.Scenarios.PurchaseStory;
import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Managed;

import net.thucydides.core.annotations.Steps;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING) //сортировка самих тестов по алфавиту от A до Z


public class PurchaseScenarioTest {

    @Managed(driver = "chrome") //Тип драйвера, по умолчанию gecko/Firefox, тут переопределен на Chrome
    public WebDriver webdriver; //инициализация объекта драйвера, настройки которого находятся в serenity.properties

    @Steps
    public PurchaseStory PurchaseScenario; //Инициализация объекта нашей стори

    @Issue("RegressionHomePage") //Это для ведения документации, пока не нужно
    @Test
    public void TestHomePageAllElementsPresent() {
        PurchaseScenario.open_home();
        PurchaseScenario.open_section_page();
        PurchaseScenario.open_category_page();
        PurchaseScenario.add_item_to_cart();
        PurchaseScenario.activate_cart_popup();
        PurchaseScenario.open_cart_page();
    }

}

//Когда тест прошел, найди фал index.html и открой в браузере. Это репортинг UI.