package com.shopkart.ui.components;

import com.shopkart.ui.locators.Xp;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;

public final class ProductCard {
    private final String name;
    public ProductCard(String name) {
        this.name = name;
    }
    public ProductCard addToCart() {

        Xp.quickAdd(name)
                .shouldBe(visible)
                .shouldBe(enabled)
                .click();

        return this;
    }
}
