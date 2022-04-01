package waiters;

import core.InitDriver;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waiter {
    private final IOSDriver<MobileElement> iosDriver;
    WebDriverWait wait;

    public Waiter() {
        this.iosDriver = InitDriver.getDriver();
        this.wait = new WebDriverWait(iosDriver, 5L);
    }

    public boolean waitForVisibility(MobileElement element) {
        try {
            wait.until(ExpectedConditions.visibilityOf(element));
            return true;
        } catch (Exception ElementNotVisible) {
            return false;
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
