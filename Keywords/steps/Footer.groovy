package steps

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

public class Footer {

	def validatePresenceOfFooterLinks() {

		/*	WebUI.verifyElementPresent(findTestObject("Homepage/FooterLinks/Explore"),5)
		 WebUI.verifyElementPresent(findTestObject("Homepage/FooterLinks/OurVision"),2)
		 WebUI.verifyElementPresent(findTestObject("Homepage/FooterLinks/Brand"),2)
		 WebUI.verifyElementPresent(findTestObject("Homepage/FooterLinks/OurLeaders"),2)
		 WebUI.verifyElementPresent(findTestObject("Homepage/FooterLinks/SupportServices"),2)
		 WebUI.verifyElementPresent(findTestObject("Homepage/FooterLinks/OurVision"),2)
		 WebUI.verifyElementPresent(findTestObject("Homepage/FooterLinks/Careers"),2)
		 WebUI.verifyElementPresent(findTestObject("Homepage/FooterLinks/news"),2)
		 WebUI.verifyElementPresent(findTestObject("Homepage/FooterLinks/DeviceTechGrp"),2)
		 WebUI.verifyElementPresent(findTestObject("Homepage/FooterLinks/DeviceOnline"),2)
		 WebUI.verifyElementPresent(findTestObject("Homepage/FooterLinks/Feedback"),2)
		 WebUI.verifyElementPresent(findTestObject("Homepage/FooterLinks/Discover"),2)
		 WebUI.verifyElementPresent(findTestObject("Homepage/FooterLinks/Login"),2)
		 WebUI.verifyElementPresent(findTestObject("Homepage/FooterLinks/Help"),2)
		 WebUI.verifyElementPresent(findTestObject("Homepage/FooterLinks/ContactUs"),2)
		 WebUI.verifyElementPresent(findTestObject("Homepage/FooterLinks/NewAccountApp"),2)*/

		boolean allLinksPresent = true

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
			"NewAccountApp",
			"Facebook",
			"Linkedin"
		]

		footerLinks.each { link ->
			try {
				WebUI.verifyElementPresent(findTestObject("Homepage/FooterLinks/${link}"), 2)
			} catch (Exception e) {
				WebUI.comment("Missing footer link: ${link}")
				allLinksPresent = false
			}
		}

		// Handle duplicate check for OurVision with longer timeout
		try {
			WebUI.verifyElementPresent(findTestObject("Homepage/FooterLinks/OurVision"), 5)
		} catch (Exception e) {
			WebUI.comment("OurVision link missing on extended check")
			allLinksPresent = false
		}

		// Final result logging
		if (allLinksPresent) {
			WebUI.comment("SCM-31 & SCM-32:Pass ")
		} else {
			WebUI.comment("SCM-31 update - one or more footer links missing")
			WebUI.markFailed("SCM-31 failed due to missing footer links")
		}
	}
}
