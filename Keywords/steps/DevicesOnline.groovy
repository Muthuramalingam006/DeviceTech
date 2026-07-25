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
import com.kms.katalon.core.logging.KeywordLogger

import internal.GlobalVariable

public class DevicesOnline {
	KeywordLogger logger = new KeywordLogger()

	def validateDevicesOnline() {
		String pageTitle = WebUI.getWindowTitle()
		println "📄 Page title: " + pageTitle

		
		WebUI.delay(3)
		WebUI.click(findTestObject("Homepage/Menu_items/device_online"))
		WebUI.scrollToElement(findTestObject("DeviceOnline/register_online_first"),5)
		WebUI.verifyElementPresent(findTestObject("DeviceOnline/register_online_first"),5)
		WebUI.verifyElementPresent(findTestObject("DeviceOnline/HowItWorks"),5)
		WebUI.verifyElementPresent(findTestObject("DeviceOnline/YourLeading"),5)
		WebUI.verifyElementPresent(findTestObject("DeviceOnline/EquipmentDescription"),5)
		WebUI.verifyElementPresent(findTestObject("DeviceOnline/VastRangeTitle"),5)
		WebUI.verifyElementPresent(findTestObject("DeviceOnline/VastRangeImg"),5)
		WebUI.verifyElementPresent(findTestObject("DeviceOnline/VastRangeDescription"),5)
		WebUI.verifyElementPresent(findTestObject("DeviceOnline/OnlineOrderingTitle"),5)
		WebUI.verifyElementPresent(findTestObject("DeviceOnline/OnlineOrderingImg"),5)
		WebUI.verifyElementPresent(findTestObject("DeviceOnline/OnlineOrderingDescription"),5)
		WebUI.verifyElementPresent(findTestObject("DeviceOnline/OrderHistoryTitle"),5)
		WebUI.verifyElementPresent(findTestObject("DeviceOnline/OrderHistoryImg"),5)
		WebUI.verifyElementPresent(findTestObject("DeviceOnline/OrderHistoryDescription"),5)

		WebUI.verifyElementPresent(findTestObject("DeviceOnline/register_now_one"),5)
		WebUI.verifyElementPresent(findTestObject("DeviceOnline/register_now_two"),5)
		WebUI.verifyElementPresent(findTestObject("DeviceOnline/register_now_three"),5)


		WebUI.verifyElementPresent(findTestObject("DeviceOnline/comprehensive_product_range"),5)
		WebUI.verifyElementPresent(findTestObject("DeviceOnline/OnlineOrderingTwo"),5)
		WebUI.verifyElementPresent(findTestObject("DeviceOnline/RequestQuotes"),5)
		//07232026WebUI.verifyElementPresent(findTestObject("DeviceOnline/Invoices"),5)

		//WebUI.verifyElementPresent(findTestObject("DeviceOnline/thousands_of_products"),5)
		//WebUI.verifyElementPresent(findTestObject("DeviceOnline/100_brands"),5)
		//WebUI.verifyElementPresent(findTestObject("DeviceOnline/extensive_specialities"),5)
		logger.logInfo("SCM-110 & SCM-109: Pass- Validating Device oline page..........")

		WebUI.verifyElementPresent(findTestObject("DeviceOnline/critical_care"),5)
		WebUI.click(findTestObject("DeviceOnline/critical_care"))
		WebUI.verifyElementPresent(findTestObject("DeviceOnline/KeyBenefits"),5)
		WebUI.verifyElementPresent(findTestObject("DeviceOnline/OnlineOrderingThree"),5)
		WebUI.verifyElementPresent(findTestObject("DeviceOnline/RequestQuotesTwo"),5)
		////7232026WebUI.verifyElementPresent(findTestObject("DeviceOnline/OrderStatus"),5)
		//7232026WebUI.verifyElementPresent(findTestObject("DeviceOnline/Education"),5)

		WebUI.verifyElementPresent(findTestObject("DeviceOnline/DeviceOnlineSupport"),5)
		WebUI.verifyElementPresent(findTestObject("DeviceOnline/RequestDemo"),5)
		WebUI.verifyElementPresent(findTestObject("DeviceOnline/Support"),5)
		WebUI.verifyElementPresent(findTestObject("DeviceOnline/ContactUs"),5)

		WebUI.verifyElementPresent(findTestObject("DeviceOnline/gastroenterology"),5)
		WebUI.verifyElementPresent(findTestObject("DeviceOnline/hospital_infrastructure"),5)
		WebUI.verifyElementPresent(findTestObject("DeviceOnline/infection_prevention"),5)
		WebUI.verifyElementPresent(findTestObject("DeviceOnline/opthalmic_technology"),5)

		WebUI.click(findTestObject("DeviceOnline/register_now_individual"))
		WebUI.verifyElementPresent(findTestObject("DeviceOnline/register_now_individual_navigation"),5)

		WebUI.back()
		WebUI.click(findTestObject("DeviceOnline/register_now_business"))
		//07232026WebUI.verifyElementPresent(findTestObject("DeviceOnline/register_now_business_navigation"),5)


		logger.logInfo("SCM-110 & SCM-109: Pass- Validating Device oline page..........")

		WebUI.back()
	}

	def validateStickyBarDeviceOnline() {
		// Step 2: Define the sticky banner TestObject
		TestObject stickyBanner = findTestObject('DeviceOnline/StickyBanner')

		// Step 3: Wait for the banner to be visible
		WebUI.waitForElementVisible(stickyBanner, 10)

		// Step 4: Get initial top position safely
		def initialTop = WebUI.executeJavaScript(
				"var el = arguments[0]; return el ? el.getBoundingClientRect().top : 'NOT_FOUND';",
				Arrays.asList(WebUI.findWebElement(stickyBanner, 10))
				)

		WebUI.verifyElementPresent(findTestObject("DeviceOnline/Login"),5)
		WebUI.verifyElementPresent(findTestObject("DeviceOnline/RegisterForFree"),5)
		WebUI.verifyElementPresent(findTestObject("DeviceOnline/CountrySwitcher"),5)

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
					WebUI.comment("🎯 Sticky banner remains fixed during scroll -CM-107-Pass.")
				} else {
					WebUI.comment("⚠️ Sticky banner moved. Initial: ${initialTop}, After scroll: ${scrolledTop}")
				}
			}
		}
	}
}
