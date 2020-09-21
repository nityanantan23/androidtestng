package Pages;

import Enums.FindElementBy;
import Model.TestConfiguration;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

public class LandingPage extends BasePage{
	public LandingPage(AndroidDriver<MobileElement> driver) {
		super(driver);
	}

	public boolean isPageBannerShown() throws InterruptedException{
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
	
	public boolean isAbleToClickDownloadButton() throws InterruptedException{
		String downloadButton = "com.maxincome.fmonlineuat:id/imgClose";
		MobileElement appLoadBannerElement = null;
		Thread.sleep(5000);
    	try {
    		appLoadBannerElement = this.appInteraction.FindElement(downloadButton, FindElementBy.Id, NO_DELAY);
    		this.appInteraction.ClickElement(downloadButton, FindElementBy.Id, NO_DELAY);
    		Thread.sleep(5000); 
    	}
    	catch(Exception e) {
	    	e.printStackTrace();
	    	return false;
    	}
			
		return true;
	}
	
	public boolean isProductPageShown() throws InterruptedException{
		String productPage = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView[1]/android.widget.LinearLayout[6]";
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
	
	public boolean isAbleToClickBackButton() throws InterruptedException{
		String backButton = "com.maxincome.fmonlineuat:id/btnBack";
		MobileElement appLoadBannerElement = null;
		Thread.sleep(5000);
    	try {
    		appLoadBannerElement = this.appInteraction.FindElement(backButton, FindElementBy.Id, NO_DELAY);
    		this.appInteraction.ClickElement(backButton, FindElementBy.Id, NO_DELAY);
    		Thread.sleep(5000); 
    	}
    	catch(Exception e) {
	    	e.printStackTrace();
	    	return false;
    	}
			
		return true;
	}
	
	public boolean isAbleToClickCloseButton() throws InterruptedException{
		String closeButton = "com.maxincome.fmonlineuat:id/btnOperation";
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

//	public boolean waitAndAcceptJobOffer() throws InterruptedException{
//		String acceptJobButtonId = "com.codigo.cdgdriver:id/btnAcceptCurrentJob";
//		String startTripButtonId = "com.codigo.cdgdriver:id/btnStartTrip";
//		TouchAction touchAction = new TouchAction(driver);
//		do {
//			MobileElement acceptJobButtonElement = null;
//	    	try {
//	    		acceptJobButtonElement = this.appInteraction.FindElement(acceptJobButtonId, FindElementBy.Id, NO_DELAY);
//	    		//System.out.println(acceptJobButtonElement);
//	    		//this.appInteraction.TapElement(acceptJobButtonId, FindElementBy.Id, NO_DELAY);
//	        }catch(Exception e) {
//	        	//e.printStackTrace();
//	        	continue; //continue waiting job offer process
//	        }
//
//	        if(acceptJobButtonElement == null) {
//	        	continue; //continue waiting job offer process
//	        }
//
//    		touchAction.press(890, 1699).release().perform();
//	        //acceptJobButtonElement.click();
//            //this.appInteraction.ClickElement(acceptJobButtonId, FindElementBy.Id, NO_DELAY);
//
//            Thread.sleep(10000);
//
//            MobileElement startTripButtonElement = null;
//	    	try {
//	    		startTripButtonElement = this.appInteraction.FindElement(startTripButtonId, FindElementBy.Id, 500);
//	        }catch(Exception e) {
//	        	//e.printStackTrace();
//	        	continue; //continue waiting job offer process
//	        }
//
//	        if(startTripButtonElement == null) {
//	        	continue; //continue waiting job offer process
//	        }
//            break;
//		} while (true);
//			this.appInteraction.TakeScreenshot("CDG_Driver_Job_Cancelled");
//		return true;
//	}
}