import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'step 1: Navigate to Page product apple-magsafe-charger'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/product/apple-magsafe-charger')

'step 2: Add visual checkpoint at Page product apple-magsafe-charger'

WebUI.takeFullPageScreenshotAsCheckpoint('TC19-Verify page Product Apple Magsafe Charger after navigating to page Product Apple Magsafe Charger_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
