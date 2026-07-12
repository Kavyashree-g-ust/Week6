package com.shopkart.ui.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.WebDriverRunner;
import com.shopkart.ui.locators.Xp;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public final class CartPage {
    public CartPage totalShows(String total) {
        $x("//*[@data-role='cart-total']").shouldHave(Condition.text(total));
        return this;
    }
    public CartPage lineTotal(String sku, String total) {
        Xp.cartLine(sku).$x(".//td[contains(@class,'line-total')]").shouldHave(Condition.text(total));
        return this;
    }
    public CheckoutPage checkout() {

        $x("//*[@id=\"root\"]/div/header/nav/button[2]")
                .shouldBe(visible)
                .click();

        $x("//*[@id=\"root\"]/div/main/div/div[2]/button[2]")
                .click();
        Wait().until(driver ->
                WebDriverRunner.url().contains("/checkout"));

        System.out.println("Current URL after Checkout click: " + webdriver().driver().url());


        return new CheckoutPage();
    }
}
