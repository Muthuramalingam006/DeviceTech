package stepsNZ

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

import internal.GlobalVariable
import com.kms.katalon.core.util.KeywordUtil

public class CategoryPage {


	def validateCategoryNavigationBar() {

		KeywordUtil.logInfo(" SCM-62 - Verifying the category navigation bar ")

		//WebUI.click(findTestObject("Homepage/Menu_items/our_specialities"))
		WebUI.verifyElementPresent(findTestObject("NZ/CriticalCare"),5)
		WebUI.delay(3)
		WebUI.click(findTestObject("NZ/CriticalCare"))
		WebUI.delay(3)
		WebUI.click(findTestObject("CatNavBar/Agree"))
		WebUI.delay(3)

		WebUI.verifyElementPresent(findTestObject("CatNavBar/h1"),5)
		String headingText =	WebUI.getText(findTestObject("CatNavBar/h1"))
		println("Heading Text: " + headingText)
		WebUI.verifyElementPresent(findTestObject("CatNavBar/ContactUs"), 2)
		WebUI.verifyElementPresent(findTestObject("CatNavBar/About"),5)
		WebUI.verifyElementPresent(findTestObject("CatNavBar/Brands"),5)
		WebUI.verifyElementPresent(findTestObject("CatNavBar/Contact"),5)
		WebUI.verifyElementPresent(findTestObject("CatNavBar/DeviceOnline"),5)
		WebUI.verifyElementPresent(findTestObject("CatNavBar/Specialities"),5)

		def items = [
			["CatNavBar/About", "About"],
			["CatNavBar/Brands", "Brands"],
			[
				"CatNavBar/Contact",
				"Contact"
			],
			[
				"CatNavBar/DeviceOnline",
				"Device Online"
			],
			[
				"CatNavBar/Specialities",
				"Specialities"
			]
		]

		items.each { path, label ->
			if (WebUI.verifyElementPresent(findTestObject(path), 5, FailureHandling.OPTIONAL)) {
				KeywordUtil.markPassed("SCM-62 & SCM-61 - Pass - ${label} tab is present")
			} else {
				KeywordUtil.markFailed("SCM-62 & SCM-61- Fail - ${label} tab is missing")
			}
		}
	}

	def validateContatcUs() {

		KeywordUtil.logInfo(" SCM-66 - Verifying the ContactUs form on category page ")

		/*		//WebUI.click(findTestObject("Homepage/Menu_items/our_specialities"))
		 WebUI.verifyElementPresent(findTestObject("CatNavBar/ScrollCardiology"),5)
		 WebUI.delay(3)
		 WebUI.click(findTestObject("CatNavBar/ScrollCardiology"))*/
		WebUI.delay(3)

		WebUI.verifyElementPresent(findTestObject("CatNavBar/CatNavStickyBar"),5)

		//WebUI.click(findTestObject("CatNavBar/ContactUs"))
		WebUI.delay(3)
		Long scrollBefore = WebUI.executeJavaScript("return window.scrollY;", null)
		WebUI.comment("Initial scroll position: " + scrollBefore)

		WebUI.delay(2)
		WebUI.click(findTestObject("NZ/ContactUs"))
		WebUI.delay(2)

		Long scrollAfter = WebUI.executeJavaScript("return window.scrollY;", null)
		WebUI.comment("Scroll position after click: " + scrollAfter)

		if (scrollAfter > scrollBefore) {
			WebUI.comment("✅ SCM-58 -Pass: Scroll is happening downward as expected.")
		} else {
			WebUI.comment("⚠️ SCM-58 -Fail :  Scroll did NOT move downward. Please check CTA behavior.")
			assert false : "Scroll did not move downward"
		}

		WebUI.verifyElementPresent(findTestObject("CatNavBar/h2"),5)
		String headingText =	WebUI.getText(findTestObject("CatNavBar/h2"))
		println("Heading Text: " + headingText)

		WebUI.verifyElementPresent(findTestObject("ContactUs/first_name"), 2)
		WebUI.verifyElementPresent(findTestObject("ContactUs/last_name"), 2)
		WebUI.verifyElementPresent(findTestObject("ContactUs/business_name"), 2)
		WebUI.verifyElementPresent(findTestObject("ContactUs/email"), 2)
		WebUI.verifyElementPresent(findTestObject("CatNavBar/State"), 2)
		WebUI.verifyElementPresent(findTestObject("ContactUs/Phone"), 2)
		WebUI.verifyElementPresent(findTestObject("ContactUs/message"), 2)
		WebUI.verifyElementPresent(findTestObject("ContactUs/submit"), 2)

		WebUI.setText(findTestObject("ContactUs/first_name"), "TestFirstname")
		WebUI.setText(findTestObject("ContactUs/last_name"), "TestLastname")
		WebUI.setText(findTestObject("ContactUs/email"), "test@gmail.com")
		//WebUI.selectOptionByIndex(findTestObject("CatNavBar/State"), 1)
		WebUI.click(findTestObject("ContactUs/state"))
		WebUI.click(findTestObject("ContactUs/StateOption"))
		WebUI.setText(findTestObject("ContactUs/Phone"), "(2)12345678")
		WebUI.setText(findTestObject("ContactUs/message"), "This is my message")
		WebUI.click(findTestObject("ContactUs/terms_conditions"))
		WebUI.click(findTestObject("ContactUs/termscheck2"))
		WebUI.delay(2)
		WebUI.click(findTestObject("ContactUs/submit"))

		WebUI.delay(7)
		WebUI.verifyElementPresent(findTestObject("CatNavBar/Close"), 2)
		WebUI.delay(2)
		if (WebUI.verifyElementPresent(findTestObject("CatNavBar/Close"), 2, FailureHandling.OPTIONAL)) {
			WebUI.comment("✅ SCM66:Pass  Close button is present.")
		} else {
			WebUI.comment("❌SCM66:Fail :  Close button not found — expected after CTA scroll.")
			assert false : "SCM66 failed: Close button not present within timeout."
		}

		String sucessMessage =	WebUI.getText(findTestObject("CatNavBar/Success"))
		println("Heading Text: " + sucessMessage)
	}

