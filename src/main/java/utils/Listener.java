package utils;

import core.InitDriver;
import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.ByteArrayInputStream;

public class Listener implements ITestListener {

    private void takeScreenshot() {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(
                ((TakesScreenshot) InitDriver.getDriver())
                        .getScreenshotAs(OutputType.BYTES));
        Allure.addAttachment("Screenshot of failed step", byteArrayInputStream);
    }

    @Override
    public void onTestFailure(ITestResult result) {
        takeScreenshot();
    }
}
