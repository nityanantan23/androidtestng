package Tests;


import Common.AppInteraction;
import Pages.m3;
import Pages.m5;
import Tests.AbstractBaseTests.TestBase;
import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

@CucumberOptions(
        strict = true,
        monochrome = true,
        features = "classpath:Step4_M5Test",
        plugin = {"pretty"}
)

public class Step4_M5Test extends TestBase {
    private m5 M5;

    @BeforeTest
    @Override
    public void setUpPage() {
        M5 = new m5(driver);
    }

    @Given("^I initiate M5 Page$")
    public void initPage() {
        if (M5 == null) {
            M5 = new m5(driver);
        }
        if (appInteraction == null) {
            this.appInteraction = new AppInteraction(driver);
        }
        this.appInteraction.WriteToReport("Background: I initiate feebacl Page : " + "Passed");

        Assert.assertTrue(true);
    }



    @Then("^I am able to add product to list$")
    public void add_productss() throws InterruptedException, Exception {
        boolean isTestSuccess = true;

        if (appInteraction == null) {
            this.appInteraction = new AppInteraction(driver);
        }

        try {
            isTestSuccess = M5.add_products();
        } catch (Exception e) {
            e.printStackTrace();
            isTestSuccess = false;
        } this.appInteraction.WriteToReport("Scenario: I am able to click the delete_address_menu button : " + (isTestSuccess ? "Passed" : "Failed"));

        Assert.assertTrue(isTestSuccess);
    }

    @Then("^I am able to select_location pickup$")
    public void select_locations_pickup() throws InterruptedException, Exception {
        boolean isTestSuccess = true;

        if (appInteraction == null) {
            this.appInteraction = new AppInteraction(driver);
        }

        try {
            isTestSuccess = M5.select_location_pickup();
        } catch (Exception e) {
            e.printStackTrace();
            isTestSuccess = false;
        } this.appInteraction.WriteToReport("Scenario: I am able to click the delete_address_menu button : " + (isTestSuccess ? "Passed" : "Failed"));

        Assert.assertTrue(isTestSuccess);
    }

    @Then("^I am able to pay pickup$")
    public void payment_methods() throws InterruptedException, Exception {
        boolean isTestSuccess = true;

        if (appInteraction == null) {
            this.appInteraction = new AppInteraction(driver);
        }

        try {
            isTestSuccess = M5.payment_method();
        } catch (Exception e) {
            e.printStackTrace();
            isTestSuccess = false;
        } this.appInteraction.WriteToReport("Scenario: I am able to click the delete_address_menu button : " + (isTestSuccess ? "Passed" : "Failed"));

        Assert.assertTrue(isTestSuccess);
    }

    @Then("^I am able to allow gps permission$")
    public void gps_permissions() throws InterruptedException, Exception {
        boolean isTestSuccess = true;

        if (appInteraction == null) {
            this.appInteraction = new AppInteraction(driver);
        }

        try {
            isTestSuccess = M5.gps_permission();
        } catch (Exception e) {
            e.printStackTrace();
            isTestSuccess = false;
        } this.appInteraction.WriteToReport("Scenario: I am able to click the delete_address_menu button : " + (isTestSuccess ? "Passed" : "Failed"));

        Assert.assertTrue(isTestSuccess);
    }

    @Then("^I am able to select_location_delivery$")
    public void select_location_deliverys() throws InterruptedException, Exception {
        boolean isTestSuccess = true;

        if (appInteraction == null) {
            this.appInteraction = new AppInteraction(driver);
        }

        try {
            isTestSuccess = M5.select_location_delivery();
        } catch (Exception e) {
            e.printStackTrace();
            isTestSuccess = false;
        } this.appInteraction.WriteToReport("Scenario: I am able to click the delete_address_menu button : " + (isTestSuccess ? "Passed" : "Failed"));

        Assert.assertTrue(isTestSuccess);
    }
}
