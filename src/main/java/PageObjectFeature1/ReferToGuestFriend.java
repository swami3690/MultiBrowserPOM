package PageObjectFeature1;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ReferToGuestFriend extends Utils {
    LoadProp loadProp = new LoadProp();
    private By _selectProduct = By.xpath("//div[@class=\"page-body\"]/div[4]/div[2]/div[2]/div/div[2]/h2/a");
    private By _emailAFriendButton = By.xpath("//input[@value='Email a friend']");
    private By _yourEmailId = By.id("FriendEmail");
    private By _enteryourEmailAddress = By.id("YourEmailAddress");
    private By _personalMassage = By.id("PersonalMessage");
    private By _SendEmailButton = By.xpath("//input [@ value=\"Send email\" ]");
    private By _actualMessage = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/ul/li");


    public void referProductToGuestFriend () {

        clickElement(_selectProduct);
        clickElement(_emailAFriendButton);
        enterText(_yourEmailId, loadProp.getProperty("Friendemail"));
        enterText(_enteryourEmailAddress,loadProp.getProperty("Email"));
        enterText(_personalMassage, loadProp.getProperty("personalMassage"));
        clickElement(_SendEmailButton);

    }
    public  void  message(){


        Assert.assertEquals(getText(_actualMessage), "Only registered customers can use email a friend feature");

    }














}
