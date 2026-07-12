package com.shopkart.ui.pages;

import static com.codeborne.selenide.Selenide.$x;

public final class CheckoutPage {
    public OrderPage placeOrder(String address) {
        $x("//textarea[@name='address']").setValue(address);
        $x("//*[@id=\"root\"]/div/main/div/form/button").click();
        System.out.println("URL after place order = "
                + com.codeborne.selenide.WebDriverRunner.url());
        return new OrderPage(); }
}
