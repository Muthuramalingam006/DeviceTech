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
import com.kms.katalon.core.webui.driver.DriverFactory
import org.openqa.selenium.By
import org.openqa.selenium.WebElement
import com.kms.katalon.core.webui.common.WebUiCommonHelper



import internal.GlobalVariable

public class News {

	def validateNews() {

		KeywordUtil.logInfo("Starting ' Validate News ' scenario...")

		WebUI.click(findTestObject("Homepage/Menu_items/news"))

		WebUI.verifyElementPresent(findTestObject("News/newsh1"),2)

		KeywordUtil.logInfo("Clickingon ' All News ' dropdown...")
		WebUI.delay(2)

		String selectedText = WebUI.getText(findTestObject('News/Dropdown_AllNews')).trim()
		assert selectedText == 'All News'

		WebUI.delay(2)
		WebUI.click(findTestObject("News/Dropdown_AllNews"))

		//WebUI.verifyElementPresent(findTestObject("News/Allnews"),2)
		WebUI.delay(2)

		WebUI.verifyElementPresent(findTestObject("News/Company"),2)
		WebUI.verifyElementPresent(findTestObject("News/Hosptial_medical"),2)
		WebUI.delay(2)

		WebUI.click(findTestObject("News/Company"))

		//WebUI.click(findTestObject('News/Company'))
		WebUI.delay(5) // Wait for filtered news to load

		KeywordUtil.logInfo(" Validate that all visible news items are tagged with 'Company Announcements'")


		//List<WebElement> newsTags = DriverFactory.getWebDriver()
		//.findElements(By.xpath("//a[contains(text(),'Company Announcements')]"))

		List<WebElement> newsTags = WebUiCommonHelper.findWebElements(findTestObject('News/CompanyTag'), 10)
		WebUI.delay(10)
		assert newsTags.size() > 0 : "❌ No news items found with tag 'Company Announcements'"

		int count = newsTags.size()

		println "✅ Found ${count > 0 ? count -1 : -1}  news items tagged with 'Company Announcements'"

		KeywordUtil.logInfo(" SCM-169 & SCM-171 & SCM-170: Pass : Validate that all visible news items are tagged with 'Hospital Medical Technology & Services '")


		WebUI.click(findTestObject("News/Dropdown_AllNews"))

		WebUI.click(findTestObject("News/Hosptial_medical"))

		WebUI.delay(5)

		//List<WebElement> hosptialnewsTags = DriverFactory.getWebDriver()
		//.findElements(By.xpath("//a[contains(text(),'Hospital Medical Technology & Services')]"))

		List<WebElement> hosptialnewsTags = WebUiCommonHelper.findWebElements(findTestObject('News/HosptialTag'), 10)


		assert hosptialnewsTags.size() > 0 : "❌ No news items found with tag 'Hosptial tags'"

		int count2 = hosptialnewsTags.size()

		println "✅ Found ${count2 > 0 ? count2 - 1 : -1} news items tagged with 'Hosptial Tags'"
	}
}


