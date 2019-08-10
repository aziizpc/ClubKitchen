package com.bie.qa.stepDefinitions;

import com.bie.qa.base.TestBase;
import com.bie.qa.pages.HomePage;
import com.bie.qa.pages.MamacitaPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class stepDefinitions extends TestBase {

	@Given("^User opens clubkitchen$")
	public void user_opens_clubkitchen() throws Throwable {
		TestBase.initialization();
	}

	@When("^selects Mamacita$")
	public void selects_mamacita() throws Throwable {
		HomePage homepage = new HomePage();
		homepage.selectMamacita();
	}

	@Then("^User can add item$")
	public void user_can_add_item() throws Throwable {
		MamacitaPage mamacitaPage = new MamacitaPage();
		mamacitaPage.addItemToCart();
	}
}