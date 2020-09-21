package Tests;


import Common.AppInteraction;
import Pages.m2;
import Tests.AbstractBaseTests.TestBase;
import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.appium.java_client.android.AndroidKeyCode;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

@CucumberOptions(
        strict = true,
        monochrome = true,
        features = "classpath:Step2_M2Test",
        plugin = {"pretty"}
)

public class Step2_M2Test extends TestBase {
    private m2 M2;

    @BeforeTest
    @Override
    public void setUpPage() {
        M2 = new m2(driver);
    }

    @Given("^I initiate m2_static & wishlist Page$")
    public void initPage() {
        if (M2 == null) {
            M2 = new m2(driver);
        }

        if (appInteraction == null) {
            this.appInteraction = new AppInteraction(driver);
        }


        this.appInteraction.WriteToReport("Background: I initiate Landing Page : " + (M2 != null ? "Passed" : "Failed"));

        Assert.assertTrue(true);
    }

    @Given("^I see the apppopup load banner$")
    public void isImgBannerShown() throws InterruptedException, Exception {
        boolean isTestSuccess = true;

        if (appInteraction == null) {
            this.appInteraction = new AppInteraction(driver);
        }

        try {
            isTestSuccess = M2.isImgBannerShown();
        } catch (Exception e) {
            e.printStackTrace();
            isTestSuccess = false;
        }

        this.appInteraction.WriteToReport("Scenario: I see the app load banner : " + (isTestSuccess ? "Passed" : "Failed"));

        Assert.assertTrue(isTestSuccess);
    }

    @Then("^back$")
    public void back() throws InterruptedException, Exception {
    M2.back();
    }


        @Then("^I am able to click the close popup button$")
    public void ableToClosePopUp() throws InterruptedException, Exception {
        boolean isTestSuccess = true;

        if (appInteraction == null) {
            this.appInteraction = new AppInteraction(driver);
        }

        try {
            isTestSuccess = M2.isAbleToClickCloseButton();
        } catch (Exception e) {
            e.printStackTrace();
            isTestSuccess = false;
        }

        this.appInteraction.WriteToReport("Scenario: I am able to click the close button : " + (isTestSuccess ? "Passed" : "Failed"));

        Assert.assertTrue(isTestSuccess);
    }

    @Given("^I see product pages$")
    public void isProductPageShown() throws InterruptedException, Exception {
        boolean isTestSuccess = true;

        if (appInteraction == null) {
            this.appInteraction = new AppInteraction(driver);
        }

        try {
            isTestSuccess = M2.isProductPageShown();
        } catch (Exception e) {
            e.printStackTrace();
            isTestSuccess = false;
        }

        this.appInteraction.WriteToReport("Scenario: I see product page : " + (isTestSuccess ? "Passed" : "Failed"));

        Assert.assertTrue(isTestSuccess);
    }

    @Then("^I am able to click the menu button$")
    public void isAbleToClickMenuButton() throws InterruptedException, Exception {
        boolean isTestSuccess = true;

        if (appInteraction == null) {
            this.appInteraction = new AppInteraction(driver);
        }

        try {
            isTestSuccess = M2.isAbleToClickMenuButton();
        } catch (Exception e) {
            e.printStackTrace();
            isTestSuccess = false;
        }

        this.appInteraction.WriteToReport("Scenario: I am able to click the menu button : " + (isTestSuccess ? "Passed" : "Failed"));

        Assert.assertTrue(isTestSuccess);
    }


    @Then("^I am able to click the login button$")
    public void isAbleToClickLoginButton() throws InterruptedException, Exception {
        boolean isTestSuccess = true;

        if (appInteraction == null) {
            this.appInteraction = new AppInteraction(driver);
        }

        try {
            isTestSuccess = M2.isAbleToClickLoginButton();
        } catch (Exception e) {
            e.printStackTrace();
            isTestSuccess = false;
        }

        this.appInteraction.WriteToReport("Scenario: I am able to click the login button : " + (isTestSuccess ? "Passed" : "Failed"));

        Assert.assertTrue(isTestSuccess);
    }

    @Then("^login page$")
    public void isAbleToLogin() throws InterruptedException, Exception {
        boolean isTestSuccess = true;

        if (appInteraction == null) {
            this.appInteraction = new AppInteraction(driver);
        }

        try {
            isTestSuccess = M2.isAbleToLogin();
        } catch (Exception e) {
            e.printStackTrace();
            isTestSuccess = false;
        }

        this.appInteraction.WriteToReport("Scenario: I login : " + (isTestSuccess ? "Passed" : "Failed"));

        Assert.assertTrue(isTestSuccess);
    }

