package pages.settings.myProfile;

import base.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class MyProfilePage extends BasePage {

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeStaticText[contains(@name, '+')]")
    protected MobileElement PHONE_NUMBER_MY_PROFIlE;

    public String getPhoneNumberFromMyProfilePage() {
        return element.getTextFromElement(PHONE_NUMBER_MY_PROFIlE);
    }
}