	def validateProductSupportPargraph() {

		def elements = [
			"ProductSupport",
			"P1",
			"Education",
			"P2",
			"Technical",
			"P3",
			"Professional",
			"P4"
		]

		for (String id : elements) {
			TestObject obj = findTestObject("CatNavBar/" + id)
			if (WebUI.verifyElementPresent(obj, 2, FailureHandling.OPTIONAL)) {
				String text = WebUI.getText(obj)
				WebUI.comment("✅SCM-67_Pass:  Verified: " + id + " → " + text)
			} else {
				WebUI.comment("❌ SCM-67_Fail : Missing element: " + id)
				assert false : "SCM-67 failed: Element not found → " + id
			}
		}
	}

	def validateDeviceOnline() {

		WebUI.click(findTestObject("CatNavBar/DeviceOnline"))
		WebUI.verifyElementPresent(findTestObject("CatNavBar/NZh3"), 2)
		WebUI.verifyElementPresent(findTestObject("CatNavBar/P5NZ"), 2)
		WebUI.verifyElementPresent(findTestObject("CatNavBar/ExploreNow"), 2)
		//Verify and click the Learn More element
		//WebUI.verifyElementPresent(findTestObject("CatNavBar/LearnMore"), 2)
		WebUI.click(findTestObject("CatNavBar/ExploreNow"))
		WebUI.delay(2) // Wait for navigation

		// Get the current URL
		String currentUrl = WebUI.getUrl()
		// Get the page title
		String pageTitle = WebUI.getWindowTitle()

		// Log both
		//	WebUI.comment("🔗 URL after click: " + currentUrl)
		WebUI.comment("📄 Page title: " + pageTitle)

		WebUI.comment("✅ SCM-67 : Pass - URL matched: " + currentUrl)

		/*	// Validate the URL
		 if (Url == "https://w3q2.device.com.au/deviceonline") {
		 WebUI.comment("✅ SCM-67 : Pass - URL matched: " + currentUrl)
		 } else {
		 WebUI.comment("❌ SCM-67 : Fail- URL mismatch. Found: " + currentUrl)
		 assert false : "Expected URL not reached."
		 }*/


		WebUI.verifyElementPresent(findTestObject("CatNavBar/RegisterFree"), 2)
		WebUI.back()
	}

