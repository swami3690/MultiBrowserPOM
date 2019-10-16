package PageObjectFeature1;

import org.openqa.selenium.By;
import org.testng.Assert;

public class Login extends Utils {

    LoadProp loadProp = new LoadProp();

    //private By _enterUserName = By.
    private By _enterUserName = By.xpath("//*[@id=\"Email\"]");
    private By _enterUserPassword = By.xpath("//*[@id=\"Password\"]");
    private By _enterLogin = By.xpath("//form/div[3]/input");
    private By _checkCondition = By.xpath("//a[@class=\"ico-account\"]");




    public void clickLogin() {

        enterText(_enterUserName, loadProp.getProperty("Email"));
        enterText(_enterUserPassword, loadProp.getProperty("passwordTXT"));
        clickElement(_enterLogin);

    }



    public void loginVisibility(){

        Assert.assertEquals(getText(_checkCondition),"My account");

    }

}

