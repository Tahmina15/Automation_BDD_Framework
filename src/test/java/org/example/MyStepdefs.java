package org.example;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;


public class MyStepdefs extends Utils {
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    Register_Result_Page registerResultPage = new Register_Result_Page();
    LogInPage logInPage = new LogInPage();
    AppleMacBook_page appleMacBookPage = new AppleMacBook_page();
    EmailAFriend_Page emailAFriendPage = new EmailAFriend_Page();
    NoteBooks noteBooks = new NoteBooks();
    BuildYourOwnComputer buildYourOwnComputer= new BuildYourOwnComputer();
    CartPage cartPage = new CartPage();
    CheckOutAsAGuest checkOutAsAGuest = new CheckOutAsAGuest();
    OnePageCheckOutBilling onePageCheckOutBilling = new OnePageCheckOutBilling();
    ShippingMethod shippingMethod = new ShippingMethod();
    PaymentMethod paymentMethod = new PaymentMethod();
    OpcPaymentInfo opcPaymentInfo = new OpcPaymentInfo();
    OpcConfirmOrder opcConfirmOrder = new OpcConfirmOrder();
    CheckoutComplete checkoutComplete = new CheckoutComplete();
    @Given("I am on registration page")
    public void i_am_on_registration_page() {
     homePage.clickOnRegister();
    }
    @When("I enter all Registration details")
    public void i_enter_all_registration_details() {
    registerPage.registerDetails();
    }
    @Then("I should able to register successfully")
    public void i_should_able_to_register_successfully() {
    registerResultPage.registerResult();
    }
//============================================================================================

    @Given("I am on home page")
    public void i_am_on_home_page() {
       homePage.clickOnRegister();
    }
    @When("I enter all required Registration details")
    public void i_enter_all_required_registration_details() {
      registerPage.registerDetailsForReferAProduct();
    }
    @When("I click on continue")
    public void i_click_on_continue() {
        registerResultPage.continueAfterRegistration();
    }
    @When("I enter all required login details")
    public void i_enter_all_required_login_details() {
        homePage.loginB();
        logInPage.loginDetails();
    }
    @When("I add apple mac book on the cart")
    public void i_add_apple_mac_book_on_the_cart() {
      homePage.addToCart();
      appleMacBookPage.emailAFriend();
    }

    @Then("I should able to referred this product to my friend successfully")
    public void i_should_able_to_referred_this_product_to_my_friend_successfully() {
        emailAFriendPage.emailAFriendDetails();
    }
//=========================================================================================

    @When("I click on {string} button")
    public void iClickOnButton(String button_name) {

        homePage.categoryButton("Computers");
    }

    @Then("I should able to verify I am navigated to related page {string} successfully")
    public void iShouldAbleToVerifyIAmNavigatedToRelatedPageSuccessfully(String page_url) {
        Assert.assertEquals(getCurrentUrl(),page_url);
    }
//=======================================================================================================
    @Given("I am on DemoNopcommerce Homepage")
    public void iAmOnDemoNopcommerceHomepage() {

    }


    @When("I hover over the {string} category")
    public void iHoverOverTheCategory(String string ) {
        homePage.hoverOverCatagoryButton("Computers");
    }

    @Then("I should verify the change of hover colour")
    public void iShouldVerifyTheChangeOfHoverColour() {

    }

    @When("I click on subcategory {string} link")
    public void iClickOnSubcategoryLink(String subCategory) {
       homePage.verifySubcategory("Notebooks");
    }

    @Then("I should be able to navigate successfully to {string} page")
    public void iShouldBeAbleToNavigateSuccessfullyToPage(String subCategory) {
    noteBooks.noteBooksPage(subCategory);

    }
    @When("I click on {string}")
    public void iClickOn(String Buildyourowncomputer) {
     homePage.buildYourOwnComputer();
    }

    @And("Select all the product details")
    public void selectAllTheProductDetails() {
        buildYourOwnComputer.productDetails();

    }

    @When("I click on add to cart button")
    public void iClickOnAddToCartButton() {
        cartPage.buidOwnComp();
    }

    @And("Enter the checkout button")
    public void enterTheCheckoutButton() {
        checkOutAsAGuest.checkOutAsAGuest();
        onePageCheckOutBilling.checkOut();
        shippingMethod.checkOut();
        paymentMethod.payMethod();
        opcPaymentInfo.checkOutPaymentInfo();
    }

    @Then("I should able to checkout successfully")
    public void iShouldAbleToCheckoutSuccessfully() {
        opcConfirmOrder.confirmOrder();
        checkoutComplete.checkoutConfirmation();
    }

    @And("I should able verify the page tittle as {string}")
    public void iShouldAbleVerifyThePageTittleAs(String button_name, String arg1) {

    }

//    @And("I should able verify the page tittle as {string}")
//    public void iShouldAbleVerifyThePageTittleAs(String arg0) {
//    }
//================================================================================================


}
