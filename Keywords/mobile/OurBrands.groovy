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

import internal.GlobalVariable
import com.kms.katalon.core.util.KeywordUtil

import java.util.ArrayList
import java.util.List
import com.kms.katalon.core.webui.common.WebUiCommonHelper

import com.kms.katalon.core.testobject.ConditionType

import org.openqa.selenium.WebElement
public class OurBrands {

	def validateOurBrands() {

		WebUI.delay(5)
		WebUI.verifyElementPresent(findTestObject("IphoneDevice/Hamburger"),5)
		WebUI.waitForElementClickable(findTestObject('IphoneDevice/Hamburger'), 10)

		WebUI.click(findTestObject("IphoneDevice/Hamburger"))

		WebUI.verifyElementPresent(findTestObject("IphoneDevice/Menu_items/our_brands"),2)
		WebUI.delay(3)
		WebUI.click(findTestObject("IphoneDevice/Menu_items/our_brands"))

		/*WebUI.click(findTestObject("Homepage/Our_brands/A"))
		 WebUI.verifyElementPresent(findTestObject("Homepage/Our_brands/abbvie"),5)
		 WebUI.verifyElementPresent(findTestObject("Homepage/Our_brands/aktina"),5)
		 WebUI.click(findTestObject("Homepage/Our_brands/B"))
		 WebUI.verifyElementPresent(findTestObject("Homepage/Our_brands/bentley"),5)
		 WebUI.verifyElementPresent(findTestObject("Homepage/Our_brands/brandon"),5)
		 WebUI.click(findTestObject("Homepage/Our_brands/C"))
		 WebUI.verifyElementPresent(findTestObject("Homepage/Our_brands/citec"),5)
		 WebUI.verifyElementPresent(findTestObject("Homepage/Our_brands/cu"),5)
		 WebUI.click(findTestObject("Homepage/Our_brands/D"))
		 WebUI.verifyElementPresent(findTestObject("Homepage/Our_brands/denyers"),5)
		 WebUI.verifyElementPresent(findTestObject("Homepage/Our_brands/diagnosys"),5)
		 WebUI.click(findTestObject("Homepage/Our_brands/E"))
		 WebUI.verifyElementPresent(findTestObject("Homepage/Our_brands/eagle_vision"),5)
		 WebUI.verifyElementPresent(findTestObject("Homepage/Our_brands/ShowAll"),5)
		 WebUI.verifyElementPresent(findTestObject("Homepage/Our_brands/Number"),5)
		 WebUI.click(findTestObject("Homepage/Our_brands/Number"))
		 WebUI.click(findTestObject("Homepage/Our_brands/ShowAll"))*/
		def brandChecks = [
			["A", ["abbvie", "AMT"]],
			["B", ["Bentley", "Brandon"]],
			["C", ["citec", "cu"]],
			[
				"D",
				["denyers", "diagnosys"]]
			//["E", ["eagle_vision"]]
		]

		for (List group : brandChecks) {
			String letter = group[0]
			List<String> brands = group[1]

			WebUI.click(findTestObject("Homepage/Our_brands/" + letter))

			for (String brand : brands) {
				TestObject obj = findTestObject("Homepage/Our_brands/" + brand)
				if (WebUI.verifyElementPresent(obj, 5, FailureHandling.OPTIONAL)) {
					WebUI.comment("✅ SCM-80 -Pass : Brand present: " + brand)
				} else {
					WebUI.comment("❌SCM-80 -Fail Brand missing: " + brand)
					assert false : "Brand '" + brand + "' not found under section " + letter
				}
			}
		}

		WebUI.verifyElementPresent(findTestObject("Homepage/Our_brands/ShowAll"),5)
		WebUI.verifyElementPresent(findTestObject("Homepage/Our_brands/Number"),5)
		WebUI.click(findTestObject("Homepage/Our_brands/Number"))
		WebUI.click(findTestObject("Homepage/Our_brands/ShowAll"))
	}

