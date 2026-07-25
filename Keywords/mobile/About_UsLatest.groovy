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
import com.kms.katalon.core.logging.KeywordLogger

import internal.GlobalVariable


import org.openqa.selenium.WebDriver


import com.kms.katalon.core.testobject.ConditionType

import org.openqa.selenium.WebElement


public class About_UsLatest {
	KeywordLogger logger = new KeywordLogger()

	def validateJoinOurTeam() {

		WebUI.verifyElementPresent(findTestObject("IphoneDevice/Hamburger"),5)
		WebUI.waitForElementClickable(findTestObject('IphoneDevice/Hamburger'), 10)

		WebUI.click(findTestObject("IphoneDevice/Hamburger"))

		logger.logInfo("Starting validate about us scenario..........")
		//WebUI.click(findTestObject("Homepage/Menu_items/about_us"))
		//WebUI.click(findTestObject("About_us/Company_overview"))



		TestObject aboutUsMenu = findTestObject("IphoneDevice/Menu_Items/about_us")
		WebUI.waitForElementVisible(aboutUsMenu, 10)
		WebUI.waitForElementClickable(aboutUsMenu, 10)
		WebUI.click(aboutUsMenu)
		WebUI.delay(1)

		WebUI.click(findTestObject("IphoneDevice/Careers"))
		WebUI.verifyElementPresent(findTestObject("IphoneDevice/working_here"),2)

		WebUI.verifyElementPresent(findTestObject("IphoneDevice/Join_our_team"),2)
		WebUI.click(findTestObject("IphoneDevice/Join_our_team"))

		// Get the page title
		String pageTitle = WebUI.getWindowTitle()
		println("Page Title: " + pageTitle)


		WebUI.verifyElementPresent(findTestObject("Object Repository/About_us/JoinOurTeam/join_our_team_header"), 5)
		WebUI.verifyElementPresent(findTestObject("Object Repository/About_us/JoinOurTeam/enquire_today"), 5)
		WebUI.verifyElementPresent(findTestObject("Object Repository/About_us/JoinOurTeam/paragraph"), 5)
		WebUI.verifyElementPresent(findTestObject("Object Repository/About_us/JoinOurTeam/linkedin"), 5)
		WebUI.verifyElementPresent(findTestObject("Object Repository/About_us/JoinOurTeam/facebook"), 5)
		WebUI.verifyElementPresent(findTestObject("Object Repository/About_us/JoinOurTeam/first_name"), 5)
		WebUI.verifyElementPresent(findTestObject("Object Repository/About_us/JoinOurTeam/surname"), 5)
		WebUI.verifyElementPresent(findTestObject("Object Repository/About_us/JoinOurTeam/email"), 5)
		WebUI.verifyElementPresent(findTestObject("Object Repository/About_us/JoinOurTeam/phone"), 5)
		WebUI.verifyElementPresent(findTestObject("Object Repository/About_us/JoinOurTeam/country"), 5)
		WebUI.verifyElementPresent(findTestObject("Object Repository/About_us/JoinOurTeam/state"), 5)
		WebUI.verifyElementPresent(findTestObject("Object Repository/About_us/JoinOurTeam/current_job_title"), 5)
		WebUI.verifyElementPresent(findTestObject("Object Repository/About_us/JoinOurTeam/availability"), 5)

		WebUI.verifyElementPresent(findTestObject("Object Repository/About_us/JoinOurTeam/resume"), 5)
		WebUI.verifyElementPresent(findTestObject("Object Repository/About_us/JoinOurTeam/resume_upload"), 5)

		WebUI.verifyElementPresent(findTestObject("Object Repository/About_us/JoinOurTeam/cover_letter"), 5)
		WebUI.verifyElementPresent(findTestObject("Object Repository/About_us/JoinOurTeam/cover_letter_upload"), 5)

		WebUI.verifyElementPresent(findTestObject("Object Repository/About_us/JoinOurTeam/terms_check"), 5)
		WebUI.verifyElementPresent(findTestObject("Object Repository/About_us/JoinOurTeam/confirm_work_check"), 5)

		WebUI.verifyElementPresent(findTestObject("Object Repository/About_us/JoinOurTeam/express_interest"), 5)

		WebUI.verifyElementPresent(findTestObject("Object Repository/About_us/JoinOurTeam/important"), 5)

		KeywordLogger log = new KeywordLogger()
		log.logPassed("SCM-123: Validation passed successfully.")
	}
	
