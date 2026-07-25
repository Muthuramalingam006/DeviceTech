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
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable
import org.openqa.selenium.WebDriver

public class Register {

	WebDriver driver;

	def register(String firstName, String lastName,String position,String email,String create_password, String confirm_password) {
		driver = DriverFactory.getWebDriver()

		WebUI.click(findTestObject("Register/register"))
		WebUI.click(findTestObject("Register/get_started"))

		def wHandles = driver.getWindowHandles()

		WebUI.setText(findTestObject("Register/first_name"), firstName)
		WebUI.setText(findTestObject("Register/last_name"), lastName)
		WebUI.selectOptionByValue(findTestObject("Register/position"), position, false)
		WebUI.setText(findTestObject("Register/email"), email)
		WebUI.setText(findTestObject("Register/create_password"), create_password)
		WebUI.setText(findTestObject("Register/confirm_password"), confirm_password)
		WebUI.click(findTestObject("Register/check_box1"))
	}
}
