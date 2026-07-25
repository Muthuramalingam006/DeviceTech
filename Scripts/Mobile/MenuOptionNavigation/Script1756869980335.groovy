import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable
import mobile.LaunchMobile
import steps.Homepage
import steps.Launch

launch = new Launch()
homepage = new Homepage()


launch.launchUrl("https://w3q2.device.com.au/")
homepage.validateMenuItemNavigation()
WebUI.closeBrowser()