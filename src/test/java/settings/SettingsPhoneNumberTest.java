package settings;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.settings.SettingsPage;

public class SettingsPhoneNumberTest extends BaseTest {

    @Test
    public void phoneNumberFromSettingsAndMyProfileTest() {
        var settingsPage = new SettingsPage();
        String phoneNumberFromSettingsPage = basePage
                .tapOnSettingsButton()
                .getPhoneNumberFromSettingsPage();
        String phoneNumberFromMyProfilePage = settingsPage
                .tapOnMyProfile()
                .getPhoneNumberFromMyProfilePage();

        Assert.assertEquals(phoneNumberFromSettingsPage, phoneNumberFromMyProfilePage, "Phone numbers is equals");
    }
}
