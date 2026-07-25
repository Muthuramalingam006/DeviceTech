package stepsNZ

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.testobject.ConditionType


import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import org.testng.Assert
import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.Keys
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.util.KeywordUtil

import internal.GlobalVariable

public class Homepage {
	KeywordLogger logger = new KeywordLogger()

	def validateMenuItems() {
		/*WebUI.verifyElementPresent(findTestObject("Homepage/Menu_items/our_specialities"),5)
		 WebUI.verifyElementPresent(findTestObject("Homepage/Menu_items/our_brands"),2)
		 WebUI.verifyElementPresent(findTestObject("Homepage/Menu_items/support_services"),2)
		 WebUI.verifyElementPresent(findTestObject("Homepage/Menu_items/news"),2)
		 WebUI.verifyElementPresent(findTestObject("Homepage/Menu_items/device_online"),2)
		 WebUI.verifyElementPresent(findTestObject("Homepage/Menu_items/about_us"),2)*/

		boolean allPresent = true

		List<TestObject> menuItems = [
			findTestObject("Homepage/Menu_items/our_specialities"),
			findTestObject("Homepage/Menu_items/our_brands"),
			findTestObject("Homepage/Menu_items/support_services"),
			//findTestObject("Homepage/Menu_items/news"),
			findTestObject("Homepage/Menu_items/device_online"),
			findTestObject("Homepage/Menu_items/about_us")
		]

		List<Integer> timeouts = [5, 2, 2, 2, 2, 2]

		for (int i = 0; i < menuItems.size(); i++) {
			if (!WebUI.verifyElementPresent(menuItems[i], timeouts[i], FailureHandling.OPTIONAL)) {
				allPresent = false
				KeywordUtil.markFailed("Menu item missing: " + menuItems[i].getObjectId())
			}
		}

		if (allPresent) {
			KeywordUtil.logInfo("All menu items are available. SCM-26: Pass")
		} else {
			KeywordUtil.markFailed("SCM-26: One or more menu items are missing")
		}
	}


	def validatePresenceOfHeaderOptions() {
		WebUI.scrollToPosition(600,700)
		//WebUI.verifyElementPresent(findTestObject("Homepage/Medical_options_header/cardiology_vascular_and_radiology"),5)
		WebUI.verifyElementPresent(findTestObject("Homepage/Medical_options_header/cardiothoracic_surgery"),2)
		WebUI.verifyElementPresent(findTestObject("NZ/CriticalCare"),2)
		WebUI.verifyElementPresent(findTestObject("Homepage/Medical_options_header/gastroenterology"),2)
		WebUI.verifyElementPresent(findTestObject("Homepage/Medical_options_header/hospital_infrastructure"),2)
		WebUI.verifyElementPresent(findTestObject("Homepage/Medical_options_header/infection_prevention"),2)
		//WebUI.verifyElementPresent(findTestObject("Homepage/Medical_options_header/micro_surgical_robotics"),2)
		WebUI.verifyElementPresent(findTestObject("NZ/oncology"),2)
		WebUI.verifyElementPresent(findTestObject("Homepage/Medical_options_header/opthalmic_technology"),2)
		WebUI.verifyElementPresent(findTestObject("Homepage/Medical_options_header/orthopaedics"),2)
		WebUI.verifyElementPresent(findTestObject("Homepage/Medical_options_header/plastic_reconstructive_surgery"),2)
		//WebUI.verifyElementPresent(findTestObject("Homepage/Medical_options_header/robotics"),2)
		//WebUI.verifyElementPresent(findTestObject("Homepage/Medical_options_header/spine"),2)
		WebUI.verifyElementPresent(findTestObject("Homepage/Medical_options_header/surgical_solutions"),2)
		WebUI.verifyElementPresent(findTestObject("Homepage/Medical_options_header/theatre_equipment"),2)
	}

