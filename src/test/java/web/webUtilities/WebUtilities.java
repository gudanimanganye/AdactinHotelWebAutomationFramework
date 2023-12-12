package web.webUtilities;

import org.openqa.selenium.WebDriver;

public class WebUtilities {

    protected WebDriver driver;

    public WebDriver getWeDriver(){
        return driver;
    }

    public void setWebDriver(WebDriver DriverTest) {
        driver = DriverTest;
    }
    public WebDriver initialiseWebDriver(String sBrowser){


        return driver;
    }
}
