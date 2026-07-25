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
import com.kms.katalon.core.testobject.ConditionType

import internal.GlobalVariable
import com.kms.katalon.core.logging.KeywordLogger


public class AboutUs {
	KeywordLogger logger = new KeywordLogger()

	def validateAboutUs() {

		WebUI.verifyElementPresent(findTestObject('IphoneDevice/Hamburger'),5)
		WebUI.waitForElementClickable(findTestObject('IphoneDevice/Hamburger'), 10)

		WebUI.click(findTestObject("IphoneDevice/Hamburger"))

		logger.logInfo("Starting validate about us scenario..........")
		//WebUI.click(findTestObject("Homepage/Menu_items/about_us"))
		//WebUI.click(findTestObject("About_us/Company_overview"))



		WebUI.waitForElementVisible(findTestObject('IphoneDevice/Menu_Items/about_us'), 10)
		WebUI.waitForElementClickable(findTestObject('IphoneDevice/Menu_Items/about_us'), 10)
		WebUI.click(findTestObject('IphoneDevice/Menu_Items/about_us'))
		WebUI.delay(1) 
		// Allow dropdown to render

		// Step 2: Scroll to and click "Company Overview"
		/*	TestObject companyOverview = new TestObject("dynamicCompanyOverview")
		 companyOverview.addProperty("xpath", ConditionType.EQUALS, "//*[contains(text(), 'Company Overview')]")
		 WebUI.scrollToElement(companyOverview, 10)
		 WebUI.waitForElementVisible(companyOverview, 10)
		 WebUI.waitForElementClickable(companyOverview, 10)
		 WebUI.click(companyOverview)*/

		WebUI.click(findTestObject("IphoneDevice/CompanyOverview"))

		WebUI.click(findTestObject("IphoneDevice/who_we_are"))

		logger.logInfo("Validating who we are page..........")


		//WebUI.scrollToElement(findTestObject("About_us/Who_we_are"), 2)
		//WebUI.verifyElementPresent(findTestObject("About_us/Who_we_are"),2)
		WebUI.verifyElementPresent(findTestObject("About_us/Delivering_innovation"),2)
		WebUI.verifyElementPresent(findTestObject("About_us/Seeking_collaboration"),2)
		WebUI.verifyElementPresent(findTestObject("About_us/Taking_ownership"),2)
		WebUI.verifyElementPresent(findTestObject("About_us/Practicing_good_business"),2)
		WebUI.verifyElementPresent(findTestObject("About_us/Championing_the_customer"),2)
		logger.logInfo("Validation completed for who we are page..........")


		WebUI.verifyElementPresent(findTestObject("About_us/Our_strategy_vision"),2)
		WebUI.verifyElementPresent(findTestObject("About_us/Our_history"),2)


		WebUI.verifyElementPresent(findTestObject("IphoneDevice/Hamburger"),5)
		WebUI.waitForElementClickable(findTestObject('IphoneDevice/Hamburger'), 10)

		WebUI.click(findTestObject("IphoneDevice/Hamburger"))


		WebUI.click(findTestObject("IphoneDevice/Menu_Items/about_us"))

		WebUI.click(findTestObject("IphoneDevice/Our_Leaders"))
		WebUI.verifyElementPresent(findTestObject("IphoneDevice/meet_our_directors"),2)


		WebUI.verifyElementPresent(findTestObject("IphoneDevice/Meet_our_senior_managers"),2)

		//.click(findTestObject("Homepage/Menu_items/about_us"))
		WebUI.click(findTestObject("IphoneDevice/Careers"))
		WebUI.verifyElementPresent(findTestObject("IphoneDevice/working_hereNz"),2)

		WebUI.verifyElementPresent(findTestObject("IphoneDevice/JoinOurTeam"),2)
		WebUI.click(findTestObject("IphoneDevice/working_hereNz"))
		if (WebUI.verifyElementPresent(findTestObject("About_us/WorkingHereNz"), 2)) {
			String workingHereText = WebUI.getText(findTestObject("About_us/WorkingHereNz"))
			println("Text from WorkingHere element: " + workingHereText)
		}

		WebUI.verifyElementPresent(findTestObject("About_us/P1"),2)
		WebUI.verifyElementPresent(findTestObject("About_us/h4"),2)

		/*		WebUI.verifyElementPresent(findTestObject("About_us/View_jobs"),2)
		 WebUI.verifyElementPresent(findTestObject("About_us/My_application"),2)*/

		logger.logInfo("Validate about us scenario completed - SCM-155: Pass.")
	}

	
	def validateAboutUsNz() {
		
				WebUI.verifyElementPresent(findTestObject('IphoneDevice/HamburgerNz'),5)
				WebUI.waitForElementClickable(findTestObject('IphoneDevice/HamburgerNz'), 10)
		
				WebUI.click(findTestObject('IphoneDevice/HamburgerNz'))
		
				logger.logInfo("Starting validate about us scenario..........")
				//WebUI.click(findTestObject("Homepage/Menu_items/about_us"))
				//WebUI.click(findTestObject("About_us/Company_overview"))
		
		
		
				WebUI.waitForElementVisible(findTestObject('IphoneDevice/Menu_Items/about_usNz'), 10)
				WebUI.waitForElementClickable(findTestObject('IphoneDevice/Menu_Items/about_usNz'), 10)
				WebUI.click(findTestObject('IphoneDevice/Menu_Items/about_usNz'))
				WebUI.delay(1)
				// Allow dropdown to render
		
				// Step 2: Scroll to and click "Company Overview"
				/*	TestObject companyOverview = new TestObject("dynamicCompanyOverview")
				 companyOverview.addProperty("xpath", ConditionType.EQUALS, "//*[contains(text(), 'Company Overview')]")
				 WebUI.scrollToElement(companyOverview, 10)
				 WebUI.waitForElementVisible(companyOverview, 10)
				 WebUI.waitForElementClickable(companyOverview, 10)
				 WebUI.click(companyOverview)*/
		
				WebUI.click(findTestObject('IphoneDevice/CompanyOverviewNz'))
		
				WebUI.click(findTestObject('IphoneDevice/who_we_areNz'))
		
				logger.logInfo("Validating who we are page..........")
		
				List<String> objectPaths = [
					'Object Repository/IphoneDevice/WhoWeAre1HeroHeading',
					'Object Repository/IphoneDevice/WhoWeAre2heroImage',
					'Object Repository/IphoneDevice/WhoWeAre3Headingcont2',
					'Object Repository/IphoneDevice/WhoWeAre4Headinngcont3',
					'Object Repository/IphoneDevice/WhoWeAre5HeadingCont4',
					'Object Repository/IphoneDevice/WhoWeAre6HeadingCont5',
					'Object Repository/IphoneDevice/WhoWeAre7HeadingCont6',
					'Object Repository/IphoneDevice/WhoWeAre8HeadingCont7',
					'Object Repository/IphoneDevice/WhoWeAre9HeadingCont8',
					'Object Repository/IphoneDevice/WhoWeAre10HeadingCont9',
					'Object Repository/IphoneDevice/WhoWeAre11HeadingCont10'
				]
				
				for (String path : objectPaths) {
					TestObject obj = findTestObject(path)
					WebUI.scrollToElement(obj, 5)
					WebUI.verifyElementPresent(obj, 5)
					WebUI.verifyElementVisible(obj)
				}
					
		
				WebUI.verifyElementPresent(findTestObject('IphoneDevice/HamburgerNz'),5)
				WebUI.waitForElementClickable(findTestObject('IphoneDevice/HamburgerNz'), 10)
		
				WebUI.click(findTestObject('IphoneDevice/HamburgerNz'))
		
		
				WebUI.click(findTestObject('IphoneDevice/Menu_Items/about_usNz'))
		
				WebUI.click(findTestObject("IphoneDevice/Our_LeadersNz"))
				WebUI.verifyElementPresent(findTestObject('IphoneDevice/meet_our_directorsNz'),2)
				WebUI.verifyElementPresent(findTestObject("IphoneDevice/Meet_our_senior_managersNz"),2)
		
				//.click(findTestObject("Homepage/Menu_items/about_us"))
				WebUI.click(findTestObject("IphoneDevice/CareersNz"))
				WebUI.verifyElementPresent(findTestObject("IphoneDevice/JoinOurTeamNz"),2)
				WebUI.verifyElementPresent(findTestObject('IphoneDevice/working_hereNz'),2)
		
				WebUI.click(findTestObject("IphoneDevice/working_hereNz"))
				
				logger.logInfo("Validate about us scenario completed - SCM-155: Pass.")
			}
		
