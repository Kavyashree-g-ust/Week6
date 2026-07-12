package com.shopkart.ui.locators;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public final class Xp {

    private Xp() {}

    public static final String EMAIL =
            "//input[@name='email']";

    public static final String PASSWORD =
            "//input[@name='password']";

    public static final String LOGIN_BUTTON =
            "//button[normalize-space()='Sign in']";

    public static final String BRAND =
            "//button[contains(@class,'brand')]";

    public static final String CATALOG =
            "//button[normalize-space()='Catalog']";

    public static final String CART =
            "//button[.//*[local-name()='svg'] and contains(.,'Cart')] | //button[contains(.,'Cart')]";

    public static final String SIGN_OUT =
            "//button[contains(.,'Sign out')]";

    public static final String SIGN_IN =
            "//button[contains(.,'Sign in')]";

    public static final String SEARCH_BOX =
            "//input[@name='q']";

    public static final String SEARCH_BUTTON =
            "//button[normalize-space()='Search']";


    public static final String PRODUCT =
            "//div[contains(@class,'product')]//*[normalize-space()='%s']/ancestor::div[contains(@class,'product')]";

    public static final String PRODUCT_NAME =
            PRODUCT + "//h2";

    public static final String PRODUCT_PRICE =
            PRODUCT + "//strong";

    public static final String PRODUCT_DESCRIPTION =
            PRODUCT + "//p";

    public static final String PRODUCT_STOCK =
            PRODUCT + "//*[contains(@class,'stock')]";

    public static final String QUICK_ADD =
            PRODUCT + "//button[contains(@class,'quick-add')]";


    public static final String QUANTITY =
            "//input[@name='quantity']";

    public static final String ADD_TO_CART =
            "//button[contains(.,'Add to cart')]";


    public static final String CART_LINE =
            "//tr[contains(@class,'cart-line')][td[normalize-space()='%s']]";

    public static final String LINE_TOTAL =
            CART_LINE + "//td[contains(@class,'line-total')]";

    public static final String CART_TOTAL =
            "//*[@data-role='cart-total']";

    public static final String CHECKOUT =
            "//button[normalize-space()='Checkout']";


    public static final String ADDRESS =
            "//textarea[@name='address']";

    public static final String PLACE_ORDER =
            "//button[normalize-space()='Place order']";


    public static final String ORDER_STATUS =
            "//*[@data-field='order-status']";

    public static final String ORDER_TOTAL =
            "//*[@data-field='order-total']";

    public static SelenideElement email() {
        return $x(EMAIL);
    }

    public static SelenideElement password() {
        return $x(PASSWORD);
    }

    public static SelenideElement loginButton() {
        return $x(LOGIN_BUTTON);
    }

    public static SelenideElement searchBox() {
        return $x(SEARCH_BOX);
    }

    public static SelenideElement searchButton() {
        return $x(SEARCH_BUTTON);
    }

    public static SelenideElement product(String productName) {
        return $x(String.format(PRODUCT, productName));
    }

    public static SelenideElement quickAdd(String productName) {

        return product(productName)
                .$x(".//button[contains(@class,'quick-add')]");
    }

    public static SelenideElement cartLine(String sku) {
        return $x(String.format(CART_LINE, sku));
    }

    public static SelenideElement lineTotal(String sku) {
        return $x(String.format(LINE_TOTAL, sku));
    }

    public static SelenideElement cartTotal() {
        return $x(CART_TOTAL);
    }

    public static SelenideElement checkoutButton() {
        return $x(CHECKOUT);
    }

    public static SelenideElement quantity() {
        return $x(QUANTITY);
    }

    public static SelenideElement addToCart(String name) {
        return $x(ADD_TO_CART);
    }

    public static SelenideElement address() {
        return $x(ADDRESS);
    }

    public static SelenideElement placeOrder() {
        return $x(PLACE_ORDER);
    }

    public static SelenideElement orderStatus() {
        return $x(ORDER_STATUS);
    }

    public static SelenideElement orderTotal() {
        return $x(ORDER_TOTAL);
    }

}