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

import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.util.KeywordUtil

import internal.GlobalVariable

public class ContactUs {

	def validateContent() {

		WebUI.click(findTestObject("ContactUs/CONTACT_US"))
		WebUI.verifyElementPresent(findTestObject("ContactUs/customer_service"),2)
		WebUI.verifyElementPresent(findTestObject("ContactUs/technical_service"),2)
		WebUI.verifyElementPresent(findTestObject("ContactUs/distribution_enquiries"),2)
		WebUI.verifyElementPresent(findTestObject("ContactUs/media_enquiries"),2)
		WebUI.verifyElementPresent(findTestObject("ContactUs/first_name"),2)
		WebUI.verifyElementPresent(findTestObject("ContactUs/last_name"),2)
		WebUI.verifyElementPresent(findTestObject("ContactUs/business_name"),2)
		WebUI.verifyElementPresent(findTestObject("ContactUs/email"),2)
		WebUI.verifyElementPresent(findTestObject("ContactUs/state"),2)
		WebUI.verifyElementPresent(findTestObject("ContactUs/Phone"),2)
		WebUI.verifyElementPresent(findTestObject("ContactUs/message"),2)
		WebUI.verifyElementPresent(findTestObject("ContactUs/submit"),2)
		WebUI.verifyElementPresent(findTestObject("ContactUs/new_south_wales"),2)
		WebUI.verifyElementPresent(findTestObject("ContactUs/victoria"),2)
		WebUI.verifyElementPresent(findTestObject("ContactUs/queensland"),2)
		WebUI.verifyElementPresent(findTestObject("ContactUs/western_australia"),2)
		WebUI.verifyElementPresent(findTestObject("ContactUs/south_australia"),2)

		WebUI.verifyElementPresent(findTestObject("ContactUs/new_south_wales_subheading"),2)
		WebUI.verifyElementPresent(findTestObject("ContactUs/victoria_subheading"),2)
		WebUI.verifyElementPresent(findTestObject("ContactUs/queensland_subheading"),2)
		WebUI.verifyElementPresent(findTestObject("ContactUs/western_australia_subheading"),2)
		WebUI.verifyElementPresent(findTestObject("ContactUs/south_australia_subheading"),2)
		WebUI.verifyElementPresent(findTestObject("ContactUs/south_australia_subheading"),2)
	}

