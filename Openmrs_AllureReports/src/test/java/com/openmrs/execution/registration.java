package com.openmrs.execution;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.openmrs.utils.BaseClass;
import com.openmrs.utils.PageElements;
import com.openmrs.utils.Property;
import com.openmrs.utils.Random_Month_Utility;
import com.openmrs.utils.TestData;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Link;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.qameta.allure.Story;

public class registration extends BaseClass{

	@Test(priority = 1, description = "Register a patient on OPENMRS Portal")
	@Description("Verify Register a patient on OPENMRS Portal........")
	@Severity(SeverityLevel.BLOCKER)
	@Owner("Bandi Ujjinesh")
	@Epic("E001")
	@Feature("Feature1: Registration")
	@Story("Story:Register a patient")
	@Step("Verify Register a patient")
	@Link(name = "OpenMRS", url = "https://demo.openmrs.org/openmrs/referenceapplication/login.page")
	public void register() throws Throwable {
		TestData td = new TestData();
		
		PageElements elements = PageFactory.initElements(driver, PageElements.class);
		elements.Login(Property.getValueForKey("Username"),Property.getValueForKey("password"));
		elements.Register();
		elements.patientname(td.getFamilyName(),td.getGivenName());
		elements.confirmright();
		elements.gendertype(td.getGender());
		elements.confirmright();
		elements.DOB(String.valueOf(td.getDate()), Random_Month_Utility.generateRandomMonth(), "19"+String.valueOf(td.getYear()));
		elements.confirmright();
		elements.address(td.getAddress1(), td.getAddress2(), td.getVillage(), td.getState(), td.getCountry(), td.getPostalcode());
		elements.confirmright();
		elements.mobilenumber(td.getPhonenumber());
		elements.confirmright();
		elements.patientrelation(td.getRelationship_type(), td.getPersonName());
		elements.confirmright();
		elements.confirmbutton();
		elements.Patientid();
		elements.HomeIcon();
		elements.Find_Patient();
		elements.Recentbutton();
		elements.logout();
		
	}
}
