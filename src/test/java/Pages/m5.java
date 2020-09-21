package Pages;

import Enums.FindElementBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

public class m5 extends BasePage {
    public m5(AndroidDriver<MobileElement> driver) {
        super(driver);

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
        String ProductButton ="//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ImageView";
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

    public void back() throws InterruptedException {
        this.driver.navigate().back();
    }

    public boolean add_products() throws InterruptedException{
        String PlusButton = "com.maxincome.fmonlineuat:id/btnAdd";
        String AddtoCartButton = "com.maxincome.fmonlineuat:id/btnAddToCart";

        MobileElement appLoadBannerElement = null;
        Thread.sleep(5000);
        try {
            appLoadBannerElement = this.appInteraction.FindElement(PlusButton, FindElementBy.Id, NO_DELAY);
            this.appInteraction.ClickElement(PlusButton, FindElementBy.Id, NO_DELAY);
            this.appInteraction.ClickElement(AddtoCartButton, FindElementBy.Id, NO_DELAY);

            Thread.sleep(5000);
        }
        catch(Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public boolean gps_permission() throws InterruptedException{
        String gps = "com.android.permissioncontroller:id/permission_allow_foreground_only_button";

        MobileElement appLoadBannerElement = null;
        Thread.sleep(5000);
        try {
            appLoadBannerElement = this.appInteraction.FindElement(gps, FindElementBy.Id, NO_DELAY);
            this.appInteraction.ClickElement(gps, FindElementBy.Id, NO_DELAY);
            Thread.sleep(5000);
        }
        catch(Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public boolean select_location_pickup() throws InterruptedException{
        String AddtoCartFab = "com.maxincome.fmonlineuat:id/fab";
        String SelectAddress = "//android.widget.TextView[contains(@text, 'Select Store')]";
        String SelfPickup = "//android.widget.TextView[contains(@text, 'Self Pick-Up')]";
        String SearchStores = "com.maxincome.fmonlineuat:id/txtAddressOrOutlet";
        String StoreName = "com.maxincome.fmonlineuat:id/lblStoreName";

        MobileElement appLoadBannerElement = null;
        Thread.sleep(5000);
        try {
            this.appInteraction.ClickElement(SelectAddress, FindElementBy.XPath, NO_DELAY);
            this.appInteraction.ClickElement(SelfPickup, FindElementBy.XPath, NO_DELAY);
            this.appInteraction.SendKey(SearchStores,"Menara u",FindElementBy.Id,NO_DELAY);
            this.driver.sendKeyEvent(AndroidKeyCode.ENTER);
            this.appInteraction.ClickElement(StoreName, FindElementBy.Id, NO_DELAY);
            back();
            this.appInteraction.ClickElement(AddtoCartFab, FindElementBy.Id, NO_DELAY);

            Thread.sleep(5000);
        }
        catch(Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public boolean payment_method() throws InterruptedException{
        String PaymentMethod = "com.maxincome.fmonlineuat:id/paymentMethodLayout";
        String Bank = "//android.widget.TextView[contains(@text, 'Bank Transfer')]";
        String Remarks =  "com.maxincome.fmonlineuat:id/txtRemark";
        String PlaceOrder =  "com.maxincome.fmonlineuat:id/btnPlaceOrder";
        String CustName =  "ent_CustName";
        String OrderSuccess =  "com.maxincome.fmonlineuat:id/lblCurrentStatus";

        String BankTest =  "//android.view.View[contains(@text, 'Pay with eGHL TestBank')]";

        MobileElement appLoadBannerElement = null;
        Thread.sleep(5000);
        try {
            this.appInteraction.ClickElement(PaymentMethod, FindElementBy.Id, NO_DELAY);
            this.appInteraction.ClickElement(Bank, FindElementBy.XPath, NO_DELAY);
            this.appInteraction.SendKey(Remarks,"\uD83D\uDE01\uD83D\uDE23\uD83D\uDE22",FindElementBy.Id,NO_DELAY);
            this.appInteraction.ClickElement(PlaceOrder, FindElementBy.Id, NO_DELAY);
            this.appInteraction.SendKey(CustName,"nity",FindElementBy.Id,NO_DELAY);
            this.appInteraction.ClickElement(BankTest, FindElementBy.XPath, NO_DELAY);
            appLoadBannerElement = this.appInteraction.FindElement(OrderSuccess, FindElementBy.Id, NO_DELAY);

            Thread.sleep(5000);
        }
        catch(Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public boolean select_location_delivery() throws InterruptedException{
        String AddtoCartFab = "com.maxincome.fmonlineuat:id/fab";
        String SelectAddress = "android.widget.Button[contains(@text, 'Select') or contains(@text,'Change')]";
        String Delivery = "//android.widget.TextView[contains(@text, 'Delivery')]";
        String add_delivery = "android.widget.Button[contains(@text, 'Menara U') ]";
        String menaraU = "android.widget.TextView[contains(@text, 'FamilyMart Menara U') ]";

        MobileElement appLoadBannerElement = null;
        Thread.sleep(5000);
        try {
            this.appInteraction.ClickElement(SelectAddress, FindElementBy.XPath, NO_DELAY);
            this.appInteraction.ClickElement(Delivery, FindElementBy.XPath, NO_DELAY);
            this.appInteraction.ClickElement(add_delivery, FindElementBy.XPath, NO_DELAY);
            this.appInteraction.ClickElement(menaraU, FindElementBy.XPath, NO_DELAY);
            back();
            back();
            this.appInteraction.ClickElement(AddtoCartFab, FindElementBy.Id, NO_DELAY);

            Thread.sleep(5000);
        }
        catch(Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

}