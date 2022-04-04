package core;

import configs.PropertiesConfig;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.apache.log4j.Logger;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class InitDriver {

    private static final Logger log = Logger.getLogger(InitDriver.class);
    private static IOSDriver<MobileElement> driver;

    public static IOSDriver<MobileElement> getDriver() {
        if (driver == null) {
            try {
                driver = initializeDriver();
                log.info("Driver is started");
            } catch (MalformedURLException e) {
                e.printStackTrace();
                log.error("Driver not started");
            }
        }
        return driver;
    }

    private static IOSDriver<MobileElement> initializeDriver() throws MalformedURLException {
        return new IOSDriver<>(new URL(PropertiesConfig.getProperty("APPIUM_URL")), setCapabilities());
    }

    private static DesiredCapabilities setCapabilities() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, PropertiesConfig.getProperty("deviceName"));
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, PropertiesConfig.getProperty("platformName"));
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, PropertiesConfig.getProperty("platformVersion"));
        capabilities.setCapability(MobileCapabilityType.NO_RESET, false);
        capabilities.setCapability(MobileCapabilityType.UDID, PropertiesConfig.getProperty("udId"));
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, PropertiesConfig.getProperty("automationName"));
        capabilities.setCapability("bundleId", PropertiesConfig.getProperty("bundleId"));

        return capabilities;
    }
}