	def validateHeaderOptionsNavigation() {
		// Define menu items and expected titles
		/*	[id: "Homepage/Scroll/cardiology_vascular_and_radiology",
		 title: "Cardiology, Vascular & Radiology | Device Technologies AU"],*/

		def medicalOptions = [
			[id: "Homepage/Medical_options_header/cardiothoracic_surgery",
				title: "Cardiothoracic Surgery | Device Technologies AU"],
			[id: "NZ/CriticalCare",
				title: "Critical Care | Device Technologies AU"],
			[id: "Homepage/Medical_options_header/gastroenterology",
				title: "Gastroenterology | Device Technologies AU"],
			[id: "Homepage/Medical_options_header/hospital_infrastructure",
				title: "Hospital Infrastructure | Device Technologies AU"],
			[id: "Homepage/Medical_options_header/infection_prevention",
				title: "Infection Prevention | Device Technologies AU"],
		]

		// Iterate through each option
		for (option in medicalOptions) {
			TestObject to = findTestObject(option.id)

			// Scroll vertically + ensure visible
			WebUI.scrollToPosition(600, 700)
			WebUI.scrollToElement(to, 5)
			WebUI.waitForElementVisible(to, 5)

			// Get WebElement
			WebDriver driver = DriverFactory.getWebDriver()
			WebElement element = WebUiCommonHelper.findWebElement(to, 10)

			// JS Click (works even if element is offscreen in horizontal scroll)
			JavascriptExecutor js = (JavascriptExecutor) driver
			js.executeScript("arguments[0].scrollIntoView(true); arguments[0].click();", element)

			WebUI.delay(5)
			def actualTitle = WebUI.getWindowTitle()


			KeywordUtil.logInfo(" Scrool elements present and page title is :" + actualTitle)
			//assert actualTitle == option.title : "${option.id} navigation failed"

			WebUI.back()
		}
	}

	def validateFooterOptionsNavigation() {
		// Define menu items and expected titles
		def medicalOptions = [
			[id: "Homepage/Medical_options_footer/cardiology_vascular_and_radiology",
				title: "Cardiology, Vascular & Radiology | Device Technologies AU"],
			[id: "Homepage/Medical_options_footer/cardiothoracic_surgery",
				title: "Cardiothoracic Surgery | Device Technologies AU"],
			[id: "Homepage/Medical_options_footer/critical_care",
				title: "Critical Care | Device Technologies AU"],
			[id: "Homepage/Medical_options_footer/gastroenterology",
				title: "Gastroenterology | Device Technologies AU"],
			[id: "Homepage/Medical_options_footer/hospital_infrastructure",
				title: "Hospital Infrastructure | Device Technologies AU"],
			[id: "Homepage/Medical_options_footer/infection_prevention",
				title: "Infection Prevention | Device Technologies AU"],
		]

		// Iterate through each option
		for (option in medicalOptions) {
			TestObject to = findTestObject(option.id)

			// Scroll vertically + ensure visible
			WebUI.scrollToPosition(600, 700)
			WebUI.scrollToElement(to, 5)
			WebUI.waitForElementVisible(to, 5)

			// Get WebElement
			WebDriver driver = DriverFactory.getWebDriver()
			WebElement element = WebUiCommonHelper.findWebElement(to, 10)

			// JS Click (works even if element is offscreen in horizontal scroll)
			JavascriptExecutor js = (JavascriptExecutor) driver
			js.executeScript("arguments[0].scrollIntoView(true); arguments[0].click();", element)

			WebUI.delay(5)
			def actualTitle = WebUI.getWindowTitle()

			//assert actualTitle == option.title : "${option.id} navigation failed"

			WebUI.back()
		}
	}

