package page;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import wdMethods.ProjectMethods;

public class Magellanix extends ProjectMethods{
	public static List<String> list ;
	public static Set<String> windowHandles ;

	public Magellanix() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.XPATH,using="//input[@name='basic[First_Name]']")
	private WebElement firstname;
	@And("Enter magellanixFirstName (.*)")
	public Magellanix enterFirstName(String data)  {
		//WebElement eleLogin = locateElement("name","firstName");
		System.out.println(data);
		type(firstname,data);
		return this;		
	}
	
	@And("Click magellanixFirstName")
	public Magellanix clickFirstName()  {
		//WebElement eleLogin = locateElement("name","firstName");
		click(firstname);
		return this;		
	}
	
	@FindBy(how=How.XPATH,using="//a[@id='resume']")
	private WebElement likedin;
	@And("Click Linkedin")
	public Magellanix clickLinkedin()  {
		//WebElement eleLogin = locateElement("name","firstName");
		click(likedin);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return this;		
	}
	@And("Switch to Second Window")
	public static List<String> SwitchToSecondWindow() {
		
	     windowHandles = driver.getWindowHandles();
		list = new ArrayList<>();
		list.addAll(windowHandles);
		driver.switchTo().window(list.get(1));
		return list;
	}
	
	@And("Click magellanixLastName")
	public Magellanix clickLastName()  {
		//WebElement eleLogin = locateElement("name","firstName");
		click(lastName);
		return this;		
	}
@FindBy(how=How.NAME,using="basic[Last_Name]")
	private WebElement lastName;
	@And("Enter magellanixLastName (.*)")
	public Magellanix enterLastName(String data) {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		type(lastName, data);
		return this;		
	}
	
   @FindBy(how=How.NAME,using="basic[Contact_Email]")
	private WebElement contactEmail;
	@And("Enter email(.*)")
	public Magellanix entercontactEmail(String data) {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		type(contactEmail, data);
		return this;		
	}
	
	@Then ("Click Email")
	public Magellanix clickEmail()  {
		//WebElement eleLogin = locateElement("name","firstName");
		click(contactEmail);
		return this;		
	}
	
	
	@Then ("Click PhoneNumber")
	public Magellanix clickPhone()  {
		//WebElement eleLogin = locateElement("name","firstName");
		click(cellPhone);
		return this;		
	}
