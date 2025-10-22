import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import internal.GlobalVariable as GlobalVariable

// Panggil API Create User
def response = WS.sendRequest(findTestObject('API/createUser', [
    ('username') : GlobalVariable.username,
    ('firstName'): GlobalVariable.firstName,
    ('lastName') : GlobalVariable.lastName,
    ('email')    : GlobalVariable.email,
    ('password') : GlobalVariable.password,
    ('phone')    : GlobalVariable.phone
]))

// Verifikasi response status 200
WS.verifyResponseStatusCode(response, 200)
