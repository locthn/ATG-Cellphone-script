import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'step 1: Navigate to Page product case-the-amity-affliction-copy'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/product/case-the-amity-affliction-copy')

'step 2: Add visual checkpoint at Page product case-the-amity-affliction-copy'

WebUI.takeFullPageScreenshotAsCheckpoint('TC19-Verify Successful Navigation to Product Case The Amity Affliction Copy Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
