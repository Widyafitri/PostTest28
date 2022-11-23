import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://shop.demoqa.com/')

WebUI.click(findTestObject('Object Repository/Page_ToolsQA Demo Site  ToolsQA  Demo E-Com_8f3fb4/a_Dismiss'))

WebUI.click(findTestObject('Object Repository/Page_ToolsQA Demo Site  ToolsQA  Demo E-Com_8f3fb4/a_My Account'))

WebUI.setText(findTestObject('Object Repository/Page_My Account  ToolsQA Demo Site/input__username'), 'rinjani1354@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_My Account  ToolsQA Demo Site/input__password'), 'UqWUC2oyAYSDi7yxhh+DAg==')

WebUI.click(findTestObject('Object Repository/Page_My Account  ToolsQA Demo Site/button_Log in'))

WebUI.click(findTestObject('Object Repository/Page_My Account  ToolsQA Demo Site/a_Search'))

WebUI.setText(findTestObject('Object Repository/Page_My Account  ToolsQA Demo Site/input_Type and Press Enter to Search_s'), 
    'dress')

WebUI.sendKeys(findTestObject('Object Repository/Page_My Account  ToolsQA Demo Site/input_Type and Press Enter to Search_s'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Search Results for dress  ToolsQA Demo Site/a_Black Cross Back Maxi Dress'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Black Cross Back Maxi Dress  ToolsQA D_c31fe6/select_Choose an optionBeigeBlack'), 
    'black', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Black Cross Back Maxi Dress  ToolsQA D_c31fe6/select_Choose an optionLargeMediumSmall'), 
    'small', true)

WebUI.click(findTestObject('Object Repository/Page_Black Cross Back Maxi Dress  ToolsQA D_c31fe6/button_Add to cart'))

WebUI.click(findTestObject('Object Repository/Page_Black Cross Back Maxi Dress  ToolsQA D_c31fe6/a_Search'))

WebUI.setText(findTestObject('Object Repository/Page_Black Cross Back Maxi Dress  ToolsQA D_c31fe6/input_Type and Press Enter to Search_s'), 
    't shirt')

WebUI.sendKeys(findTestObject('Object Repository/Page_Black Cross Back Maxi Dress  ToolsQA D_c31fe6/input_Type and Press Enter to Search_s'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Search Results for t shirt  ToolsQA Demo Site/a_playboy x missguided plus size grey lips _adf89a'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_playboy x missguided plus size grey li_ba0ff0/select_Choose an optionGrey'), 
    'grey', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_playboy x missguided plus size grey li_ba0ff0/select_Choose an option404244'), 
    '44', true)

WebUI.click(findTestObject('Object Repository/Page_playboy x missguided plus size grey li_ba0ff0/button_Add to cart'))

WebUI.click(findTestObject('Object Repository/Page_playboy x missguided plus size grey li_ba0ff0/i_Checkout_icon_bag_alt'))

WebUI.closeBrowser()

