package Tests;

import Common.AppInteraction;
import Pages.m3;
import Tests.AbstractBaseTests.TestBase;
import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

@CucumberOptions(
        strict = true,
        monochrome = true,
        features = "classpath:Step3_M3Test",
        plugin = {"pretty"}
)

public class Step3_M3Test extends TestBase {
    private m3 M3;

    @BeforeTest
    @Override
    public void setUpPage() {
        M3 = new m3(driver);
    }

    @Given("^I initiate M3_feedback Page$")
    public void initPage() {
        if (M3 == null) {
            M3 = new m3(driver);
        }

        if (appInteraction == null) {
            this.appInteraction = new AppInteraction(driver);
        }


        this.appInteraction.WriteToReport("Background: I initiate feebacl Page : " + "Passed");

        Assert.assertTrue(true);
    }

//    @Then("^backM3$")
//    public void back() throws InterruptedException, Exception {
//        M3.back();
//    }

    @Then("^I am able to click the isAbleToClickFeedbackButton button$")
    public void isAbleToClickFeedbackButton() throws InterruptedException, Exception {
        boolean isTestSuccess = true;

        if (appInteraction == null) {
            this.appInteraction = new AppInteraction(driver);
        }

        try {
            isTestSuccess = M3.isAbleToClickFeedbackButton();
        } catch (Exception e) {
            e.printStackTrace();
            isTestSuccess = false;
        } this.appInteraction.WriteToReport("Scenario: I am able to click the delete_address_menu button : " + (isTestSuccess ? "Passed" : "Failed"));

        Assert.assertTrue(isTestSuccess);
    }

    @Then("^I am able to click the isAbleToClickHelpCenterButton button$")
    public void isAbleToClickHelpCenterButton() throws InterruptedException, Exception {
        boolean isTestSuccess = true;

        if (appInteraction == null) {
            this.appInteraction = new AppInteraction(driver);
        }

        try {
            isTestSuccess = M3.isAbleToClickHelpCenterButton();
        } catch (Exception e) {
            e.printStackTrace();
            isTestSuccess = false;
        } this.appInteraction.WriteToReport("Scenario: I am able to click the delete_address_menu button : " + (isTestSuccess ? "Passed" : "Failed"));

        Assert.assertTrue(isTestSuccess);
    }

    @Then("^I am able to click the isAbleToDescription button$")
    public void isAbleToDescription() throws InterruptedException, Exception {
        boolean isTestSuccess = true;

        if (appInteraction == null) {
            this.appInteraction = new AppInteraction(driver);
        }

        try {
            isTestSuccess = M3.isAbleToDescription();
        } catch (Exception e) {
            e.printStackTrace();
            isTestSuccess = false;
        } this.appInteraction.WriteToReport("Scenario: I am able to click the delete_address_menu button : " + (isTestSuccess ? "Passed" : "Failed"));

        Assert.assertTrue(isTestSuccess);
    }

    @Then("^I am able to click the isAbleTolongdescription button$")
    public void isAbleTolongdescription() throws InterruptedException, Exception {
        boolean isTestSuccess = true;

        if (appInteraction == null) {
            this.appInteraction = new AppInteraction(driver);
        }

        try {
            isTestSuccess = M3.isAbleTolongdescription();
        } catch (Exception e) {
            e.printStackTrace();
            isTestSuccess = false;
        } this.appInteraction.WriteToReport("Scenario: I am able to click the delete_address_menu button : " + (isTestSuccess ? "Passed" : "Failed"));

        Assert.assertTrue(isTestSuccess);
    }

    @Then("^I am able to click the isAbleToEmoji button$")
    public void isAbleToEmoji() throws InterruptedException, Exception {
        boolean isTestSuccess = true;

        if (appInteraction == null) {
            this.appInteraction = new AppInteraction(driver);
        }

        try {
            isTestSuccess = M3.isAbleToEmoji();
        } catch (Exception e) {
            e.printStackTrace();
            isTestSuccess = false;
        } this.appInteraction.WriteToReport("Scenario: I am able to click the delete_address_menu button : " + (isTestSuccess ? "Passed" : "Failed"));

        Assert.assertTrue(isTestSuccess);
    }

