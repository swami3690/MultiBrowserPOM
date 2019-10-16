package PageObjectFeature1;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;



import javax.rmi.CORBA.Util;
import java.io.File;
import java.util.concurrent.TimeUnit;

import static PageObjectFeature1.Utils.randomDate;

public class Hooks extends BasePage {

    BrowserSelector browserSelector = new BrowserSelector();
    LoadProp loadProp = new LoadProp();

    @Before
    public void setBrowserSelector() {
        browserSelector.setUpBrowser();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(loadProp.getProperty("url"));


    }

    @After

        public void closeBrowser() {
    //    driver.close();

    }

}