	def validateOurBrandsNz() {
		
				WebUI.delay(5)
				WebUI.verifyElementPresent(findTestObject("IphoneDevice/Hamburger"),5)
				WebUI.waitForElementClickable(findTestObject('IphoneDevice/Hamburger'), 10)
		
				WebUI.click(findTestObject("IphoneDevice/Hamburger"))
		
				WebUI.verifyElementPresent(findTestObject("IphoneDevice/Menu_items/our_brands"),2)
				WebUI.delay(3)
				WebUI.click(findTestObject("IphoneDevice/Menu_items/our_brands"))
		
				def brandChecks = [
					["A", ["abbvie", "AMT"]],
					["B", ["Bentley", "Brandon"]],
				]
		
				for (List group : brandChecks) {
					String letter = group[0]
					List<String> brands = group[1]
		
					WebUI.click(findTestObject("Homepage/Our_brands/" + letter))
		
					for (String brand : brands) {
						TestObject obj = findTestObject("Homepage/Our_brands/" + brand)
						if (WebUI.verifyElementPresent(obj, 5, FailureHandling.OPTIONAL)) {
							WebUI.comment("✅ SCM-80 -Pass : Brand present: " + brand)
						} else {
							WebUI.comment("❌SCM-80 -Fail Brand missing: " + brand)
							assert false : "Brand '" + brand + "' not found under section " + letter
						}
					}
				}
		
				WebUI.verifyElementPresent(findTestObject("Homepage/Our_brands/ShowAll"),5)
				WebUI.verifyElementPresent(findTestObject("Homepage/Our_brands/Number"),5)
				WebUI.click(findTestObject("Homepage/Our_brands/Number"))
				WebUI.click(findTestObject("Homepage/Our_brands/ShowAll"))
			}
		
	
	def validateCategories() {
		WebUI.click(findTestObject("Homepage/Our_brands/C"))
		WebUI.click(findTestObject("Homepage/Our_brands/Categories/Check_boxes/Cardiology_Vascular_Radiology"))
		WebUI.click(findTestObject("Homepage/Our_brands/Categories/Check_boxes/Cardiology_Vascular_Radiology"))
		WebUI.click(findTestObject("Homepage/Our_brands/Categories/Check_boxes/Cardiology_Vascular_Radiology"))
		WebUI.verifyElementPresent(findTestObject("Homepage/Our_brands/Categories/Cardiology_Vascular_Radiology/Atrion"),5)
		WebUI.verifyElementPresent(findTestObject("Homepage/Our_brands/Categories/Cardiology_Vascular_Radiology/Balt"),5)
		WebUI.click(findTestObject("Homepage/Our_brands/Categories/Check_boxes/Cardiology_Vascular_Radiology"))

		WebUI.click(findTestObject("Homepage/Our_brands/Categories/Check_boxes/Cardiothoracic_Surgery"))
		WebUI.verifyElementPresent(findTestObject("Homepage/Our_brands/Categories/Cardiothoracic_Surgery/Artivion"),5)
		WebUI.verifyElementPresent(findTestObject("Homepage/Our_brands/Categories/Cardiothoracic_Surgery/Medela"),5)
		WebUI.click(findTestObject("Homepage/Our_brands/Categories/Check_boxes/Cardiothoracic_Surgery"))

		WebUI.click(findTestObject("Homepage/Our_brands/Categories/Check_boxes/Critical_Care"))
		WebUI.verifyElementPresent(findTestObject("Homepage/Our_brands/Categories/Critical_care/Flexi_Care"),5)
		WebUI.verifyElementPresent(findTestObject("Homepage/Our_brands/Categories/Critical_care/Piramal"),5)
		WebUI.click(findTestObject("Homepage/Our_brands/Categories/Check_boxes/Critical_Care"))

		WebUI.click(findTestObject("Homepage/Our_brands/Categories/Check_boxes/Gastroenterology"))
		WebUI.verifyElementPresent(findTestObject("Homepage/Our_brands/Categories/Gastroenterology/Abbvie"),5)
		WebUI.verifyElementPresent(findTestObject("Homepage/Our_brands/Categories/Gastroenterology/Ambu"),5)
		WebUI.click(findTestObject("Homepage/Our_brands/Categories/Check_boxes/Gastroenterology"))

		WebUI.click(findTestObject("Homepage/Our_brands/Categories/Check_boxes/Hospital_Infrastructure"))
		WebUI.verifyElementPresent(findTestObject("Homepage/Our_brands/Categories/Hospital_Infrastructure/Aethon"),5)
		WebUI.verifyElementPresent(findTestObject("Homepage/Our_brands/Categories/Hospital_Infrastructure/Nimble"),5)
		WebUI.click(findTestObject("Homepage/Our_brands/Categories/Check_boxes/Hospital_Infrastructure"))
	}

