import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.junit.After as After
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

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.urlmobile)

WebUI.setText(findTestObject('Member_Login/username'), GlobalVariable.username)

WebUI.setText(findTestObject('Member_Login/password'), GlobalVariable.password)

WebUI.click(findTestObject('Object Repository/Member_Login/Button_Masuk'))

WebUI.delay(2)

WebUI.navigateToUrl(GlobalVariable.urlpulsa)

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Pulsa_Mobile/nmr_hp'), GlobalVariable.nmr_hp)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Pulsa_Mobile/Pilih_nominal'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Pulsa_Mobile/Nominal1'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Pulsa_Mobile/Blanja_Sekarang'))

WebUI.delay(1)

