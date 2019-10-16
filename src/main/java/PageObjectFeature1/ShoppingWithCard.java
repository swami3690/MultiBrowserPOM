package PageObjectFeature1;

import org.openqa.selenium.By;

public class ShoppingWithCard  extends  Utils{
    LoadProp loadProp = new LoadProp();

    private By _Book = By.linkText("Books");
    private By _ClickBook = By.xpath("//div/div[1]/div/div[2]/div[3]/div[2]/input[1]");
    private By _ShoppingCart = By.xpath("//*[@id=\"bar-notification\"]/div/p/a");
    private By _UpdateSoppingCard =By.xpath("//*[@id=\"shopping-cart-form\"]/div[2]/div[1]/input[1]");
    private By _Checkbox = By.xpath("//*[@id=\"termsofservice\"]");
    private By _CheckOut = By.xpath("//*[@id=\"checkout\"]");
    private By _Email = By.id("Email");
    private  By _Password = By.id("Password");
    private  By _Login = By.xpath("//div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/input");
    private  By _UpdateSoppingCard_1 = By.xpath("//*[@id=\"shopping-cart-form\"]/div[2]/div[1]/input[1]");
    private  By _Checkbox_1 = By.xpath("//*[@id=\"termsofservice\"]");
    private  By _CheckOut1 = By.xpath("//*[@id=\"checkout\"]");
    private By _continue_1_Button = By.xpath("//*[@id=\"billing-buttons-container\"]/input");
    private By _Country = By.id("BillingNewAddress_CountryId");
    private By _City = By.id("BillingNewAddress_City");
    private By _Add1 = By.id("BillingNewAddress_Address1");
    private By _Postcode = By.name("BillingNewAddress.ZipPostalCode");
    private By _phone = By.id("BillingNewAddress_PhoneNumber");
    private By _continue_2_Button = By.xpath("//*[@id=\"shipping-method-buttons-container\"]/input");
    private By _creditCard = By.id("paymentmethod_1");
    private By _continue_3_Button = By.xpath("//*[@id=\"payment-method-buttons-container\"]/input");
    private By _creditcard_Button = By.id("paymentmethod_1");
    private By _continue_4_Button = By.className("button-1 payment-method-next-step-button");
    private By _TickOut = By.xpath("//input[@id=\"shippingoption_1\"]");
    private By _countinue_5_Button = By.xpath("//*[@id=\"payment-method-buttons-container\"]/input");
    private By _dropDown =By.className("dropdownlists");
    private By _cardholderName = By.id("CardholderName");
    private By _cardNumber = By.id("CardNumber");
    private By _ExpiredDate = By.id("ExpireMonth");
    private By _cardCode = By.id("CardCode");
    //private By _TickOut1 = By.xpath("//*[@id=\"paymentmethod_1\"]");
   //  private By _countinue_7_Button = By.xpath("//*[@id=\"payment-method-buttons-container\"]/input");
    private By _confirm_Button = By.className("button-1 confirm-order-next-step-button");
    private By _getAssert = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div/div[1]/strong");


    public  void ShopingToCheckout () {

        clickElement(_Book);
        clickElement(_ClickBook);
        clickElement(_ShoppingCart);
        clickElement(_UpdateSoppingCard);
        clickElement(_Checkbox);
        clickElement(_CheckOut);
        enterText(_Email , loadProp.getProperty("Email"));
        enterText(_Password, loadProp.getProperty("password"));
       clickElement(_Login);
       clickElement(_UpdateSoppingCard_1);
       clickElement(_Checkbox_1);
       clickElement(_CheckOut1);
       clickElement(_continue_1_Button);
       clickElement(_continue_2_Button);
        enterText(_Country,loadProp.getProperty("Country"));
        enterText(_City,loadProp.getProperty("City"));
        enterText(_Add1,loadProp.getProperty("add"));
        enterText(_Postcode, loadProp.getProperty("postcode"));
        enterText(_phone, loadProp.getProperty("phone"));
        clickElement(_continue_1_Button);

    }


    public void paymentMethod() {

        clickElement(_creditCard);
        clickElement(_continue_3_Button);
        clickElement(_creditcard_Button);
        clickElement(_continue_4_Button);
        clickElement(_TickOut);
        clickElement(_countinue_5_Button);
        clickElement(_dropDown);
        enterText(_cardholderName, loadProp.getProperty("cardholderName"));
        enterText(_cardNumber, loadProp.getProperty("cardNumber"));
        enterText(_ExpiredDate, loadProp.getProperty("Expiration date"));
        enterText(_cardCode, loadProp.getProperty("Card code"));
        //clickElement(_TickOut1);
       // clickElement(_countinue_7_Button);
        clickElement(_confirm_Button);
    }
    public void Assert (){


        enterText(_getAssert ,loadProp.getProperty("getAssert"));

        AssertByText("Your order has been successfully processed!","Your order has been successfully processed!");

    }

    private void AssertByText(String s, String s1) {
    }









}
