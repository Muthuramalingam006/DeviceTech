import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable
import steps.Homepage
import steps.LaunchMobile


homepage = new Homepage()


launchmobile = new LaunchMobile()

launchmobile.openiPhone(GlobalVariable.baseUrlNZ)
WebUI.click(findTestObject('Object Repository/IphoneDevice/Hamburger'))

homepage.validateMenuItemNavigationmblNz()

WebUI.closeBrowser()