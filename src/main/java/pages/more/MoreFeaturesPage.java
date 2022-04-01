package pages.more;

import base.BasePage;
import pages.more.savings.SavingsPage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.qameta.allure.Step;

public class MoreFeaturesPage extends BasePage {

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Savings']/..")
    protected MobileElement SAVINGS_SECTION;

    @Step("Tap on 'Savings section'")
    public SavingsPage tapOnSavingsSectionButton() {
        element.clickOnElement(SAVINGS_SECTION);
        return new SavingsPage();
    }
}
