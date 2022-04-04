package pages.settings;

import base.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.qameta.allure.Step;
import pages.settings.myProfile.MyProfilePage;

public class SettingsPage extends BasePage {

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='View my profile']/following-sibling::*")
    protected MobileElement PHONE_NUMBER;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='View my profile']/..")
    protected MobileElement MY_PROFILE_BUTTON;

    @Step("Get phone number from settings page")
    public String getPhoneNumberFromSettingsPage() {
        return element.getTextFromElement(PHONE_NUMBER);
    }

    @Step("Tap on 'My profile'")
    public MyProfilePage tapOnMyProfile() {
        element.clickOnElement(MY_PROFILE_BUTTON);
        return new MyProfilePage();
    }
}
