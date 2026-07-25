import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

import steps.EmailOTP
import steps.Launch
import steps.Login
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.testobject.ObjectRepository

// Instantiate your classes
EmailOTP emailotp = new EmailOTP()
Launch launch = new Launch()
Login login = new Login()

// Launch and login
launch.launchUrl("https://w3q2.device.com.au/")
login.login("prashanthis003@gmail.com", "Ashok@123")



// Wait for OTP email to arrive
WebUI.delay(5)

/*
 * // Fetch OTP from Gmail using IMAP String otp =
 * emailotp.getMails("prashanthis003@gmail.com", "wffenfhrtbuugonn") //String
 * otp = emailotp.getMails("your.email@gmail.com", "your_app_password") println
 * "OTP received: ${otp}"
 * 
 * if (otp != null && otp.length() == 6) { for (int i = 0; i < 6; i++) {
 * TestObject otpBox = findTestObject("Login/otp-" + i) WebUI.setText(otpBox,
 * otp.charAt(i).toString()) } WebUI.click(findTestObject("Login/Confirm")) }
 * else { KeywordUtil.markFailed("OTP was not retrieved or is invalid.") }
 */


