package cucumbermap;

import java.util.Hashtable;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.HTMLReportGenerator;
import utility.SeleniumOperations;

public class ManageAddress
{
	@When("^user click on manage Address$")
	public void user_click_on_manage_Address() throws Throwable
	{
		Object [] input10=new Object[1];
		input10[0]="(//*[@class='NS64GK'])[1]";
		Hashtable<String,Object> output10=SeleniumOperations.clickOnElement(input10);
		HTMLReportGenerator.StepDetails(output10.get("STATUS").toString(),"^user click on manage Address$" , output10.get("MESSAGE").toString());
	}

	@When("^user click on add new Address$")
	public void user_click_on_add_new_Address() throws Throwable
	{
		Object [] input11=new Object[1];
		input11[0]="//*[@class='_1QhEVk']";
		Hashtable<String,Object> output11=SeleniumOperations.clickOnElement(input11);
		HTMLReportGenerator.StepDetails(output11.get("STATUS").toString(),"^user click on add new Address$" , output11.get("MESSAGE").toString());
	}

	@When("^user enter name as \"([^\"]*)\"$")
	public void user_enter_name_as(String arg1) throws Throwable 
	{
		Object [] input12=new Object[2];
		input12[0]="(//*[@class='_1w3ZZo _2mFmU7'])[1]";
		input12[1]=arg1;	
		Hashtable<String,Object> output12=SeleniumOperations.sendKeyOnUi(input12);
		HTMLReportGenerator.StepDetails(output12.get("STATUS").toString(),"^user enter name as \"([^\"]*)\"$" , output12.get("MESSAGE").toString());
	}

	@When ("^user enter  digit phone number as \"(.*)\"$")
	public void user_enter_digit_phone_number_as(int arg1) throws Throwable
	{
		Object [] input13=new Object[2];
		input13[0]="(//*[@class='_1w3ZZo _2mFmU7'])[2]";
		input13[1]=arg1;	
		Hashtable<String,Object> output13=SeleniumOperations.sendKeyOnUi(input13);
		HTMLReportGenerator.StepDetails(output13.get("STATUS").toString(),"^user enter  digit phone number as \"(.*)\"$" , output13.get("MESSAGE").toString());
	}

	@When("^user enter pin code as \"([^\"]*)\"$")
	public void user_enter_pin_code_as(String arg1) throws Throwable
	{
		Object [] input14=new Object[2];
		input14[0]="(//*[@class='_1w3ZZo _2mFmU7'])[3]";
		input14[1]="414001";	
		Hashtable<String,Object> output14=SeleniumOperations.sendKeyOnUi(input14);
		HTMLReportGenerator.StepDetails(output14.get("STATUS").toString(),"^user enter pin code as \"([^\"]*)\"$", output14.get("MESSAGE").toString());
	}

	@When("^user enter locality as \"([^\"]*)\"$")
	public void user_enter_locality_as(String arg1) throws Throwable
	{
		Object [] input15=new Object[2];
		input15[0]="(//*[@class='_1w3ZZo _2mFmU7'])[4]";
		input15[1]="arg1";	
		Hashtable<String,Object> output15=SeleniumOperations.sendKeyOnUi(input15);
		HTMLReportGenerator.StepDetails(output15.get("STATUS").toString(),"^user enter locality as \"([^\"]*)\"$" , output15.get("MESSAGE").toString());
	}

	@When("^enter Address as \"([^\"]*)\"$")
	public void enter_Address_as(String arg1) throws Throwable 
	{
		Object [] input16=new Object[2];
		input16[0]="//*[@class='_1sQQBU _1w3ZZo _1TO48q']";
		input16[1]=arg1;	
		Hashtable<String,Object> output16=SeleniumOperations.sendKeyOnUi(input16);
		HTMLReportGenerator.StepDetails(output16.get("STATUS").toString(),"^enter Address as \"([^\"]*)\"$", output16.get("MESSAGE").toString());
	}

	@When("^user select Address type as home$")
	public void user_select_Address_type_as_home() throws Throwable
	{
		Object [] input17=new Object[1];
		input17[0]="(//*[text()='Home'])[1]";
		Hashtable<String,Object> output17=SeleniumOperations.clickOnElement(input17);
		HTMLReportGenerator.StepDetails(output17.get("STATUS").toString(),"^user select Address type as home$" , output17.get("MESSAGE").toString());
	}

	@When("^user click on save$")
	public void user_click_on_save() throws Throwable
	{
		Object [] input18=new Object[1];
		input18[0]="//*[@class='_2KpZ6l _1JDhFS _1o0c4q _3AWRsL']";
		Hashtable<String,Object> output18=SeleniumOperations.clickOnElement(input18);
		HTMLReportGenerator.StepDetails(output18.get("STATUS").toString(),"^user click on save$" , output18.get("MESSAGE").toString());
	}

	


}