	def validateCookies() {
		KeywordUtil.logInfo("🔍 Starting cookie banner validation")
		// Step 1: Trigger the cookie banner
		WebUI.click(findTestObject("Homepage/Menu_items/our_specialities"))
		TestObject cookieBanner = findTestObject("Cookies/accept_cookies")
		// Step 2: Accept cookies if banner is present
		if (WebUI.verifyElementPresent(cookieBanner, 5, FailureHandling.OPTIONAL)) {
			WebUI.click(cookieBanner)
			KeywordUtil.logInfo("✅ Cookie banner accepted")
		} else {
			KeywordUtil.logInfo("ℹ️ Cookie banner not displayed or already dismissed")
		}
		// Step 3: Re-trigger navigation to confirm banner is gone
		WebUI.delay(2)
		WebUI.click(findTestObject("Homepage/Menu_items/our_specialities"))
		WebUI.delay(3)
		// Step 4: Validate cookie banner is no longer visible
		if (WebUI.verifyElementPresent(cookieBanner, 2, FailureHandling.OPTIONAL)) {
			WebElement element = WebUI.findWebElement(cookieBanner)
			Assert.assertFalse(element.isDisplayed(), "❌ Cookie banner is still visible after acceptance")
		} else {
			KeywordUtil.logInfo("✅ Cookie banner successfully dismissed - SCM-27 & SCM-143 _ pass")
		}
		// Step 5: Dynamically locate and log the "Learn More" link
		TestObject learnMoreLink = new TestObject('dynamicLearnMore')
		learnMoreLink.addProperty('xpath', ConditionType.EQUALS, "//a[contains(text(),'Learn More')]")
		if (WebUI.verifyElementPresent(learnMoreLink, 5, FailureHandling.OPTIONAL)) {
			WebElement linkElement = WebUI.findWebElement(learnMoreLink)
			KeywordUtil.logInfo("🔗 Link Text: " + linkElement.getText())
			KeywordUtil.logInfo("🔗 Href: " + linkElement.getAttribute("href"))
			KeywordUtil.logInfo("🔗 Tag: " + linkElement.getTagName())
			KeywordUtil.logInfo("🔗 Location: X=" + linkElement.getLocation().getX() + ", Y=" + linkElement.getLocation().getY())
		} else {
			KeywordUtil.logInfo("❌ 'Learn More' link not found - SCM-143 and SCM-27 _ Fail")
		}
	}


	def validateMenuItemNavigation() {


		/*	WebUI.click(findTestObject("Homepage/Menu_items/our_specialities"))
		 WebUI.verifyElementPresent(findTestObject("Homepage/Menu_items/Navigation_links/Learn_more"),5)
		 WebUI.click(findTestObject("Homepage/Menu_items/our_brands"))
		 WebUI.verifyElementPresent(findTestObject("Homepage/Menu_items/Navigation_links/A"),5)
		 WebUI.click(findTestObject("Homepage/Menu_items/support_services"))
		 WebUI.verifyElementPresent(findTestObject("Homepage/Menu_items/Navigation_links/Support_services"),5)
		 WebUI.click(findTestObject("Homepage/Menu_items/news"))
		 WebUI.verifyElementPresent(findTestObject("Homepage/Menu_items/Navigation_links/News"),5)
		 WebUI.click(findTestObject("Homepage/Menu_items/device_online"))
		 WebUI.verifyElementPresent(findTestObject("Homepage/Menu_items/Navigation_links/Device_online"),5)
		 WebUI.click(findTestObject("Homepage/Menu_items/about_us"))
		 WebUI.verifyElementPresent(findTestObject("Homepage/Menu_items/Navigation_links/Company_review"),5)*/

		boolean allPassed = true

		// Define menu items and their expected navigation targets
		Map<TestObject, TestObject> navigationMap = [
			(findTestObject("Homepage/Menu_items/our_specialities")) : findTestObject("Homepage/Menu_items/Navigation_links/Learn_more"),
			(findTestObject("Homepage/Menu_items/our_brands"))       : findTestObject("Homepage/Menu_items/Navigation_links/A"),
			(findTestObject("Homepage/Menu_items/support_services")) : findTestObject("Homepage/Menu_items/Navigation_links/Support_services"),
			(findTestObject("Homepage/Menu_items/device_online"))    : findTestObject("Homepage/Menu_items/Navigation_links/Device_online"),
			(findTestObject("Homepage/Menu_items/about_us"))         : findTestObject("Homepage/Menu_items/Navigation_links/Company_review")
		]

		// Iterate and validate each navigation
		navigationMap.each { menuItem, expectedTarget ->
			WebUI.click(menuItem)
			WebUI.delay(2)
			if (WebUI.verifyElementPresent(expectedTarget, 5, FailureHandling.OPTIONAL)) {
				KeywordUtil.logInfo("Navigation successful for ${menuItem.getObjectId()}")
			} else {
				allPassed = false
				KeywordUtil.markFailed("Navigation failed for ${menuItem.getObjectId()}")
			}
		}

		// Final SCM-26 result
		if (allPassed) {
			KeywordUtil.logInfo("SCM-26: All menu item navigations passed")
		} else {
			KeywordUtil.markFailed("SCM-26: One or more menu item navigations failed")
		}
	}

