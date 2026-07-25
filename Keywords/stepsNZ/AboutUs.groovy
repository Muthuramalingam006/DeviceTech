package stepsNZ

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
import com.kms.katalon.core.testobject.ConditionType
import org.openqa.selenium.chrome.ChromeDriver
import internal.GlobalVariable
import com.kms.katalon.core.logging.KeywordLogger
import org.openqa.selenium.WebDriver



public class AboutUs {
	KeywordLogger logger = new KeywordLogger()
	WebDriver driver = new ChromeDriver()

	def validateAboutUs() {
		logger.logInfo("Starting validate about us scenario..........")
		//WebUI.click(findTestObject("Homepage/Menu_items/about_us"))
		//WebUI.click(findTestObject("About_us/Company_overview"))



		TestObject aboutUsMenu = findTestObject("Homepage/Menu_items/about_us")
		WebUI.waitForElementVisible(aboutUsMenu, 10)
		WebUI.waitForElementClickable(aboutUsMenu, 10)
		WebUI.click(aboutUsMenu)
		WebUI.delay(1) // Allow dropdown to render

		// Step 2: Scroll to and click "Company Overview"
		TestObject companyOverview = new TestObject("dynamicCompanyOverview")
		companyOverview.addProperty("xpath", ConditionType.EQUALS, "//*[contains(text(), 'Company Overview')]")

		WebUI.scrollToElement(companyOverview, 10)
		WebUI.waitForElementVisible(companyOverview, 10)
		WebUI.waitForElementClickable(companyOverview, 10)
		WebUI.click(companyOverview)


		logger.logInfo("Validating who we are page..........")
		//WebUI.scrollToElement(findTestObject("About_us/Who_we_are"), 2)
		WebUI.verifyElementPresent(findTestObject("About_us/Who_we_are"),2)

		WebUI.verifyElementPresent(findTestObject("About_us/Delivering_innovation"),2)
		WebUI.verifyElementPresent(findTestObject("About_us/Seeking_collaboration"),2)
		WebUI.verifyElementPresent(findTestObject("About_us/Taking_ownership"),2)
		WebUI.verifyElementPresent(findTestObject("About_us/Practicing_good_business"),2)
		WebUI.verifyElementPresent(findTestObject("About_us/Championing_the_customer"),2)
		logger.logInfo("Validation completed for who we are page..........")


		WebUI.verifyElementPresent(findTestObject("About_us/Our_strategy_vision"),2)
		WebUI.verifyElementPresent(findTestObject("About_us/Our_history"),2)

		WebUI.click(findTestObject("Homepage/Menu_items/about_us"))
		WebUI.click(findTestObject("About_us/Our_leaders"))
		WebUI.verifyElementPresent(findTestObject("About_us/Meet_our_directors"),2)
		WebUI.verifyElementPresent(findTestObject("About_us/Meet_our_senior_management"),2)

		WebUI.click(findTestObject("Homepage/Menu_items/about_us"))
		WebUI.click(findTestObject("About_us/Careers"))
		WebUI.verifyElementPresent(findTestObject("About_us/Working_here"),2)
		WebUI.verifyElementPresent(findTestObject("About_us/WorkingHere"),2)
		WebUI.verifyElementPresent(findTestObject("About_us/P1"),2)
		WebUI.verifyElementPresent(findTestObject("About_us/h4"),2)
		WebUI.verifyElementPresent(findTestObject('NZ/Join_our_team'),2)
		//WebUI.verifyElementPresent(findTestObject("About_us/View_jobs"),2)
		//WebUI.verifyElementPresent(findTestObject("About_us/My_application"),2)

		logger.logInfo("Validate about us scenario completed SCM-155 - Pass")
	}

