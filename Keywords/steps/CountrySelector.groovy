package steps

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.time.Duration

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.Select
import org.openqa.selenium.support.ui.WebDriverWait

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class CountrySelector {

	@Keyword
	def validateCountrySelector() {
		
		WebUI.click(findTestObject("ContactUs/CONTACT_US"))
		/*
		 // Step 1: Open browser and navigate
		 WebUI.openBrowser('')
		 WebUI.navigateToUrl('https://www.device.com.au/')
		 WebUI.maximizeWindow()*/
		WebUI.delay(2)

		// Step 2: Scroll to bottom using WebUI
		WebUI.scrollToPosition(0, 15999)
		WebUI.comment("✅ Scrolled to bottom of page.")
		WebUI.delay(2)

		// Step 3: Click country selector if present
		WebDriver driver = DriverFactory.getWebDriver()
		String xpath = "//*[@data-katalon='country-selector']"

		try {
			List<WebElement> elements = driver.findElements(By.xpath(xpath))
			if (elements.size() > 0) {
				WebElement countryElement = elements.get(0)
				countryElement.click()
				WebUI.comment("✅ Clicked on country selector.")
			} else {
				WebUI.comment("❌ No matching country selector found.")
			}
		} catch (Exception e) {
			WebUI.comment("❌ Error clicking country selector: " + e.getMessage())
		}

		// Step 4: Wait for dropdown and select NZ
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10))
			WebElement dropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@data-katalon='country-selector-select']")))
			Select locationSelect = new Select(dropdown)

			// Print all available options
			List<WebElement> allOptions = locationSelect.getOptions();
			for (WebElement option : allOptions) {
				System.out.println("🔹 Dropdown value: " + option.getText());
			}
			//WebUI.click(findTestObject(""))

			locationSelect.selectByVisibleText("NZ")
			WebUI.comment("✅ SCM-33:Pass Selected 'NZ' from dropdown.")

			// Step 5: Click Confirm button
			WebElement confirmButton = wait.until(ExpectedConditions.elementToBeClickable(
					By.xpath("//button[contains(text(), 'Confirm')]")
					)).click()

			
			
			WebUI.comment("✅ SCM-33-Pass -  Clicked Confirm to submit location.")
		} catch (Exception e) {
			WebUI.comment("❌ SCM-33 : Fail -Failed to select 'NZ' or confirm: " + e.getMessage())
		}

	//	WebUI.back()


		WebUI.delay(5)
	}
}