    @Given("^I see homepage page$")
    public void isCategoryPageShown() throws InterruptedException, Exception {
        boolean isTestSuccess = true;

        if (appInteraction == null) {
            this.appInteraction = new AppInteraction(driver);
        }

        try {
            isTestSuccess = M2.isCategoryPageShown();
        } catch (Exception e) {
            e.printStackTrace();
            isTestSuccess = false;
        }

        this.appInteraction.WriteToReport("Scenario: I see homepage page : " + (isTestSuccess ? "Passed" : "Failed"));

        Assert.assertTrue(isTestSuccess);
    }

    @Then("^click category button$")
    public void isAbleToClickCategoryPageButton() throws InterruptedException, Exception {
        boolean isTestSuccess = true;

        if (appInteraction == null) {
            this.appInteraction = new AppInteraction(driver);
        }

        try {
            isTestSuccess = M2.isAbleToClickCategoryPageButton();
        } catch (Exception e) {
            e.printStackTrace();
            isTestSuccess = false;
        }

        this.appInteraction.WriteToReport("Scenario: I click category : " + (isTestSuccess ? "Passed" : "Failed"));

        Assert.assertTrue(isTestSuccess);
    }


    @Then("^I click heart button$")
    public void isAbleToClickHeartButton() throws InterruptedException, Exception {
        boolean isTestSuccess = true;

        if (appInteraction == null) {
            this.appInteraction = new AppInteraction(driver);
        }

        try {
            isTestSuccess = M2.isAbleToClickHeartButton();
        } catch (Exception e) {
            e.printStackTrace();
            isTestSuccess = false;
        }

        this.appInteraction.WriteToReport("Scenario: I click heart button : " + (isTestSuccess ? "Passed" : "Failed"));

        Assert.assertTrue(isTestSuccess);
    }

    @Then("^goingback$")
    public void isAbleToClickBackButton() throws InterruptedException, Exception {
        boolean isTestSuccess = true;

        if (appInteraction == null) {
            this.appInteraction = new AppInteraction(driver);
        }

        try {
            isTestSuccess = M2.isAbleToClickBackButton();
        } catch (Exception e) {
            e.printStackTrace();
            isTestSuccess = false;
        }

        this.appInteraction.WriteToReport("Scenario: going back : " + (isTestSuccess ? "Passed" : "Failed"));

        Assert.assertTrue(isTestSuccess);
    }

    @Then("^I click wishlist button$")
    public void isAbleToClickWishlistButton() throws InterruptedException, Exception {
        boolean isTestSuccess = true;

        if (appInteraction == null) {
            this.appInteraction = new AppInteraction(driver);
        }

        try {
            isTestSuccess = M2.isAbleToClickWishlistButton();
        } catch (Exception e) {
            e.printStackTrace();
            isTestSuccess = false;
        }

        this.appInteraction.WriteToReport("Scenario: I click wishlist button : " + (isTestSuccess ? "Passed" : "Failed"));

        Assert.assertTrue(isTestSuccess);
    }

    @Given("^I see wishlist page$")
    public void isWishlistPageShown() throws InterruptedException, Exception {
        boolean isTestSuccess = true;

        if (appInteraction == null) {
            this.appInteraction = new AppInteraction(driver);
        }

        try {
            isTestSuccess = M2.isWishlistPageShown();
        } catch (Exception e) {
            e.printStackTrace();
            isTestSuccess = false;
        }

        this.appInteraction.WriteToReport("Scenario: I see wishlist page : " + (isTestSuccess ? "Passed" : "Failed"));

        Assert.assertTrue(isTestSuccess);
    }

    @Then("^I click wishlist product button$")
    public void isAbleToClickWishlistProductButton() throws InterruptedException, Exception {
        boolean isTestSuccess = true;

        if (appInteraction == null) {
            this.appInteraction = new AppInteraction(driver);
        }

        try {
            isTestSuccess = M2.isAbleToClickWishlistProductButton();
        } catch (Exception e) {
            e.printStackTrace();
            isTestSuccess = false;
        }

        this.appInteraction.WriteToReport("Scenario: I click wishlist product button : " + (isTestSuccess ? "Passed" : "Failed"));

        Assert.assertTrue(isTestSuccess);
    }

    @Then("^I click uncheck wishlist product button$")
    public void isAbleToClickUncheckWishlistProductButton() throws InterruptedException, Exception {
        boolean isTestSuccess = true;

        if (appInteraction == null) {
            this.appInteraction = new AppInteraction(driver);
        }

        try {
            isTestSuccess = M2.isAbleToClickUncheckWishlistProductButton();
        } catch (Exception e) {
            e.printStackTrace();
            isTestSuccess = false;
        }

        this.appInteraction.WriteToReport("Scenario: I click uncheck wishlist product button : " + (isTestSuccess ? "Passed" : "Failed"));

        Assert.assertTrue(isTestSuccess);
    }

