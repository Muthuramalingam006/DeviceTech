import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable
import mobile.SupportServices
import steps.LaunchMobile

launchmobile = new LaunchMobile()

launchmobile.openiPhone(GlobalVariable.baseUrl)

supportservices = new SupportServices()

supportservices.validateSupportServices()
supportservices.validateTechinicalServices()

supportservices.validateDigitalEducation()

WebUI.closeBrowser()