    @Then("^I am able to click the validation_failed_emoji button$")
    public void validation_failed_emojis() throws InterruptedException, Exception {
        boolean isTestSuccess = true;

        if (appInteraction == null) {
            this.appInteraction = new AppInteraction(driver);
        }

        try {
            isTestSuccess = M3.validation_failed_emoji();
        } catch (Exception e) {
            e.printStackTrace();
            isTestSuccess = false;
        } this.appInteraction.WriteToReport("Scenario: I am able to click the validation_failed_emoji  : " + (isTestSuccess ? "Passed" : "Failed"));

        Assert.assertTrue(isTestSuccess);
    }

    @Then("^I am able to click the isAbleToClickSubmit button$")
    public void isAbleToClickSubmits() throws InterruptedException, Exception {
        boolean isTestSuccess = true;

        if (appInteraction == null) {
            this.appInteraction = new AppInteraction(driver);
        }

        try {
            isTestSuccess = M3.isAbleToClickSubmit();
        } catch (Exception e) {
            e.printStackTrace();
            isTestSuccess = false;
        } this.appInteraction.WriteToReport("Scenario: I am able to click the isAbleToClickSubmit button : " + (isTestSuccess ? "Passed" : "Failed"));

        Assert.assertTrue(isTestSuccess);
    }

    @Then("^I am able to validate the feedback form$")
    public void validation_success() throws InterruptedException, Exception {
        boolean isTestSuccess = true;

        if (appInteraction == null) {
            this.appInteraction = new AppInteraction(driver);
        }
        try {
            isTestSuccess = M3.validation_success();
        } catch (Exception e) {
            e.printStackTrace();
            isTestSuccess = false;
        } this.appInteraction.WriteToReport("Scenario: I am able to click the delete_address_menu button : " + (isTestSuccess ? "Passed" : "Failed"));

        Assert.assertTrue(isTestSuccess);
    }
    @Then("^back1$")
    public void back() throws InterruptedException {
        M3.back();
    }

    @Then("^arrowleft$")
    public void arrowleft() throws InterruptedException {
        boolean isTestSuccess = true;

        if (appInteraction == null) {
            this.appInteraction = new AppInteraction(driver);
        }
        try {
            isTestSuccess = M3.arrowleft();
        } catch (Exception e) {
            e.printStackTrace();
            isTestSuccess = false;
        } this.appInteraction.WriteToReport("Scenario: I am able to click the back : " + (isTestSuccess ? "Passed" : "Failed"));

        Assert.assertTrue(isTestSuccess);
    }

    @Then("^I am able to invalidate the feedback form$")
    public void validation_failed() throws InterruptedException, Exception {
        boolean isTestSuccess = true;

        if (appInteraction == null) {
            this.appInteraction = new AppInteraction(driver);
        }
        try {
            isTestSuccess = M3.validation_failed_long();
        } catch (Exception e) {
            e.printStackTrace();
            isTestSuccess = false;
        } this.appInteraction.WriteToReport("Scenario: I am able to click the delete_address_menu button : " + (isTestSuccess ? "Passed" : "Failed"));

        Assert.assertTrue(isTestSuccess);
    }

    @Then("^I am able to click fav_address menu$")
    public void fav_address() throws InterruptedException, Exception {
        boolean isTestSuccess = true;

        if (appInteraction == null) {
            this.appInteraction = new AppInteraction(driver);
        }
        try {
            isTestSuccess = M3.fav_address();
        } catch (Exception e) {
            e.printStackTrace();
            isTestSuccess = false;
        } this.appInteraction.WriteToReport("Scenario: I am able to click the delete_address_menu button : " + (isTestSuccess ? "Passed" : "Failed"));

        Assert.assertTrue(isTestSuccess);
    }

