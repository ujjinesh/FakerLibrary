package com.openmrs.utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageElements {

	// username
	@FindBy(xpath = "//input[@id='username']")
	WebElement username;

	// password
	@FindBy(xpath = "//input[@id='password']")
	WebElement password;

	// Location for this session
	@FindBy(xpath = "//li[text()='Inpatient Ward']")
	WebElement location;

	// Login Button
	@FindBy(xpath = "//input[@id='loginButton']")
	WebElement submit;

	// login_text
	@FindBy(xpath = "//legend[@class='w-auto']/text()[2]")
	WebElement logintext;

	// dashboard
	@FindBy(xpath = "//*[@id='content']/div[2]/div/h4/text()")
	WebElement dasboard;

	// Login Openmrs Page
	public void Login(String uname, String Pass) {

		username.sendKeys(uname);
		password.sendKeys(Pass);
		location.click();
		submit.click();
	}

	// dashboard Validation
	public void logintext() {
		String Actual = logintext.getText();
		System.out.println("Login Text :" + Actual);
	}

	// dashboard Validation
	public void dashboardvalidation() {
		String Actual = dasboard.getText();
		System.out.println("Dashboard Text :" + Actual);

	}

	// Given (required)
	@FindBy(xpath = "//input[@name='givenName']")
	WebElement Given;

	// Family Name (required)
	@FindBy(xpath = "//input[@name='familyName']")
	WebElement Family_Name;

	// patient's name
	public void patientname(String Firstname, String Lastname) {
		Given.sendKeys(Firstname);
		Family_Name.sendKeys(Lastname);
	}

	// confirm right
	@FindBy(xpath = "//button[@class='confirm right']")
	WebElement confirm_right;

	// confirm right forward
	public void confirmright() {
		confirm_right.click();
	}

	// patient's gender
	@FindBy(xpath = "//select[@id='gender-field']")
	WebElement gender;

	public void gendertype(String value) {
		gender.sendKeys(value);
	}

	// Day
	@FindBy(xpath = "//input[@id='birthdateDay-field']")
	WebElement Day;

	// Month
	@FindBy(xpath = "//select[@id='birthdateMonth-field']")
	WebElement Month;

	// Year
	@FindBy(xpath = "//input[@id='birthdateYear-field']")
	WebElement Year;

	// DOB Selection
	public void DOB(String day, String month, String year) {
		Day.sendKeys(day);
		Month.sendKeys(month);
		Year.sendKeys(year);
	}

	// Address
	@FindBy(xpath = "//input[@id='address1']")
	WebElement Address;

	// Address 2

	@FindBy(xpath = "//input[@id='address2']")
	WebElement Address_2;

	// City
	@FindBy(xpath = "//input[@id='cityVillage']")
	WebElement City;

	// State
	@FindBy(xpath = "//input[@id='stateProvince']")
	WebElement State;

	// Country
	@FindBy(xpath = "//input[@id='country']")
	WebElement Country;

	// Postal Code
	@FindBy(xpath = "//input[@id='postalCode']")
	WebElement Postal_Code;

	// patient's address
	public void address(String address1, String address2, String city, String state, String country, String pincode) {
		Address.sendKeys(address1);
		Address_2.sendKeys(address2);
		City.sendKeys(city);
		State.sendKeys(state);
		Country.sendKeys(country);
		Postal_Code.sendKeys(pincode);
	}

	// phone number
	@FindBy(xpath = "//input[@name='phoneNumber']")
	WebElement phone_number;

	// phone_number
	public void mobilenumber(String number) {
		phone_number.sendKeys(number);
	}

	// Relationship
	@FindBy(xpath = "//select[@id='relationship_type']")
	WebElement Relationship;

	// Person Name
	@FindBy(xpath = "//input[@placeholder='Person Name']")
	WebElement Person_Name;

	// patient related
	public void patientrelation(String relationtype, String personname) {
		Relationship.sendKeys(relationtype);
		Person_Name.sendKeys(personname);
	}

	// Confirm text
	@FindBy(xpath = "(//*[@id='confirmationQuestion']/text())[1]")
	WebElement Confirmpage;

	// Confirm button
	@FindBy(xpath = "//input[@id='submit']")
	WebElement Confirm_button;

	// Confirm_submission
	public void confirmationpage() {
		String Actual = Confirmpage.getText();
		System.out.println("Confirmpage Text :" + Actual);
	}

	// Confirm button click
	public void confirmbutton() {
		Confirm_button.click();
	}

	// Patient ID
	@FindBy(xpath = "//em[text()='Patient ID']//following-sibling::span[text()]")
	private static WebElement Patient_ID;

	public static String getPatient_ID() {
		String id = Patient_ID.getText();
		return id;
	}

	public void setPatient_ID(WebElement patient_ID) {
		Patient_ID = patient_ID;
	}

	// Home_Icon button
	@FindBy(xpath = "//a[@href='/openmrs/index.htm']")
	WebElement Home_Icon;

	// Patient id
	public void Patientid() {
		String id = Patient_ID.getText();
		System.out.println("Patient id is : " + id);
	}

	// Home_Icon button click
	public void HomeIcon() {
		Home_Icon.click();
	}

	// Register a patient
	@FindBy(xpath = "(//i[@class='icon-user'])[2]")
	WebElement Register;

	// Find Patient Record
	@FindBy(xpath = "//*[@id='coreapps-activeVisitsHomepageLink-coreapps-activeVisitsHomepageLink-extension']")
	WebElement Find_Patient;

	// Register Openmrs Page
	public void Register() {
		Register.click();

	}

	// Find_Patient Openmrs Page
	public void Find_Patient() {

		Find_Patient.click();
	}

	// search a patient
	@FindBy(xpath = "//*[@id=\"patient-search\"]")
	WebElement search;

	// search Patient Openmrs Page
	public void patientsearch() {

		search.click();
	}

	// Recent Button
	@FindBy(xpath = "//*[@id=\"patient-search-results-table\"]/tbody/tr[1]/td[1]/span")
	WebElement Recent;

	// Recent Button click
	public void Recentbutton() {

		Recent.click();
	}

	// logout Button
	@FindBy(xpath = "// *[@id=\"navbarSupportedContent\"]/ul/li[3]/a")
	WebElement logout;

	// logout Button click
	public void logout() {

		logout.click();
	}

}
