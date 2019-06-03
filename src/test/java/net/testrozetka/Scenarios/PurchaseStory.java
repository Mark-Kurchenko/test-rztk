package net.testrozetka.Scenarios;

import net.testrozetka.pages.PurchaseScenarioPage;
import net.thucydides.core.annotations.Step;

public class PurchaseStory {

    PurchaseScenarioPage PurchasePage; // Инициализируем объект нашего PageObject класса

    @Step
    public void open_home(){ //открываем дефолтную урлу из класса нашей страницы
        PurchasePage.open();
    }

    @Step
    public void open_section_page() { //объявили метод, переиспользующий PageObject метод с фасадами
        PurchasePage.select_section(); //Инициализированный объект страницы использует метод из класса PageObject
    }

    @Step
    public void open_category_page(){
        PurchasePage.select_category();
    }

    @Step
    public void add_item_to_cart() {
        PurchasePage.select_item();
    }

    //@Step
   // public void activate_cart_popup() {
     //   PurchasePage.cart_icon_popup_open();
    //}

    @Step
    public void open_checkout_page() {
        PurchasePage.openUrl("https://my.rozetka.com.ua/checkout/?");
    }

    @Step
    public void open_cart_page() {
        PurchasePage.go_order_details_page();
    }

}