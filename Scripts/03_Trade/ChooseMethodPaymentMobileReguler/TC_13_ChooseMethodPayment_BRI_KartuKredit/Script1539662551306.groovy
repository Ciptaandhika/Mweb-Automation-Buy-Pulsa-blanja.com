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

WebUI.selectOptionByLabel(findTestObject('Object Repository/Jasa_Pengiriman/Pilih_Pengiriman'),'Kurir Standar',false)
WebUI.delay(1)
WebUI.click(findTestObject('Trade_Payment_Method/Click_Bank/ClickBank/Click_03_BRI'))

WebUI.delay(1)

WebUI.click(findTestObject('Trade_Payment_Method/Click_Bank/BRI_Reguler/Click_12_BRI_KartuKredit'))

CustomKeywords.'blj.common.report.Autoplaced.AppendToBlanjaAutoplacedReport'('BRI Kartu Kredit', true)