	def validateJoinOurTeamNz() {
		
				WebUI.verifyElementPresent(findTestObject("IphoneDevice/HamburgerNz"),5)
				WebUI.waitForElementClickable(findTestObject('IphoneDevice/HamburgerNz'), 10)
		
				WebUI.click(findTestObject("IphoneDevice/HamburgerNz"))
		
				logger.logInfo("Starting validate about us scenario..........")
				//WebUI.click(findTestObject("Homepage/Menu_items/about_us"))
				//WebUI.click(findTestObject("About_us/Company_overview"))
		
		
		
				TestObject aboutUsMenu = findTestObject("IphoneDevice/Menu_Items/about_usNz")
				WebUI.waitForElementVisible(aboutUsMenu, 10)
				WebUI.waitForElementClickable(aboutUsMenu, 10)
				WebUI.click(aboutUsMenu)
				WebUI.delay(1)
		
				WebUI.click(findTestObject("IphoneDevice/CareersNz"))
				WebUI.verifyElementPresent(findTestObject("IphoneDevice/working_hereNz"),2)
		
				WebUI.verifyElementPresent(findTestObject('IphoneDevice/JoinOurTeamNz'),2)
				WebUI.click(findTestObject("IphoneDevice/JoinOurTeamNz"))
		
				// Get the page title
				String pageTitle = WebUI.getWindowTitle()
				println("Page Title: " + pageTitle)
		
		
				WebUI.verifyElementPresent(findTestObject("Object Repository/About_us/JoinOurTeam/join_our_team_header"), 5)
//				WebUI.verifyElementPresent(findTestObject("Object Repository/About_us/JoinOurTeam/enquire_today"), 5)
//				WebUI.verifyElementPresent(findTestObject("Object Repository/About_us/JoinOurTeam/paragraph"), 5)
//				WebUI.verifyElementPresent(findTestObject("Object Repository/About_us/JoinOurTeam/linkedin"), 5)
//				WebUI.verifyElementPresent(findTestObject("Object Repository/About_us/JoinOurTeam/facebook"), 5)
				WebUI.verifyElementPresent(findTestObject("Object Repository/About_us/JoinOurTeam/first_name"), 5)
				WebUI.verifyElementPresent(findTestObject("Object Repository/About_us/JoinOurTeam/surname"), 5)
				WebUI.verifyElementPresent(findTestObject("Object Repository/About_us/JoinOurTeam/email"), 5)
				WebUI.verifyElementPresent(findTestObject("Object Repository/About_us/JoinOurTeam/phone"), 5)
				WebUI.verifyElementPresent(findTestObject("Object Repository/About_us/JoinOurTeam/country"), 5)
				WebUI.verifyElementPresent(findTestObject("Object Repository/About_us/JoinOurTeam/state"), 5)
				WebUI.verifyElementPresent(findTestObject("Object Repository/About_us/JoinOurTeam/current_job_title"), 5)
				WebUI.verifyElementPresent(findTestObject("Object Repository/About_us/JoinOurTeam/availability"), 5)
		
				WebUI.verifyElementPresent(findTestObject("Object Repository/About_us/JoinOurTeam/resume"), 5)
				WebUI.verifyElementPresent(findTestObject("Object Repository/About_us/JoinOurTeam/resume_upload"), 5)
		
				WebUI.verifyElementPresent(findTestObject("Object Repository/About_us/JoinOurTeam/cover_letter"), 5)
				WebUI.verifyElementPresent(findTestObject("Object Repository/About_us/JoinOurTeam/cover_letter_upload"), 5)
		
				WebUI.verifyElementPresent(findTestObject("Object Repository/About_us/JoinOurTeam/terms_check"), 5)
				WebUI.verifyElementPresent(findTestObject("Object Repository/About_us/JoinOurTeam/confirm_work_check"), 5)
		
				WebUI.verifyElementPresent(findTestObject("Object Repository/About_us/JoinOurTeam/express_interest"), 5)
		
//				WebUI.verifyElementPresent(findTestObject("Object Repository/About_us/JoinOurTeam/important"), 5)
		
				KeywordLogger log = new KeywordLogger()
				log.logPassed("SCM-123: Validation passed successfully.")
			}