	def validateOurLeaders() {
		logger.logInfo("Starting our leaders scenario..........")
		WebUI.click(findTestObject("Homepage/Menu_items/about_us"))
		WebUI.click(findTestObject("About_us/Our_leaders"))
		WebUI.enhancedClick(findTestObject("About_us/Meet_our_directors"))

		logger.logInfo("Validating Philip Latham..........")
		WebUI.scrollToElement(findTestObject("About_us/Our_leader/Philip Latham/Philip_latham"),2)
		WebUI.verifyElementPresent(findTestObject("About_us/Our_leader/Philip Latham/Philip_latham"),2)
		WebUI.click(findTestObject("About_us/Our_leader/Philip Latham/Philip_latham"))
		WebUI.verifyElementPresent(findTestObject("About_us/Our_leader/Philip Latham/Philip_latham_info"),2)
		WebUI.scrollToElement(findTestObject("About_us/Our_leader/Philip Latham/Philip_latham_linkedin_button"),2)
		WebUI.click(findTestObject("About_us/Our_leader/Philip Latham/Philip_latham_linkedin_button"))
		WebUI.switchToWindowIndex(1)

		assert WebUI.getUrl().toString().contains("linkedin"),"Phil_latham_linkedin page Navigation Failed"

		WebUI.closeWindowIndex(1)
		WebUI.switchToWindowIndex(0)
		WebUI.back()

		logger.logInfo("Validating Michael Trevaskis..........")
		WebUI.scrollToElement(findTestObject("About_us/Our_leader/Michael Trevaskis/Michael_trevaskis"),2)
		WebUI.verifyElementPresent(findTestObject("About_us/Our_leader/Michael Trevaskis/Michael_trevaskis"),2)
		WebUI.click(findTestObject("About_us/Our_leader/Michael Trevaskis/Michael_trevaskis"))
		WebUI.verifyElementPresent(findTestObject("About_us/Our_leader/Michael Trevaskis/Michael_trevaskis_info"),2)
		WebUI.scrollToElement(findTestObject("About_us/Our_leader/Michael Trevaskis/Michael_trevaskis_linkedin_button"),2)
		WebUI.click(findTestObject("About_us/Our_leader/Michael Trevaskis/Michael_trevaskis_linkedin_button"))
		WebUI.switchToWindowIndex(1)

		assert WebUI.getUrl().toString().contains("linkedin"),"Michael_trevaskis_linkedin page Navigation Failed"

		WebUI.closeWindowIndex(1)
		WebUI.switchToWindowIndex(0)
		WebUI.back()
		//WebUI.back()
		/*logger.logInfo("Validating Emma Cleary..........")
		 WebUI.scrollToElement(findTestObject("About_us/Our_leader/Emma Cleary/Emma_cleary"),2)
		 WebUI.verifyElementPresent(findTestObject("About_us/Our_leader/Emma Cleary/Emma_cleary"),2)
		 WebUI.click(findTestObject("About_us/Our_leader/Emma Cleary/Emma_cleary"))
		 def member_info3 = WebUI.getText(findTestObject("About_us/Our_leader/Emma Cleary/Emma_cleary_info"))
		 assert member_info3.toString().contains("Emma Cleary"),"Philip_latham_info page not found"
		 WebUI.scrollToElement(findTestObject("About_us/Our_leader/Emma Cleary/Emma_cleary_linkedin_button"),2)
		 WebUI.click(findTestObject("About_us/Our_leader/Emma Cleary/Emma_cleary_linkedin_button"))
		 WebUI.switchToWindowIndex(1)
		 assert WebUI.getUrl().toString().contains("linkedin"),"Emma_cleary_linkedin page Navigation Failed"
		 WebUI.closeWindowIndex(1)
		 WebUI.switchToWindowIndex(0)
		 WebUI.back()*/
/*
		logger.logInfo("Validating William Whittle..........")
		WebUI.scrollToElement(findTestObject("About_us/Our_leader/William Whittle/william_whittle"),2)
		WebUI.verifyElementPresent(findTestObject("About_us/Our_leader/William Whittle/william_whittle"),2)
		WebUI.click(findTestObject("About_us/Our_leader/William Whittle/william_whittle"))

		def member_info4 = WebUI.getText(findTestObject("About_us/Our_leader/William Whittle/william_whittle_info"))
		assert member_info4.toString().contains("William Whittle"),"william_whittle_info page not found"

		WebUI.scrollToElement(findTestObject("About_us/Our_leader/William Whittle/william_whittle_linkedin_button"),2)
		WebUI.click(findTestObject("About_us/Our_leader/William Whittle/william_whittle_linkedin_button"))
		WebUI.switchToWindowIndex(1)

		assert WebUI.getUrl().toString().contains("linkedin"),"william_whittle_linkedin page Navigation Failed"

		WebUI.closeWindowIndex(1)
		WebUI.switchToWindowIndex(0)
		WebUI.back()*/

		/*	logger.logInfo("Validating Ben Arthur..........")
		 WebUI.scrollToElement(findTestObject("About_us/Our_leader/Ben Arthur/ben_arthur"),2)
		 WebUI.verifyElementPresent(findTestObject("About_us/Our_leader/Ben Arthur/ben_arthur"),2)
		 WebUI.click(findTestObject("About_us/Our_leader/Ben Arthur/ben_arthur"))
		 def member_info5 = WebUI.getText(findTestObject("About_us/Our_leader/Ben Arthur/ben_arthur_info"))
		 assert member_info5.toString().contains("Ben Arthur"),"ben_arthur_info page not found"
		 WebUI.scrollToElement(findTestObject("About_us/Our_leader/Ben Arthur/ben_arthur_linkedin_button"),2)
		 WebUI.click(findTestObject("About_us/Our_leader/Ben Arthur/ben_arthur_linkedin_button"))
		 WebUI.switchToWindowIndex(1)
		 assert WebUI.getUrl().toString().contains("linkedin"),"ben_arthur_linkedin page Navigation Failed"
		 WebUI.closeWindowIndex(1)
		 WebUI.switchToWindowIndex(0)
		 WebUI.back()  */
	}

