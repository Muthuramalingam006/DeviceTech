package tab

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
import org.openqa.selenium.Keys
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.webui.driver.DriverFactory
import org.openqa.selenium.WebElement
import java.util.List



import internal.GlobalVariable


public class Search {
	def validateSearch() {

		WebUI.verifyElementPresent(findTestObject("Tab/SearchLens"), 2)
		WebUI.delay(2)
		WebUI.verifyElementPresent(findTestObject("Search/PlaceHolder"), 2)
		String PlaceHolderText = WebUI.getAttribute(findTestObject("Search/PlaceHolder"), 'placeholder')
		WebUI.comment("🔍 Search box placeholder: " + PlaceHolderText)

		/*String PlaceHolderText = WebUI.getText(findTestObject("Search/PlaceHolder"))
		 WebUI.comment("🔍 Search box placeholder: " + PlaceHolderText)*/

		WebUI.delay(4)
		WebUI.click(findTestObject("Tab/SearchLens"))
		WebUI.verifyElementPresent(findTestObject("Search/Close"), 2)
		WebUI.setText(findTestObject("Search/SearchText"), "Device")
		WebUI.sendKeys(findTestObject("Search/SearchText"), Keys.chord(Keys.ENTER))

		String resultText = WebUI.getText(findTestObject("Search/SearchResult"))

		WebUI.comment("🔍SCM-45-Pass:  Search result header: " + resultText)

		// ✅ Get and print the page title
		String pageTitle = DriverFactory.getWebDriver().getTitle()
		WebUI.comment("📄 SCM-45 : Pass - Page title: " + pageTitle)
	}

	def validateSearchNoResults() {
		WebUI.click(findTestObject("Tab/SearchLens"))
		WebUI.setText(findTestObject("Search/SearchText"), "Blue")
		WebUI.sendKeys(findTestObject("Search/SearchText"), Keys.chord(Keys.ENTER))

		String resultText = WebUI.getText(findTestObject("Search/NoResults"))

		if (resultText.contains("Search Content Not Found")) {
			WebUI.comment("✅ SCM-45-Pass: " + resultText)
		} else {
			WebUI.comment("❌ SCM-45-Fail: Unexpected result - " + resultText)
		}
	}

	def validateSearchResults() {

		WebUI.click(findTestObject("Tab/SearchLens"))
		WebUI.setText(findTestObject("Search/SearchText"), "ent")
		WebUI.sendKeys(findTestObject("Search/SearchText"), Keys.chord(Keys.ENTER))

		int linkCount = WebUI.findWebElements(findTestObject('Search/title_links'), 10).size()

		for (int i = 1; i <= linkCount; i++) {
			WebUI.click(findTestObject("Tab/SearchLens"))
			WebUI.setText(findTestObject("Search/SearchText"), "ent")
			WebUI.sendKeys(findTestObject("Search/SearchText"), Keys.chord(Keys.ENTER))

			// Re-fetch fresh list each time
			WebElement result = WebUI.findWebElement(findTestObject('Object Repository/Search/Results', [('i') : i]))

			String linkText = result.getText()
			String href = result.getAttribute('href')

			WebUI.comment("Navigating to: " + linkText + " (" + href + ")")

			result.click()
			WebUI.waitForPageLoad(5)

			String pageTitle = WebUI.getWindowTitle()
			WebUI.comment("Page title: " + pageTitle)

			WebUI.delay(5)
			WebUI.back()
			WebUI.waitForPageLoad(5)
		}
	}
}
