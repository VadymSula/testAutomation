package pages.more.savings;

import base.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.qameta.allure.Step;

public class SavingsPage extends BasePage {

    @iOSXCUITFindBy(iOSNsPredicate = "label == 'CREATE' AND type == 'XCUIElementTypeButton'")
    protected MobileElement CREATE_SAVING_BUTTON;

    @iOSXCUITFindBy(iOSNsPredicate = "label CONTAINS 'Vacation'")
    protected MobileElement VACATION_SECTION;

    @iOSXCUITFindBy(iOSNsPredicate = "label == 'Name '")
    protected MobileElement SAVING_NAME_FIELD;

    @Step("Tap on 'Create'")
    public SavingsPage tapOnCreateButton() {
        element.clickOnElement(CREATE_SAVING_BUTTON);
        return this;
    }

    @Step("Choose 'Vacation' variant from offer list")
    public SavingsPage chooseVacationSection() {
        element.clickOnElement(VACATION_SECTION);
        return this;
    }

    public boolean isExistNameOfSelectedVariantInField() {
        return element.isElementExist(SAVING_NAME_FIELD);
    }
}
