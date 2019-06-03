package net.testrozetka.pages;

import net.thucydides.core.annotations.DefaultUrl;

import net.serenitybdd.core.pages.WebElementFacade;


import net.serenitybdd.core.annotations.findby.FindBy;

import net.thucydides.core.pages.PageObject;


@DefaultUrl("https://rozetka.com.ua/") //Тут у тебя дефолтная урла, на которую идет вебдрайвер при инициализации инстанса браузера
public class PurchaseScenarioPage extends PageObject {

    @FindBy(xpath="/html/body/app-root/div/div[1]/app-rz-main-page/div/aside/main-page-sidebar/sidebar-fat-menu/div/ul/li[3]/a") //Локатор
    private WebElementFacade SectionAppliances; //Фасад локатора

    @FindBy(className="pab-h3-link")
    private WebElementFacade CategoryAcessories;

    @FindBy (css="#catalog_goods_block > div > div:nth-child(16) > div.over-wraper > div > div > div > div.g-tools-container.clearfix > div > div > div > form > span > button")
    private WebElementFacade ItemFridgeKnob;

    @FindBy (xpath="/html/body/app-root/rz-main-app/rz-header/div/header/div/div[2]/rz-header-user-buttons/ul/li[3]/rz-user-buttons-cart/div/a")
    private WebElementFacade CartIcon;

    @FindBy (xpath="//*[@id=\"cdk-overlay-12\"]/rz-dialog-host/div/rz-cart/div/div/div[2]/div[2]/button")
    private WebElementFacade GoToCart;


    public void select_section() {     //Название метода, использующего фасад локатора веб-элемента
        SectionAppliances.click();     //В каждом методе ты можешь использовать любые фасады и ИМЕННО ТУТ ты описываешь Selenium-действия
    }

    public void select_category() {
        CategoryAcessories.click();
    }

    public void select_item() {
        ItemFridgeKnob.click();
        waitForTextToAppear("67520431", 5000);  //тут валидация ID продукта из DOM-дерева по стринге
    }

    public void cart_icon_popup_open() {
        CartIcon.click();
    }

    public void go_order_details_page() {
        GoToCart.click();
    }




}



