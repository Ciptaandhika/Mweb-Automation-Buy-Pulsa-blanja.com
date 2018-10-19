import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.navigateToUrl(GlobalVariable.PDP)

WebUI.delay(2)

WebUI.click(findTestObject('PDP/close_dialog_gojek'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/PDP/PDP_Cicilan/select_quantity'))

WebUI.sendKeys(findTestObject('Object Repository/PDP/PDP_Cicilan/select_quantity'),Keys.chord(Keys.DELETE))

WebUI.setText(findTestObject('Object Repository/PDP/PDP_Cicilan/select_quantity'),'25')

WebUI.click(findTestObject('PDP/Btn_tambah_ketroli'))

WebUI.delay(2)

WebUI.click(findTestObject('PDP/Btn_ke_pembayaran'))

WebUI.delay(2)

WebUI.click(findTestObject('PDP/Btn_Pembayaran'))
