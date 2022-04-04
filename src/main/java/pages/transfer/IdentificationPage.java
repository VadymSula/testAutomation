package pages.transfer;

import base.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.qameta.allure.Step;

public class IdentificationPage extends BasePage {

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`label == 'IDENTIFY NOW'`]")
    protected MobileElement IDENTIFY_NOW_BUTTON;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeNavigationBar[`name == 'Identification'`]")
    protected MobileElement IDENTIFICATION_LABEL;

    @Step("Tap on 'IDENTIFY NOW' button")
    public IdentificationPage tapOnIdentifyNowButton() {
        element.clickOnElement(IDENTIFY_NOW_BUTTON);
        return this;
    }

    public boolean isDisplayIdentificationPage() {
        return element.isElementExist(IDENTIFICATION_LABEL);
    }
}
