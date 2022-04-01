package elements;

import core.InitDriver;
import waiters.Waiter;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.apache.log4j.Logger;

public class Element {
    private final AppiumDriver<MobileElement> driver = InitDriver.getDriver();
    private static final Logger log = Logger.getLogger(Element.class);
    private final Waiter waiter = new Waiter();

    public boolean isVisibleElement(MobileElement mobileElement) {
        return waiter.waitForVisibility(mobileElement);
    }

    public boolean isElementExist(MobileElement mobileElement) {
        return waiter.isElementExist(mobileElement);
    }

    public void clickOnElement(MobileElement mobileElement) {
        waiter.waitForClickable(mobileElement).click();
    }

    public String getTextFromElement(MobileElement mobileElement) {
        waiter.waitForVisibility(mobileElement);
        return mobileElement.getText();
    }
}
