Feature: Login Fuctionality

Background: User open application successfully
Given user Launch browser with "webdriver.chrome.driver" and "D:\\Automation support\\chromedriver.exe"
Given user open application as "https://www.flipkart.com/"


Scenario: User login Application with valid credentials
When user cancel initial Login page
When user navigate on Login button
When user click on My Profile
When user enter "9595952980" as username
When user enter "Abhi@3151995" as password
When user click on Login button
