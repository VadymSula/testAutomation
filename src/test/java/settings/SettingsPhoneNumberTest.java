package settings;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SettingsPhoneNumberTest extends BaseTest {

    @Test
    public void phoneNumberFromSettingsAndMyProfileTest() {
        String phoneNumberFromSettingsPage = basePage
                .tapOnSettingsButton()
                .getPhoneNumberFromSettingsPage();
        String phoneNumberFromMyProfilePage = settingsPage
                .tapOnMyProfile()
                .getPhoneNumberFromMyProfilePage();

        Assert.assertEquals(phoneNumberFromSettingsPage, phoneNumberFromMyProfilePage, "Phone numbers is equals");
    }
}