@FindBy(how=How.NAME,using="basic[Cell_Phone]")
	private WebElement cellPhone;
	@And("Enter phoneNumber (.*)")
	public Magellanix entercellPhone(String data) {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		type(cellPhone, data);
		return this;		
	}
	

	@FindBy(how=How.NAME,using="basic[City]")
	private WebElement city;
	@And("Enter City (.*)")
	public Magellanix entercity(String data) {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		type(city, data.trim());
		return this;		
	}
	@FindBy(how=How.NAME,using="basic[Country]")
	private WebElement countryDropdown;
	@And("Select Country (.*)")
	public Magellanix selectCountry(String data) {
		selectDropDownUsingValue(countryDropdown, data);
		return this;		
	}
	/*
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
	
	
	
	@FindBy(how=How.NAME,using="zip")
	private WebElement zip;
	@And("enter companyName (.*)")
	public Magellanix enterzip(String data) {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		type(zip, data);
		return this;		
	}
	
	
	@FindBy(how=How.XPATH,using="//select[@name='questions']")
	private WebElement dynamicQuestionsSelect;
	@And("enter companyName (.*)")
	public Magellanix dynamicQuestionsSelect(String data) {
		selectDropDownUsingText(dynamicQuestionsSelect, data);
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
	
	
	
	
	
	@FindBy(how=How.XPATH,using="//label[@class='check']/span[@class='checkmark']")
	private WebElement dataprivacyConditionSelect;
	@And("enter companyName (.*)")
	public Magellanix dataprivacyConditionSelect() {
		click(dataprivacyConditionSelect);
		return this;		
	}
	
	@FindBy(how=How.XPATH,using="(//label[@class='check']/span[@class='checkmark'])[2]")
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
	
	@And("Verify(.*) and WebElement (.*)")
	public Magellanix AssertUsingWebelementPresent(String xpathValue ,String verifyText) {
		WebElement locateElement = locateElement("xpath", xpathValue);
	System.out.println(locateElement.getText().trim());
		Assert.assertTrue(locateElement.getText().trim().equalsIgnoreCase(verifyText.trim()));
		Assert.assertTrue(locateElement.isDisplayed());
		return this;		
	}
	
	
	@FindBy(how=How.NAME,using="basic[cust_Gender]")
	private WebElement gender;
	@And("Select Gender (.*)")
	public Magellanix genderSelect(String data) {
		selectDropDownUsingText(gender, data);
		return this;		
	}
	
	
	@FindBy(how=How.XPATH,using="//button[@data-toggle='dropdown']")
	private WebElement resumeSelect;
	@And("Click Resume")
	public Magellanix resumeSelect() {
		click(resumeSelect);
		return this;		
	}
	
	
	@FindBy(how=How.XPATH,using="(//button[@data-toggle='dropdown'])[2]")
	private WebElement CoverSelect;
	@And("Click coverLetter")
	public Magellanix coverSelect() {
		click(CoverSelect);
		return this;		
	}
	
	@FindBy(how=How.XPATH,using="//a[@id='input_resume']")
	private WebElement resumeFileSelect;
	@And("Click ResumFile")
	public Magellanix resumeFileSelect() {
		click(resumeFileSelect);
		return this;		
	}
	
	@FindBy(how=How.XPATH,using="//a[@id='input_cover_letter']")
	private WebElement coverFileSelect;
	@And("Select coverFile")
	public Magellanix coverFileSelect() {
		click(coverFileSelect);
		return this;		
	}
	
	@FindBy(how=How.XPATH,using="//a[starts-with(@onclick,'remove')]")
	private WebElement removeCoverFile;
	@And("Remove coverFile")
	public Magellanix removeCoverFile() {
		click(removeCoverFile);
		return this;		
	}
	
	
	
	@And("Select fileFromLocal and clickEnter(.*)")
	public void selectFileFromLocalandClickEnter(String data) throws AWTException, InterruptedException {
		String property = System.getProperty("user.dir");
		String filePath = property + "\\" + "FileForUpload\\" + data ;
		StringSelection strSel = new StringSelection(filePath);
		System.out.println(strSel);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSel, null);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
	}
	
	@Then("Verify Mandatory Field TextBox Validation(.*)")
	public Magellanix AssertMandatoryFieldsEnteredEmpty(String path) {
		Assert.assertTrue(locateElement("xpath", path).getText().equals("Please provide this information."));
		return this;
		
	}
	@Then("Get Path (.*) and Common Assert(.*)")
	public Magellanix Assert(String path , String data) {
		String result =locateElement("xpath", path.trim()).getText();
		System.out.println("Result " + result);
		Assert.assertTrue(result.trim().equalsIgnoreCase(data.trim()));
		return this;
		
	}
	
	@FindBy(how=How.XPATH,using="//select[@id='ques_6064']")
	private WebElement leanManufactureDropdownSelect;
	@And("Select LeanManufactureExperience (.*)")
	public Magellanix selectLeanManufactureExperience(String data) {
		selectDropDownUsingText(leanManufactureDropdownSelect, data);
		return this;		
	}
	
	@FindBy(how=How.XPATH,using="//select[@id='ques_6066']")
	private WebElement commercialVehicleExperienceDropdownSelect;
	@And("Select CommercialVehicleExperience (.*)")
	public Magellanix commercialVehicleExperienceDropdownSelect(String data) {
		selectDropDownUsingText(commercialVehicleExperienceDropdownSelect, data);
		return this;		
	}
	
	@FindBy(how=How.XPATH,using="//select[@id='ques_6083']")
	private WebElement experienceManagingPeopleDropdownSelect;
	@And("Select ManagingPeopleExperience (.*)")
	public Magellanix experienceManagingPeopleDropdownSelect(String data) {
		selectDropDownUsingText(experienceManagingPeopleDropdownSelect, data);
		return this;		
	}
	
}
