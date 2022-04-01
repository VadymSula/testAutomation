package base;

import core.InitDriver;
import elements.Element;
import pages.more.MoreFeaturesPage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.qameta.allure.Step;
import org.openqa.selenium.support.PageFactory;
import pages.settings.SettingsPage;
import pages.transfer.TransferPage;

public class BasePage {
    private IOSDriver<MobileElement> driver;
    protected Element element;

    @iOSXCUITFindBy(iOSNsPredicate = "label == 'More'")
    protected MobileElement MORE_BUTTON;
    @iOSXCUITFindBy(accessibility = "HomeSettingsButtonAccessId")
    protected MobileElement SETTINGS_BUTTON;
    @iOSXCUITFindBy(iOSNsPredicate = "label == 'Transfers'")
    protected MobileElement TRANSFERS_BUTTON;

    public BasePage() {
        var iosDriver = InitDriver.getDriver();
        element = new Element();
        this.setDriver(iosDriver);
        PageFactory.initElements(new AppiumFieldDecorator(iosDriver), this);
    }

    public IOSDriver<MobileElement> getDriver() {
        return driver;
    }

    public void setDriver(IOSDriver<MobileElement> driver) {
        this.driver = driver;
    }

    @Step("Input PIN code")
    public BasePage inputPinCode(String pinCode) {
        var arrayOfNumbersForCode = pinCode.toCharArray();
        for (char number : arrayOfNumbersForCode) {
            element.clickOnElement(driver.findElementByIosClassChain("**/XCUIElementTypeButton[`label == '" + number + "'`]"));
        }
        return this;
    }

    @Step("Tap on 'More features' button")
    public MoreFeaturesPage tapOnMoreFeaturesButton() {
        element.clickOnElement(MORE_BUTTON);
        return new MoreFeaturesPage();
    }

    @Step("Tap on 'Settings' button, on home page")
    public SettingsPage tapOnSettingsButton() {
        element.clickOnElement(SETTINGS_BUTTON);
        return new SettingsPage();
    }

    @Step("Tap on 'Transfers' button")
    public TransferPage tapOnTransfersButton() {
        element.clickOnElement(TRANSFERS_BUTTON);
        return new TransferPage();
    }
}