	def validateSeniorManagement() {
		logger.logInfo("Starting our Senior Management scenario..........")
		WebUI.delay(3)
		logger.logInfo("Starting our leaders -Our history scenario..........")

		WebUI.verifyElementPresent(findTestObject("IphoneDevice/Hamburger"),5)
		WebUI.waitForElementClickable(findTestObject('IphoneDevice/Hamburger'), 10)

		WebUI.click(findTestObject("IphoneDevice/Hamburger"))

		logger.logInfo("Starting validate about us scenario..........")
		WebUI.click(findTestObject("IphoneDevice/aboutus"))

		WebUI.click(findTestObject("IphoneDevice/Our_Leaders"))

		WebUI.enhancedClick(findTestObject("IphoneDevice/Meet_our_senior_managers"))

		logger.logInfo("Validating GRAHAM CRONIN..........")
		WebUI.delay(5)
		WebUI.scrollToElement(findTestObject("Object Repository/About_us/Our_leader/Meet_Our_Senior_Management/GRAHAM_CRONIN/graham_cronin"),2)
		WebUI.verifyElementPresent(findTestObject("Object Repository/About_us/Our_leader/Meet_Our_Senior_Management/GRAHAM_CRONIN/graham_cronin"),2)
	//	WebUI.click(findTestObject("Object Repository/About_us/Our_leader/Meet_Our_Senior_Management/GRAHAM_CRONIN/graham_cronin"))
		WebUI.scrollToElement(findTestObject("Object Repository/About_us/Our_leader/Meet_Our_Senior_Management/GRAHAM_CRONIN/graham_cronin - Linkedin Button"),2)
		WebUI.click(findTestObject("Object Repository/About_us/Our_leader/Meet_Our_Senior_Management/GRAHAM_CRONIN/graham_cronin - Linkedin Button"))
		WebUI.switchToWindowIndex(1)

		assert WebUI.getUrl().toString().contains("linkedin"),"Graham_Cronin_linkedin page Navigation Failed"

		logger.logInfo("Validating GRAHAM CRONIN completed..........")

		WebUI.closeWindowIndex(1)
		WebUI.switchToWindowIndex(0)
		WebUI.back()
		WebUI.enhancedClick(findTestObject("IphoneDevice/Meet_our_senior_managers"))

		logger.logInfo("Validating SHAUN ANDERSON..........")
		WebUI.scrollToElement(findTestObject("Object Repository/About_us/Our_leader/Meet_Our_Senior_Management/SHAUN_ANDERSON/shaun_anderson"),2)
		WebUI.verifyElementPresent(findTestObject("Object Repository/About_us/Our_leader/Meet_Our_Senior_Management/SHAUN_ANDERSON/shaun_anderson"),2)
		//WebUI.click(findTestObject("Object Repository/About_us/Our_leader/Meet_Our_Senior_Management/SHAUN_ANDERSON/shaun_anderson"))
		WebUI.scrollToElement(findTestObject("Object Repository/About_us/Our_leader/Meet_Our_Senior_Management/SHAUN_ANDERSON/shaun_anderson - Linkedin Button"),2)
		WebUI.click(findTestObject("Object Repository/About_us/Our_leader/Meet_Our_Senior_Management/SHAUN_ANDERSON/shaun_anderson - Linkedin Button"))
		WebUI.switchToWindowIndex(1)

		assert WebUI.getUrl().toString().contains("linkedin"),"Graham_Cronin_linkedin page Navigation Failed"

		logger.logInfo("Validating SHAUN ANDERSON completed..........")

		WebUI.closeWindowIndex(1)
		WebUI.switchToWindowIndex(0)
		WebUI.back()
		WebUI.enhancedClick(findTestObject("IphoneDevice/Meet_our_senior_managers"))

		logger.logInfo("Validating MATTHEW CLAYTON..........")
		WebUI.scrollToElement(findTestObject("Object Repository/About_us/Our_leader/Meet_Our_Senior_Management/MATHEW_CLAYTON/mathew_clayton"),2)
		WebUI.verifyElementPresent(findTestObject("Object Repository/About_us/Our_leader/Meet_Our_Senior_Management/MATHEW_CLAYTON/mathew_clayton"),2)
		//WebUI.click(findTestObject("Object Repository/About_us/Our_leader/Meet_Our_Senior_Management/MATHEW_CLAYTON/mathew_clayton"))
		WebUI.scrollToElement(findTestObject("Object Repository/About_us/Our_leader/Meet_Our_Senior_Management/MATHEW_CLAYTON/mathew_clayton - Linkedin Button"),2)
		WebUI.click(findTestObject("Object Repository/About_us/Our_leader/Meet_Our_Senior_Management/MATHEW_CLAYTON/mathew_clayton - Linkedin Button"))
		WebUI.switchToWindowIndex(1)

		assert WebUI.getUrl().toString().contains("linkedin"),"mathew_clayton_linkedin page Navigation Failed"

		logger.logInfo("Validating MATTHEW CLAYTON completed..........")

		WebUI.closeWindowIndex(1)
		WebUI.switchToWindowIndex(0)
		WebUI.back()
		WebUI.enhancedClick(findTestObject("IphoneDevice/Meet_our_senior_managers"))

		logger.logInfo("Validating MATTHEW CLAYTON..........")
		WebUI.scrollToElement(findTestObject("Object Repository/About_us/Our_leader/Meet_Our_Senior_Management/MATHEW_CLAYTON/mathew_clayton"),2)
		WebUI.verifyElementPresent(findTestObject("Object Repository/About_us/Our_leader/Meet_Our_Senior_Management/MATHEW_CLAYTON/mathew_clayton"),2)
		//WebUI.click(findTestObject("Object Repository/About_us/Our_leader/Meet_Our_Senior_Management/MATHEW_CLAYTON/mathew_clayton"))
		WebUI.scrollToElement(findTestObject("Object Repository/About_us/Our_leader/Meet_Our_Senior_Management/MATHEW_CLAYTON/mathew_clayton - Linkedin Button"),2)
		WebUI.click(findTestObject("Object Repository/About_us/Our_leader/Meet_Our_Senior_Management/MATHEW_CLAYTON/mathew_clayton - Linkedin Button"))
		WebUI.switchToWindowIndex(1)

		assert WebUI.getUrl().toString().contains("linkedin"),"mathew_clayton_linkedin page Navigation Failed"

		logger.logInfo("Validating MATTHEW CLAYTON completed..........")

		WebUI.closeWindowIndex(1)
		WebUI.switchToWindowIndex(0)
		WebUI.back()
		WebUI.enhancedClick(findTestObject("IphoneDevice/Meet_our_senior_managers"))
	}
	def validateSeniorManagemenmbl(){logger.logInfo("Starting our Senior Management scenario..........")
		WebUI.delay(3)
		logger.logInfo("Starting our leaders -Our history scenario..........")
		
		WebUI.verifyElementPresent(findTestObject("IphoneDevice/Hamburger"),5)
		WebUI.waitForElementClickable(findTestObject('IphoneDevice/Hamburger'), 10)
		
		WebUI.click(findTestObject("IphoneDevice/Hamburger"))
		
		logger.logInfo("Starting validate about us scenario..........")
		WebUI.click(findTestObject("IphoneDevice/aboutus"))
		
		WebUI.click(findTestObject("IphoneDevice/Our_Leaders"))
		
		WebUI.enhancedClick(findTestObject("IphoneDevice/Meet_our_senior_managers"))
		
		logger.logInfo("Validating GRAHAM CRONIN..........")
		WebUI.delay(5)
		WebUI.scrollToElement(findTestObject("Object Repository/About_us/Our_leader/Meet_Our_Senior_Management/GRAHAM_CRONIN/graham_cronin"),2)
		WebUI.verifyElementPresent(findTestObject("Object Repository/About_us/Our_leader/Meet_Our_Senior_Management/GRAHAM_CRONIN/graham_cronin"),2)
		//	WebUI.click(findTestObject("Object Repository/About_us/Our_leader/Meet_Our_Senior_Management/GRAHAM_CRONIN/graham_cronin"))
		WebUI.scrollToElement(findTestObject("Object Repository/About_us/Our_leader/Meet_Our_Senior_Management/GRAHAM_CRONIN/graham_cronin - Linkedin Button"),2)
		WebUI.click(findTestObject("Object Repository/About_us/Our_leader/Meet_Our_Senior_Management/GRAHAM_CRONIN/graham_cronin - Linkedin Button"))
		WebUI.switchToWindowIndex(1)
		
		assert WebUI.getUrl().toString().contains("linkedin"),"Graham_Cronin_linkedin page Navigation Failed"
		
		logger.logInfo("Validating GRAHAM CRONIN completed..........")
		
		WebUI.closeWindowIndex(1)
		WebUI.switchToWindowIndex(0)
		WebUI.back()
		}
	def validateDirectorDetails() {

		logger.logInfo("Starting our director details scenario..........")
		
		WebUI.delay(3)
		//logger.logInfo("Starting our leaders -Our history scenario..........")

		WebUI.verifyElementPresent(findTestObject("IphoneDevice/Hamburger"),5)
		WebUI.waitForElementClickable(findTestObject('IphoneDevice/Hamburger'), 10)

		WebUI.click(findTestObject("IphoneDevice/Hamburger"))

		logger.logInfo("Starting validate about us scenario..........")
		WebUI.click(findTestObject("IphoneDevice/aboutus"))

		WebUI.click(findTestObject("IphoneDevice/Our_Leaders"))
		WebUI.enhancedClick(findTestObject("IphoneDevice/meet_our_directors"))
		
		/*WebUI.click(findTestObject("Homepage/Menu_items/about_us"))
		WebUI.click(findTestObject("About_us/Our_leaders"))
		WebUI.enhancedClick(findTestObject("About_us/Meet_our_directors"))
				WebUI.scrollToElement(findTestObject('About_us/Meet_our_directors'), 5)
		 WebUI.click(findTestObject("About_us/Meet_our_directors"))
		 WebUI.scrollToElement(findTestObject('Object Repository/About_us/Director_List'), 5)
		 WebUI.click(findTestObject('Object Repository/About_us/Director_List'))*/


		def number_of_directors =  WebUI.findWebElements(findTestObject("Object Repository/About_us/Director_List"), 5).size()
		println("Number of directors = "+number_of_directors)

		// Find all directors on the page
		// Find all director elements
		List<WebElement> elements = WebUI.findWebElements(findTestObject("Object Repository/About_us/Director_List"), 10)

		// Expected director list
		List<String> expected_directorList = [
			"PHILIP LATHAM\nChairman | Partner\nNavis Capital\nLinkedIn",
			"MICHAEL TREVASKIS\nExecutive Vice Chairman\nLinkedIn",
			"EMMA CLEARY\nNon-Executive Director\nLinkedIn",
			"WILLIAM WHITTLE\nNon-Executive Director | Navis Capital\nLinkedIn",
			"HEATH PRIESTLY\nChief Executive Officer\nLinkedIn",
			"BEN ARTHUR\nChief Financial Officer | Company Secretary\nLinkedIn",
			"NATHANIEL MCLAY\nManaging Director, Asia\nLinkedIn",
			"MEREDITH ARCHIBALD\nDirector of Operations\nLinkedIn",
			"LISA KIRSCH\nDirector of Sales – Surgical & Hospital\nLinkedIn",
			"ANTHONY GENNUSA\nDirector of Sales – Healthcare\nLinkedIn",
			"MICHELLE STEWART\nDirector of People, Brand & Innovation\nLinkedIn"
		]

		// Create a list for actual texts
		List<String> directorList = []

		// Compare each element
		for (int i = 0; i < elements.size(); i++) {
			String actualText = elements[i].getText().strip()
			String expectedText = expected_directorList[i].strip()

			// Replace line breaks followed by text with a space (to join broken lines)
			actualText = actualText.replaceAll("[\\r\\n]+", " ").replaceAll("\\s+", " ").strip()
			expectedText = expectedText.replaceAll("[\\r\\n]+", " ").replaceAll("\\s+", " ").strip()

			println("Comparing Director ${i + 1}:")
			println("Expected:\n${expectedText}")
			println("Actual:\n${actualText}")

			assert actualText == expectedText : "Mismatch at index ${i} → Expected '${expectedText}' but found '${actualText}'"
		}


		println("\nAll director entries match the expected list.")
		logger.logInfo("SCM-SCM-136Our director details scenario completed ..........")
	}
}
