package Pages;

import Enums.FindElementBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class m3 extends BasePage {
    public m3(AndroidDriver<MobileElement> driver) {
        super(driver);
    }


    public boolean isAbleToClickHelpCenterButton() throws InterruptedException{
        String HCButton = "com.maxincome.fmonlineuat:id/lblHelpCenter";
        MobileElement appLoadBannerElement = null;
        Thread.sleep(5000);
        try {
            appLoadBannerElement = this.appInteraction.FindElement(HCButton, FindElementBy.Id, NO_DELAY);
            this.appInteraction.ClickElement(HCButton, FindElementBy.Id, NO_DELAY);
            Thread.sleep(5000);
        }
        catch(Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public boolean isHelpCenterShown() throws InterruptedException{
        String HC = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[8]";
        MobileElement appLoadBannerElement = null;
        Thread.sleep(5000);
        try {
            appLoadBannerElement = this.appInteraction.FindElement(HC, FindElementBy.Id, NO_DELAY);
        }
        catch(Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public boolean isAbleToClickMenuButtons() throws InterruptedException{
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

    public boolean isAbleToClickFeedbackButton() throws InterruptedException{
        String FeedbackButton = "//android.view.View[contains(@text, 'I have other issue to feedback')]";
        MobileElement appLoadBannerElement = null;
        Thread.sleep(5000);
        try {
            appLoadBannerElement = this.appInteraction.FindElement(FeedbackButton, FindElementBy.XPath, NO_DELAY);
            this.appInteraction.ClickElement(FeedbackButton, FindElementBy.XPath, NO_DELAY);
            Thread.sleep(5000);
        }
        catch(Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public boolean arrowleft() throws InterruptedException{
        String arrowleft = "com.maxincome.fmonlineuat:id/btnOperation";
        MobileElement appLoadBannerElement = null;
        Thread.sleep(5000);
        try {
            appLoadBannerElement = this.appInteraction.FindElement(arrowleft, FindElementBy.Id, NO_DELAY);
            this.appInteraction.ClickElement(arrowleft, FindElementBy.Id, NO_DELAY);
            Thread.sleep(5000);
        }
        catch(Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public boolean isFeedbackShown() throws InterruptedException{
        String FB = "time";
        MobileElement appLoadBannerElement = null;
        Thread.sleep(5000);
        try {
            appLoadBannerElement = this.appInteraction.FindElement(FB, FindElementBy.Id, NO_DELAY);
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

    public boolean isAbleToDescription() throws InterruptedException{ //download 3 images and put location of img in img variables
        String Description = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[11]/android.view.View/android.widget.EditText";
        String img2box = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[14]";
        String img2 ="//android.widget.TextView[contains(@text, '26')]";


        String img =  "//android.widget.TextView[contains(@text, '25')]";
        String imgbox = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[13]";
        String img3box ="//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[15]";
        String img3 = "//android.widget.TextView[contains(@text, '27')]";
        String location= "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.widget.EditText";
        String location_dropdown = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View[2]/android.widget.ListView";
        String file_image ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]";
        MobileElement appLoadBannerElement = null;
        Thread.sleep(5000);
        try {
            appLoadBannerElement = this.appInteraction.FindElement(img2box, FindElementBy.XPath, NO_DELAY);
            this.appInteraction.ClickElement(img2box, FindElementBy.XPath, NO_DELAY);
            Thread.sleep(500);
            this.appInteraction.ClickElement(file_image, FindElementBy.XPath, NO_DELAY);
//            this.appInteraction.ClickElement(img2, FindElementBy.XPath, NO_DELAY);
            this.appInteraction.ClickElement(imgbox, FindElementBy.XPath, NO_DELAY);
            Thread.sleep(500);
            this.appInteraction.ClickElement(file_image, FindElementBy.XPath, NO_DELAY);
//            this.appInteraction.ClickElement(img, FindElementBy.XPath, NO_DELAY);
            this.appInteraction.ClickElement(img3box, FindElementBy.XPath, NO_DELAY);
            Thread.sleep(500);
            this.appInteraction.ClickElement(file_image, FindElementBy.XPath, NO_DELAY);
//            this.appInteraction.ClickElement(img3, FindElementBy.XPath, NO_DELAY);
            this.appInteraction.SendKey(location,"menara u",FindElementBy.XPath,NO_DELAY);

            this.appInteraction.ClickElement(location_dropdown,FindElementBy.XPath,NO_DELAY);
            this.appInteraction.SendKey(Description,"Hola amigo",FindElementBy.XPath,NO_DELAY);
            Thread.sleep(5000);
        }
        catch(Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public boolean isAbleToEmoji() throws InterruptedException{
        String Description = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[11]/android.view.View/android.widget.EditText";
        String img2box = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[14]";
        MobileElement appLoadBannerElement = null;
        Thread.sleep(5000);
        try {
            appLoadBannerElement = this.appInteraction.FindElement(img2box, FindElementBy.XPath, NO_DELAY);
            this.appInteraction.SendKey(Description,"\uD83D\uDE0A\uD83E\uDD7A\uD83D\uDE09\uD83D\uDE0D\uD83D\uDE18\uD83D\uDE1A\uD83D\uDE1C\uD83D\uDE02\uD83D\uDE1D\uD83D\uDE33\uD83D\uDE01\uD83D\uDE23\uD83D\uDE22",FindElementBy.XPath,NO_DELAY);
            Thread.sleep(5000);
        }
        catch(Exception e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }

    public boolean isAbleToClickSubmit() throws InterruptedException{
        String submit = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[16]/android.widget.Button";
        MobileElement appLoadBannerElement = null;
        Thread.sleep(5000);
        try {
            appLoadBannerElement = this.appInteraction.FindElement(submit, FindElementBy.XPath, NO_DELAY);
            this.appInteraction.ClickElement(submit, FindElementBy.XPath, NO_DELAY);
            Thread.sleep(5000);
        }
        catch(Exception e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }

    public boolean isAbleTolongdescription() throws InterruptedException{
        String Description = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[11]/android.view.View/android.widget.EditText";
        String img2box = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[14]";
        MobileElement appLoadBannerElement = null;
        Thread.sleep(5000);
        try {
            appLoadBannerElement = this.appInteraction.FindElement(img2box, FindElementBy.XPath, NO_DELAY);
            this.appInteraction.SendKey(Description,"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Egestas egestas fringilla phasellus faucibus scelerisque eleifend. At quis risus sed vulputate odio ut enim blandit volutpat. Tempor orci dapibus ultrices in iaculis nunc sed augue lacus. Venenatis urna cursus eget nunc scelerisque viverra mauris in. Ut etiam sit amet nisl purus in mollis nunc sed. Sed risus pretium quam vulputate. Id donec ultrices tincidunt arcu. Diam in arcu cursus euismod quis. Mattis rhoncus urna neque viverra justo nec ultrices. Fermentum leo vel orci porta non pulvinar neque laoreet. Montes nascetur ridiculus mus mauris vitae ultricies leo integer. Adipiscing diam donec adipiscing tristique risus nec feugiat in fermentum. Convallis a cras semper auctor neque vitae tempus. Nullam vehicula ipsum a arcu cursus vitae congue mauris. Ultricies mi eget mauris pharetra et ultrices neque ornare. Sapien nec sagittis aliquam malesuada bibendum arcu. Elit scelerisque mauris pellentesque pulvinar pellentesque habitant morbi. Risus sed vulputate odio ut enim. Cras adipiscing enim eu turpis egestas pretium aenean. Tempor orci eu lobortis elementum nibh tellus. Semper viverra nam libero justo laoreet sit amet. Porta lorem mollis aliquam ut porttitor leo a diam sollicitudin. Eget nunc lobortis mattis aliquam faucibus purus. Neque convallis a cras semper auctor neque vitae tempus. Sit amet mauris commodo quis imperdiet massa tincidunt nunc pulvinar. Etiam erat velit scelerisque in dictum non consectetur. Curabitur vitae nunc sed velit dignissim sodales. Elit ut aliquam purus sit. Risus in hendrerit gravida rutrum quisque. Venenatis tellus in metus vulputate eu scelerisque felis imperdiet proin. Vestibulum rhoncus est pellentesque elit. Mauris ultrices eros in cursus turpis massa tincidunt dui ut. Amet justo donec enim diam vulputate ut pharetra sit. Fringilla ut morbi tincidunt augue interdum velit. Non odio euismod lacinia at quis. Mattis ullamcorper velit sed ullamcorper. Nec ullamcorper sit amet risus nullam eget felis eget. Neque vitae tempus quam pellentesque nec nam aliquam. Ac tortor dignissim convallis aenean et tortor at risus. Rhoncus dolor purus non enim praesent elementum. Est ante in nibh mauris cursus mattis. Lobortis scelerisque fermentum dui faucibus. Senectus et netus et malesuada fames ac. Id aliquet risus feugiat in. Quis ipsum suspendisse ultrices gravida dictum fusce ut. Est sit amet facilisis magna etiam tempor orci eu. Vitae tortor condimentum lacinia quis. Tortor consequat id porta nibh venenatis cras sed. Tellus integer feugiat scelerisque varius. Senectus et netus et malesuada fames. Sit amet commodo nulla facilisi. Purus ut faucibus pulvinar elementum integer enim neque. Elit ullamcorper dignissim cras tincidunt lobortis feugiat vivamus. Adipiscing diam donec adipiscing tristique risus nec feugiat. Iaculis at erat pellentesque adipiscing. Quam adipiscing vitae proin sagittis. Lorem ipsum dolor sit amet consectetur adipiscing elit pellentesque. Massa eget egestas purus viverra accumsan in nisl. Aliquam etiam erat velit scelerisque in dictum non. Eget nunc lobortis mattis aliquam faucibus purus. Porttitor rhoncus dolor purus non enim. Diam quis enim lobortis scelerisque fermentum. Ut pharetra sit amet aliquam id. Fames ac turpis egestas sed tempus urna et pharetra pharetra. Rhoncus urna neque viverra justo nec ultrices dui sapien. Id neque aliquam vestibulum morbi. Ut tellus elementum sagittis vitae et leo duis. At quis risus sed vulputate odio ut enim blandit. Urna nec tincidunt praesent semper feugiat. Elementum pulvinar etiam non quam lacus suspendisse faucibus interdum posuere. Nibh mauris cursus mattis molestie a. Tristique senectus et netus et malesuada fames ac turpis. Dui faucibus in ornare quam viverra orci. Feugiat in fermentum posuere urna nec. Leo integer malesuada nunc vel risus commodo viverra maecenas accumsan. Aenean pharetra magna ac placerat vestibulum lectus mauris ultrices eros. Habitasse platea dictumst quisque sagittis purus. At ultrices mi tempus imperdiet nulla malesuada pellentesque. Semper auctor neque vitae tempus quam pellentesque nec nam. Suspendisse ultrices gravida dictum fusce. Faucibus ornare suspendisse sed nisi. Curabitur gravida arcu ac tortor. Vitae aliquet nec ullamcorper sit. Sed adipiscing diam donec adipiscing tristique risus. Et malesuada fames ac turpis egestas sed. Id consectetur purus ut faucibus pulvinar elementum integer enim neque. Quis blandit turpis cursus in hac habitasse platea. Proin libero nunc consequat interdum varius sit amet mattis vulputate. Imperdiet sed euismod nisi porta lorem mollis aliquam ut porttitor. Libero id faucibus nisl tincidunt eget nullam. Nibh venenatis cras sed felis eget velit. Venenatis urna cursus eget nunc scelerisque. Accumsan tortor posuere ac ut consequat semper. Bibendum arcu vitae elementum curabitur vitae nunc sed. Rhoncus urna neque viverra justo nec ultrices dui. Diam sit amet nisl suscipit adipiscing. Neque vitae tempus quam pellentesque nec nam aliquam. Consequat nisl vel pretium lectus quam id. Nulla at volutpat diam ut venenatis.Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Egestas egestas fringilla phasellus faucibus scelerisque eleifend. At quis risus sed vulputate odio ut enim blandit volutpat. Tempor orci dapibus ultrices in iaculis nunc sed augue lacus. Venenatis urna cursus eget nunc scelerisque viverra mauris in. Ut etiam sit amet nisl purus in mollis nunc sed. Sed risus pretium quam vulputate. Id donec ultrices tincidunt arcu. Diam in arcu cursus euismod quis. Mattis rhoncus urna neque viverra justo nec ultrices. Fermentum leo vel orci porta non pulvinar neque laoreet. Montes nascetur ridiculus mus mauris vitae ultricies leo integer. Adipiscing diam donec adipiscing tristique risus nec feugiat in fermentum. Convallis a cras semper auctor neque vitae tempus. Nullam vehicula ipsum a arcu cursus vitae congue mauris. Ultricies mi eget mauris pharetra et ultrices neque ornare. Sapien nec sagittis aliquam malesuada bibendum arcu. Elit scelerisque mauris pellentesque pulvinar pellentesque habitant morbi. Risus sed vulputate odio ut enim. Cras adipiscing enim eu turpis egestas pretium aenean. Tempor orci eu lobortis elementum nibh tellus. Semper viverra nam libero justo laoreet sit amet. Porta lorem mollis aliquam ut porttitor leo a diam sollicitudin. Eget nunc lobortis mattis aliquam faucibus purus. Neque convallis a cras semper auctor neque vitae tempus. Sit amet mauris commodo quis imperdiet massa tincidunt nunc pulvinar. Etiam erat velit scelerisque in dictum non consectetur. Curabitur vitae nunc sed velit dignissim sodales. Elit ut aliquam purus sit. Risus in hendrerit gravida rutrum quisque. Venenatis tellus in metus vulputate eu scelerisque felis imperdiet proin. Vestibulum rhoncus est pellentesque elit. Mauris ultrices eros in cursus turpis massa tincidunt dui ut. Amet justo donec enim diam vulputate ut pharetra sit. Fringilla ut morbi tincidunt augue interdum velit. Non odio euismod lacinia at quis. Mattis ullamcorper velit sed ullamcorper. Nec ullamcorper sit amet risus nullam eget felis eget. Neque vitae tempus quam pellentesque nec nam aliquam. Ac tortor dignissim convallis aenean et tortor at risus. Rhoncus dolor purus non enim praesent elementum. Est ante in nibh mauris cursus mattis. Lobortis scelerisque fermentum dui faucibus. Senectus et netus et malesuada fames ac. Id aliquet risus feugiat in. Quis ipsum suspendisse ultrices gravida dictum fusce ut. Est sit amet facilisis magna etiam tempor orci eu. Vitae tortor condimentum lacinia quis. Tortor consequat id porta nibh venenatis cras sed. Tellus integer feugiat scelerisque varius. Senectus et netus et malesuada fames. Sit amet commodo nulla facilisi. Purus ut faucibus pulvinar elementum integer enim neque. Elit ullamcorper dignissim cras tincidunt lobortis feugiat vivamus. Adipiscing diam donec adipiscing tristique risus nec feugiat. Iaculis at erat pellentesque adipiscing. Quam adipiscing vitae proin sagittis. Lorem ipsum dolor sit amet consectetur adipiscing elit pellentesque. Massa eget egestas purus viverra accumsan in nisl. Aliquam etiam erat velit scelerisque in dictum non. Eget nunc lobortis mattis aliquam faucibus purus. Porttitor rhoncus dolor purus non enim. Diam quis enim lobortis scelerisque fermentum. Ut pharetra sit amet aliquam id. Fames ac turpis egestas sed tempus urna et pharetra pharetra. Rhoncus urna neque viverra justo nec ultrices dui sapien. Id neque aliquam vestibulum morbi. Ut tellus elementum sagittis vitae et leo duis. At quis risus sed vulputate odio ut enim blandit. Urna nec tincidunt praesent semper feugiat. Elementum pulvinar etiam non quam lacus suspendisse faucibus interdum posuere. Nibh mauris cursus mattis molestie a. Tristique senectus et netus et malesuada fames ac turpis. Dui faucibus in ornare quam viverra orci. Feugiat in fermentum posuere urna nec. Leo integer malesuada nunc vel risus commodo viverra maecenas accumsan. Aenean pharetra magna ac placerat vestibulum lectus mauris ultrices eros. Habitasse platea dictumst quisque sagittis purus. At ultrices mi tempus imperdiet nulla malesuada pellentesque. Semper auctor neque vitae tempus quam pellentesque nec nam. Suspendisse ultrices gravida dictum fusce. Faucibus ornare suspendisse sed nisi. Curabitur gravida arcu ac tortor. Vitae aliquet nec ullamcorper sit. Sed adipiscing diam donec adipiscing tristique risus. Et malesuada fames ac turpis egestas sed. Id consectetur purus ut faucibus pulvinar elementum integer enim neque. Quis blandit turpis cursus in hac habitasse platea. Proin libero nunc consequat interdum varius sit amet mattis vulputate. Imperdiet sed euismod nisi porta lorem mollis aliquam ut porttitor. Libero id faucibus nisl tincidunt eget nullam. Nibh venenatis cras sed felis eget velit. Venenatis urna cursus eget nunc scelerisque. Accumsan tortor posuere ac ut consequat semper. Bibendum arcu vitae elementum curabitur vitae nunc sed. Rhoncus urna neque viverra justo nec ultrices dui. Diam sit amet nisl suscipit adipiscing. Neque vitae tempus quam pellentesque nec nam aliquam. Consequat nisl vel pretium lectus quam id. Nulla at volutpat diam ut venenatis.",FindElementBy.XPath,NO_DELAY);
            Thread.sleep(5000);
        }
        catch(Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public boolean validation_success() throws InterruptedException{
        String CategoryButton = "//android.view.View[contains(@text, 'Thank You For Your Feedback! Your message is well received. We will look into this and get back to you as soon as possible')]";
        MobileElement appLoadBannerElement = null;
        Thread.sleep(5000);
        try {
            appLoadBannerElement = this.appInteraction.FindElement(CategoryButton, FindElementBy.XPath, NO_DELAY);
            Thread.sleep(5000);
        }
        catch(Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }



    public boolean validation_failed_emoji() throws InterruptedException{
        String CategoryButton = "//android.view.View[not(contains(@text, 'Thank You For Your Feedback! Your message is well received. We will look into this and get back to you as soon as possible'))]";
        MobileElement appLoadBannerElement = null;
        Thread.sleep(5000);

        try {
            appLoadBannerElement = this.appInteraction.FindElement(CategoryButton, FindElementBy.XPath, NO_DELAY);
            Thread.sleep(5000);
        }
        catch(Exception e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }
    public boolean validation_failed_long() throws InterruptedException{
        String CategoryButton = "//android.view.View[contains(@text, 'Description must not exceed 4000 characters')]";
        MobileElement appLoadBannerElement = null;
        Thread.sleep(5000);
        try {
            appLoadBannerElement = this.appInteraction.FindElement(CategoryButton, FindElementBy.XPath, NO_DELAY);
            Thread.sleep(5000);
            arrowleft();
        }
        catch(Exception e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }

    public boolean fav_address() throws InterruptedException{
        String fav_addressButton = "com.maxincome.fmonlineuat:id/lblFavouriteAddress";
        MobileElement appLoadBannerElement = null;
        Thread.sleep(5000);
        try {
            appLoadBannerElement = this.appInteraction.FindElement(fav_addressButton, FindElementBy.Id, NO_DELAY);
            this.appInteraction.ClickElement(fav_addressButton, FindElementBy.Id, NO_DELAY);
            Thread.sleep(5000);
        }
        catch(Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public boolean add_fav_address() throws InterruptedException{
        String add_fav_address = "com.maxincome.fmonlineuat:id/btnAddAddress";
        String add_address_detail =" com.maxincome.fmonlineuat:id/btnSearchPlace";

        MobileElement appLoadBannerElement = null;
        Thread.sleep(5000);
        try {
            appLoadBannerElement = this.appInteraction.FindElement(add_fav_address, FindElementBy.Id, NO_DELAY);
            this.appInteraction.ClickElement(add_fav_address, FindElementBy.Id, NO_DELAY);
            this.appInteraction.ClickElement(add_address_detail, FindElementBy.Id, NO_DELAY);

            Thread.sleep(5000);
        }
        catch(Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }


    public boolean input_address_details() throws InterruptedException{
        String address_floor= "com.maxincome.fmonlineuat:id/txtFloorUnit";
        String address_notes = "com.maxincome.fmonlineuat:id/txtNotes";
        String submit = "com.maxincome.fmonlineuat:id/btnSaveAddress";


        MobileElement appLoadBannerElement = null;
        Thread.sleep(5000);
        try {
            this.appInteraction.SendKey(address_floor,"10-10",FindElementBy.Id,NO_DELAY);
            this.appInteraction.SendKey(address_notes,"\uD83D\uDE1C its a me mario",FindElementBy.Id,NO_DELAY);
            appLoadBannerElement = this.appInteraction.FindElement(submit, FindElementBy.Id, NO_DELAY);
            this.appInteraction.ClickElement(submit, FindElementBy.Id, NO_DELAY);
            Thread.sleep(5000);
        }
        catch(Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public boolean edit_address_menu() throws InterruptedException{

        String saved_address = "//android.widget.TextView[contains(@text, 'HOME')]";


        MobileElement appLoadBannerElement = null;
        Thread.sleep(5000);
        try {
            appLoadBannerElement = this.appInteraction.FindElement(saved_address, FindElementBy.XPath, NO_DELAY);
            this.appInteraction.ClickElement(saved_address, FindElementBy.XPath, NO_DELAY);
            Thread.sleep(5000);
        }
        catch(Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public boolean edit_address_details() throws InterruptedException{

        String saved_address = "com.maxincome.fmonlineuat:id/lblAddress";
        String saved_floor = "com.maxincome.fmonlineuat:id/txtFloorUnit";
        String saved_address_notes = "com.maxincome.fmonlineuat:id/txtNotes";
        String submit = "com.maxincome.fmonlineuat:id/btnSaveAddress";

        MobileElement appLoadBannerElement = null;
        Thread.sleep(5000);
        try {
            appLoadBannerElement = this.appInteraction.FindElement(saved_address, FindElementBy.Id, NO_DELAY);
            this.appInteraction.SendKey(saved_floor,"20-20",FindElementBy.Id,NO_DELAY);
            this.appInteraction.SendKey(saved_address_notes,"\uD83D\uDE1C its a me luigi",FindElementBy.Id,NO_DELAY);
            this.appInteraction.ClickElement(saved_address, FindElementBy.Id, NO_DELAY);

            appLoadBannerElement = this.appInteraction.FindElement(submit, FindElementBy.Id, NO_DELAY);
            this.appInteraction.ClickElement(submit, FindElementBy.Id, NO_DELAY);
              input_address_details();
            this.appInteraction.ClickElement(submit, FindElementBy.Id, NO_DELAY);

        }
        catch(Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public boolean delete_address_menu() throws InterruptedException{
        String saved_address = "com.maxincome.fmonlineuat:id/btnRemoveAddress";
//        edit_address_menu();

        MobileElement appLoadBannerElement = null;
        Thread.sleep(5000);
        try {
            appLoadBannerElement = this.appInteraction.FindElement(saved_address, FindElementBy.Id, NO_DELAY);
            this.appInteraction.ClickElement(saved_address, FindElementBy.Id, NO_DELAY);
            Thread.sleep(5000);
        }
        catch(Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public boolean store_locator_map() throws InterruptedException{
        String nav_icon = "com.maxincome.fmonlineuat:id/navigation_location";
//        edit_address_menu();

        MobileElement appLoadBannerElement = null;
        Thread.sleep(5000);
        try {
            appLoadBannerElement = this.appInteraction.FindElement(nav_icon, FindElementBy.Id, NO_DELAY);
            this.appInteraction.ClickElement(nav_icon, FindElementBy.Id, NO_DELAY);
            Thread.sleep(5000);
        }
        catch(Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public boolean store_locator_nearme() throws InterruptedException{
        String nearme = "com.maxincome.fmonlineuat:id/btnStoreNearMe";
        String takeMeThere =  "com.maxincome.fmonlineuat:id/btnTakeMeThere";


        String fm = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]";
//        edit_address_menu();

        MobileElement appLoadBannerElement = null;
        Thread.sleep(5000);
        try {
            this.appInteraction.ClickElement(nearme, FindElementBy.Id, NO_DELAY);

            appLoadBannerElement = this.appInteraction.FindElement(fm, FindElementBy.XPath, NO_DELAY);
            this.appInteraction.ClickElement(fm, FindElementBy.XPath, NO_DELAY);
            this.appInteraction.ClickElement(takeMeThere, FindElementBy.Id, NO_DELAY);
            back();
            Thread.sleep(1000);
        }
        catch(Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public boolean store_locator_filter() throws InterruptedException{
        String nearme = "com.maxincome.fmonlineuat:id/btnStoreNearMe";
        String fm = "//android.view.View[contains(@text, 'FamilyMart')]";
//        edit_address_menu();

        MobileElement appLoadBannerElement = null;
        Thread.sleep(5000);
        try {
            this.appInteraction.ClickElement(nearme, FindElementBy.Id, NO_DELAY);

            appLoadBannerElement = this.appInteraction.FindElement(fm, FindElementBy.XPath, NO_DELAY);
            Thread.sleep(5000);
        }
        catch(Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

//    public boolean store_locator_sort() throws InterruptedException{
//        String nearme = "com.maxincome.fmonlineuat:id/btnStoreNearMe";
//        String fm = "//android.view.View[contains(@text, 'FamilyMart')]";
//        edit_address_menu();
//
//        MobileElement appLoadBannerElement = null;
//        Thread.sleep(5000);
//        try {
//            this.appInteraction.ClickElement(nearme, FindElementBy.Id, NO_DELAY);
//
//            appLoadBannerElement = this.appInteraction.FindElement(fm, FindElementBy.XPath, NO_DELAY);
//            Thread.sleep(5000);
//        }
//        catch(Exception e) {
//            e.printStackTrace();
//            return false;
//        }
//        return true;
//    }

    public boolean store_list() throws InterruptedException{
        String johor = "//android.widget.TextView[contains(@text, 'Johor')]";
        String fm ="//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"Store List\"]";
//        edit_address_menu();

        MobileElement appLoadBannerElement = null;
        Thread.sleep(5000);
        try {
            this.appInteraction.ClickElement(fm, FindElementBy.XPath, NO_DELAY);

            appLoadBannerElement = this.appInteraction.FindElement(johor, FindElementBy.XPath, NO_DELAY);
            Thread.sleep(5000);
        }
        catch(Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public boolean store_list_filter() throws InterruptedException{
        String filter = "com.maxincome.fmonlineuat:id/btnOption";
        String hrs =  "com.maxincome.fmonlineuat:id/btn24hours";
        String johor = "android.widget.TextView[not(contains(@text, 'Johor')])";

//        edit_address_menu();

        MobileElement appLoadBannerElement = null;
        Thread.sleep(5000);
        try {
            this.appInteraction.ClickElement(filter, FindElementBy.Id, NO_DELAY);
            this.appInteraction.ClickElement(hrs, FindElementBy.Id, NO_DELAY);
            back();


            appLoadBannerElement = this.appInteraction.FindElement(johor, FindElementBy.XPath, NO_DELAY);
            Thread.sleep(5000);
        }
        catch(Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public boolean gps() throws InterruptedException{
        String gps =  "com.android.permissioncontroller:id/permission_allow_always_button";

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

    public boolean GoHome() throws InterruptedException{
        String home =  "com.maxincome.fmonlineuat:id/navigation_food";

        MobileElement appLoadBannerElement = null;
        Thread.sleep(5000);
        try {
            appLoadBannerElement = this.appInteraction.FindElement(home, FindElementBy.Id, NO_DELAY);

            this.appInteraction.ClickElement(home, FindElementBy.Id, NO_DELAY);
            Thread.sleep(5000);
        }
        catch(Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
