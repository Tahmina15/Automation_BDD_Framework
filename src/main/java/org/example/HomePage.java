package org.example;

import org.openqa.selenium.By;
    //Verify user can register successfully
    public class HomePage extends Utils{
    private By _register = By.className("ico-register");

    //method for click on register button
    public void clickOnRegister() {
        clickOnElement(_register);
    }
    //Test that user can refer any product to a friend
    private By _addToCart = By.xpath("//div[@class='product-grid home-page-product-grid']/div[contains(@class,'item-grid')]/div[2]/div/div[2]/div[3]/div[2]/button[1]");
    //click on add to cart in appleMac book
    public void addToCart() {
        clickOnElement(_addToCart);
    }
    // log in button
        private By _loginButton=By.xpath("//a[text()='Log in' ]");
        public void loginB(){
            waitForElementToBeClickable(_loginButton,10);
            clickOnElement(_loginButton);
        }
}
