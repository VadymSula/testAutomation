package transfers;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IdentificationTest extends BaseTest {

    @Test
    public void isDisplayIdentificationPageTest() {
        var actualResult = basePage
                .tapOnTransfersButton()
                .tapOnNewTransferButton()
                .choosePayseraTransfer()
                .tapOnIdentifyNowButton()
                .isDisplayIdentificationPage();

        Assert.assertTrue(actualResult, "Identification page is display");
    }
}