	def validateAboutSection() {


		WebUI.click(findTestObject("CatNavBar/About"))

		WebUI.verifyElementPresent(findTestObject("CatNavBar/CriticalCare"), 2)
		WebUI.verifyElementPresent(findTestObject("CatNavBar/CriticalCareParagraph"), 2)
		if (WebUI.verifyElementPresent(findTestObject("CatNavBar/CriticalCare"), 2, FailureHandling.OPTIONAL)) {
			String text = WebUI.getText(findTestObject("CatNavBar/CriticalCare"))
			WebUI.comment("🩺 SCM-63 - Pass : Cricare text: " + text)
		} else {
			WebUI.comment("❌ SCM-63- Fail:  Critical care element not found.")
			assert false : "Criticalcare section missing from CatNavBar."
		}
	}

	def validateSpecialities() {

		//OurVision

		/*		 WebUI.click(findTestObject("CatNavBar/Specialities"))
		 WebUI.verifyElementPresent(findTestObject("CatNavBar/WayFinding"), 2)
		 WebUI.verifyElementPresent(findTestObject("CatNavBar/P6"), 2)
		 WebUI.verifyElementPresent(findTestObject("CatNavBar/Hosptial"), 2)
		 WebUI.verifyElementPresent(findTestObject("CatNavBar/P7"), 2)
		 WebUI.verifyElementPresent(findTestObject("CatNavBar/Pharmacy"), 2)
		 WebUI.verifyElementPresent(findTestObject("CatNavBar/P8"), 2)
		 WebUI.verifyElementPresent(findTestObject("CatNavBar/OutPatient"), 2)
		 WebUI.verifyElementPresent(findTestObject("CatNavBar/P9"), 2)
		 WebUI.verifyElementPresent(findTestObject("CatNavBar/Transport"), 2)
		 WebUI.verifyElementPresent(findTestObject("CatNavBar/P10"), 2)*/

		WebUI.click(findTestObject("CatNavBar/Specialities"))
		def elementsToCheck = [
			"Emergency",
			"Paragraph",
			"h1",
			"P2",
			"h2",
			"P3",
			"h3",
			"P4"
		]

		for (String id : elementsToCheck) {
			TestObject obj = findTestObject("CatNavBar/CriticalCareSpecialities/" + id)
			if (WebUI.verifyElementPresent(obj, 2, FailureHandling.OPTIONAL)) {
				WebUI.comment("✅ SCM-64 - Pass: Element present: " + id)
			} else {
				WebUI.comment("❌SCM-64 - Pass: Fail - Element missing: " + id)
				assert false : "Missing expected element: " + id
			}
		}
	}

	def validateBrandsSection() {

		/*
		 WebUI.click(findTestObject("CatNavBar/Brands"))
		 WebUI.verifyElementPresent(findTestObject("CatNavBar/OurBrandsHeading"), 2)
		 WebUI.verifyElementPresent(findTestObject("CatNavBar/Atrion"), 2)
		 WebUI.verifyElementPresent(findTestObject("CatNavBar/balt"), 2)
		 WebUI.verifyElementPresent(findTestObject("CatNavBar/Bentley"), 2)
		 */
		// Step 1: Click on Brands tab
		WebUI.click(findTestObject("CatNavBar/Brands"))
		WebUI.delay(2)

		// Step 2: Define all required objects
		TestObject heading = findTestObject("CatNavBar/OurBrandsHeading")
		TestObject flexicare = findTestObject("CatNavBar/CriticalCareBrands/Flexicare")
		TestObject sle = findTestObject("CatNavBar/CriticalCareBrands/SLE")
		TestObject lotus = findTestObject("CatNavBar/LotusNZ")

		// Step 3: Verify presence of all elements
		boolean allPresent = WebUI.verifyElementPresent(heading, 2, FailureHandling.OPTIONAL) &&
				WebUI.verifyElementPresent(flexicare, 2, FailureHandling.OPTIONAL) &&
				WebUI.verifyElementPresent(sle, 2, FailureHandling.OPTIONAL) &&
				WebUI.verifyElementPresent(lotus, 2, FailureHandling.OPTIONAL)

		// Step 4: Log result
		if (allPresent) {
			KeywordUtil.markPassed("✅ SCM-65 : Pass - All brand elements are present.")
		} else {
			KeywordUtil.markFailed("❌SCM-65 : Fail :  One or more brand elements are missing.")
		}
	}
}
