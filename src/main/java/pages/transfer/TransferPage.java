package pages.transfer;

import base.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.qameta.allure.Step;

public class TransferPage extends BasePage {

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='New Transfer']/..")
    protected MobileElement NEW_TRANSFER_BUTTON;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Paysera Transfer']/..")
    protected MobileElement PAYSERA_TRANSFER;

    @Step("Tap on 'New Transfer' button")
    public TransferPage tapOnNewTransferButton() {
        element.clickOnElement(NEW_TRANSFER_BUTTON);
        return this;
    }

    @Step("Choose 'Paysera Transfer' variant of transfer")
    public IdentificationPage choosePayseraTransfer() {
        element.clickOnElement(PAYSERA_TRANSFER);
        return new IdentificationPage();
    }
}
