package configs;

import core.InitDriver;
import org.apache.log4j.Logger;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesConfig {

    private static final String PATH_TO_CONFIG_PROPERTIES = "src/main/resources/conf.properties";
    protected static Properties PROPERTIES;
    private static final Logger log = Logger.getLogger(InitDriver.class);

    static {
        File configFile = new File(PATH_TO_CONFIG_PROPERTIES);

        Properties properties = new Properties();

        try {
            properties.load(new FileInputStream(configFile));
            PROPERTIES = new Properties();
            PROPERTIES.putAll(properties);
        } catch (IOException e) {
            log.error(e.getMessage());
        }
    }

    public static String getProperty(String key) {
        return PROPERTIES.getProperty(key);
    }
}
