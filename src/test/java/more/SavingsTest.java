package more;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SavingsTest extends BaseTest {

    @Test
    public void nameOfSelectedVariantInInputFieldSavingTest() {
        var actualResult = basePage
                .tapOnMoreFeaturesButton()
                .tapOnSavingsSectionButton()
                .tapOnCreateButton()
                .chooseVacationSection()
                .isExistNameOfSelectedVariantInField();

        Assert.assertTrue(actualResult, "Selected variant exist in input field for saving");
    }
}
