
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import java.lang.String

import com.kms.katalon.core.testobject.TestObject

import com.applitools.eyes.selenium.Eyes

import org.openqa.selenium.WebElement

import com.applitools.eyes.RectangleSize



def static "stepsNZ.CountrySelector.validateCountrySelector"() {
    (new stepsNZ.CountrySelector()).validateCountrySelector()
}


def static "performancePOM.Performanceload.measurePageLoad"(
    	String pageName	
     , 	String url	
     , 	int maxTime	) {
    (new performancePOM.Performanceload()).measurePageLoad(
        	pageName
         , 	url
         , 	maxTime)
}


def static "performancePOM.Performanceload.measurePageLoad"(
    	String pageName	
     , 	String url	) {
    (new performancePOM.Performanceload()).measurePageLoad(
        	pageName
         , 	url)
}


def static "steps.Launch.launchUrl"(
    	String url	) {
    (new steps.Launch()).launchUrl(
        	url)
}


def static "steps.CountrySelector.validateCountrySelector"() {
    (new steps.CountrySelector()).validateCountrySelector()
}


def static "mobile.CountrySelector.validateCountrySelector"() {
    (new mobile.CountrySelector()).validateCountrySelector()
}


def static "steps.SikuliHelper.compareScreenshot"(
    	String baselinePath	
     , 	String currentPath	) {
    (new steps.SikuliHelper()).compareScreenshot(
        	baselinePath
         , 	currentPath)
}


def static "steps.LaunchTablet.launchTabletView"(
    	String url	) {
    (new steps.LaunchTablet()).launchTabletView(
        	url)
}


def static "com.katalon.testcloud.FileExecutor.exist"(
    	String fileName	) {
    (new com.katalon.testcloud.FileExecutor()).exist(
        	fileName)
}


def static "com.katalon.testcloud.FileExecutor.getFileDescriptor"(
    	String fileName	) {
    (new com.katalon.testcloud.FileExecutor()).getFileDescriptor(
        	fileName)
}


def static "com.katalon.testcloud.FileExecutor.getFileContent"(
    	String fileName	) {
    (new com.katalon.testcloud.FileExecutor()).getFileContent(
        	fileName)
}


def static "com.katalon.testcloud.FileExecutor.pushFileToDevice"(
    	String destinationPath	
     , 	String localFilePath	) {
    (new com.katalon.testcloud.FileExecutor()).pushFileToDevice(
        	destinationPath
         , 	localFilePath)
}


def static "com.katalon.testcloud.FileExecutor.uploadFileToWeb"(
    	TestObject to	
     , 	String filePath	) {
    (new com.katalon.testcloud.FileExecutor()).uploadFileToWeb(
        	to
         , 	filePath)
}


def static "com.katalon.testcloud.GeolocationExecutor.setMobileGeoLocation"(
    	double latitude	
     , 	double longitude	
     , 	double altitude	) {
    (new com.katalon.testcloud.GeolocationExecutor()).setMobileGeoLocation(
        	latitude
         , 	longitude
         , 	altitude)
}


def static "com.katalon.testcloud.BiometricsAuthenticator.authenticatePass"() {
    (new com.katalon.testcloud.BiometricsAuthenticator()).authenticatePass()
}


def static "com.katalon.testcloud.BiometricsAuthenticator.authenticateFail"() {
    (new com.katalon.testcloud.BiometricsAuthenticator()).authenticateFail()
}


def static "com.katalon.testcloud.CameraImageInjectionExecutor.exist"(
    	String fileName	) {
    (new com.katalon.testcloud.CameraImageInjectionExecutor()).exist(
        	fileName)
}


def static "com.katalon.testcloud.CameraImageInjectionExecutor.injectImage"(
    	String fileName	) {
    (new com.katalon.testcloud.CameraImageInjectionExecutor()).injectImage(
        	fileName)
}


def static "com.katalon.testcloud.ThrottleNetworkExecutor.customNetworkProfile"(
    	int downloadSpeed	
     , 	int uploadSpeed	
     , 	int latency	) {
    (new com.katalon.testcloud.ThrottleNetworkExecutor()).customNetworkProfile(
        	downloadSpeed
         , 	uploadSpeed
         , 	latency)
}


def static "com.katalon.testcloud.ThrottleNetworkExecutor.setNetworkProfile"(
    	String condition	) {
    (new com.katalon.testcloud.ThrottleNetworkExecutor()).setNetworkProfile(
        	condition)
}


def static "com.katalon.extent.report.ExtentReport.logWarning"(
    	String message	) {
    (new com.katalon.extent.report.ExtentReport()).logWarning(
        	message)
}


def static "com.katalon.extent.report.ExtentReport.logInfo"(
    	String message	) {
    (new com.katalon.extent.report.ExtentReport()).logInfo(
        	message)
}


def static "com.katalon.extent.report.ExtentReport.logPass"(
    	String message	) {
    (new com.katalon.extent.report.ExtentReport()).logPass(
        	message)
}


def static "com.katalon.extent.report.ExtentReport.attachLog"(
    	String message	) {
    (new com.katalon.extent.report.ExtentReport()).attachLog(
        	message)
}


def static "com.katalon.extent.report.ExtentReport.logFail"(
    	String message	) {
    (new com.katalon.extent.report.ExtentReport()).logFail(
        	message)
}


def static "com.katalon.extent.report.ExtentReport.addScreenshot"(
    	String message	) {
    (new com.katalon.extent.report.ExtentReport()).addScreenshot(
        	message)
}


def static "com.katalon.extent.report.ExtentReport.addScreenshot"() {
    (new com.katalon.extent.report.ExtentReport()).addScreenshot()
}


def static "com.katalon.extent.report.ExtentReport.flushReport"() {
    (new com.katalon.extent.report.ExtentReport()).flushReport()
}


def static "com.kms.katalon.keyword.applitools.BasicKeywords.checkElement"(
    	Eyes eyes	
     , 	WebElement element	) {
    (new com.kms.katalon.keyword.applitools.BasicKeywords()).checkElement(
        	eyes
         , 	element)
}


def static "com.kms.katalon.keyword.applitools.BasicKeywords.checkWindow"(
    	String testName	) {
    (new com.kms.katalon.keyword.applitools.BasicKeywords()).checkWindow(
        	testName)
}


def static "com.kms.katalon.keyword.applitools.BasicKeywords.checkTestObject"(
    	TestObject testObject	
     , 	String testName	) {
    (new com.kms.katalon.keyword.applitools.BasicKeywords()).checkTestObject(
        	testObject
         , 	testName)
}


def static "com.kms.katalon.keyword.applitools.EyesKeywords.eyesOpenWithBaseline"(
    	String baselineName	
     , 	String testName	
     , 	RectangleSize viewportSize	) {
    (new com.kms.katalon.keyword.applitools.EyesKeywords()).eyesOpenWithBaseline(
        	baselineName
         , 	testName
         , 	viewportSize)
}


def static "com.kms.katalon.keyword.applitools.EyesKeywords.eyesClose"(
    	Eyes eyes	) {
    (new com.kms.katalon.keyword.applitools.EyesKeywords()).eyesClose(
        	eyes)
}


def static "com.kms.katalon.keyword.applitools.EyesKeywords.eyesOpen"(
    	String testName	
     , 	RectangleSize viewportSize	) {
    (new com.kms.katalon.keyword.applitools.EyesKeywords()).eyesOpen(
        	testName
         , 	viewportSize)
}


def static "com.kms.katalon.keyword.applitools.EyesKeywords.eyesInit"() {
    (new com.kms.katalon.keyword.applitools.EyesKeywords()).eyesInit()
}
