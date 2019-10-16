package PageObjectFeature1;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepDefs {
    LoadProp loadProp = new LoadProp();
    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    Login login = new Login();
    ReferToFriend referToFriend = new ReferToFriend();
    ReferToGuestFriend referToGuestFriend = new ReferToGuestFriend();
    ShoppingWithCard shoppingWithCard =new ShoppingWithCard();


    @Given("^User is on Homepage URL$")
    public void user_is_on_Homepage_URL() {

        homePage.clickOnRegister();

    }

    @When("^User should be able to see register page after click on register navigate on homepage$")
    public void user_should_be_able_to_see_register_page_after_click_on_register_navigate_on_homepage() {
        registrationPage.userEnterRegistrationDetails();


    }

    @Then("^User should able to  see massage \"([^\"]*)\" after clicking register button$")
    public void user_should_able_to_see_massage_after_clicking_register_button(String arg1) {

        registrationPage.RegisterSuccessfully();

    }


    @When("^User should be able to click on product and email to friend$")
    public void user_should_be_able_to_click_on_product_and_email_to_friend() {

        login.clickLogin();
        referToFriend.referFriendWhenloggedIn();

    }

    @Then("^User  should be able to send email and can see massage \"([^\"]*)\"$")
    public void user_should_be_able_to_send_email_and_can_see_massage(String arg1) {
        referToFriend.testComparison();
    }


    @Given("^User is on Homepage$")
    public void user_is_on_Homepage() {
        homePage.logIn();

    }

    @When("^User should able to refer product without login$")
    public void user_should_able_to_refer_product_without_login() {
        referToGuestFriend.referProductToGuestFriend();
    }

    @Then("^User  should be able to send email and can see massage$")
    public void user_should_be_able_to_send_email_and_can_see_massage() {

        referToGuestFriend.message();

    }


    @Given("^homepage$")
    public void homepage() {
        homePage.clickOnRegister();

    }





    @When("^User should be able to do payment$")
    public void user_should_be_able_to_do_payment() {
        shoppingWithCard.ShopingToCheckout();

        shoppingWithCard.paymentMethod();
    }

    @Then("^User should able to see massage after payment$")
    public void user_should_able_to_see_massage_after_payment()  {
        shoppingWithCard.Assert();
    }


}