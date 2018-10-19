package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object username
     
    /**
     * <p></p>
     */
    public static Object password
     
    /**
     * <p></p>
     */
    public static Object urlmobile
     
    /**
     * <p></p>
     */
    public static Object urlpulsa
     
    /**
     * <p></p>
     */
    public static Object nmr_hp
     
    /**
     * <p></p>
     */
    public static Object PDP
     

    static {
        def allVariables = [:]        
        allVariables.put('default', [:])
        allVariables.put('Production', allVariables['default'] + ['username' : 'testblj2', 'password' : '123qwe', 'urlmobile' : 'https://m.blanja.com/member/login', 'urlpulsa' : 'https://m.blanja.com/top-up/pulsa', 'nmr_hp' : '081289138338', 'PDP' : 'https://m.blanja.com/item/jual-beli-pantene-black-shine-18983897'])
        
        String profileName = RunConfiguration.getExecutionProfile()
        
        def selectedVariables = allVariables[profileName]
        username = selectedVariables['username']
        password = selectedVariables['password']
        urlmobile = selectedVariables['urlmobile']
        urlpulsa = selectedVariables['urlpulsa']
        nmr_hp = selectedVariables['nmr_hp']
        PDP = selectedVariables['PDP']
        
    }
}
