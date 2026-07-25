package steps

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.util.KeywordUtil

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
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable
import org.openqa.selenium.WebDriver

public class Login {

	WebDriver driver;

	def login(String username, String password) {
		driver = DriverFactory.getWebDriver()

		/*WebUI.click(findTestObject("Login/device_online_login"))
		 def wHandles = driver.getWindowHandles()*/

		// Capture window handles before click
		def beforeClickHandles = driver.getWindowHandles()

		WebUI.click(findTestObject("Login/device_online_login"))

		// Wait briefly to allow new tab to open
		WebUI.delay(2)

		// Capture window handles after click
		def afterClickHandles = driver.getWindowHandles()

		// Check if a new tab was opened
		if (afterClickHandles.size() > beforeClickHandles.size()) {
			KeywordUtil.logInfo("Opened in new tab - SCM-24 - Pass ")
			WebUI.switchToWindowIndex(afterClickHandles.size() - 1)
		} else {
			KeywordUtil.logInfo("No new tab opened")
		}

		WebUI.switchToWindowIndex(1)

		/*WebUI.waitForElementPresent(findTestObject("Login/email"), 30)
		 WebUI.setText(findTestObject("Login/email"), username)
		 WebUI.setText(findTestObject("Login/password"), password)
		 WebUI.click(findTestObject("Login/login_button"))*/
	}
}