	def validateMapAddress() {

		/*	// Dynamically define address element
		 TestObject addressText = new TestObject()
		 addressText.addProperty("xpath", ConditionType.CONTAINS, "//*[contains(text(),'1 Garigal Road,')]")
		 // Dynamically define map container //div[@aria-label='Map']
		 TestObject mapContainer = new TestObject()
		 mapContainer.addProperty("xpath", ConditionType.EQUALS, "//div[@aria-label='Map']")
		 // Validate address visibility //
		 boolean addressVisible = WebUI.verifyElementVisible(addressText, FailureHandling.CONTINUE_ON_FAILURE)
		 boolean mapVisible = WebUI.verifyElementVisible(mapContainer, FailureHandling.CONTINUE_ON_FAILURE)
		 // Log results
		 if (addressVisible && mapVisible) {
		 println "✅ Address and map are both visible and correctly embedded"
		 } else {
		 KeywordUtil.markWarning("⚠️ Either the address or map is missing or not visible")
		 }
		 //WebUI.executeJavaScript("map.setZoom(15);", null)
		 //WebUI.switchToFrame(findTestObject("(//iframe[@aria-hidden='true'])[1]"), 10)
		 TestObject mapIframe = new TestObject()
		 mapIframe.addProperty("xpath", ConditionType.EQUALS, "(//iframe[@aria-hidden='true'])[1]")
		 WebUI.switchToFrame(mapIframe, 10)
		 WebUI.comment(" switched Iframe ")
		 TestObject mapCameraButton = new TestObject().addProperty("xpath", ConditionType.EQUALS, "(//button[@aria-label='Map camera controls'])[1]/..")
		 WebUI.verifyElementPresent(mapCameraButton, 2)
		 WebUI.click(mapCameraButton)
		 TestObject zoomInButton = new TestObject().addProperty("xpath", ConditionType.EQUALS, "(//button[@title='Zoom in'])[1]")
		 TestObject zoomOutButton = new TestObject().addProperty("xpath", ConditionType.EQUALS, "(//button[@title='Zoom out'])[1]")
		 WebUI.click(zoomInButton)
		 WebUI.click(zoomOutButton)*/
		// Step 1: Validate address visibility
		boolean addressVisible = WebUI.verifyElementVisible(findTestObject('ContactUs/new_south_wales'), FailureHandling.CONTINUE_ON_FAILURE)

		// Step 2: Validate map container visibility
		boolean mapVisible = WebUI.verifyElementVisible(findTestObject('ContactUs/Map'), FailureHandling.CONTINUE_ON_FAILURE)

		// Step 3: Log results
		if (addressVisible && mapVisible) {
			println "✅ Address and map are both visible and correctly embedded"
		} else {
			KeywordUtil.markWarning("⚠️ Either the address or map is missing or not visible")
		}

		/*// Step 4: Switch to map iframe
		 WebUI.switchToFrame(findTestObject('ContactPage/MapIframe'), 10)
		 WebUI.comment("✅ Switched to map iframe")*/

		// Step 5: Click map camera controls
		WebUI.verifyElementPresent(findTestObject('ContactUs/Controller'), 2)
		WebUI.click(findTestObject('ContactUs/Controller'))

		// Step 6: Zoom in and out
		WebUI.click(findTestObject('ContactUs/ZoomIn'))
		WebUI.click(findTestObject('ContactUs/ZoomOut'))

		try {
			// Zoom In
			WebUI.click(findTestObject('ContactUs/ZoomIn'))
			println "✅ Zoom In clicked"

			// Zoom Out
			WebUI.click(findTestObject('ContactUs/ZoomOut'))
			println "✅ Zoom Out clicked"

			// If both clicks succeed
			KeywordUtil.markPassed("✅ SCM-54 & SCM-55 passed: Zoom In and Zoom Out successful")
		} catch (Exception e) {
			// If either fails
			KeywordUtil.markFailed("❌ SCM-54 & SCM-55 failed: Zoom interaction unsuccessful\n" + e.message)
		}
	}

	def validateFormSubmission() {

		WebUI.click(findTestObject("ContactUs/CONTACT_US"))
		WebUI.setText(findTestObject("ContactUs/first_name"),"TestFirstname")
		WebUI.setText(findTestObject("ContactUs/last_name"),"TestLastname")
		WebUI.setText(findTestObject("ContactUs/email"),"test@gmail.com")
		//WebUI.selectOptionByIndex(findTestObject("ContactUs/state"),1)
		WebUI.click(findTestObject("ContactUs/state"))
		WebUI.click(findTestObject("ContactUs/StateOption"))
		WebUI.setText(findTestObject("ContactUs/Phone"),"(2)12345678")
		WebUI.setText(findTestObject("ContactUs/message"),"This is my message")
		WebUI.click(findTestObject("ContactUs/terms_conditions"))
		WebUI.click(findTestObject("ContactUs/termscheck2"))
		WebUI.delay(2)
		WebUI.click(findTestObject("ContactUs/submit"))

		//println "✅ SCM-46 - Pass:  Enquired Scuessfully"
		
		WebUI.delay(7)
		WebUI.verifyElementPresent(findTestObject("CatNavBar/Close"), 2)
		WebUI.delay(2)
		if (WebUI.verifyElementPresent(findTestObject("CatNavBar/Close"), 2, FailureHandling.OPTIONAL)) {
			WebUI.comment("✅ SCM46:Pass  Close button is present.")
		} else {
			WebUI.comment("❌SCM46:Fail :  Close button not found — expected after CTA scroll.")
			assert false : "SCM46 failed: Close button not present within timeout."
		}

		String sucessMessage =	WebUI.getText(findTestObject("CatNavBar/Success"))
		println("Heading Text: " + sucessMessage)
	}
}
