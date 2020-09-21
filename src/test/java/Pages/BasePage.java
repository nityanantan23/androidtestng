/*
 * Copyright 2014-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 * http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package Pages;

import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidKeyCode;
import org.openqa.selenium.support.PageFactory;

import Common.AppInteraction;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public abstract class BasePage {
	public static final int NO_DELAY = 0;
	public static final int ANIMATION_DELAY = 1000;
	public static final int REFRESH_DELAY = 500;
	public static final int MAX_DELAY = 15000;
	protected final AndroidDriver<MobileElement> driver;
	protected AppInteraction appInteraction;
	
	protected BasePage(AndroidDriver<MobileElement> driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver, 5, TimeUnit.SECONDS), this);
		this.appInteraction = new AppInteraction(driver);


		//this.appInteraction.WriteToReport("Init");
	}
}