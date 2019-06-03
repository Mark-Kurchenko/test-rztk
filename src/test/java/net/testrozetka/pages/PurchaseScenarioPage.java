package net.testrozetka.pages;

import io.vavr.collection.Tree;
import net.thucydides.core.annotations.DefaultUrl;

import net.serenitybdd.core.pages.WebElementFacade;


import net.serenitybdd.core.annotations.findby.FindBy;

import net.thucydides.core.annotations.NamedUrl;
import net.thucydides.core.annotations.NamedUrls;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.interactions.Actions;


@DefaultUrl("https://rozetka.com.ua/") //Тут у тебя дефолтная урла, на которую идет вебдрайвер при инициализации инстанса браузера
public class PurchaseScenarioPage extends PageObject {

    @FindBy(xpath="/html/body/app-root/div/div[1]/app-rz-main-page/div/aside/main-page-sidebar/sidebar-fat-menu/div/ul/li[3]/a") //Локатор
    private WebElementFacade SectionAppliances; //Фасад локатора

    @FindBy(xpath="//*[@id=\"content-inner-block\"]/div[1]/div[2]/div/div[2]/div/div[1]/div[1]/div/div[3]/div/div/div[1]/div/div[2]/div[2]/div/p/a")
    private WebElementFacade CategoryAcessories;

    @FindBy (css="#catalog_goods_block > div > div:nth-child(16) > div.over-wraper > div > div > div > div.g-tools-container.clearfix > div > div > div > form > span > button")
    private WebElementFacade ItemFridgeKnob;

    @FindBy (xpath="//*[@id=\"cart_block30686\"]/a")
    private WebElementFacade CartIcon;

    @FindBy (xpath="//*[@id=\"drop-block\"]/span/span/button")
    private WebElementFacade OrderButton;


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

  //  public void cart_icon_popup_open() {
     //   Actions builder = new Actions(getDriver());
       // builder.moveToElement(CartIcon).perform();
       // builder.click(OrderButton).perform();
        //OrderButton.click();
    //}




}



