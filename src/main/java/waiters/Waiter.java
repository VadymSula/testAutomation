package waiters;

import core.InitDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waiter {

    private static final Logger log = Logger.getLogger(Waiter.class);
    WebDriverWait wait;

    public Waiter() {
        IOSDriver<MobileElement> iosDriver = InitDriver.getDriver();
        this.wait = new WebDriverWait(iosDriver, 5L);
    }

    public void waitForVisibility(MobileElement element) {
        try {
            wait.until(ExpectedConditions.visibilityOf(element));
        } catch (Exception elementNotVisible) {
            log.error(elementNotVisible);
        }
    }

    public boolean isElementExist(MobileElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
        return element.isDisplayed();
    }

    public MobileElement waitForClickable(MobileElement ClickElement) {
        return (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(ClickElement));
    }
}
