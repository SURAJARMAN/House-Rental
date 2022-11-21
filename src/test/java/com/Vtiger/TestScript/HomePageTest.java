package com.Vtiger.TestScript;

import org.testng.annotations.Test;

import com.Vtiger.GenricLibraries.BaseClass;
import com.Vtiger.ObjectRepositary.CreateNewOrganiZationPage;
import com.Vtiger.ObjectRepositary.CreateOrganization;
import com.Vtiger.ObjectRepositary.HomePage;

public class HomePageTest extends BaseClass {

	@Test
	public void Home() {
		HomePage h=new HomePage(driver);
		h.organizationbtn();
		CreateOrganization corg=new CreateOrganization(driver);
		corg.CreatenewOrganization();
		CreateNewOrganiZationPage corgname=new CreateNewOrganiZationPage(driver);
		corgname.Giveorgname("Testyantra C#42","Integrator");
		corgname.IndusType("Banking");   
	}
	
}
