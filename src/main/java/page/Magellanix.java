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
	
	@FindBy(how=How.XPATH,using="//div[@id='cont_80013']/p")
	private WebElement cust_InstrDiversityText;
	@And("Assert cust_InstrDiversityText")
	public Magellanix cust_InstrDiversityText()  {
		Assert.assertTrue(cust_InstrDiversityText.getText().trim().contains("CCEP is committed to attracting, developing and retaining a truly diverse and inclusive workforce with equal opportunities for all regardless of any protected characteristic"));
		return this;		
	}
	
	@And("Assert custom_InstrDiversityText(.*)")
	public Magellanix custom_InstrDiversityText(String data)  {
		Assert.assertTrue(cust_InstrDiversityText.getText().trim().contains(data.trim()));
		return this;		
	}
	
	
	@FindBy(how=How.XPATH,using="//div[@id='cont_80001']/label")
	private WebElement firstnameLabel;
	@And("Verify magellanixFirstNameLabel(.*)")
	public Magellanix verifyFirstNamelabel(String fname)  {
		System.out.println("fnsmd  =  "+firstnameLabel.getText());
		//WebElement eleLogin = locateElement("name","firstName");
		Assert.assertTrue(firstnameLabel.getText().trim().equalsIgnoreCase(fname.trim()));
		return this;		
	}
	
	@FindBy(how=How.XPATH,using="//div[@id='cont_80002']/label")
	private WebElement lastnameLabel;
	@And("Verify magellanixlastnameLabel(.*)")
	public Magellanix verifylastnameLabel(String lname)  {
		//WebElement eleLogin = locateElement("name","firstName");
		Assert.assertTrue(lastnameLabel.getText().trim().equalsIgnoreCase(lname.trim()));
		return this;		
	}
	
	
	@FindBy(how=How.XPATH,using="//div[@id='cont_80003']/label")
	private WebElement emailLabel;
	@And("Verify magellanixemailLabel(.*)")
	public Magellanix verifyemailLabel(String email)  {
		//WebElement eleLogin = locateElement("name","firstName");
		Assert.assertTrue(emailLabel.getText().trim().equalsIgnoreCase(email.trim()));
		return this;		
	}
	
	@FindBy(how=How.XPATH,using="//div[@id='cont_80004']/label")
	private WebElement phoneLabel;
	@And("Verify magellanixphoneLabel(.*)")
	public Magellanix verifyphoneLabel(String phone)  {
		//WebElement eleLogin = locateElement("name","firstName");
		Assert.assertTrue(phoneLabel.getText().trim().equalsIgnoreCase(phone.trim()));
		return this;		
	}
	@FindBy(how=How.XPATH,using="//div[@id='cont_80005']/label")
	private WebElement ssnLabel;
	@And("Verify magellanixssnLabel(.*)")
	public Magellanix verifyssnLabel(String phone)  {
		//WebElement eleLogin = locateElement("name","firstName");
		Assert.assertTrue(ssnLabel.getText().trim().equalsIgnoreCase(phone.trim()));
		return this;		
	}
	
	@FindBy(how=How.XPATH,using="//div[@id='cont_80006']/label")
	private WebElement addressLabel;
	@And("Verify magellanixaddressLabel(.*)")
	public Magellanix verifyaddressLabel(String phone)  {
		//WebElement eleLogin = locateElement("name","firstName");
		Assert.assertTrue(addressLabel.getText().trim().equalsIgnoreCase(phone.trim()));
		return this;		
	}
	
	@FindBy(how=How.XPATH,using="//div[@id='cont_80006']/label")
	private WebElement streetAndHouseLabel;
	@And("Verify magellanixstreetAndHouseLabel(.*)")
	public Magellanix verifystreetAndHouseLabel(String street)  {
		//WebElement eleLogin = locateElement("name","firstName");
		Assert.assertTrue(streetAndHouseLabel.getText().trim().equalsIgnoreCase(street.trim()));
		return this;		
	}
	
	@FindBy(how=How.XPATH,using="//div[@id='cont_80007']/label")
	private WebElement cityLabel;
	@And("Verify magellanixcityLabel(.*)")
	public Magellanix verifycityLabel(String city)  {
		//WebElement eleLogin = locateElement("name","firstName");
		Assert.assertTrue(cityLabel.getText().trim().equalsIgnoreCase(city.trim()));
		return this;		
	}
	
	@FindBy(how=How.XPATH,using="//div[@id='cont_80008']/label")
	private WebElement zipLabel;
	@And("Verify magellanixzipLabel(.*)")
	public Magellanix verifyzipLabel(String zip)  {
		//WebElement eleLogin = locateElement("name","firstName");
		Assert.assertTrue(zipLabel.getText().trim().equalsIgnoreCase(zip.trim()));
		return this;		
	}
	
	
	@FindBy(how=How.XPATH,using="//div[@id='cont_80009']/label")
	private WebElement countryLabel;
	@And("Verify magellanixcountryLabel(.*)")
	public Magellanix verifycountryLabel(String country)  {
		//WebElement eleLogin = locateElement("name","firstName");
		Assert.assertTrue(countryLabel.getText().trim().equalsIgnoreCase(country.trim()));
		return this;		
	}
	
	
	@FindBy(how=How.XPATH,using="//div[@id='cont_6063']/label")
	private WebElement utilisingContinousimprovementlabel;
	@And("Verify utilisingContinousimprovementlabel(.*)")
	public Magellanix verifyutilisingContinousimprovementlabel(String label)  {
		//WebElement eleLogin = locateElement("name","firstName");
		Assert.assertTrue(utilisingContinousimprovementlabel.getText().trim().equalsIgnoreCase(label.trim()));
		return this;		
	}
	
	@FindBy(how=How.XPATH,using="//div[@id='cont_6160']/label")
	private WebElement personalVehiclerequirementlabel;
	@And("Verify personalVehiclerequirementlabel(.*)")
	public Magellanix verifypersonalVehiclerequirementlabel(String label)  {
		//WebElement eleLogin = locateElement("name","firstName");
		Assert.assertTrue(personalVehiclerequirementlabel.getText().trim().equalsIgnoreCase(label.trim()));
		return this;		
	}
	
	
	@FindBy(how=How.XPATH,using="//div[@id='cont_6109']/label")
	private WebElement cleanUkDrivingLicenselabel;
	@And("Verify cleanUkDrivingLicenselabel(.*)")
	public Magellanix verifycleanUkDrivingLicenselabel(String label)  {
		//WebElement eleLogin = locateElement("name","firstName");
		Assert.assertTrue(cleanUkDrivingLicenselabel.getText().trim().equalsIgnoreCase(label.trim()));
		return this;		
	}
	
	@FindBy(how=How.XPATH,using="//div[@id='cont_80010']/label")
	private WebElement resumeLabel;
	@And("Verify magellanixresumeLabel(.*)")
	public Magellanix verifyresumeLabel(String resume)  {
		//WebElement eleLogin = locateElement("name","firstName");
		Assert.assertTrue(resumeLabel.getText().trim().equalsIgnoreCase(resume.trim()));
		return this;		
	}
	
	
	@FindBy(how=How.XPATH,using="//div[@id='cont_80014']/label")
	private WebElement genderLabel;
	@And("Verify magellanixgenderLabel(.*)")
	public Magellanix verifygenderLabel(String genderlabel)  {
		//WebElement eleLogin = locateElement("name","firstName");
		Assert.assertTrue(genderLabel.getText().trim().equalsIgnoreCase(genderlabel.trim()));
		return this;		
	}
	
	@FindBy(how=How.XPATH,using="//div[@id='cont_6064']/label")
	private WebElement leanManufacturingTechniqueLabel;
	@And("Verify magellanixleanManufacturingTechniqueLabel(.*)")
	public Magellanix verifyleanManufacturingTechniqueLabel(String lean)  {
		//WebElement eleLogin = locateElement("name","firstName");
		Assert.assertTrue(leanManufacturingTechniqueLabel.getText().trim().equalsIgnoreCase(lean.trim()));
		return this;		
	}
	
	
	@FindBy(how=How.XPATH,using="//div[@id='cont_6066']/label")
	private WebElement commercialvehicleExpLabel;
	@And("Verify magellanixcommercialvehicleExpLabel(.*)")
	public Magellanix verifycommercialvehicleExpLabel(String commercialVehicle)  {
		//WebElement eleLogin = locateElement("name","firstName");
		Assert.assertTrue(commercialvehicleExpLabel.getText().trim().equalsIgnoreCase(commercialVehicle.trim()));
		return this;		
	}
	
	@FindBy(how=How.XPATH,using="//div[@id='cont_6083']/label")
	private WebElement managepplRomeotelyLabel;
	@And("Verify magellanixmanagepplRomeotelyLabel(.*)")
	public Magellanix verifymanagepplRomeotelyLabel(String managePeople)  {
		//WebElement eleLogin = locateElement("name","firstName");
		Assert.assertTrue(managepplRomeotelyLabel.getText().trim().equalsIgnoreCase(managePeople.trim()));
		return this;		
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
	@And("Assert magellanixFirstName")
	public Magellanix assertFirstName()  {
		//WebElement eleLogin = locateElement("name","firstName");
		verifyDisplayed(firstname);
		return this;		
	}
	
	@And("Assert magellanixLastName")
	public Magellanix assertLastName()  {
		//WebElement eleLogin = locateElement("name","firstName");
		verifyDisplayed(lastName);
		return this;		
	}
	
	@And("Assert magellanixCoverLetter")
	public Magellanix assertCoverLetter()  {
		//WebElement eleLogin = locateElement("name","firstName");
		verifyDisplayed(CoverSelect);
		return this;		
	}
	
	
	@And("Assert magellanixContactEmail")
	public Magellanix assertContactEmail()  {
		//WebElement eleLogin = locateElement("name","firstName");
		verifyDisplayed(contactEmail);
		return this;		
	}
	
	
	@And("Assert magellanixCellPhone")
	public Magellanix assertCellPhone()  {
		//WebElement eleLogin = locateElement("name","firstName");
		verifyDisplayed(cellPhone);
		return this;		
	}
	
	@And("Assert magellanixAddress")
	public Magellanix assertAddress()  {
		//WebElement eleLogin = locateElement("name","firstName");
		verifyDisplayed(address);
		return this;		
	}
	
	@And("Assert magellanixCity")
	public Magellanix assertCity()  {
		//WebElement eleLogin = locateElement("name","firstName");
		verifyDisplayed(city);
		return this;		
	}
	
	@And("Assert magellanixZip")
	public Magellanix assertZip()  {
		//WebElement eleLogin = locateElement("name","firstName");
		verifyDisplayed(zip);
		return this;		
	}
	
	@And("Assert magellanixCountry")
	public Magellanix assertCountry()  {
		//WebElement eleLogin = locateElement("name","firstName");
		verifyDisplayed(countryDropdown);
		return this;		
	}
	
	@And("Assert magellanixResume")
	public Magellanix assertResume()  {
		//WebElement eleLogin = locateElement("name","firstName");
		verifyDisplayed(resumeSelect);
		return this;		
	}


	@And("Assert magellanixGender")
	public Magellanix assertGender()  {
		//WebElement eleLogin = locateElement("name","firstName");
		verifyDisplayed(gender);
		return this;		
	}
	
	@FindBy(how=How.XPATH,using="//div[@id='cont_80021']/label")
	private WebElement agreeToCareerOppurtunityText;
	@And("Assert agreeToCareerOppurtunityText")
	public Magellanix assertagreeToCareerOppurtunityText()  {
		System.out.println(agreeToCareerOppurtunityText.getText().trim());
		Assert.assertTrue(agreeToCareerOppurtunityText.getText().trim().contains("Hear more about career opportunities"));
		return this;		
	}
	@And("Assert FRagreeToCareerOppurtunityText")
	public Magellanix assertagreeToCareerOppurtunityTextFR()  {
		System.out.println(agreeToCareerOppurtunityText.getText().trim());
		Assert.assertTrue(agreeToCareerOppurtunityText.getText().trim().contains("En savoir plus sur les opportunités de carrière"));
		return this;		
	}
	@And("Assert GerManyagreeToCareerOppurtunityText")
	public Magellanix assertagreeToCareerOppurtunityTextGerMany()  {
		System.out.println(agreeToCareerOppurtunityText.getText().trim());
		Assert.assertTrue(agreeToCareerOppurtunityText.getText().trim().contains("Ich möchte mehr über Karrieremöglichkeiten bei CCEP erfahren."));
		return this;		
	}
	@And("Assert NLagreeToCareerOppurtunityText")
	public Magellanix assertagreeToCareerOppurtunityTextNl()  {
		System.out.println(agreeToCareerOppurtunityText.getText().trim());
		Assert.assertTrue(agreeToCareerOppurtunityText.getText().trim().contains("Meer horen over carrièremogelijkheden"));
		return this;		
	}
	
	@And("Assert ESagreeToCareerOppurtunityText")
	public Magellanix assertagreeToCareerOppurtunityTextES()  {
		System.out.println(agreeToCareerOppurtunityText.getText().trim());
		Assert.assertTrue(agreeToCareerOppurtunityText.getText().trim().contains("Obtener más información sobre puestos vacantes"));
		return this;		
	}
	

	@And("Assert SVagreeToCareerOppurtunityText")
	public Magellanix assertagreeToCareerOppurtunityTextSV()  {
		System.out.println(agreeToCareerOppurtunityText.getText().trim());
		Assert.assertTrue(agreeToCareerOppurtunityText.getText().trim().contains("Mer information om karriärmöjligheter"));
		return this;		
	}
	
	@And("Assert NBagreeToCareerOppurtunityText")
	public Magellanix assertagreeToCareerOppurtunityTextNB()  {
		System.out.println(agreeToCareerOppurtunityText.getText().trim());
		Assert.assertTrue(agreeToCareerOppurtunityText.getText().trim().contains("Hør mer om karrieremuligheter"));
		return this;		
	}

	@And("Assert ISagreeToCareerOppurtunityText")
	public Magellanix assertagreeToCareerOppurtunityTextIS()  {
		System.out.println(agreeToCareerOppurtunityText.getText().trim());
		Assert.assertTrue(agreeToCareerOppurtunityText.getText().trim().contains("Fáðu upplýsingar um störf hjá fyrirtækinu."));
		return this;		
	}
	
	@And("Assert PTagreeToCareerOppurtunityText")
	public Magellanix assertagreeToCareerOppurtunityTextPT()  {
		System.out.println(agreeToCareerOppurtunityText.getText().trim());
		Assert.assertTrue(agreeToCareerOppurtunityText.getText().trim().contains("Saber mais sobre oportunidades de carreira"));
		return this;		
	}
	
	@FindBy(how=How.XPATH,using="//div[@id='cont_80021']/label/span")
	private WebElement agreeToCareerOppurtunitycheckbox;
	@And("click agreeToCareerOppurtunitycheckbox")
	public Magellanix agreeToCareerOppurtunitycheckbox()  {
		click(agreeToCareerOppurtunitycheckbox);
		return this;		
	}
	
	
	
	@FindBy(how=How.XPATH,using="//div[@id='cont_80016']/label")
	private WebElement agreeToDataPrivacyStatementText;
	@And("Assert agreeToDataPrivacyStatement")
	public Magellanix assertagreeToDataPrivacyStatement()  {
		Assert.assertTrue(agreeToDataPrivacyStatementText.getText().trim().contains("I have read and accept the data privacy statement"));
		return this;		
	}
	
	@And("Assert FRagreeToDataPrivacyStatement")
	public Magellanix assertagreeToDataPrivacyStatementFR()  {
		Assert.assertTrue(agreeToDataPrivacyStatementText.getText().trim().contains("Revue Déclaration de confidentialité des données"));
		return this;		
	}
	@And("Assert GRagreeToDataPrivacyStatement")
	public Magellanix assertagreeToDataPrivacyStatementGR()  {
		Assert.assertTrue(agreeToDataPrivacyStatementText.getText().trim().contains("Ich habe die"));
		return this;		
	}
	
	@And("Assert NLagreeToDataPrivacyStatement")
	public Magellanix assertagreeToDataPrivacyStatementNL()  {
		Assert.assertTrue(agreeToDataPrivacyStatementText.getText().trim().contains("Raadpleeg Privacyverklaring"));
		return this;		
	}
	
	@And("Assert ESagreeToDataPrivacyStatement")
	public Magellanix assertagreeToDataPrivacyStatementES()  {
		Assert.assertTrue(agreeToDataPrivacyStatementText.getText().trim().contains("Revisar Declaración de privacidad de datos"));
		return this;		
	}
	
	@And("Assert SVagreeToDataPrivacyStatement")
	public Magellanix assertagreeToDataPrivacyStatementSV()  {
		Assert.assertTrue(agreeToDataPrivacyStatementText.getText().trim().contains("Godkänn Dataintegritetspolicy"));
		return this;		
	}
	
	@And("Assert NBagreeToDataPrivacyStatement")
	public Magellanix assertagreeToDataPrivacyStatementNB()  {
		Assert.assertTrue(agreeToDataPrivacyStatementText.getText().trim().contains("Godkjenn Personvernerklæring"));
		return this;		
	}
	
	@And("Assert ISagreeToDataPrivacyStatement")
	public Magellanix assertagreeToDataPrivacyStatementIS()  {
		Assert.assertTrue(agreeToDataPrivacyStatementText.getText().trim().contains("Ég hef lesið og samþykki perónusverndarstefnu CCEP "));
		return this;		
	}
	
	
	@And("Assert PTagreeToDataPrivacyStatement")
	public Magellanix assertagreeToDataPrivacyStatementPT()  {
		Assert.assertTrue(agreeToDataPrivacyStatementText.getText().trim().contains("Reveja a Declaração de Privacidade dos Dados"));
		return this;		
	}
	
	
	@FindBy(how=How.XPATH,using="//div[@id='cont_80016']/label/span")
	private WebElement agreeToDataPrivacyStatementcheckBox;
	@And("click agreeToDataPrivacyStatementcheckBox")
	public Magellanix agreeToDataPrivacyStatementcheckBox()  {
        click(agreeToDataPrivacyStatementcheckBox);
		return this;		
	}
	
	@FindBy(how=How.XPATH,using="//div[@id='cont_80017']/label")
	private WebElement agreeToPersonalDataPrivacyStatementText;
	@And("Assert agreeToPersonalDataPrivacyStatementText")
	public Magellanix agreeToPersonalDataPrivacyStatementText()  {
		Assert.assertTrue(agreeToPersonalDataPrivacyStatementText.getText().trim().contains("I consent to my personal data being added to CCEP’s group wide candidate database"));
		return this;		
	}
	
	@FindBy(how=How.XPATH,using="//div[@id='cont_80017']/label/span")
	private WebElement agreeToPersonalDataPrivacyStatementCheckBox;
	@And("click agreeToPersonalDataPrivacyStatementCheckBox")
	public Magellanix agreeToPersonalDataPrivacyStatementCheckBox()  {
        click(agreeToPersonalDataPrivacyStatementCheckBox);
		return this;		
	}
	
	
	
	@FindBy(how=How.XPATH,using="//div[@id='cont_80019']/label")
	private WebElement agreeToPersonalDataOneYearText;
	@And("Assert agreeToPersonalDataOneYearText")
	public Magellanix agreeToPersonalDataOneYearText()  {
		Assert.assertTrue(agreeToPersonalDataOneYearText.getText().trim().contains("I hereby consent to my personal data being stored for 1 year."));
		return this;		
	}
	
	@FindBy(how=How.XPATH,using="//div[@id='cont_80019']/label/span")
	private WebElement agreeToPersonalDataOneYearCheckBox;
	@And("Click agreeToPersonalDataOneYearCheckBox")
	public Magellanix agreeToPersonalDataOneYearCheckBox()  {
        click(agreeToPersonalDataOneYearCheckBox);
		return this;		
	}
	
	@FindBy(how=How.XPATH,using="//div[@id='cont_80018']/label")
	private WebElement agreeToPersonalityTestText;
	@And("Assert agreeToPersonalityTestText")
	public Magellanix agreeToPersonalityTestText()  {
		Assert.assertTrue(agreeToPersonalityTestText.getText().trim().contains("I consent to be subjected to personality tests and video interviews on online platforms provided by third parties, which will pass my personal data to CCEP."));
		return this;		
	}
	
	@FindBy(how=How.XPATH,using="//div[@id='cont_80018']/label/span")
	private WebElement agreeToPersonalityTestCheckBox;
	@And("click agreeToPersonalityTestCheckBox")
	public Magellanix agreeToPersonalityTestCheckBox()  {
        click(agreeToPersonalityTestCheckBox);
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
	//Click LinkToDPCS
	
	 @FindBy(how=How.XPATH,using="//div[@id='cont_80016']/label/a")
		private WebElement dpcsLink;
		@And("Click LinkToDPCS")
		public Magellanix clickDpcsLink() {
			//WebElement eleLogin = locateElement("class","decorativeSubmit");
			click(dpcsLink);
			return this;		
		}
	
	@Then ("Click PhoneNumber")
	public Magellanix clickPhone()  {
		//WebElement eleLogin = locateElement("name","firstName");
		click(cellPhone);
		return this;		
	}
	
	

	@FindBy(how=How.NAME,using="basic[Address]")
	private WebElement address;
	@And("enter MagellanixAddress (.*)")
	public Magellanix enteraddress(String data) {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		type(address, data);
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
	
	@FindBy(how=How.XPATH,using="//select[@id='ques_6063']")
	private WebElement utilisingContinousimprovementDropdown;
	@And("Select utilisingContinousimprovementDropdown(.*)")
	public Magellanix utilisingContinousimprovementDropdown(String data) {
		selectDropDownUsingText(utilisingContinousimprovementDropdown, data.trim());
		return this;		
	}
	

	@FindBy(how=How.XPATH,using="//select[@id='ques_6109']")
	private WebElement ukDrivingLicenseDropdown;
	@And("Select ukDrivingLicenseDropdownDropdown(.*)")
	public Magellanix ukDrivingLicenseDropdownDropdown(String data) {
		selectDropDownUsingText(ukDrivingLicenseDropdown, data.trim());
		return this;		
	}
	
	@FindBy(how=How.XPATH,using="//select[@id='ques_6160']")
	private WebElement personalVehicleDropdown;
	@And("Select personalVehicleDropdown(.*)")
	public Magellanix personalVehicleDropdown(String data) {
		selectDropDownUsingText(personalVehicleDropdown, data.trim());
		return this;		
	}
	
	@FindBy(how=How.NAME,using="basic[ZIP]")
	private WebElement zip;
	@And("enter zip(.*)")
	public Magellanix enterzip(String data) {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		type(zip, data);
		return this;		
	}
	
	
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
	
	@And("Verify SubmitLabel(.*)")
	public Magellanix SubmitLabel(String data) {
		Assert.assertTrue(resumeSelect.getText().trim().equalsIgnoreCase(data.trim()));
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
	
	
	
	@FindBy(how=How.XPATH,using="//div[@class='col-lg-6']/div")
	private WebElement verifysubmit;
	@FindBy(how=How.ID,using="qassubmit")
	
	private WebElement clickSubmit;
	@And("click Submit")
	public Magellanix clickSubmit() {
        click(clickSubmit);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertTrue(verifysubmit.getText().trim().equals("Your details have been sent. Thank you!"));
		return this;		
	}
	
  @FindBy(how=How.XPATH,using="//h2[@class='clear']")
	private WebElement langDesc;
	@And("Verify languageDesc(.*)")
	public Magellanix verifylangDesc(String data) {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertTrue(langDesc.getText().trim().equals(data.trim()));
		return this;		
	}
	
}
