package mobile

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
import internal.GlobalVariable

public class SupportServices {

	def validateSupportServices() {

		WebUI.delay(5)
		WebUI.verifyElementPresent(findTestObject("IphoneDevice/Hamburger"),5)
		WebUI.waitForElementClickable(findTestObject('IphoneDevice/Hamburger'), 10)

		WebUI.click(findTestObject("IphoneDevice/Hamburger"))

		WebUI.verifyElementPresent(findTestObject("IphoneDevice/Menu_items/support_services"),2)
		WebUI.delay(3)
		WebUI.click(findTestObject("IphoneDevice/Menu_items/support_services"))

		KeywordUtil.logInfo("Starting ' Validate SupportServices Validate ' scenario...")

		//WebUI.click(findTestObject("Homepage/Menu_items/support_services"))

		WebUI.click(findTestObject("IphoneDevice/SupportServices"))

		WebUI.verifyElementPresent(findTestObject("SupportService/About"), 2)

		WebUI.verifyElementPresent(findTestObject("SupportService/Regulatory"), 2)


		//WebUI.click(findTestObject("SupportService/GetInTouch"))

		WebUI.verifyElementPresent(findTestObject("SupportService/Contactsupport"), 2)

		WebUI.click(findTestObject("SupportService/Contactsupport"))

		WebUI.click(findTestObject("SupportService/GetintouchLink"))
	}

	def validateTechinicalServices() {

		WebUI.delay(5)
		WebUI.verifyElementPresent(findTestObject("IphoneDevice/Hamburger"),5)
		WebUI.waitForElementClickable(findTestObject('IphoneDevice/Hamburger'), 10)

		WebUI.click(findTestObject("IphoneDevice/Hamburger"))

		WebUI.verifyElementPresent(findTestObject("IphoneDevice/Menu_items/support_services"),2)
		WebUI.delay(3)
		WebUI.click(findTestObject("IphoneDevice/Menu_items/support_services"))

		KeywordUtil.logInfo("Starting ' Validate SupportServices-Technical Services ' scenario...")

		//WebUI.click(findTestObject("Homepage/Menu_items/support_services"))

		WebUI.click(findTestObject("IphoneDevice/TechnicalServices"))

		WebUI.verifyElementPresent(findTestObject("SupportService/Deviceassure"), 2)

		WebUI.verifyElementPresent(findTestObject("SupportService/About"), 2)

		WebUI.verifyElementPresent(findTestObject("SupportService/Maximising"), 2)

		WebUI.verifyElementPresent(findTestObject("SupportService/Preventative"), 2)

		WebUI.verifyElementPresent(findTestObject("SupportService/FirstClass"), 2)

		WebUI.verifyElementPresent(findTestObject("SupportService/Providing"), 2)
		WebUI.verifyElementPresent(findTestObject("SupportService/Brands"), 2)

		WebUI.verifyElementPresent(findTestObject("SupportService/Seaspine"), 2)

		//WebUI.click(findTestObject("SupportService/GetInTouch"))

		WebUI.verifyElementPresent(findTestObject("SupportService/Contactsupport"), 2)

		WebUI.click(findTestObject("SupportService/Contactsupport"))

		WebUI.click(findTestObject("SupportService/GetInTouchLink"))
		KeywordUtil.logInfo(" ✅ SCM-101 - Pass : Support services - Digital Educa all elements present.")
		WebUI.click(findTestObject("IphoneDevice/Close"))
	}

	def validateDigitalEducation() {

		KeywordUtil.logInfo("Starting ' Validate DigitalEducation ' scenario...")
		WebUI.delay(5)
		WebUI.verifyElementPresent(findTestObject("IphoneDevice/Hamburger"),5)
		WebUI.waitForElementClickable(findTestObject('IphoneDevice/Hamburger'), 10)

		WebUI.click(findTestObject("IphoneDevice/Hamburger"))

		WebUI.verifyElementPresent(findTestObject("IphoneDevice/Menu_items/support_services"),2)
		WebUI.delay(3)
		WebUI.click(findTestObject("IphoneDevice/Menu_items/support_services"))

		//WebUI.click(findTestObject("Homepage/Menu_items/support_services"))
		WebUI.delay(2)
		WebUI.click(findTestObject("IphoneDevice/DeviceDigital"))
		WebUI.delay(2)
		WebUI.verifyElementPresent(findTestObject("SupportService/Deviceh1"), 2)

		WebUI.verifyElementPresent(findTestObject("SupportService/About"), 2)

		WebUI.verifyElementPresent(findTestObject("SupportService/Img"), 2)

		WebUI.verifyElementPresent(findTestObject("SupportService/Deviceh2"), 2)

		WebUI.verifyElementPresent(findTestObject("SupportService/Liveh2"), 2)

		WebUI.verifyElementPresent(findTestObject("SupportService/Clinicalh2"), 2)

		//WebUI.click(findTestObject("SupportService/GetInTouch"))

		WebUI.verifyElementPresent(findTestObject("SupportService/Contactsupport"), 2)

		WebUI.click(findTestObject("SupportService/Contactsupport"))

		WebUI.click(findTestObject("SupportService/GetintouchLink"))
		KeywordUtil.logInfo("✅ SCM-103 - Pass : Support services - Digital Educa all elements present")
	}
}