    @Then("^I see wishlist product page$")
    public void isWishlistProductPageShown() throws InterruptedException, Exception {
        boolean isTestSuccess = true;

        if (appInteraction == null) {
            this.appInteraction = new AppInteraction(driver);
        }

        try {
            isTestSuccess = M2.isWishlistProductPageShown();
        } catch (Exception e) {
            e.printStackTrace();
            isTestSuccess = false;
        }

        this.appInteraction.WriteToReport("Scenario: I click uncheck wishlist product button : " + (isTestSuccess ? "Passed" : "Failed"));

        Assert.assertTrue(isTestSuccess);
    }

    @Then("^I click product page$")
    public void isAbleToClickProductPageButton() throws InterruptedException, Exception {
        boolean isTestSuccess = true;

        if (appInteraction == null) {
            this.appInteraction = new AppInteraction(driver);
        }

        try {
            isTestSuccess = M2.isAbleToClickProductPageButton();
        } catch (Exception e) {
            e.printStackTrace();
            isTestSuccess = false;
        }

        this.appInteraction.WriteToReport("Scenario: I click  product page : " + (isTestSuccess ? "Passed" : "Failed"));

        Assert.assertTrue(isTestSuccess);
    }



    @Then("^I click terms and condion button$")
    public void isAbleToClickTncButton() throws InterruptedException, Exception {
        boolean isTestSuccess = true;

        if (appInteraction == null) {
            this.appInteraction = new AppInteraction(driver);
        }

        try {
            isTestSuccess = M2.isAbleToClickTncButton();
        } catch (Exception e) {
            e.printStackTrace();
            isTestSuccess = false;
        }

        this.appInteraction.WriteToReport("Scenario: I click terms and condion button : " + (isTestSuccess ? "Passed" : "Failed"));


    }

    @Then("^I see Tnc page$")
    public void isTncShown() throws InterruptedException, Exception {
        boolean isTestSuccess = true;

        if(appInteraction == null) {
            this.appInteraction = new AppInteraction(driver);
        }

        try {
            isTestSuccess = M2.isTncShown();
        } catch (Exception e) {
            e.printStackTrace();
            isTestSuccess = false;
        }

        this.appInteraction.WriteToReport("Scenario: I see Tnc page : " + (isTestSuccess ? "Passed" : "Failed"));

        Assert.assertTrue(isTestSuccess);
    }

    @Then("^I click privacy policy button$")
    public void isAbleToClickPpButton() throws InterruptedException, Exception {
        boolean isTestSuccess = true;

        if (appInteraction == null) {
            this.appInteraction = new AppInteraction(driver);
        }

        try {
            isTestSuccess = M2.isAbleToClickPpButton();
        } catch (Exception e) {
            e.printStackTrace();
            isTestSuccess = false;
        }

        this.appInteraction.WriteToReport("Scenario: I click terms and condion button : " + (isTestSuccess ? "Passed" : "Failed"));


    }

    @Then("^I see privacy policy page$")
    public void isPpShown() throws InterruptedException, Exception {
        boolean isTestSuccess = true;

        if(appInteraction == null) {
            this.appInteraction = new AppInteraction(driver);
        }

        try {
            isTestSuccess = M2.isPpShown();
        } catch (Exception e) {
            e.printStackTrace();
            isTestSuccess = false;
        }

        this.appInteraction.WriteToReport("Scenario: I see privacy policy page : " + (isTestSuccess ? "Passed" : "Failed"));

        Assert.assertTrue(isTestSuccess);
    }

    @Then("^I click stay connected button$")
    public void isAbleToClickStayConnectedButton() throws InterruptedException, Exception {
        boolean isTestSuccess = true;

        if(appInteraction == null) {
            this.appInteraction = new AppInteraction(driver);
        }

        try {
            isTestSuccess = M2.isAbleToClickStayConnectedButton();
        } catch (Exception e) {
            e.printStackTrace();
            isTestSuccess = false;
        }

        this.appInteraction.WriteToReport("Scenario: I click stay connected button : " + (isTestSuccess ? "Passed" : "Failed"));

        Assert.assertTrue(isTestSuccess);
    }
    @Then("^I see stay connected page$")
    public void isStayConnectedShown() throws InterruptedException, Exception {
        boolean isTestSuccess = true;

        if(appInteraction == null) {
            this.appInteraction = new AppInteraction(driver);
        }

        try {
            isTestSuccess = M2.isStayConnectedShown();
        } catch (Exception e) {
            e.printStackTrace();
            isTestSuccess = false;
        }

        this.appInteraction.WriteToReport("Scenario: I see stay connected page : " + (isTestSuccess ? "Passed" : "Failed"));

        Assert.assertTrue(isTestSuccess);
    }





}
