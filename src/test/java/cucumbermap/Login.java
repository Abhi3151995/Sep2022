package cucumbermap;

import java.util.Hashtable;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.HTMLReportGenerator;
import utility.SeleniumOperations;

public class Login
{

	@Given ("^user Launch browser with \"(.*)\" and \"(.*)\"$")
	public void browserLaunch(String key,String value)
	{
		Object [] input1=new Object[2];
		input1[0]=key;
		input1[1]=value;	
			SeleniumOperations.browserLaunch(input1);
	}
	
	@Given ("^user open application as \"(.*)\"$")
	public void user_open_application_as_https_www_flipkart_com(String arg1) throws Throwable 
	{
		Object [] input2=new Object[1];
		input2[0]=arg1;
		SeleniumOperations.openApplication(input2);
	}

	@When("^user cancel initial Login page$")
	public void user_cancel_initial_Login_page() throws Throwable
	{
		Object [] input3=new Object[1];
		input3[0]="//*[@class='_2KpZ6l _2doB4z']";
		Hashtable<String,Object> output3=SeleniumOperations.clickOnElement(input3);
	}

	@When("^user navigate on Login button$")
	public void user_navigate_on_Login_button() throws Throwable 
	{
		Object [] input5=new Object[1];
		input5[0]="//*[@class='_1_3w1N']";
		Hashtable<String,Object> output4=SeleniumOperations.moveToElement(input5);
	}

	@When("^user click on My Profile$")
	public void user_click_on_My_Profile() throws Throwable
	{
		Object [] input6=new Object[1];
		input6[0]="//*[text()='My Profile']";
		Hashtable<String,Object> output5=SeleniumOperations.clickOnElement(input6);	
		HTMLReportGenerator.StepDetails(output5.get("STATUS").toString(),"^user click on My Profile$" , output5.get("MESSAGE").toString());
		
	}

	@When("^user enter \"([^\"]*)\" as username$")
	public void user_enter_as_username(String arg1) throws Throwable
	{
		Thread.sleep(5000);
		Object [] input7=new Object[2];
		input7[0]="//*[@class='_2IX_2- VJZDxU']";
		input7[1]=arg1;	
		Hashtable<String,Object> output6=SeleniumOperations.sendKeyOnUi(input7);
		HTMLReportGenerator.StepDetails(output6.get("STATUS").toString(),"^user enter \"([^\"]*)\" as username$" , output6.get("MESSAGE").toString());
		
	}

	@When("^user enter \"([^\"]*)\" as password$")
	public void user_enter_as_password(String arg1) throws Throwable 
	{
		Object [] input8=new Object[2];
		input8[0]="//*[@class='_2IX_2- _3mctLh VJZDxU']";
		input8[1]=arg1;	
		Hashtable<String,Object> output7=SeleniumOperations.sendKeyOnUi(input8);
		HTMLReportGenerator.StepDetails(output7.get("STATUS").toString(),"^user enter \"([^\"]*)\" as password$" , output7.get("MESSAGE").toString());
		
	}

	@When("^user click on Login button$")
	public void user_click_on_Login_button() throws Throwable
	{
		Object [] input9=new Object[1];
		input9[0]="(//*[text()='Login'])[3]";
		Hashtable<String,Object> output8=SeleniumOperations.clickOnElement(input9);
		HTMLReportGenerator.StepDetails(output8.get("STATUS").toString(),"^user click on Login button$" , output8.get("MESSAGE").toString());
	}

	@Then ("^application shows Login successfully$")
	public void validationByGetText()
	{
		Object [] input19=new Object[2];
		input19[0]="Hello,";
		input19[1]="//*[@class='_2QZ3Er']";	
		Hashtable<String,Object> output9=SeleniumOperations.validationByGetText(input19);	
		HTMLReportGenerator.StepDetails(output9.get("STATUS").toString(),"^application shows Login successfully$", output9.get("MESSAGE").toString());
	}


	
	
	
	
	
	
	
	
}
