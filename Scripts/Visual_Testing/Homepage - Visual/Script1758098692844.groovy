import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.configuration.RunConfiguration
import java.io.File
import steps.SikuliHelper
import steps.Launch


launch = new Launch()

// Open browser and navigate
launch.launchUrl("https://w3q2.device.com.au/")

// Define absolute path for screenshot
String projectDir = RunConfiguration.getProjectDir() // absolute path to project root
String folderPath = projectDir + "/Images/current/"
File folder = new File(folderPath)
if (!folder.exists()) {
    folder.mkdirs() // create folder if it doesn't exist
}

// File name for the screenshot
String fileName = "current_home_page.png"
String screenshotPath = folderPath + fileName


WebUI.delay(5)
// Take screenshot and save
currentScreenshot = WebUI.takeScreenshot(screenshotPath)

println "✅ Screenshot saved at: " + screenshotPath

WebUI.closeBrowser()

// Baseline screenshot (saved earlier)
String baselineScreenshot = "Images/base/current_home_page.png"

// Compare using Sikuli
SikuliHelper helper = new SikuliHelper()
boolean result = helper.compareScreenshot(baselineScreenshot, currentScreenshot)

if (!result) {
	WebUI.comment("Visual mismatch detected!")
}

WebUI.closeBrowser()