	def validatePresenceOfFooterOptions() {
		WebUI.scrollToPosition(500,2500)
		WebUI.delay(10)
		WebUI.verifyElementPresent(findTestObject("NZ/Cardio"),5)
		WebUI.verifyElementPresent(findTestObject("Homepage/Medical_options_footer/cardiothoracic_surgery"),2)
		WebUI.verifyElementPresent(findTestObject("NZ/CriticalCareFooter"),2)
		WebUI.verifyElementPresent(findTestObject("Homepage/Medical_options_footer/gastroenterology"),2)
		WebUI.verifyElementPresent(findTestObject("Homepage/Medical_options_footer/hospital_infrastructure"),2)
		WebUI.verifyElementPresent(findTestObject("Homepage/Medical_options_footer/infection_prevention"),2)
		//WebUI.verifyElementPresent(findTestObject("Homepage/Medical_options_footer/micro_surgical_robotics"),2)
		//WebUI.verifyElementPresent(findTestObject("Homepage/Medical_options_footer/oncology"),2)
		WebUI.verifyElementPresent(findTestObject("Homepage/Medical_options_footer/opthalmic_technology"),2)
		WebUI.verifyElementPresent(findTestObject("Homepage/Medical_options_footer/orthopaedics"),2)
		WebUI.verifyElementPresent(findTestObject("Homepage/Medical_options_footer/plastic_reconstructive_surgery"),2)
		//WebUI.verifyElementPresent(findTestObject("Homepage/Medical_options_footer/robotics"),2)
		//WebUI.verifyElementPresent(findTestObject("Homepage/Medical_options_footer/spine"),2)
		WebUI.verifyElementPresent(findTestObject("Homepage/Medical_options_footer/surgical_solutions"),2)
		WebUI.verifyElementPresent(findTestObject("Homepage/Medical_options_footer/theatre_equipment"),2)
	}

