package performancePOM

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI




public class Performanceload {
	@Keyword
	def measurePageLoad(String pageName, String url, int maxTime = 50) {

		WebUI.waitForPageLoad(30)

		// Safer JS for all Chrome versions
		def loadTime = WebUI.executeJavaScript("""
            if (window.performance && window.performance.timing) {
                var t = window.performance.timing;
                return t.loadEventEnd - t.navigationStart;
            } else {
                return 0;
            }
        """, null)

		if (loadTime == null) {
			loadTime = 0
		}

		double seconds = loadTime / 1000

		KeywordUtil.logInfo("--------------------------------------------------")
		KeywordUtil.logInfo("Page Name : " + pageName)
		KeywordUtil.logInfo("URL       : " + url)
		KeywordUtil.logInfo("Load Time : " + seconds + " seconds")
		KeywordUtil.logInfo("--------------------------------------------------")

		if (seconds > maxTime) {
			KeywordUtil.markFailed("❌ " + pageName +
					" FAILED - Load Time exceeded " + maxTime +
					" sec | Actual: " + seconds + " sec")
		}

		return seconds
	}
}
