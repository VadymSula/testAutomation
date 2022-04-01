package base;

import utils.Listener;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import static core.InitDriver.*;

@Listeners(Listener.class)
public class BaseTest {
    protected BasePage basePage = new BasePage();
    private static final String PIN_CODE = "25802";

    @BeforeClass
    public void inputPinCode() {
        basePage.inputPinCode(PIN_CODE);
    }

    @AfterClass
    public void afterMobileTests() {
        getDriver().resetApp();
    }
}
