package Tests.AbstractBaseTests;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.openqa.selenium.html5.Location;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import Common.AppInteraction;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public abstract class TestBase extends AbstractTestNGCucumberTests {

	protected static final String DEVICE_NAME = System.getenv("deviceName") != null ? System.getenv("deviceName")
			: "iPhone X";
	protected static final String PLATFORM_VERSION = "11.4";
	public static AndroidDriver<MobileElement> driver;
	protected AppInteraction appInteraction;

	@BeforeTest
	public abstract void setUpPage();

	@BeforeSuite
	public void setUpAppium() throws MalformedURLException, UnknownHostException {

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("autoGrantPermissions", true);
		capabilities.setCapability("autoAcceptAlerts", true);
		capabilities.setCapability("connectHardwareKeyboard", false);
		capabilities.setCapability("useNewWDA", false);
		capabilities.setCapability("locationContextEnabled", true);


//		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "PIXEL3");
//		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
//		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
//		capabilities.setCapability(MobileCapabilityType.APP, "E:\\Downloads\\fm.apk");
//		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		
		
		try {
			driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

		} catch (MalformedURLException e) {
			System.out.println(e.getMessage());
		}

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}

	@AfterSuite
	public void tearDownAppium() {
		driver.quit();
	}

	@BeforeClass
	public void initApp() throws Exception {

	}

	@AfterClass
	public void restartApp() {

	}
}
