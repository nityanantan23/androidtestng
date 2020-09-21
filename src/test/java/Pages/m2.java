package Pages;

import Enums.FindElementBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class m2 extends BasePage {
    public m2(AndroidDriver<MobileElement> driver) {
        super(driver);

    }
    public void back() throws InterruptedException {
        this.driver.navigate().back();
    }

    public boolean isImgBannerShown() throws InterruptedException{
        String appLoadBanner = "com.maxincome.fmonlineuat:id/imgBanner";
        MobileElement appLoadBannerElement = null;
        Thread.sleep(5000);
        try {
            appLoadBannerElement = this.appInteraction.FindElement(appLoadBanner, FindElementBy.Id, NO_DELAY);
        }
        catch(Exception e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }

    public boolean isAbleToClickCloseButton() throws InterruptedException{
        String closeButton = "com.maxincome.fmonlineuat:id/imgClose";
        MobileElement appLoadBannerElement = null;
        Thread.sleep(5000);
        try {
            appLoadBannerElement = this.appInteraction.FindElement(closeButton, FindElementBy.Id, NO_DELAY);
            this.appInteraction.ClickElement(closeButton, FindElementBy.Id, NO_DELAY);
            Thread.sleep(5000);
        }
        catch(Exception e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }

    public boolean isAbleToClickMenuButton() throws InterruptedException{
        String MenuButton = "com.maxincome.fmonlineuat:id/btnOperation";
        MobileElement appLoadBannerElement = null;
        Thread.sleep(5000);
        try {
            appLoadBannerElement = this.appInteraction.FindElement(MenuButton, FindElementBy.Id, NO_DELAY);
            this.appInteraction.ClickElement(MenuButton, FindElementBy.Id, NO_DELAY);
            Thread.sleep(5000);
        }
        catch(Exception e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }



    public boolean isAbleToClickTncButton() throws InterruptedException{
        String TncButton = "com.maxincome.fmonlineuat:id/lblTnC"
                ;
        MobileElement appLoadBannerElement = null;
        Thread.sleep(5000);
        try {
            appLoadBannerElement = this.appInteraction.FindElement(TncButton, FindElementBy.Id, NO_DELAY);
            this.appInteraction.ClickElement(TncButton, FindElementBy.Id, NO_DELAY);
            Thread.sleep(5000);
        }
        catch(Exception e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }
    public boolean isTncShown() throws InterruptedException{
        String Tnc = "//android.view.View[contains(@text, 'The FamilyMart Loyalty Programme')]";
        MobileElement appLoadBannerElement = null;
        Thread.sleep(5000);
        try {
            appLoadBannerElement = this.appInteraction.FindElement(Tnc, FindElementBy.XPath, NO_DELAY);
        }
        catch(Exception e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }

    public boolean isAbleToClickBackButton() throws InterruptedException{
        String BackButton = "com.maxincome.fmonlineuat:id/btnOperation";

        MobileElement appLoadBannerElement = null;
        Thread.sleep(5000);
        try {
            appLoadBannerElement = this.appInteraction.FindElement(BackButton, FindElementBy.Id, NO_DELAY);
            this.appInteraction.ClickElement(BackButton, FindElementBy.Id, NO_DELAY);
            Thread.sleep(5000);
        }
        catch(Exception e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }

    public boolean isAbleToClickPpButton() throws InterruptedException{
        String PpButton = "com.maxincome.fmonlineuat:id/lblPrivacyPolicy";
        MobileElement appLoadBannerElement = null;
        Thread.sleep(5000);
        try {
            appLoadBannerElement = this.appInteraction.FindElement(PpButton, FindElementBy.Id, NO_DELAY);
            this.appInteraction.ClickElement(PpButton, FindElementBy.Id, NO_DELAY);
            Thread.sleep(5000);
        }
        catch(Exception e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }

    public boolean isPpShown() throws InterruptedException{
        String Tnc = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[2]";
        MobileElement appLoadBannerElement = null;
        Thread.sleep(5000);
        try {
            appLoadBannerElement = this.appInteraction.FindElement(Tnc, FindElementBy.XPath, NO_DELAY);
        }
        catch(Exception e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }

    public boolean isAbleToClickStayConnectedButton() throws InterruptedException{
        String StayConnectedButton = "com.maxincome.fmonlineuat:id/lblStayConnected";
        MobileElement appLoadBannerElement = null;
        Thread.sleep(5000);
        try {
            appLoadBannerElement = this.appInteraction.FindElement(StayConnectedButton, FindElementBy.Id, NO_DELAY);
            this.appInteraction.ClickElement(StayConnectedButton, FindElementBy.Id, NO_DELAY);
            Thread.sleep(5000);
        }
        catch(Exception e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }

    public boolean isStayConnectedShown() throws InterruptedException{
        String Tnc =  "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout[3]";
        MobileElement appLoadBannerElement = null;
        Thread.sleep(5000);
        try {
            appLoadBannerElement = this.appInteraction.FindElement(Tnc, FindElementBy.XPath, NO_DELAY);
        }
        catch(Exception e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }

    public boolean isAbleToClickLoginButton() throws InterruptedException{
        String LoginButton = "com.maxincome.fmonlineuat:id/lblLogout";
        MobileElement appLoadBannerElement = null;
        Thread.sleep(5000);
        try {
            appLoadBannerElement = this.appInteraction.FindElement(LoginButton, FindElementBy.Id, NO_DELAY);
            this.appInteraction.ClickElement(LoginButton, FindElementBy.Id, NO_DELAY);
            Thread.sleep(5000);
        }
        catch(Exception e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }

    public boolean isAbleToLogin() throws InterruptedException{
        String txtPhone = "com.maxincome.fmonlineuat:id/txtPhone";
        String txtPassword = "com.maxincome.fmonlineuat:id/txtPassword";
        String btnLogin ="com.maxincome.fmonlineuat:id/btnLogin";

        MobileElement appLoadBannerElement = null;
        Thread.sleep(5000);
        try {
            appLoadBannerElement = this.appInteraction.FindElement(btnLogin, FindElementBy.Id, NO_DELAY);
            this.appInteraction.SendKey(txtPassword,"nity2000",FindElementBy.Id,NO_DELAY);
            this.appInteraction.SendKey(txtPhone,"162275593",FindElementBy.Id,NO_DELAY);
            this.appInteraction.ClickElement(btnLogin, FindElementBy.Id, NO_DELAY);
            Thread.sleep(5000);
        }
        catch(Exception e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }

    public boolean isLandingPageShown() throws InterruptedException{
        String productPage ="com.maxincome.fmonlineuat:id/navigation_rewards";
        MobileElement appLoadBannerElement = null;
        Thread.sleep(5000);
        try {
            appLoadBannerElement = this.appInteraction.FindElement(productPage, FindElementBy.Id, NO_DELAY);
        }
        catch(Exception e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }

    public boolean isAbleToClickWishlistButton() throws InterruptedException{
        String WishlistButton = "com.maxincome.fmonlineuat:id/navigation_rewards";
        MobileElement appLoadBannerElement = null;
        Thread.sleep(5000);
        try {
            appLoadBannerElement = this.appInteraction.FindElement(WishlistButton, FindElementBy.Id, NO_DELAY);
            this.appInteraction.ClickElement(WishlistButton, FindElementBy.Id, NO_DELAY);
            Thread.sleep(5000);
        }
        catch(Exception e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }


    public boolean isAbleToClickCategoryPageButton() throws InterruptedException{
        String CategoryButton = "//android.widget.TextView[contains(@text, 'Meal')]";
        MobileElement appLoadBannerElement = null;
        Thread.sleep(5000);
        try {
            appLoadBannerElement = this.appInteraction.FindElement(CategoryButton, FindElementBy.XPath, NO_DELAY);
            this.appInteraction.ClickElement(CategoryButton, FindElementBy.XPath, NO_DELAY);
            Thread.sleep(5000);
        }
        catch(Exception e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }


    public boolean isAbleToClickProductPageButton() throws InterruptedException{
        String ProductButton ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.RelativeLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.LinearLayout/androidx.cardview.widget.CardView/android.widget.RelativeLayout/android.widget.ImageView[1]";
        MobileElement appLoadBannerElement = null;
        Thread.sleep(5000);
        try {
            appLoadBannerElement = this.appInteraction.FindElement(ProductButton, FindElementBy.XPath, NO_DELAY);
            this.appInteraction.ClickElement(ProductButton, FindElementBy.XPath, NO_DELAY);
            Thread.sleep(5000);
        }
        catch(Exception e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }

    public boolean isAbleToClickHeartButton() throws InterruptedException{
        String HeartButton = "com.maxincome.fmonlineuat:id/imgFavourite";
        MobileElement appLoadBannerElement = null;
        Thread.sleep(5000);
        try {
            appLoadBannerElement = this.appInteraction.FindElement(HeartButton, FindElementBy.Id, NO_DELAY);
            this.appInteraction.ClickElement(HeartButton, FindElementBy.Id, NO_DELAY);
            Thread.sleep(5000);
        }
        catch(Exception e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }

    public boolean isProductPageShown() throws InterruptedException{
        String productPage ="com.maxincome.fmonlineuat:id/imgFavourite";
        MobileElement appLoadBannerElement = null;
        Thread.sleep(5000);
        try {
            appLoadBannerElement = this.appInteraction.FindElement(productPage, FindElementBy.Id, NO_DELAY);
        }
        catch(Exception e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }

    public boolean isCategoryPageShown() throws InterruptedException{
        String productPage = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView[2]/android.widget.LinearLayout[6]/android.widget.ImageView";
        MobileElement appLoadBannerElement = null;
        Thread.sleep(5000);
        try {
            appLoadBannerElement = this.appInteraction.FindElement(productPage, FindElementBy.XPath, NO_DELAY);
        }
        catch(Exception e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }

    public boolean isWishlistPageShown() throws InterruptedException{
        String productPage = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]";
        MobileElement appLoadBannerElement = null;
        Thread.sleep(5000);
        try {
            appLoadBannerElement = this.appInteraction.FindElement(productPage, FindElementBy.XPath, NO_DELAY);
        }
        catch(Exception e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }

    public boolean isWishlistProductPageShown() throws InterruptedException{
        String productPage = "com.maxincome.fmonlineuat:id/imgFavourite";
        MobileElement appLoadBannerElement = null;
        Thread.sleep(5000);
        try {
            appLoadBannerElement = this.appInteraction.FindElement(productPage, FindElementBy.Id, NO_DELAY);
        }
        catch(Exception e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }

    public boolean isAbleToClickWishlistProductButton() throws InterruptedException{
        String WPButton = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout";
        MobileElement appLoadBannerElement = null;
        Thread.sleep(5000);
        try {
            appLoadBannerElement = this.appInteraction.FindElement(WPButton, FindElementBy.XPath, NO_DELAY);
            this.appInteraction.ClickElement(WPButton, FindElementBy.XPath, NO_DELAY);
            Thread.sleep(5000);
        }
        catch(Exception e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }

    public boolean isAbleToClickUncheckWishlistProductButton() throws InterruptedException{
        String UWButton = "com.maxincome.fmonlineuat:id/imgFavourite";
        MobileElement appLoadBannerElement = null;
        Thread.sleep(5000);
        try {
            appLoadBannerElement = this.appInteraction.FindElement(UWButton, FindElementBy.Id, NO_DELAY);
            this.appInteraction.ClickElement(UWButton, FindElementBy.Id, NO_DELAY);
            Thread.sleep(5000);
        }
        catch(Exception e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }





}