    @Then("^I am able to add fav_address$")
    public void add_fav_addresss() throws InterruptedException, Exception {
        boolean isTestSuccess = true;

        if (appInteraction == null) {
            this.appInteraction = new AppInteraction(driver);
        }
        try {
            isTestSuccess = M3.add_fav_address();
        } catch (Exception e) {
            e.printStackTrace();
            isTestSuccess = false;
        } this.appInteraction.WriteToReport("Scenario: I am able to click the delete_address_menu button : " + (isTestSuccess ? "Passed" : "Failed"));

        Assert.assertTrue(isTestSuccess);
    }



    @Then("^I am able to input_address_details$")
    public void input_address_detailss() throws InterruptedException, Exception {
        boolean isTestSuccess = true;

        if (appInteraction == null) {
            this.appInteraction = new AppInteraction(driver);
        }
        try {
            isTestSuccess = M3.input_address_details();
        } catch (Exception e) {
            e.printStackTrace();
            isTestSuccess = false;
        } this.appInteraction.WriteToReport("Scenario: I am able to click the delete_address_menu button : " + (isTestSuccess ? "Passed" : "Failed"));

        Assert.assertTrue(isTestSuccess);
    }

    @Then("^I am able to edit_address_menu$")
    public void edit_address_menus() throws InterruptedException, Exception {
        boolean isTestSuccess = true;

        if (appInteraction == null) {
            this.appInteraction = new AppInteraction(driver);
        }
        try {
            isTestSuccess = M3.edit_address_menu();
        } catch (Exception e) {
            e.printStackTrace();
            isTestSuccess = false;
        } this.appInteraction.WriteToReport("Scenario: I am able to click the delete_address_menu button : " + (isTestSuccess ? "Passed" : "Failed"));

        Assert.assertTrue(isTestSuccess);
    }

    @Then("^I am able to click menu buttins$")
    public void isAbleToClickMenuButtonss() throws InterruptedException, Exception {
        boolean isTestSuccess = true;

        if (appInteraction == null) {
            this.appInteraction = new AppInteraction(driver);
        }
        try {
            isTestSuccess = M3.isAbleToClickMenuButtons();
        } catch (Exception e) {
            e.printStackTrace();
            isTestSuccess = false;
        } this.appInteraction.WriteToReport("Scenario: I am able to click the delete_address_menu button : " + (isTestSuccess ? "Passed" : "Failed"));

        Assert.assertTrue(isTestSuccess);
    }

    @Then("^I am able to edit_address_details$")
    public void edit_address_detailss() throws InterruptedException, Exception {
        boolean isTestSuccess = true;

        if (appInteraction == null) {
            this.appInteraction = new AppInteraction(driver);
        }
        try {
            isTestSuccess = M3.edit_address_details();
        } catch (Exception e) {
            e.printStackTrace();
            isTestSuccess = false;
        }
        this.appInteraction.WriteToReport("Scenario: I am able to click the edit_address_details button : " + (isTestSuccess ? "Passed" : "Failed"));

        Assert.assertTrue(isTestSuccess);
    }

    @Then("^I am able to delete_address_menu$")
    public void delete_address_menus() throws InterruptedException, Exception {
        boolean isTestSuccess = true;

        if (appInteraction == null) {
            this.appInteraction = new AppInteraction(driver);
        }
        try {
            isTestSuccess = M3.delete_address_menu();
        } catch (Exception e) {
            e.printStackTrace();
            isTestSuccess = false;
        }
        this.appInteraction.WriteToReport("Scenario: I am able to click the delete_address_menu button : " + (isTestSuccess ? "Passed" : "Failed"));

        Assert.assertTrue(isTestSuccess);
    }

