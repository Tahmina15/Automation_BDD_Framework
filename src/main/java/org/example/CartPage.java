package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class CartPage extends Utils{
    private By _shoppingCart=By.xpath("//div[@class=\"page shopping-cart-page\"]//a[text()='Leica T Mirrorless Digital Camera']");
    String expectedProductName="Leica Tt Mirrorless Digital Camera";
    public void shoppingCartDetails(){
        Assert.assertEquals(getTextFromElement(_shoppingCart),expectedProductName) ;


    }
    private By _buildComputer=By.xpath("//td[@class=\"product\"]//div[@class=\"attributes\"]");
    String expectedShoppingCart="Processor: 2.2 GHz Intel Pentium Dual-Core E2200\n" +
            "RAM: 2 GB\n" +
            "HDD: 320 GB\n" +
            "OS: Vista Home [+$50.00]";

    private By _term=By.id("termsofservice");
    private By _checkout=By.id("checkout");
    public void buidOwnComp(){
        Assert.assertEquals(getTextFromElement(_buildComputer),expectedShoppingCart);
        clickOnElement(_term);
        clickOnElement(_checkout);
    }

}