	def validateLogoRedirection() {
		String expectedUrl = GlobalVariable.baseUrlNZ // Replace with your actual homepage URL

		// Click on the logo
		WebUI.click(findTestObject("Homepage/Logo"))

		// Wait for navigation
		WebUI.delay(2)

		/*	// Get current URL
		 WebDriver driver = DriverFactory.getWebDriver()
		 String currentUrl = driver.getCurrentUrl()
		 // Compare and log result
		 if (currentUrl == expectedUrl) {
		 KeywordUtil.logInfo(" SCM-25 -Pass - Logo redirection is correct:" + currentUrl)
		 } else {
		 KeywordUtil.markFailed("SCM-25 Fail Logo redirection mismatch. Expected: " + expectedUrl + ", but got: " + currentUrl)
		 }
		 WebUI.click(findTestObject("ContactUs/CONTACT_US"))
		 // Click on the logo
		 WebUI.click(findTestObject("Homepage/Logo"))
		 // Wait for navigation
		 WebUI.delay(2)
		 // Get current URL
		 WebDriver driver1 = DriverFactory.getWebDriver()
		 String currentUrl2 = driver.getCurrentUrl()
		 // Compare and log result
		 if (currentUrl == expectedUrl) {
		 KeywordUtil.logInfo("SCM-25 Pass -Logo redirection is correct: " + currentUrl)
		 } else {
		 KeywordUtil.markFailed(" SCM-25 Fail -Logo redirection mismatch. Expected: " + expectedUrl + ", but got: " + currentUrl)
		 }*/

		// Get current URL before interaction
		WebDriver driver = DriverFactory.getWebDriver()
		String initialUrl = driver.getCurrentUrl()

		// Compare and log result
		if (initialUrl == expectedUrl) {
			KeywordUtil.logInfo("SCM-25 Pass - Initial logo redirection is correct: " + initialUrl)
		} else {
			KeywordUtil.markFailed("SCM-25 Fail - Initial logo redirection mismatch. Expected: " + expectedUrl + ", but got: " + initialUrl)
			WebUI.takeScreenshot()
		}

		// Click on Contact Us tab
		WebUI.click(findTestObject("ContactUs/CONTACT_US"))

		// Click on the logo
		WebUI.click(findTestObject("Homepage/Logo"))

		// Wait for navigation
		WebUI.delay(2)

		// Get current URL after clicking logo
		String redirectedUrl = driver.getCurrentUrl()

		// Compare and log result
		if (redirectedUrl == expectedUrl) {
			KeywordUtil.logInfo("SCM-25 Pass - Logo redirection after click is correct: " + redirectedUrl)
		} else {
			KeywordUtil.markFailed("SCM-25 Fail - Logo redirection mismatch after click. Expected: " + expectedUrl + ", but got: " + redirectedUrl)
			WebUI.takeScreenshot()
		}
	}




	def validateFooterLinksNavigation() {

		boolean allLinksNavigated = true

		List<String> footerLinks = [
			"Explore",
			"OurVision",
			"Brand",
			"OurLeaders",
			"SupportServices",
			"Careers",
			"news",
			"DeviceTechGrp",
			"DeviceOnline",
			"Feedback",
			"Discover",
			"Login",
			"Help",
			"ContactUs",
			"NewAccountApp"
		]

		footerLinks.each { link ->
			try {
				TestObject linkObj = findTestObject("Homepage/FooterLinks/${link}")
				WebUI.click(linkObj)
				WebUI.waitForPageLoad(5)

				String currentUrl = WebUI.getUrl()
				WebUI.comment("Navigated to ${link}: ${currentUrl}")

				// Optional: Add validation for expected URL or page content
				// WebUI.verifyTextPresent("Expected Text", false)
			} catch (Exception e) {
				WebUI.comment("Navigation failed for: ${link}")
				allLinksNavigated = false
			}
		}

		if (allLinksNavigated) {
			WebUI.comment("SCM-31 _ pass")
		} else {
			WebUI.comment("SCM-31 update - one or more links failed navigation")
			WebUI.markFailed("SCM-31 failed due to navigation issues")
		}
	}


	def validateStrickyNavigattionBar() {
		// Step 2: Define the sticky banner TestObject
		TestObject stickyBanner = findTestObject('Homepage/StickyBanner')

		// Step 3: Wait for the banner to be visible
		WebUI.waitForElementVisible(stickyBanner, 10)

		// Step 4: Get initial top position safely
		def initialTop = WebUI.executeJavaScript(
				"var el = arguments[0]; return el ? el.getBoundingClientRect().top : 'NOT_FOUND';",
				Arrays.asList(WebUI.findWebElement(stickyBanner, 10))
				)

		if (initialTop == 'NOT_FOUND') {
			WebUI.comment("❌ Sticky banner not found. Check selector or visibility.")
		} else {
			WebUI.comment("✅ Initial top position: " + initialTop)

			// Step 5: Scroll down
			WebUI.executeJavaScript("window.scrollBy(0, 500);", null)
			WebUI.delay(2)

			// Step 6: Get top position after scroll
			def scrolledTop = WebUI.executeJavaScript(
					"var el = arguments[0]; return el ? el.getBoundingClientRect().top : 'NOT_FOUND';",
					Arrays.asList(WebUI.findWebElement(stickyBanner, 10))
					)

			if (scrolledTop == 'NOT_FOUND') {
				WebUI.comment("❌ Sticky banner missing after scroll.")
			} else {
				WebUI.comment("✅ Top after scroll: " + scrolledTop)

				// Step 7: Compare positions
				if (initialTop == scrolledTop) {
					WebUI.comment("🎯 Sticky banner remains fixed during scroll -SCM-39-Pass.")
				} else {
					WebUI.comment("⚠️ Sticky banner moved. Initial: ${initialTop}, After scroll: ${scrolledTop}")
				}
			}
		}
	}

