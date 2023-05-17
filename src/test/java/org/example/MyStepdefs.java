package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class MyStepdefs {
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    Register_Result_Page registerResultPage = new Register_Result_Page();
    LogInPage logInPage = new LogInPage();
    AppleMacBook_page appleMacBookPage = new AppleMacBook_page();
    EmailAFriend_Page emailAFriendPage = new EmailAFriend_Page();
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
}
