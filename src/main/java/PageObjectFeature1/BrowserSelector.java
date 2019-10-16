package PageObjectFeature1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserSelector extends Utils {

    LoadProp loadProp = new LoadProp();

    public void setUpBrowser() {

        String browser = loadProp.getProperty("browser");

        if (browser.equalsIgnoreCase("Firefox")) {

            System.setProperty("webdriver.gecko.driver", "src\\test\\java\\Resources\\BrowserDriver\\geckodriver.exe");

            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("chrome")) {

            System.setProperty("webdriver.chrome.driver", "src\\test\\java\\Resources\\BrowserDriver\\chromedriver.exe");

            driver = new ChromeDriver();

        }

        else if(browser.equalsIgnoreCase("ie")) {

            System.setProperty("webdriver.ie.driver", "src\\test\\java\\Resources\\BrowserDriver\\IEDriverServer.exe");
            driver = new InternetExplorerDriver();
        }
        else {

            System.out.println("Browser name is empty or typed wrong " + browser);
        }


    }}

