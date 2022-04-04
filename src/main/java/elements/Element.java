package elements;

import io.appium.java_client.MobileElement;
import waiters.Waiter;

public class Element {
    private final Waiter waiter = new Waiter();

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