	def ValidateHistory() {

		logger.logInfo("Starting our leaders scenario..........")

		logger.logInfo("Starting our leaders scenario..........")
		WebUI.click(findTestObject("Homepage/Menu_items/about_us"))
		WebUI.click(findTestObject("About_us/Company_overview"))
		WebUI.click(findTestObject("About_us/Our_history"))

		WebUI.click(findTestObject("About_us/Our_history"))

		//Identify the element (container that might have horizontal scroll)
		TestObject element = findTestObject('About_us/History_scroll_bar')

		WebUI.scrollToElement(findTestObject("About_us/History_scroll_bar"), 5)

		if (WebUI.verifyElementPresent(findTestObject("About_us/History_scroll_bar"), 5)) {
			println("✅ Element is present.")
		} else {
			println("❌ Element is not present.")
		}

		logger.logPassed("SCM-123: Validation passed successfully.")




		TestObject nextArrow = new TestObject()
		nextArrow.addProperty("xpath", ConditionType.EQUALS, "(//*[@class='custom-next-arrow'])[1]")



		WebUI.enhancedClick(nextArrow)



		TestObject prevArrow = new TestObject()
		//prevArrow.addProperty("xpath", ConditionType.EQUALS, "(//*[@class='owl-prev'])[1]")
		prevArrow.addProperty("xpath", ConditionType.EQUALS, "(//*[@class='owl-prev ng-star-inserted'])[1]")
		
		

		WebUI.enhancedClick(prevArrow)

		/*//Run JavaScript inside browser
		 boolean hasHorizontalScroll = WebUI.executeJavaScript(
		 "var el = arguments[0]; return el.scrollWidth > el.clientWidth;",
		 Arrays.asList(WebUI.findWebElement(element))
		 )
		 assert hasHorizontalScroll == true, "Horizontal scroll not present"
		 println("Horizontal scrollbar present? " + hasHorizontalScroll)
		 // Scroll 100px to the right
		 WebUI.executeJavaScript(
		 "var el = arguments[0]; el.scrollLeft = 100; return el.scrollLeft;",
		 Arrays.asList(WebUI.findWebElement(element))
		 )
		 int maxScroll = WebUI.executeJavaScript(
		 "var el = arguments[0]; return el.scrollWidth - el.clientWidth;",
		 Arrays.asList(WebUI.findWebElement(element))
		 )
		 println("Max horizontal scroll: " + maxScroll)
		 WebUI.delay(5)
		 // Scroll completely to the left
		 WebUI.executeJavaScript(
		 "arguments[0].scrollLeft = 0;",
		 Arrays.asList(WebUI.findWebElement(element))
		 )*/

		WebUI.verifyElementPresent(findTestObject("About_us/1992"),2)
		WebUI.verifyElementPresent(findTestObject("About_us/1993"),2)
		WebUI.verifyElementPresent(findTestObject("About_us/1996"),2)
		WebUI.verifyElementPresent(findTestObject("About_us/2000"),2)
		WebUI.verifyElementPresent(findTestObject("About_us/2003"),2)
		WebUI.verifyElementPresent(findTestObject("About_us/2004"),2)
		WebUI.verifyElementPresent(findTestObject("About_us/2006"),2)
		WebUI.verifyElementPresent(findTestObject("About_us/2008"),2)
		WebUI.verifyElementPresent(findTestObject("About_us/2011"),2)
		WebUI.verifyElementPresent(findTestObject("About_us/2012"),2)
		WebUI.verifyElementPresent(findTestObject("About_us/2015"),2)
		WebUI.verifyElementPresent(findTestObject("About_us/2016"),2)
		WebUI.verifyElementPresent(findTestObject("About_us/2017"),2)
		WebUI.verifyElementPresent(findTestObject("About_us/2018"),2)
		WebUI.verifyElementPresent(findTestObject("About_us/2019"),2)
		WebUI.verifyElementPresent(findTestObject("About_us/2020"),2)
		WebUI.verifyElementPresent(findTestObject("About_us/2021"),2)
		WebUI.verifyElementPresent(findTestObject("About_us/2022"),2)
		WebUI.verifyElementPresent(findTestObject("About_us/2023"),2)
	}
}
