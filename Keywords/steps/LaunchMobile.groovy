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

import com.kms.katalon.core.webui.driver.DriverFactory
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.remote.DesiredCapabilities
import internal.GlobalVariable

public class LaunchMobile {

	def openiPhone(String url) {
		/*	Map<String, String> mobileEmulation = [
		 "deviceName": "iPhone X"
		 ]
		 ChromeOptions chromeOptions = new ChromeOptions()
		 chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation)
		 WebDriver driver = new org.openqa.selenium.chrome.ChromeDriver(chromeOptions)
		 DriverFactory.changeWebDriver(driver)
		 WebUI.navigateToUrl(url)*/

		WebUI.openBrowser('')
		WebUI.navigateToUrl(url)
		WebUI.delay(2) // Allow page to load

		// Step 2: Set viewport to iPhone X dimensions
		WebUI.setViewPortSize(375, 812)
		WebUI.delay(1) // Allow viewport to stabilize

		/*// Step 3: Scroll to element with matching text
		 String jsScroll = """
		 var el = Array.from(document.querySelectorAll('*'))
		 .find(e => e.textContent.trim() === '${visibleText}');
		 if (el) {
		 el.scrollIntoView({behavior: 'smooth', block: 'center'});
		 el.style.border = '2px dashed red'; // Optional: highlight for debug
		 } else {
		 console.warn('Element with text "${visibleText}" not found.');
		 }
		 """
		 WebUI.executeJavaScript(jsScroll, null)*/
	}
}


