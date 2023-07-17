package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

//Verify user can register successfully
    public class HomePage extends Utils {
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
    private By _loginButton = By.xpath("//a[text()='Log in' ]");

    public void loginB() {
        waitForElementToBeClickable(_loginButton, 10);
        clickOnElement(_loginButton);
    }

    public void categoryButton(String button_name) {
        clickOnElement(By.xpath("//a[text()='" + button_name + " ']"));
    }

    //    public void clickOnCategory(String category_name){
//        clickOnElement(By.linkText(category_name));
//    }
    public void hoverOverCatagoryButton(String category) {
        WebElement element = driver.findElement(By.linkText(category));
        System.out.println("Before hover colour from the catagory is " + element.getCssValue("colour"));
        Actions action = new Actions(driver);
        action.moveToElement(element).perform();
        //assert
        System.out.println("After hover the colour is ----" + element.getCssValue("color"));
        action.moveToElement(driver.findElement(By.linkText("Software"))).click().perform();

        Assert.assertTrue(getCurrentUrl().contains("software"));
    }
    public void verifySubcategory(String subcategory){
        clickOnElement(By.linkText(subcategory));
    }

    public void verifySubcategoryUrl(String subcategoryUrl){
        Assert.assertTrue(getCurrentUrl().contains(subcategoryUrl));
    }
    //===========================================================================================
    private By _addToCartComputer=By.xpath("//div[@class=\"product-grid home-page-product-grid\"]/div[2]/div[1]//button[1]");
    public void buildYourOwnComputer(){

        clickOnElement(_addToCartComputer);
    }


}