	def validateOurLeaders() {
		WebUI.delay(3)
		logger.logInfo("Starting our leaders -Our history scenario..........")

		WebUI.verifyElementPresent(findTestObject("IphoneDevice/Hamburger"),5)
		WebUI.waitForElementClickable(findTestObject('IphoneDevice/Hamburger'), 10)

		WebUI.click(findTestObject("IphoneDevice/Hamburger"))

		logger.logInfo("Starting validate about us scenario..........")
		WebUI.click(findTestObject("IphoneDevice/aboutus"))

		WebUI.click(findTestObject("IphoneDevice/Our_Leaders"))
		WebUI.enhancedClick(findTestObject("IphoneDevice/meet_our_directors"))

		logger.logInfo("Validating Philip Latham..........")
		WebUI.delay(3)
		WebUI.scrollToElement(findTestObject("About_us/Our_leader/Philip Latham/Philip_latham"),2)
		WebUI.verifyElementPresent(findTestObject("About_us/Our_leader/Philip Latham/Philip_latham"),2)
		WebUI.click(findTestObject("About_us/Our_leader/Philip Latham/Philip_latham"))
		WebUI.delay(3)
		WebUI.verifyElementPresent(findTestObject("IphoneDevice/PhilipLatham/Philip_latham_info"),2)
		WebUI.delay(3)
		WebUI.scrollToElement(findTestObject("IphoneDevice/PhilipLatham/Philip_latham_linkedin_button"),2)
		WebUI.delay(3)
		WebUI.click(findTestObject("IphoneDevice/PhilipLatham/Philip_latham_linkedin_button"))
		WebUI.switchToWindowIndex(1)
		WebUI.delay(3)
		assert WebUI.getUrl().toString().contains("linkedin"),"Phil_latham_linkedin page Navigation Failed"

		WebUI.closeWindowIndex(1)
		WebUI.switchToWindowIndex(0)
		WebUI.back()
		/*
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
		 logger.logInfo("Validating Emma Cleary..........")
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
		 WebUI.back()
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
		 WebUI.back()
		 */
		/*    logger.logInfo("Validating Ben Arthur..........")
		 WebUI.scrollToElement(findTestObject("Homepage/About_us/Our_leader/Ben Arthur/ben_arthur"),2)
		 WebUI.verifyElementPresent(findTestObject("Homepage/About_us/Our_leader/Ben Arthur/ben_arthur"),2)
		 WebUI.click(findTestObject("Homepage/About_us/Our_leader/Ben Arthur/ben_arthur"))
		 def member_info5 = WebUI.getText(findTestObject("Homepage/About_us/Our_leader/Ben Arthur/ben_arthur_info"))
		 assert member_info5.toString().contains("Ben Arthur"),"ben_arthur_info page not found"
		 WebUI.scrollToElement(findTestObject("Homepage/About_us/Our_leader/Ben Arthur/ben_arthur_linkedin_button"),2)
		 WebUI.click(findTestObject("Homepage/About_us/Our_leader/Ben Arthur/ben_arthur_linkedin_button"))
		 WebUI.switchToWindowIndex(1)
		 assert WebUI.getUrl().toString().contains("linkedin"),"ben_arthur_linkedin page Navigation Failed"
		 assert WebUI.getUrl().toString().contains("linkedin"),"ben_arthur_linkedin page Navigation Failed"
		 WebUI.closeWindowIndex(1)
		 WebUI.switchToWindowIndex(0)
		 WebUI.back()  */
	}
	def ValidateHistory() {
		
		
				WebUI.delay(3)
				logger.logInfo("Starting our leaders -Our history scenario..........")
		
				WebUI.verifyElementPresent(findTestObject("IphoneDevice/Hamburger"),5)
				WebUI.waitForElementClickable(findTestObject('IphoneDevice/Hamburger'), 10)
		
				WebUI.click(findTestObject("IphoneDevice/Hamburger"))
		
				logger.logInfo("Starting validate about us scenario..........")
				WebUI.click(findTestObject("IphoneDevice/aboutus"))
		
				WebUI.click(findTestObject("IphoneDevice/CompanyOverview"))
		
				//WebUI.click(findTestObject("IphoneDevice/who_we_are"))
		
				WebUI.delay(2)
		
				logger.logInfo("Validating our history page..........")
		
				WebUI.click(findTestObject("IphoneDevice/ourhistory"))
				WebUI.verifyElementPresent(findTestObject("About_us/OurHistoryBanner"),2)
				WebUI.verifyElementPresent(findTestObject("About_us/ourhistoryHeading"),2)
				String headingText = WebUI.getText(findTestObject("About_us/ourhistoryHeading"))
				println "Heading text: " + headingText
				//WebUI.verifyElementPresent(findTestObject("About_us/P1"),2)
				WebUI.verifyElementPresent(findTestObject("About_us/OurHistoryParagraph"),2)
				WebUI.verifyElementPresent(findTestObject("About_us/OurHistoryParagraphTwo"),2)
		
		
		
				println "Heading text: " + headingText
				// Katalon logger
				KeywordLogger log = new KeywordLogger()
				log.logPassed("SCM-123: Validation passed successfully.")
		
		
		
		
				//WebUI.click(findTestObject("About_us/Our_history"))
		
		
		
		
				//Identify the element (container that might have horizontal scroll)
				TestObject element = findTestObject('About_us/History_scroll_bar')
		
				//WebUI.scrollToElement(findTestObject("About_us/History_scroll_bar"), 5)
		
				WebUI.scrollToElement(findTestObject("About_us/History_scroll_bar"), 5)
		
				if (WebUI.verifyElementPresent(findTestObject("About_us/History_scroll_bar"), 5)) {
					println("✅ Element is present.")
				} else {
					println("❌ Element is not present.")
				}
		
				log.logPassed("SCM-123: Validation passed successfully.")
		
		
		
		
				TestObject nextArrow = new TestObject()
				nextArrow.addProperty("xpath", ConditionType.EQUALS, "(//*[@class='custom-next-arrow'])[1]")
		
		
		
				WebUI.enhancedClick(nextArrow)
		
		
		
				TestObject prevArrow = new TestObject()
				prevArrow.addProperty("xpath", ConditionType.EQUALS, "(//*[@class='owl-prev'])[1]")
		
				WebUI.enhancedClick(prevArrow)
		
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
			
			def ValidateHistoryNz() {
				
				
						WebUI.delay(3)
						logger.logInfo("Starting our leaders -Our history scenario..........")
				
						WebUI.verifyElementPresent(findTestObject('IphoneDevice/HamburgerNz'),5)
						WebUI.waitForElementClickable(findTestObject('IphoneDevice/HamburgerNz'), 10)
				
						WebUI.click(findTestObject('IphoneDevice/HamburgerNz'))
				
						logger.logInfo("Starting validate about us scenario..........")
						WebUI.click(findTestObject('IphoneDevice/Menu_items/about_usNz'))
				
						WebUI.click(findTestObject('IphoneDevice/CompanyOverviewNz'))
				
						//WebUI.click(findTestObject("IphoneDevice/who_we_are"))
				
						WebUI.delay(2)
				
						logger.logInfo("Validating our history page..........")
				
						WebUI.click(findTestObject('IphoneDevice/ourhistoryNz'))
						


// Katalon logger
KeywordLogger log = new KeywordLogger()
log.logPassed("SCM-123: Validation passed successfully.")

//Identify the element (container that might have horizontal scroll)
TestObject element = findTestObject('About_us/History_scroll_bar')

//WebUI.scrollToElement(findTestObject('About_us/History_scroll_bar'), 5)

WebUI.scrollToElement(findTestObject('About_us/History_scroll_bar'), 5)

if (WebUI.verifyElementPresent(findTestObject('About_us/History_scroll_bar'), 5)) {
    println("✅ Element is present.")
} else {
    println("❌ Element is not present.")
}

log.logPassed("SCM-123: Validation passed successfully.")




TestObject nextArrow = new TestObject()
nextArrow.addProperty("xpath", ConditionType.EQUALS, "(//*[@class='custom-next-arrow'])[1]")



WebUI.enhancedClick(nextArrow)



TestObject prevArrow = new TestObject()
prevArrow.addProperty("xpath", ConditionType.EQUALS, "(//span//parent::button[@id='owl-prev'])[1]")

WebUI.enhancedClick(prevArrow)

WebUI.verifyElementPresent(findTestObject('About_us/1992'),2)
WebUI.verifyElementPresent(findTestObject('About_us/1993'),2)
WebUI.verifyElementPresent(findTestObject('About_us/1996'),2)
WebUI.verifyElementPresent(findTestObject('About_us/2000'),2)
WebUI.verifyElementPresent(findTestObject('About_us/2003'),2)
WebUI.verifyElementPresent(findTestObject('About_us/2004'),2)
WebUI.verifyElementPresent(findTestObject('About_us/2006'),2)
WebUI.verifyElementPresent(findTestObject('About_us/2008'),2)
WebUI.verifyElementPresent(findTestObject('About_us/2011'),2)
WebUI.verifyElementPresent(findTestObject('About_us/2012'),2)
WebUI.verifyElementPresent(findTestObject('About_us/2015'),2)
WebUI.verifyElementPresent(findTestObject('About_us/2016'),2)
WebUI.verifyElementPresent(findTestObject('About_us/2017'),2)
WebUI.verifyElementPresent(findTestObject('About_us/2018'),2)
WebUI.verifyElementPresent(findTestObject('About_us/2019'),2)
WebUI.verifyElementPresent(findTestObject('About_us/2020'),2)
WebUI.verifyElementPresent(findTestObject('About_us/2021'),2)
WebUI.verifyElementPresent(findTestObject('About_us/2022'),2)
WebUI.verifyElementPresent(findTestObject('About_us/2023'),2)}
	
}
