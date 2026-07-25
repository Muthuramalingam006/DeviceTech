package steps

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.common.WebUiCommonHelper
import org.openqa.selenium.WebElement
import com.kms.katalon.core.webui.driver.DriverFactory
import org.openqa.selenium.interactions.Actions

import com.kms.katalon.core.testobject.ConditionType




import internal.GlobalVariable

public class GeneralFunctionalities {

	def validateBackToTopButton() {
		// Step 1: Scroll down using JavaScript

		WebUI.click(findTestObject("Homepage/Menu_items/our_brands"))

		WebUI.delay(5)
		WebUI.executeJavaScript("window.scrollTo(0, 1500);", null)
		WebUI.delay(3)

		// Step 2: Define the Scroll-to-Top button using XPath
		WebUI.verifyElementPresent(findTestObject("OurBrands/Top"), 2)
		TestObject topButton = findTestObject("OurBrands/Top")

		WebUI.delay(10)
		// Step 3: Verify presence and visibility
		if (WebUI.waitForElementPresent(topButton, 10)) {
			if (WebUI.verifyElementVisible(topButton)) {
				KeywordUtil.logInfo("✅ Scroll-to-Top button is visible.")

				// Step 4: Click using JavaScript to avoid flaky click issues
				WebElement topButtonElement = WebUiCommonHelper.findWebElement(topButton, 10)
				WebUI.executeJavaScript("arguments[0].click();", Arrays.asList(topButtonElement))
				WebUI.delay(2)

				// Step 5: Validate scroll returned to top
				Long scrollTop = WebUI.executeJavaScript("return window.pageYOffset;", null)
				KeywordUtil.logInfo("📍 Scroll position after clicking Top: " + scrollTop)

				if (scrollTop == 0) {
					KeywordUtil.markPassed("✅ SCM-114 - Pass: Back to Top button successfully scrolled to top.")
				} else {
					KeywordUtil.markFailed("❌ SCM-114 - Fail: Back to Top button did not scroll to top. Current position: " + scrollTop)
				}
			} else {
				KeywordUtil.markWarning("⚠️ Scroll-to-Top button is present but not visible.")
			}
		} else {
			KeywordUtil.markFailed("❌ Scroll-to-Top button is NOT present in the DOM.")
		}
	}

	def validatereCaptcha() {
	
			WebUI.click(findTestObject("ContactUs/CONTACT_US"))
			
	
			// Get objects from repository
			TestObject captchaIframe = findTestObject('General/Captcha')
			TestObject captchaIcon = findTestObject('General/CaptchaIcon')
	
			// Switch to iframe
			WebUI.waitForElementVisible(captchaIframe, 10)
			WebUI.switchToFrame(captchaIframe, 10)
	
			// Scroll and hover
			WebUI.scrollToElement(captchaIcon, 5)
			WebUI.waitForElementVisible(captchaIcon, 10)
			WebUI.mouseOver(captchaIcon)
	
			
	
			// Validate CAPTCHA expansion
			boolean headingPresent = WebUI.verifyElementPresent(findTestObject("General/CaptchaHeading"), 2, FailureHandling.CONTINUE_ON_FAILURE)
			boolean textPresent = WebUI.verifyElementPresent(findTestObject("General/CaptchaText"), 2, FailureHandling.CONTINUE_ON_FAILURE)
			boolean actionPresent = WebUI.verifyElementPresent(findTestObject("General/TakeAct"), 2, FailureHandling.CONTINUE_ON_FAILURE)
	
			if (headingPresent && textPresent && actionPresent) {
				println "✅ CAPTCHA expanded successfully — pass SCM-51 & SCM-50"
			} else {
				KeywordUtil.markFailed("❌ CAPTCHA expansion failed — SCM-51 & SCM-50 should fail")
			}
		}
}
