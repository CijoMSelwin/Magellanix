package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class Magellanix extends ProjectMethods{
	public Magellanix() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.XPATH,using="//input[@name='firstName']")
	private WebElement firstname;
	@And("Enter magellanixFirstName (.*)")
	public Magellanix enterFirstName(String data)  {
		//WebElement eleLogin = locateElement("name","firstName");
		System.out.println(data);
		type(firstname, data);
System.out.println("Entered sucessfully");
		return this;		
	}
	
	/*@FindBy(how=How.NAME,using="lastName")
	private WebElement lastName;
	@And("enter companyName (.*)")
	public Magellanix enterLastName(String data) {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		type(lastName, data);
		return this;		
	}
	
	@FindBy(how=How.NAME,using="contactEmail")
	private WebElement contactEmail;
	@And("enter companyName (.*)")
	public Magellanix entercontactEmail(String data) {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		type(contactEmail, data);
		return this;		
	}
	
	@FindBy(how=How.NAME,using="cellPhone")
	private WebElement cellPhone;
	@And("enter companyName (.*)")
	public Magellanix entercellPhone(String data) {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		type(cellPhone, data);
		return this;		
	}
	
	
	@FindBy(how=How.NAME,using="cust_SSN")
	private WebElement socialSecrityNumber;
	@And("enter companyName (.*)")
	public Magellanix entersocialSecrityNumber(String data) {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		type(socialSecrityNumber, data);
		return this;		
	}
	

	@FindBy(how=How.NAME,using="address")
	private WebElement address;
	@And("enter companyName (.*)")
	public Magellanix enteraddress(String data) {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		type(address, data);
		return this;		
	}
	
	
	@FindBy(how=How.NAME,using="city")
	private WebElement city;
	@And("enter companyName (.*)")
	public Magellanix entercity(String data) {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		type(city, data);
		return this;		
	}
	
	@FindBy(how=How.NAME,using="zip")
	private WebElement zip;
	@And("enter companyName (.*)")
	public Magellanix enterzip(String data) {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		type(zip, data);
		return this;		
	}
	
	@FindBy(how=How.XPATH,using="//button[@data-toggle='dropdown']")
	private WebElement resumeSelect;
	@And("enter companyName (.*)")
	public Magellanix resumeSelect() {
		click(resumeSelect);
		return this;		
	}
	
	
	@FindBy(how=How.NAME,using="country")
	private WebElement countryDropdown;
	@And("enter companyName (.*)")
	public Magellanix selectCountry(String data) {
		selectDropDownUsingText(countryDropdown, data);
		return this;		
	}
	
	
	@FindBy(how=How.XPATH,using="(//button[@data-toggle='dropdown'])[2]")
	private WebElement coverLetterSelect;
	@And("enter companyName (.*)")
	public Magellanix coverLetterSelect() {
		click(coverLetterSelect);
		return this;		
	}
	
	
	@FindBy(how=How.XPATH,using="//input[starts-with(@name,'cust_ ')]")
	private WebElement referenceDetailsEnter;
	@And("enter companyName (.*)")
	public Magellanix referenceDetailsEnter(String data) {
		type(referenceDetailsEnter,data);
		return this;		
	}
	
	
	@FindBy(how=How.NAME,using="gender")
	private WebElement gender;
	@And("enter companyName (.*)")
	public Magellanix genderSelect(String data) {
		selectDropDownUsingText(gender, data);
		return this;		
	}
	
	@FindBy(how=How.NAME,using="ethnicity")
	private WebElement ethnicity;
	@And("enter companyName (.*)")
	public Magellanix ethnicitySelect(String data) {
		selectDropDownUsingText(ethnicity, data);
		return this;		
	}
	
	
	@FindBy(how=How.NAME,using="questions")
	private WebElement dynamicQuestionsEnter;
	@And("enter companyName (.*)")
	public Magellanix dynamicQuestionsEnter(String data) {
		type(dynamicQuestionsEnter,data);
		return this;		
	}
	
	
	@FindBy(how=How.XPATH,using="//select[@name='questions']")
	private WebElement dynamicQuestionsSelect;
	@And("enter companyName (.*)")
	public Magellanix dynamicQuestionsSelect(String data) {
		selectDropDownUsingText(dynamicQuestionsSelect, data);
		return this;		
	}*/
	
	/*
	@FindBy(how=How.XPATH,using="//label[@class='check']/span[@class='checkmark']")
	private WebElement dataprivacyConditionSelect;
	@And("enter companyName (.*)")
	public Magellanix dataprivacyConditionSelect() {
		click(dataprivacyConditionSelect);
		return this;		
	}
	*/
	/*@FindBy(how=How.XPATH,using="(//label[@class='check']/span[@class='checkmark'])[2]")
	private WebElement personalDataCheckboxSelect;
	@And("enter companyName (.*)")
	public Magellanix personalDataCheckboxSelect() {
		click(personalDataCheckboxSelect);
		return this;		
	}
	
	
	@FindBy(how=How.XPATH,using="(//label[@class='check']/span[@class='checkmark'])[3]")
	private WebElement personalityTestConsentSelect;
	@And("enter companyName (.*)")
	public Magellanix personalityTestConsentSelect() {
		click(personalityTestConsentSelect);
		return this;		
	}
	
	
	@FindBy(how=How.XPATH,using="(//label[@class='check']/span[@class='checkmark'])[4]")
	private WebElement personalDataStoreSelect;
	@And("enter companyName (.*)")
	public Magellanix personalDataStoreSelect() {
		click(personalDataStoreSelect);
		return this;		
	}
	
	@FindBy(how=How.XPATH,using="//input[@type='submit']")
	private WebElement submitButton;
	@And("enter companyName (.*)")
	public Magellanix clickSubmitButton() {
		click(submitButton);
		return this;		
	}
	*/
}