	def validatePagination() {

		/*		String paginationXPath = "//div[contains(@class,'page-list')]/a[normalize-space(text()) and not(contains(text(),'Next')) and not(contains(text(),'Previous'))]"
		 List<WebElement> pages = WebUiCommonHelper.findWebElements(
		 new TestObject().addProperty("xpath", ConditionType.EQUALS, paginationXPath), 5)
		 int totalPages = pages.size()
		 WebUI.comment("🔢 Total pages found: " + totalPages)
		 for (int i = 1; i <= totalPages; i++) {
		 TestObject pageLink = new TestObject("Page_" + i)
		 pageLink.addProperty("xpath", ConditionType.EQUALS,
		 "//div[contains(@class,'page-list')]/a[normalize-space(text())='" + i + "']")
		 if (WebUI.verifyElementPresent(pageLink, 5, FailureHandling.OPTIONAL)) {
		 WebUI.click(pageLink)
		 WebUI.delay(2)
		 WebUI.comment("📄 Navigated to page " + i)
		 } else {
		 WebUI.comment("❌ Page " + i + " link not found.")
		 assert false : "Missing pagination link for page " + i
		 }
		 }
		 }*/


		// Define pagination container
		TestObject paginationContainer = new TestObject("PaginationContainer")
		paginationContainer.addProperty("xpath", ConditionType.EQUALS, "//div[contains(@class,'page-list')]")

		if (WebUI.verifyElementPresent(paginationContainer, 5, FailureHandling.OPTIONAL)) {
			WebUI.comment("✅ SCM-82 - Pass : Pagination is available.")
			WebUI.scrollToElement(paginationContainer, 3)
			WebUI.delay(2)

			int currentPage = 1
			boolean hasNext = true

			while (hasNext) {
				// Click current page link
				TestObject pageLink = new TestObject("Page_" + currentPage)
				pageLink.addProperty("xpath", ConditionType.EQUALS,
						"//div[contains(@class,'page-list')]/a[normalize-space(text())='" + currentPage + "']")

				if (WebUI.verifyElementPresent(pageLink, 5, FailureHandling.OPTIONAL)) {
					WebUI.click(pageLink)
					WebUI.delay(2)
					WebUI.comment("📄 Navigated to page " + currentPage)

					// ✅ Validate brand elements on this page
					TestObject brandCard = new TestObject("BrandCard")
					brandCard.addProperty("xpath", ConditionType.EQUALS, "//div[contains(@class,'brand-items')]/div")
					List<WebElement> brands = WebUiCommonHelper.findWebElements(brandCard, 5)
					WebUI.comment("🧩 Brands found on page " + currentPage + ": " + brands.size())
				} else {
					WebUI.comment("❌ Page " + currentPage + " link not found.")
					break
				}

				// Check if Next arrow is present
				TestObject nextArrow = new TestObject("NextArrow")
				nextArrow.addProperty("xpath", ConditionType.EQUALS, "//a[@rel='next']")

				if (WebUI.verifyElementPresent(nextArrow, 2, FailureHandling.OPTIONAL)) {
					WebUI.click(nextArrow)
					WebUI.delay(2)
					currentPage++
				} else {
					WebUI.comment("✅ Reached last page — no more Next arrow.")
					hasNext = false
				}
			}

			// Verify Previous arrow
			TestObject previousArrow = new TestObject("PreviousArrow")
			previousArrow.addProperty("xpath", ConditionType.EQUALS, "//a[@aria-label='Previous page']")

			if (WebUI.verifyElementPresent(previousArrow, 2, FailureHandling.OPTIONAL)) {
				WebUI.comment("⬅️ Previous arrow is present.")
			} else {
				WebUI.comment("⚠️ Previous arrow not found.")
			}
		} else {
			WebUI.comment("❌ SCM-82 -Fail : Pagination is not available on this page.")
			assert false : "Pagination container not found."
		}
	}


