package PageObjectFeature1;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegistrationPage extends Utils {

    LoadProp loadProp = new LoadProp();
    private By _firstName = By.id("FirstName");
    private By _lastName = By.id("LastName");
    private By _email = By.id("Email");
    private By _passWord = By.id("Password");
    private By _confirmPassword = By.id ("ConfirmPassword");
    private By _registerButton = By.id("register-button");
    private By _RegisterSuccessfully = By.className("result");





    public  void  userEnterRegistrationDetails (){

        enterText(_firstName,loadProp.getProperty("FirstName"));
        enterText(_lastName,loadProp.getProperty("LastName"));
        enterText(_email,loadProp.getProperty("email")+ randomDate()+"@gmail.com");
        System.out.println(loadProp.getProperty("email")+ randomDate()+"@gmail.com");
        enterText(_passWord , loadProp.getProperty("password"));
        enterText(_confirmPassword ,loadProp.getProperty("cpassword"));
        clickElement(_registerButton);

    }

    public void RegisterSuccessfully (){

        Assert.assertEquals(getText(_RegisterSuccessfully),"Your registration completed");

    }



}


