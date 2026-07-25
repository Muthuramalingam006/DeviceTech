import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import mobile.About_UsLatest as About_UsLatest
import steps.LaunchMobile as LaunchMobile

aboutus = new About_UsLatest()

launchmobile = new LaunchMobile()

KeywordLogger logger = new KeywordLogger()

launchmobile.openiPhone(GlobalVariable.baseUrl)

aboutus.validateSeniorManagemenmbl()

WebUI.closeBrowser()