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
import internal.GlobalVariable

public class SupportServices {

	def validateSupportServices() {

		KeywordUtil.logInfo("Starting ' Validate SupportServices Validate ' scenario...")

		WebUI.click(findTestObject("Homepage/Menu_items/support_services"))
		WebUI.delay(2)

		WebUI.waitForElementVisible(findTestObject('SupportService/supportservice'), 10)
		WebUI.click(findTestObject('SupportService/supportservice'))

		//WebUI.click(findTestObject("SupportService/supportservice"))
		WebUI.delay(2)

		WebUI.verifyElementPresent(findTestObject("SupportService/About"), 2)
		WebUI.delay(2)

		WebUI.verifyElementPresent(findTestObject("SupportService/Regulatory"), 2)
		WebUI.verifyElementPresent(findTestObject("SupportService/RegulatoryPara"), 2)

		WebUI.delay(2)

		//WebUI.verifyElementPresent(findTestObject("SupportService/ProfessionalImg"), 2)
		WebUI.verifyElementPresent(findTestObject("SupportService/ProfessionalHeading"), 2)
		WebUI.delay(2)

		WebUI.verifyElementPresent(findTestObject("SupportService/ClinicalHeading"), 2)
		WebUI.verifyElementPresent(findTestObject("SupportService/ClinicalPara"), 2)
		WebUI.delay(2)

		//WebUI.verifyElementPresent(findTestObject("SupportService/ClinicalImg"), 2)
		WebUI.delay(2)

		WebUI.verifyElementPresent(findTestObject("SupportService/SolutionHeading"), 2)
		WebUI.verifyElementPresent(findTestObject("SupportService/SolutionPara"), 2)
		WebUI.delay(2)

		//WebUI.verifyElementPresent(findTestObject("SupportService/SolutionImg"), 2)
		WebUI.delay(2)




		WebUI.click(findTestObject("SupportService/GetInTouch"))
		WebUI.delay(2)


		WebUI.verifyElementPresent(findTestObject("SupportService/Contactsupport"), 2)
		WebUI.delay(2)


		WebUI.click(findTestObject("SupportService/Contactsupport"))
		WebUI.delay(2)

		WebUI.click(findTestObject("SupportService/GetintouchLink"))
		WebUI.delay(2)
		KeywordUtil.logInfo(" ✅ SCM-98 - Pass : Support services all elements present.")
		//WebUI.comment("")
	}

	def validateTechinicalServices() {

		KeywordUtil.logInfo("Starting ' Validate Technical Services ' scenario...")

		WebUI.click(findTestObject("Homepage/Menu_items/support_services"))

		WebUI.click(findTestObject("SupportService/Techinicalservices"))

		String title = WebUI.getWindowTitle()
		println("Page Title: " + title)


		WebUI.verifyElementPresent(findTestObject("SupportService/Deviceassure"), 2)

		String text = WebUI.getText(findTestObject("SupportService/Deviceassure"))
		println(text)


		WebUI.verifyElementPresent(findTestObject("SupportService/About"), 2)

		WebUI.verifyElementPresent(findTestObject("SupportService/Maximising"), 2)

		WebUI.verifyElementPresent(findTestObject("SupportService/Preventative"), 2)

		WebUI.verifyElementPresent(findTestObject("SupportService/FirstClass"), 2)

		WebUI.verifyElementPresent(findTestObject("SupportService/Providing"), 2)
		WebUI.verifyElementPresent(findTestObject("SupportService/Brands"), 2)

		//WebUI.verifyElementPresent(findTestObject("SupportService/Seaspine"), 2)

		WebUI.click(findTestObject("SupportService/GetInTouch"))

		//WebUI.verifyElementPresent(findTestObject("SupportService/Contactsupport"), 2)
		WebUI.verifyElementPresent(findTestObject("SupportService/Contactsupport"), 2)
		WebUI.verifyElementPresent(findTestObject("SupportService/GetintouchLink"), 2)



		WebUI.click(findTestObject("SupportService/Contactsupport"))

		WebUI.click(findTestObject("SupportService/GetintouchLink"))
		KeywordUtil.logInfo(" ✅ SCM-101 - Pass : Support services - Digital Educa all elements present.")

		//WebUI.comment("✅ SCM-101 - Pass : Support services - Digital Educa all elements present.")
	}

	def validateDigitalEducation() {

		KeywordUtil.logInfo("Starting ' Validate DigitalEducation ' scenario...")
		WebUI.delay(2)

		WebUI.click(findTestObject("Homepage/Menu_items/support_services"))
		WebUI.delay(2)

		/*WebUI.click(findTestObject("SupportService/supportservice"))
		 WebUI.delay(2)*/

		//WebUI.click(findTestObject("Homepage/Menu_items/support_services"))

		WebUI.click(findTestObject("SupportService/Digitaledu"))

		WebUI.verifyElementPresent(findTestObject("SupportService/Deviceh1"), 2)

		WebUI.verifyElementPresent(findTestObject("SupportService/About"), 2)

		//WebUI.verifyElementPresent(findTestObject("SupportService/Img"), 2)

		WebUI.verifyElementPresent(findTestObject("SupportService/Deviceh2"), 2)

		WebUI.verifyElementPresent(findTestObject("SupportService/Liveh2"), 2)

		WebUI.verifyElementPresent(findTestObject("SupportService/Clinicalh2"), 2)

		WebUI.click(findTestObject("SupportService/GetInTouch"))

		WebUI.verifyElementPresent(findTestObject("SupportService/Contactsupport"), 2)

		WebUI.click(findTestObject("SupportService/Contactsupport"))

		WebUI.click(findTestObject("SupportService/GetintouchLink"))
		KeywordUtil.logInfo("✅ SCM-103 - Pass : Support services - Digital Educa all elements present")
	}
}
