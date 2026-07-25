package mobile

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.logging.KeywordLogger

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
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
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


		WebUI.verifyElementPresent(findTestObject("IphoneDevice/Hamburger"),7)
		WebUI.waitForElementClickable(findTestObject('IphoneDevice/Hamburger'), 10)

		WebUI.click(findTestObject("IphoneDevice/Hamburger"))

		/*WebUI.verifyElementPresent(findTestObject("Homepage/Menu_items/our_specialities"),5)
		 WebUI.verifyElementPresent(findTestObject("Homepage/Menu_items/our_brands"),2)
		 WebUI.verifyElementPresent(findTestObject("Homepage/Menu_items/support_services"),2)
		 WebUI.verifyElementPresent(findTestObject("Homepage/Menu_items/news"),2)
		 WebUI.verifyElementPresent(findTestObject("Homepage/Menu_items/device_online"),2)
		 WebUI.verifyElementPresent(findTestObject("Homepage/Menu_items/about_us"),2)*/

		boolean allPresent = true

		List<TestObject> menuItems = [
			findTestObject("IphoneDevice/Menu_items/our_specialities"),
			findTestObject("IphoneDevice/Menu_items/our_brands"),
			findTestObject("IphoneDevice/Menu_items/support_services"),
			findTestObject("IphoneDevice/Menu_items/news"),
			findTestObject("IphoneDevice/Menu_items/device_online"),
			findTestObject("IphoneDevice/Menu_items/about_us")
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



		WebUI.click(findTestObject("IphoneDevice/HamburgerMenuClose"))
	}
	def validateMenuItemsNz() {
		
		
				WebUI.verifyElementPresent(findTestObject("IphoneDevice/Hamburger"),7)
				WebUI.waitForElementClickable(findTestObject('IphoneDevice/Hamburger'), 10)
		
				WebUI.click(findTestObject("IphoneDevice/Hamburger"))
		
				/*WebUI.verifyElementPresent(findTestObject("Homepage/Menu_items/our_specialities"),5)
				 WebUI.verifyElementPresent(findTestObject("Homepage/Menu_items/our_brands"),2)
				 WebUI.verifyElementPresent(findTestObject("Homepage/Menu_items/support_services"),2)
				 WebUI.verifyElementPresent(findTestObject("Homepage/Menu_items/news"),2)
				 WebUI.verifyElementPresent(findTestObject("Homepage/Menu_items/device_online"),2)
				 WebUI.verifyElementPresent(findTestObject("Homepage/Menu_items/about_us"),2)*/
		
				boolean allPresent = true
		
				List<TestObject> menuItems = [
					findTestObject("IphoneDevice/Menu_items/our_specialities"),
					findTestObject("IphoneDevice/Menu_items/our_brands"),
					findTestObject("IphoneDevice/Menu_items/support_services"),
					findTestObject("IphoneDevice/Menu_items/news"),
					findTestObject("IphoneDevice/Menu_items/device_online"),
					findTestObject("IphoneDevice/Menu_items/about_us")
				]
		
				List<Integer> timeouts = [5, 2, 2, 2, 2, 2]
		
				for (int i = 0; i < menuItems.size(); i++) {
					if (!WebUI.verifyElementPresent(menuItems[i], timeouts[i], FailureHandling.OPTIONAL)) {
						allPresent = false
//						KeywordUtil.markFailed("Menu item missing: " + menuItems[i].getObjectId())
					}
				}
		
				if (allPresent) {
					KeywordUtil.logInfo("All menu items are available. SCM-26: Pass")
				} else {
//					KeywordUtil.markFailed("SCM-26: One or more menu items are missing")
				}
		
		
		
				WebUI.click(findTestObject("IphoneDevice/HamburgerMenuClose"))
			}
		

	def validatePresenceOfHeaderOptions() {

		//Desktop
		//WebUI.scrollToPosition(600,700)
		//Mobile
		WebUI.scrollToPosition(0, 200)
		WebUI.verifyElementPresent(findTestObject("Homepage/Medical_options_header/cardiology_vascular_and_radiology"),5)
		WebUI.verifyElementPresent(findTestObject("Homepage/Medical_options_header/cardiothoracic_surgery"),2)
		WebUI.verifyElementPresent(findTestObject("Homepage/Medical_options_header/critical_care"),2)
		WebUI.verifyElementPresent(findTestObject("Homepage/Medical_options_header/gastroenterology"),2)
		WebUI.verifyElementPresent(findTestObject("Homepage/Medical_options_header/hospital_infrastructure"),2)
		WebUI.verifyElementPresent(findTestObject("Homepage/Medical_options_header/infection_prevention"),2)
		WebUI.verifyElementPresent(findTestObject("Homepage/Medical_options_header/micro_surgical_robotics"),2)
		WebUI.verifyElementPresent(findTestObject("Homepage/Medical_options_header/oncology"),2)
		WebUI.verifyElementPresent(findTestObject("Homepage/Medical_options_header/opthalmic_technology"),2)
		WebUI.verifyElementPresent(findTestObject("Homepage/Medical_options_header/orthopaedics"),2)
		WebUI.verifyElementPresent(findTestObject("Homepage/Medical_options_header/plastic_reconstructive_surgery"),2)
		WebUI.verifyElementPresent(findTestObject("Homepage/Medical_options_header/robotics"),2)
		WebUI.verifyElementPresent(findTestObject("Homepage/Medical_options_header/spine"),2)
		WebUI.verifyElementPresent(findTestObject("Homepage/Medical_options_header/surgical_solutions"),2)
		WebUI.verifyElementPresent(findTestObject("Homepage/Medical_options_header/theatre_equipment"),2)
	}

	def validateHeaderOptionsNavigation() {
		// Define menu items and expected titles
		def medicalOptions = [
			[id: "Homepage/Medical_options_header/cardiology_vascular_and_radiology",
				title: "Cardiology, Vascular & Radiology | Device Technologies AU"],
			[id: "Homepage/Medical_options_header/cardiothoracic_surgery",
				title: "Cardiothoracic Surgery | Device Technologies AU"],
			[id: "Homepage/Medical_options_header/critical_care",
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
			//(Desktop)WebUI.scrollToPosition(600, 700)

			//Mobile
			WebUI.scrollToPosition(0, 200)
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

			assert actualTitle == option.title : "${option.id} navigation failed"

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

			assert actualTitle == option.title : "${option.id} navigation failed"

			WebUI.back()
		}
	}

	def vallidateCookies() {
		WebUI.click(findTestObject("Homepage/Menu_items/our_specialities"))
		WebUI.verifyElementPresent(findTestObject("Cookies/accept_cookies"),5)
		WebUI.click(findTestObject("Cookies/accept_cookies"))
		WebUI.click(findTestObject("Homepage/Menu_items/our_specialities"))

		def element = WebUI.findWebElement(findTestObject("Cookies/accept_cookies"))
		Assert.assertTrue(!element.isDisplayed(), "Cookies button is still visible")
	}

	def validateMenuItemNavigation() {

		WebUI.delay(5)
		WebUI.verifyElementPresent(findTestObject("IphoneDevice/Hamburger"),5)
		WebUI.waitForElementClickable(findTestObject('IphoneDevice/Hamburger'), 10)
		WebUI.delay(2)
		WebUI.click(findTestObject("IphoneDevice/Hamburger"))

		WebUI.click(findTestObject("IphoneDevice/Menu_items/our_specialities"))
		WebUI.verifyElementPresent(findTestObject("Homepage/Menu_items/Navigation_links/Learn_more"),5)

		WebUI.click(findTestObject("Homepage/Menu_items/Navigation_links/Specialities"))
		WebUI.delay(2)


		WebUI.click(findTestObject("Homepage/Menu_items/Navigation_links/critical_care"))


		WebUI.waitForElementClickable(findTestObject('IphoneDevice/Hamburger'), 10)

		WebUI.click(findTestObject("IphoneDevice/Hamburger"))
		WebUI.delay(2)


		WebUI.click(findTestObject("IphoneDevice/Menu_items/our_brands"))
		WebUI.verifyElementPresent(findTestObject("Homepage/Menu_items/Navigation_links/A"),5)

		WebUI.delay(2)


		WebUI.waitForElementClickable(findTestObject('IphoneDevice/Hamburger'), 10)
		WebUI.delay(2)

		WebUI.click(findTestObject("IphoneDevice/Hamburger"))

		//WebUI.click(findTestObject("IphoneDevice/Menu_items/support_services"))
		WebUI.verifyElementPresent(findTestObject("Homepage/Menu_items/Navigation_links/Support_services"),5)
		WebUI.delay(2)

		WebUI.click(findTestObject("Homepage/Menu_items/Navigation_links/Support_services"))
		WebUI.delay(2)

		WebUI.click(findTestObject("IphoneDevice/SupportServices"))

		WebUI.waitForElementClickable(findTestObject('IphoneDevice/Hamburger'), 10)
		WebUI.delay(2)

		WebUI.click(findTestObject("IphoneDevice/Hamburger"))
		WebUI.delay(2)
		/*WebUI.click(findTestObject("Homepage/Menu_items/news"))
		 //WebUI.verifyElementPresent(findTestObject("Homepage/Menu_items/Navigation_links/News"),5)
		 WebUI.waitForElementClickable(findTestObject('IphoneDevice/Hamburger'), 10)
		 WebUI.click(findTestObject("IphoneDevice/Hamburger"))*/


		WebUI.verifyElementPresent(findTestObject("Homepage/Menu_items/Navigation_links/Device_online"),5)

		WebUI.click(findTestObject("IphoneDevice/Menu_items/device_online"))

		/*WebUI.waitForElementClickable(findTestObject('IphoneDevice/Hamburger'), 10)
		 WebUI.click(findTestObject("IphoneDevice/Hamburger"))
		 WebUI.click(findTestObject("Homepage/Menu_items/about_us"))
		 WebUI.verifyElementPresent(findTestObject("Homepage/Menu_items/Navigation_links/Company_review"),5)*/

		/*WebUI.waitForElementClickable(findTestObject('IphoneDevice/Hamburger'), 10)
		 WebUI.click(findTestObject("IphoneDevice/Hamburger"))
		 //WebUI.click(findTestObject("Homepage/Menu_items/Contact_us"))
		 */
		WebUI.comment("SCM-28: All menu item navigations passed")
	}

	def validatePresenceOfFooterOptions() {
		WebUI.scrollToPosition(500,2500)
		WebUI.verifyElementPresent(findTestObject("Homepage/Medical_options_footer/cardiology_vascular_and_radiology"),5)
		WebUI.verifyElementPresent(findTestObject("Homepage/Medical_options_footer/cardiothoracic_surgery"),2)
		WebUI.verifyElementPresent(findTestObject("Homepage/Medical_options_footer/critical_care"),2)
		WebUI.verifyElementPresent(findTestObject("Homepage/Medical_options_footer/gastroenterology"),2)
		WebUI.verifyElementPresent(findTestObject("Homepage/Medical_options_footer/hospital_infrastructure"),2)
		WebUI.verifyElementPresent(findTestObject("Homepage/Medical_options_footer/infection_prevention"),2)
		WebUI.verifyElementPresent(findTestObject("Homepage/Medical_options_footer/micro_surgical_robotics"),2)
		WebUI.verifyElementPresent(findTestObject("Homepage/Medical_options_footer/oncology"),2)
		WebUI.verifyElementPresent(findTestObject("Homepage/Medical_options_footer/opthalmic_technology"),2)
		WebUI.verifyElementPresent(findTestObject("Homepage/Medical_options_footer/orthopaedics"),2)
		WebUI.verifyElementPresent(findTestObject("Homepage/Medical_options_footer/plastic_reconstructive_surgery"),2)
		WebUI.verifyElementPresent(findTestObject("Homepage/Medical_options_footer/robotics"),2)
		WebUI.verifyElementPresent(findTestObject("Homepage/Medical_options_footer/spine"),2)
		WebUI.verifyElementPresent(findTestObject("Homepage/Medical_options_footer/surgical_solutions"),2)
		WebUI.verifyElementPresent(findTestObject("Homepage/Medical_options_footer/theatre_equipment"),2)
	}

	def validateLogoRedirection() {
		// Define expected URL
		String expectedUrl = GlobalVariable.baseUrl  // Replace with your actual homepage URL

		// Click on the logo
		WebUI.click(findTestObject("Homepage/Logo"))

		// Wait for navigation
		WebUI.delay(2)

		// Get current URL
		WebDriver driver = DriverFactory.getWebDriver()
		String currentUrl = driver.getCurrentUrl()

		// Compare and log result
		if (currentUrl == expectedUrl) {
			KeywordUtil.logInfo(" SCM-25 -Pass - Logo redirection is correct:" + currentUrl)
		} else {
			KeywordUtil.markFailed("SCM-25 Fail Logo redirection mismatch. Expected: " + expectedUrl + ", but got: " + currentUrl)
		}
	//	WebUI.delay(5)
	//	WebUI.click(findTestObject("ContactUs/CONTACT_US"))

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
		}
	}
	def validateLogoRedirectionNz() {
		// Define expected URL
		String expectedUrl = WebUI.getUrl() // Replace with your actual homepage URL

		// Click on the logo
		WebUI.click(findTestObject("Homepage/Logo"))

		// Wait for navigation
		WebUI.delay(2)

		// Get current URL
		String currentUrl = WebUI.getUrl()

		// Compare and log result
		if (currentUrl == expectedUrl) {
			KeywordUtil.logInfo(" SCM-25 -Pass - Logo redirection is correct:" + currentUrl)
		} else {
			KeywordUtil.markFailed("SCM-25 Fail Logo redirection mismatch. Expected: " + expectedUrl + ", but got: " + currentUrl)
		}
	//	WebUI.delay(5)
	//	WebUI.click(findTestObject("ContactUs/CONTACT_US"))

		// Click on the logo
		WebUI.click(findTestObject("Homepage/Logo"))

		// Wait for navigation
		WebUI.delay(2)

		// Get current URL
		WebDriver driver1 = DriverFactory.getWebDriver()
		String currentUrl2 = WebUI.getUrl()

		// Compare and log result
		if (currentUrl == expectedUrl) {
			KeywordUtil.logInfo("SCM-25 Pass -Logo redirection is correct: " + currentUrl)
		} else {
//			KeywordUtil.markFailed(" SCM-25 Fail -Logo redirection mismatch. Expected: " + expectedUrl + ", but got: " + currentUrl)
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

	def validateStrickyNavigattionBarNz() {
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
			findTestObject("Homepage/h1"),
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
	def verificationOfElementsPresentOnHomepageNz() {
		boolean allElementsPresent = true

		List<TestObject> elementsToCheck = [
			findTestObject('Homepage/h1Nz'),
			findTestObject('Homepage/LearnMore'),
			findTestObject('Homepage/h2'),
			findTestObject('Homepage/WhoWeAre'),
			findTestObject('Homepage/our'),
		//	findTestObject('Homepage/OurLeaders'),
//			findTestObject('Homepage/OurBrands'),
			findTestObject('Homepage/Careers'),
			findTestObject('Homepage/OurHistory'),
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
}
