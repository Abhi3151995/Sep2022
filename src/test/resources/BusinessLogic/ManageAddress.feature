Feature: Manage Address


Background: Application Login Successfull
Given user Launch browser with "webdriver.chrome.driver" and "D:\\Automation support\\chromedriver.exe"
Given user open application as "https://www.flipkart.com/"
When user cancel initial Login page
When user navigate on Login button
When user click on My Profile
When user enter "9595952980" as username
When user enter "Abhi@3151995" as password
When user click on Login button

@RegressionTest
Scenario: Add Address and validate 
When user click on manage Address
When user click on add new Address
When user enter name as "Abhi"
When user enter  digit phone number as "8329046687"
When user enter pin code as "414001"
When user enter locality as "Ahmednagar"
When enter Address as "Delhigate"
When user select Address type as home 
When user click on save