    @Then("^I am able to click store_locator_map$")
    public void store_locator_maps() throws InterruptedException, Exception {
        boolean isTestSuccess = true;

        if (appInteraction == null) {
            this.appInteraction = new AppInteraction(driver);
        }
        try {
            isTestSuccess = M3.store_locator_map();
        } catch (Exception e) {
            e.printStackTrace();
            isTestSuccess = false;
        }
        this.appInteraction.WriteToReport("Scenario: I am able to click the delete_address_menu button : " + (isTestSuccess ? "Passed" : "Failed"));

        Assert.assertTrue(isTestSuccess);
    }

    @Then("^I am able to click store_locator_nearme$")
    public void store_locator_nearmes() throws InterruptedException, Exception {
        boolean isTestSuccess = true;

        if (appInteraction == null) {
            this.appInteraction = new AppInteraction(driver);
        }
        try {
            isTestSuccess = M3.store_locator_nearme();
        } catch (Exception e) {
            e.printStackTrace();
            isTestSuccess = false;
        }
        this.appInteraction.WriteToReport("Scenario: I am able to click the delete_address_menu button : " + (isTestSuccess ? "Passed" : "Failed"));

        Assert.assertTrue(isTestSuccess);
    }

    @Then("^I am able to click store_locator_filter$")
    public void store_locator_filters() throws InterruptedException, Exception {
        boolean isTestSuccess = true;

        if (appInteraction == null) {
            this.appInteraction = new AppInteraction(driver);
        }
        try {
            isTestSuccess = M3.store_locator_filter();
        } catch (Exception e) {
            e.printStackTrace();
            isTestSuccess = false;
        }
        this.appInteraction.WriteToReport("Scenario: I am able to click the delete_address_menu button : " + (isTestSuccess ? "Passed" : "Failed"));

        Assert.assertTrue(isTestSuccess);
    }

    @Then("^I am able to click store_list$")
    public void store_lists() throws InterruptedException, Exception {
        boolean isTestSuccess = true;

        if (appInteraction == null) {
            this.appInteraction = new AppInteraction(driver);
        }
        try {
            isTestSuccess = M3.store_list();
        } catch (Exception e) {
            e.printStackTrace();
            isTestSuccess = false;
        }
        this.appInteraction.WriteToReport("Scenario: I am able to click the delete_address_menu button : " + (isTestSuccess ? "Passed" : "Failed"));

        Assert.assertTrue(isTestSuccess);
    }

    @Then("^I am able to click store_list_filter$")
    public void store_list_filters() throws InterruptedException, Exception {
        boolean isTestSuccess = true;

        if (appInteraction == null) {
            this.appInteraction = new AppInteraction(driver);
        }
        try {
            isTestSuccess = M3.store_list_filter();
        } catch (Exception e) {
            e.printStackTrace();
            isTestSuccess = false;
        }
        this.appInteraction.WriteToReport("Scenario: I am able to click the delete_address_menu button : " + (isTestSuccess ? "Passed" : "Failed"));

        Assert.assertTrue(isTestSuccess);
    }

    @Then("^I am able to click allow gps$")
    public void gpss() throws InterruptedException, Exception {
        boolean isTestSuccess = true;

        if (appInteraction == null) {
            this.appInteraction = new AppInteraction(driver);
        }
        try {
            isTestSuccess = M3.gps();
        } catch (Exception e) {
            e.printStackTrace();
            isTestSuccess = false;
        } this.appInteraction.WriteToReport("Scenario: I am able to click the delete_address_menu button : " + (isTestSuccess ? "Passed" : "Failed"));

        Assert.assertTrue(isTestSuccess);
    }

    @Then("^I am able to click home$")
    public void home() throws InterruptedException, Exception {
        boolean isTestSuccess = true;

        if (appInteraction == null) {
            this.appInteraction = new AppInteraction(driver);
        }
        try {
            isTestSuccess = M3.GoHome();
        } catch (Exception e) {
            e.printStackTrace();
            isTestSuccess = false;
        } this.appInteraction.WriteToReport("Scenario: I am able to click the delete_address_menu button : " + (isTestSuccess ? "Passed" : "Failed"));

        Assert.assertTrue(isTestSuccess);
    }
}
