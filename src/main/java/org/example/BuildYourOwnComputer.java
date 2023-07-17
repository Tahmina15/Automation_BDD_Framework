package org.example;

import org.openqa.selenium.By;

public class BuildYourOwnComputer extends Utils{
    private By _processor=By.xpath("//select[@id='product_attribute_1']");
    private By _ram=By.id("product_attribute_2");
    private By _hdd=By.id("product_attribute_3_6");
    private By _os=By.id("product_attribute_4_8");
    private By _software=By.id("product_attribute_5_10");
    private By _addToCart=By.id("add-to-cart-button-1");
    private By _shoppingCart=By.xpath("//div[@class=\"bar-notification success\"]//a[@href=\"/cart\"]");
    public void productDetails(){
        waitForElementToBeClickable(_processor,10);
        selectFromDropdownVisibleText(_processor,"2.2 GHz Intel Pentium Dual-Core E2200");
        waitForElementToBeClickable(_processor,10);
        selectFromDropdownVisibleText(_ram,"2 GB");
        clickOnElement(_hdd);
        clickOnElement(_os);
        clickOnElement(_software);
        clickOnElement(_addToCart);
        waitForElementToBeClickable(_shoppingCart,10);
        clickOnElement(_shoppingCart);



    }
}