	def validateBrandDetailsPage() {


		//WebUI.click(findTestObject("Homepage/Menu_items/our_brands"))
		//WebUI.click(findTestObject("Homepage/Our_brands/Categories/Check_boxes/Cardiology_Vascular_Radiology"))
		//WebUI.verifyElementPresent(findTestObject("Homepage/Our_brands/Categories/Cardiology_Vascular_Radiology/Atrion"),5)
		//WebUI.click(findTestObject("Homepage/Our_brands/Categories/Cardiology_Vascular_Radiology/Atrion"))
		WebUI.click(findTestObject("Homepage/Our_brands/A"))
		WebUI.verifyElementPresent(findTestObject("Homepage/Our_brands/abbvie"),5)
		WebUI.click(findTestObject("Homepage/Our_brands/abbvie"))
		WebUI.verifyElementPresent(findTestObject("Ourbrands/BrandLogo"),5)
		WebUI.verifyElementPresent(findTestObject("Ourbrands/JumpToAbout"),5)
		WebUI.click(findTestObject("Ourbrands/JumpToAbout"))
		WebUI.verifyElementPresent(findTestObject("Ourbrands/About"),5)
		// Verify the element is present
		if (WebUI.verifyElementPresent(findTestObject("IphoneDevice/AbbvieHeading"), 5)) {
			// Get the text of the element
			String headingText = WebUI.getText(findTestObject("IphoneDevice/AbbvieHeading"))

			// Print the text to the console
			println("SCM-83:Pass: Heading text: " + headingText)
		} else {
			println("SCM-83:Fail: Element 'Ourbrands/Heading' not found within timeout.")
		}
	}

	def validationOfVision() {

		KeywordUtil.logInfo("🔍 Starting Vision Component(Get In Touch) validation")
		/*WebUI.click(findTestObject("Homepage/Menu_items/our_brands"))
		 WebUI.click(findTestObject("Homepage/Our_brands/Categories/Check_boxes/Cardiology_Vascular_Radiology"))
		 WebUI.verifyElementPresent(findTestObject("Homepage/Our_brands/Categories/Cardiology_Vascular_Radiology/Atrion"),5)
		 WebUI.click(findTestObject("Homepage/Our_brands/Categories/Cardiology_Vascular_Radiology/Atrion"))*/
		/*WebUI.click(findTestObject("Homepage/Our_brands/A"))
		 WebUI.click(findTestObject("Homepage/Our_brands/abbvie"))
		 WebUI.verifyElementPresent(findTestObject("Homepage/Our_brands/abbvie"),5)*/

		// Scroll to the same element (or another target element if needed)


		WebUI.scrollToElement(findTestObject("Ourbrands/GetInTouchBtn"), 10)

		// Wait for visibility or presence (adjust timeout as needed)
		WebUI.waitForElementVisible(findTestObject("Ourbrands/GetInTouchBtn"), 10)
		WebUI.verifyElementPresent(findTestObject("IphoneDevice/LearnMoreHeading"),5)
		WebUI.verifyElementPresent(findTestObject("Ourbrands/WorkingTogether"),5)
		WebUI.verifyElementPresent(findTestObject("IphoneDevice/VisionHeading"),5)

		WebUI.click(findTestObject("Ourbrands/GetInTouchBtn"))
		String pageTitle = WebUI.getWindowTitle()
		println("📄 Page title is: " + pageTitle)
		String currentUrl = WebUI.getUrl()
		println("Present url of the page:"+currentUrl)



		println("SCM-86:Pass: Vision Component(Get In Touch) validated sucessfully")
	}
}
