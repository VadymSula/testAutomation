package base;

import configs.PropertiesConfig;
import pages.settings.SettingsPage;
import utils.Listener;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import static core.InitDriver.*;

@Listeners(Listener.class)
public class BaseTest {

    protected BasePage basePage = new BasePage();
    protected SettingsPage settingsPage = new SettingsPage();

    @BeforeClass
    public void inputPinCode() {
        basePage.inputPinCode(PropertiesConfig.getProperty("pinCode"));
    }

    @AfterClass
    public void afterMobileTests() {
        getDriver().resetApp();
    }
}
