import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;


import java.net.MalformedURLException;
import java.net.URL;

public class TestBase {
    public static AndroidDriver driver;

    public static void setUp() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("platformVersion", "11");
        caps.setCapability("deviceName", "OPPO A9 2020");
        caps.setCapability("appium:app",
                System.getProperty("user.dir")+"/apps/ToDo_1.24_APKPure.apk");
        caps.setCapability("newCommandTimeout", 60); // Adjust as needed


        try {
            driver = new AndroidDriver<AndroidElement>(new URL("http://localhost:4723"), caps);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }


    }
