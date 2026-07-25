import com.kms.katalon.core.annotation.BeforeTestSuite
import com.kms.katalon.core.annotation.AfterTestSuite
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver

import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.context.TestCaseContext


class MyTestListener {
    @BeforeTestSuite
    def setup(TestCaseContext testCaseContext) {
//        WebDriver driver = new ChromeDriver()
//        DriverFactory.changeWebDriver(driver)
    }

    @AfterTestSuite
    def teardown(TestCaseContext testCaseContext) {
//        DriverFactory.getWebDriver()?.quit()
    }
}

