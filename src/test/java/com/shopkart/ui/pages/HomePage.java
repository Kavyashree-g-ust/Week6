package com.shopkart.ui.pages;

import com.codeborne.selenide.Condition;
import com.shopkart.ui.components.ProductCard;
import com.shopkart.ui.locators.Xp;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public final class HomePage {
    public HomePage showsProduct(String name) {
        Xp.product(name).shouldBe(visible);
        return this;
    }
    public ProductCard product(String name) {

        Xp.product(name).shouldBe(visible);

        return new ProductCard(name);
    }
    public CartPage cart()
    {
        $x("//a[contains(@href,'/cart') or normalize-space()='Cart']").click();
        return new CartPage();
    }
}
