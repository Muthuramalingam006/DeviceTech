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
import steps.Search as Search
import steps.Launch
import steps.Login
import mobile.Homepage
import steps.LaunchMobile
import steps.GeneralFunctionalities
import steps.CountrySelector
import steps.Launch
import mobile.GeneralFunctionalities
import mobile.CountrySelector
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.model.FailureHandling

import steps.CategoryPage


launchmobile = new LaunchMobile()
//launch = new Launch()
//login = new Login()
homepage = new Homepage()


//launchmobile = new LaunchMobile()

launchmobile.openiPhone(GlobalVariable.baseUrlNZ)
genFun = new GeneralFunctionalities()
genFun.validateBackToTopButton()


countryselector = new CountrySelector()
countryselector.validateCountrySelector()

general = new GeneralFunctionalities()
general.validatereCaptcha()

WebUI.closeBrowser()

/*
 * 
 * search = new Search()
 * 
 * search.validateSearch()
 * 
 * search.validateSearchNoResults()
 * 
 * search.validateSearchResults()
 * 
 * 
 * WebUI.closeBrowser()
 */





