package Tests;


import org.testng.Assert;
import org.testng.annotations.BeforeTest;

import Common.AppInteraction;
import Pages.LandingPage;
import Tests.AbstractBaseTests.TestBase;
import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


@CucumberOptions(
        strict = true,
        monochrome = true,
        features = "classpath:Step1_LandingPageTest",
        plugin = {"pretty"}
)

public class Step1_LandingPageTest extends TestBase{
	private LandingPage landingPage;

    @BeforeTest
    @Override
    public void setUpPage() {
    	landingPage = new LandingPage(driver);
    	
    }
    
    @Given("^I initiate Landing Page$")
    public void initPage() {
    	if(landingPage == null) {
    		landingPage = new LandingPage(driver);
    	}
    	
    	if(appInteraction == null) {
    		this.appInteraction = new AppInteraction(driver);
    	}
    	
    	this.appInteraction.WriteToReport("Background: I initiate Landing Page : " + (landingPage != null ? "Passed" : "Failed"));

        Assert.assertTrue(true);
    }

    @Given("^I see the app load banner$")
    public void isPageBannerShown() throws InterruptedException, Exception {
    	boolean isTestSuccess = true;

    	if(appInteraction == null) {
    		this.appInteraction = new AppInteraction(driver);
    	}
    	
    	try {
    		isTestSuccess = landingPage.isPageBannerShown();
		} catch (Exception e) {
			e.printStackTrace();
			isTestSuccess = false;
		}
    	
    	this.appInteraction.WriteToReport("Scenario: I see the app load banner : " + (isTestSuccess ? "Passed" : "Failed"));

        Assert.assertTrue(isTestSuccess);
    }

    @Then("^I am able to click the download button$")
    public void ableToClosePopUp() throws InterruptedException, Exception {
    	boolean isTestSuccess = true;

    	if(appInteraction == null) {
    		this.appInteraction = new AppInteraction(driver);
    	}
    	
    	try {
    		isTestSuccess = landingPage.isAbleToClickDownloadButton();
		} catch (Exception e) {
			e.printStackTrace();
			isTestSuccess = false;
		}
    	
    	this.appInteraction.WriteToReport("Scenario: I am able to click the download button : " + (isTestSuccess ? "Passed" : "Failed"));

        Assert.assertTrue(isTestSuccess);
    }
    
    @Given("^I see product page$")
    public void isProductPageShown() throws InterruptedException, Exception {
    	boolean isTestSuccess = true;

    	if(appInteraction == null) {
    		this.appInteraction = new AppInteraction(driver);
    	}
    	
    	try {
    		isTestSuccess = landingPage.isProductPageShown();
		} catch (Exception e) {
			e.printStackTrace();
			isTestSuccess = false;
		}
    	
    	this.appInteraction.WriteToReport("Scenario: I see product page : " + (isTestSuccess ? "Passed" : "Failed"));

        Assert.assertTrue(isTestSuccess);
    }
    
    @Then("^I am able to click the back button$")
    public void ableToClickBack() throws InterruptedException, Exception {
    	boolean isTestSuccess = true;

    	if(appInteraction == null) {
    		this.appInteraction = new AppInteraction(driver);
    	}
    	
    	try {
    		isTestSuccess = landingPage.isAbleToClickBackButton();
		} catch (Exception e) {
			e.printStackTrace();
			isTestSuccess = false;
		}
    	
    	this.appInteraction.WriteToReport("Scenario: I am able to click the back button : " + (isTestSuccess ? "Passed" : "Failed"));

        Assert.assertTrue(isTestSuccess);
    }
    
    @Then("^I am able to click the close button$")
    public void ableToClose() throws InterruptedException, Exception {
    	boolean isTestSuccess = true;

    	if(appInteraction == null) {
    		this.appInteraction = new AppInteraction(driver);
    	}
    	
    	try {
    		isTestSuccess = landingPage.isAbleToClickCloseButton();
		} catch (Exception e) {
			e.printStackTrace();
			isTestSuccess = false;
		}
    	
    	this.appInteraction.WriteToReport("Scenario: I am able to click the close button : " + (isTestSuccess ? "Passed" : "Failed"));

        Assert.assertTrue(isTestSuccess);
    }
}
