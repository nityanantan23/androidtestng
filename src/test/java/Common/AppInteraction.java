package Common;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Properties;

import org.apache.commons.io.IOUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Enums.FindElementBy;
import Model.TestConfiguration;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class AppInteraction {
	
	private AndroidDriver<MobileElement> _driver;
	private TouchAction touchAction = null;
	public static final int MAX_DELAY = 15000;
	
	public AppInteraction(AndroidDriver<MobileElement> driver) {
		this._driver = driver;
		touchAction = new TouchAction(driver);
	}

	public MobileElement FindElement(String id, FindElementBy by, int delayInSeconds) {
		MobileElement element;

		if (by == FindElementBy.XPath) {
			element = (MobileElement) _driver.findElement(By.xpath(id));
		} else {
			element = (MobileElement) _driver.findElement(By.id(id));
		}
		
		if(delayInSeconds > 0) {
			WaitForElement(id, by, delayInSeconds);
		}
		return element;
	}

	public void TapElement(String id, FindElementBy by, int delay) {
		MobileElement element = FindElement(id, by, delay);
		touchAction.tap(element.getLocation().x, element.getLocation().y).perform();
	}

	public void ClickElement(String id, FindElementBy by, int delay) {
		MobileElement element = FindElement(id, by, delay);
		element.click();
	}

	public void SendKey(String id, String key, FindElementBy by, int delay) {
		MobileElement element = FindElement(id, by, delay);
		element.clear();
		element.sendKeys(key);
	}

	public boolean WaitForElement(String id, FindElementBy by, int delayInSeconds) {
		try {
			MobileElement element;

			if (by == FindElementBy.XPath) {
				element = (MobileElement) _driver.findElement(By.xpath(id));
			} else {
				element = (MobileElement) _driver.findElement(By.id(id));
			}
			
			WebDriverWait wait = new WebDriverWait(_driver, delayInSeconds);
			wait.until(ExpectedConditions.visibilityOf(element));
			return element.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}

	public long RecordVisible(String id, FindElementBy by, int delayInSeconds) {
		long start = System.currentTimeMillis();
		try {
			MobileElement element;
			
			By findBy;

			if (by == FindElementBy.XPath) {
				findBy = By.xpath(id);
			} else {
				findBy = By.id(id);
			}
			
			element = (MobileElement) _driver.findElement(findBy);
			
			WebDriverWait wait = new WebDriverWait(_driver, 300);
			wait.until(ExpectedConditions.visibilityOfElementLocated(findBy));
			long finish = System.currentTimeMillis();
			long timeElapsed = finish - start;

			if(element.isDisplayed()) {
				return timeElapsed;
			}
			else {
				return -1;
			}
		} catch (Exception e) {
			return -1;
		}
	}
	
	protected long RecordInvisible(String id, FindElementBy by) {
		long start = System.currentTimeMillis();
		try {
			By findBy;

			if (by == FindElementBy.XPath) {
				findBy = By.xpath(id);
			} else {
				findBy = By.id(id);
			}
			
			WebDriverWait wait = new WebDriverWait(_driver, 300);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(findBy));
			long finish = System.currentTimeMillis();
			long timeElapsed = finish - start;
			/*
			writeToFile("Starts: " + Long.toString(start) + "\r\n Ends: " + Long.toString(finish) + "\r\n Elapsed: "
					+ Long.toString(timeElapsed));*/
			return timeElapsed;
		} catch (Exception e) {
			return 0;
		}
	}
	
	public boolean TakeScreenshot(final String name) {
	   String screenshotDirectory = System.getProperty("appium.screenshots.dir", System.getProperty("java.io.tmpdir", ""));
	   File screenshot = ((TakesScreenshot) _driver).getScreenshotAs(OutputType.FILE);
	   return screenshot.renameTo(new File(screenshotDirectory, String.format("%s.png", name)));
	}

	public void WriteToReport(String text) {
		String filePath = System.getenv("DEVICEFARM_LOG_DIR") + "/report.txt";
		File reportFile = new File(filePath);

		System.out.println("filepath: " + filePath);
		
		if(!reportFile.exists()) {
			try(PrintWriter output = new PrintWriter(new FileWriter(reportFile))) 
			{
			    output.printf("%s\r\n", text);
			} 
			catch (Exception e) {
				System.out.println("Report file not found.");
				System.out.println(e.getMessage());
			}
		}
		else {
			try(PrintWriter output = new PrintWriter(new FileWriter(reportFile, true))) 
			{
			    output.printf("%s\r\n", text);
			} 
			catch (Exception e) {
				System.out.println("Report file not found. (Existing)");
				System.out.println(e.getMessage());
			}
		}		
	}
	
	public void WriteConfigFile() {
		TestConfiguration configuration = getTestConfiguration();
		
		String filePath = System.getenv("DEVICEFARM_LOG_DIR") + "/config.json";
		File configFile = new File(filePath);

		System.out.println("filepath: " + filePath);
		
		try(PrintWriter output = new PrintWriter(new FileWriter(configFile))) 
		{
			output.printf("{\r\n");
		    	output.printf("\"TestResultSender\": \"%s\",\r\n", configuration.TestResultSender);
		    	output.printf("\"TestResultRecipient\": \"%s\"\r\n", configuration.TestResultRecipient);
			output.printf("}");
		} 
		catch (Exception e) {
			System.out.println("config file not found.");
			System.out.println(e.getMessage());
		}
	}
	
	public TestConfiguration getTestConfiguration() {
		TestConfiguration configuration = new TestConfiguration();
		String driverID = "5009003";
		String password = "12345";
		String otp = "1234";
		String emailSender = "eugeneng@axrail.com";
		String emailRecipient = "yhlaw@axrail.com";
		
		TestConfiguration defaultConfiguration = new TestConfiguration();
		defaultConfiguration.DriverID = driverID;
		defaultConfiguration.Password = password;
		defaultConfiguration.Otp = otp;
		defaultConfiguration.TestResultSender = emailSender;
		defaultConfiguration.TestResultRecipient = emailRecipient;
		
		ObjectMapper mapper = new ObjectMapper();
		String fileName = "config/config.json";      
	    InputStream testConfigurationResourceStream = null;
	    ClassLoader classLoader = ClassLoader.getSystemClassLoader();  
	    String testConfigurationResourceData = "";
	    try {
			//System.out.println("file in resource: " + classLoader.getResource(fileName).getFile());
			testConfigurationResourceStream = classLoader.getResourceAsStream(fileName);
			testConfigurationResourceData = IOUtils.toString(testConfigurationResourceStream, "UTF-8");
		} catch (Exception e) {
			e.printStackTrace();
			return defaultConfiguration;
		}
	    
		if(testConfigurationResourceStream != null) {
        	try {
        		TestConfiguration testConfigurationResourceModel = mapper.readValue(testConfigurationResourceData, TestConfiguration.class);
        		configuration.TestResultSender = isValidConfiguration(testConfigurationResourceModel.TestResultSender) ? testConfigurationResourceModel.TestResultSender : emailSender;
        		configuration.TestResultRecipient = isValidConfiguration(testConfigurationResourceModel.TestResultRecipient) ? testConfigurationResourceModel.TestResultRecipient : emailRecipient;
        		configuration.DriverID = isValidConfiguration(testConfigurationResourceModel.DriverID) ? testConfigurationResourceModel.DriverID : driverID;
        		configuration.Password = isValidConfiguration(testConfigurationResourceModel.Password) ? testConfigurationResourceModel.Password : password;
        		configuration.Otp = isValidConfiguration(testConfigurationResourceModel.Otp) ? testConfigurationResourceModel.Otp : otp;
        		
		    } catch (IOException e) {
		    	e.printStackTrace();
		    	return defaultConfiguration;
		    }
		}
		
		return configuration;
	}
	
	private boolean isValidConfiguration(String configurationString) {
		return !(configurationString == null || configurationString.equals(""));
	}
}