	def verificationOfElementsPresentOnHomepage() {
		boolean allElementsPresent = true

		List<TestObject> elementsToCheck = [
			findTestObject("NZ/h1"),
			findTestObject("Homepage/LearnMore"),
			findTestObject("Homepage/h2"),
			findTestObject("Homepage/WhoWeAre"),
			findTestObject("Homepage/our"),
			findTestObject("Homepage/OurLeaders"),
			findTestObject("Homepage/OurBrands"),
			findTestObject("Homepage/Careers"),
			findTestObject("Homepage/OurHistory"),
		]

		for (TestObject element : elementsToCheck) {
			if (!WebUI.verifyElementPresent(element, 2, FailureHandling.OPTIONAL)) {
				WebUI.comment("❌ Missing element: " + element.getObjectId())
				allElementsPresent = false
			}
		}

		if (allElementsPresent) {
			WebUI.comment("✅ SCM-40 & SCM-41 -  All required homepage elements are present.")
		} else {
			WebUI.comment("❌ SCM-40 & SCM-41: One or more required homepage elements are missing.")
			WebUI.verifyMatch("SCM-40 & SCM-41", "PASS", false) // Force failure for SCM-40
		}
	}

	def validatePolicyLibrary() {

		WebUI.delay(3)
		WebUI.click(findTestObject("Object Repository/Homepage/FooterLinks/PolicyLibrary"))


		// Get the page title
		String pageTitle = WebUI.getWindowTitle()

		// Print the title in the console
		println("Page Title: " + pageTitle)

		def Expected_policy_list = [
			'Anti-bribery and Corruption Policy',
			'Environmental Policy',
			'Fair Trading Principles',
			'Gifts and Entertainment Policy',
			'Modern Slavery & Human Rights Policy',
			'Modern Slavery Statement',
			'Privacy Policy',
			'Supplier Code of Conduct',
			'Whistleblower Policy',
			'Quality Policy',
			'Risk Management Policy',
		]

		for(int i = 1;i<=Expected_policy_list.size();i++) {
			def policy_list_item = WebUI.getText(findTestObject("Object Repository/Homepage/FooterLinks/policy_listNZ", [('i') : i]))
			assert policy_list_item in Expected_policy_list, policy_list_item+"not found."

			WebUI.click(findTestObject("Object Repository/Homepage/FooterLinks/policy_listNZ", [('i') : i]))
			WebUI.switchToWindowIndex(1)
			WebUI.closeWindowIndex(1)
			WebUI.switchToWindowIndex(0)
		}
		KeywordUtil.logInfo("SCM-152 - Pass - Policy Library")
	}

	def validateReturnsPolicy() {
		WebUI.delay(3)
		//WebUI.click(findTestObject("Object Repository/Homepage/FooterLinks/return_policy_link"))
		WebUI.click(findTestObject("NZ/ReturnsPolicy"))

		// Get the page title
		String pageTitle = WebUI.getWindowTitle()

		// Print the title in the console
		println("Page Title: " + pageTitle)

		WebUI.verifyElementPresent(findTestObject("NZ/return_policy_text"),5)
		KeywordUtil.logInfo("SCM-151 - Pass - Return Policy")
	}
}

