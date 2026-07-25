import internal.GlobalVariable
import steps.Launch
import steps.Login
import steps.OurBrands

launch = new Launch()
login = new Login()
our_brands = new OurBrands()
launch.launchUrl(GlobalVariable.baseUrl)

//launch.launchUrl('https://w3q2.device.com.au/')
our_brands.validateOurBrands() 
//our_brands.validatePagination()
our_brands.validateCategories() 
our_brands.validateBrandDetailsPage()

our_brands.validationOfVision()
//WebUI.closeBrowser()