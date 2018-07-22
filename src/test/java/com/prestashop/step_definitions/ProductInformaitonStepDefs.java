package com.prestashop.step_definitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.prestashop.pages.HomePage;
import com.prestashop.pages.ItemPage;
import com.prestashop.utilities.Driver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ProductInformaitonStepDefs {

	HomePage homePage = new HomePage();

	@When("the user selects Printed Summer Dress")
	public void the_user_selects_Printed_Summer_Dress() {
		homePage.item("Printed Summer Dress").click();
	}

	@Then("product information page should be displayed")
	public void product_information_page_should_be_displayed() {
		String actual = Driver.getDriver().getTitle();
		String expected = "Printed Summer Dress";

		assertTrue(actual.contains(expected));

	}

	@Then("product name should be Printed Summer Dress")
	public void product_name_should_be_Printed_Summer_Dress() {
		ItemPage itemPage = new ItemPage();
		assertEquals("Printed Dress", itemPage.itemName.getText());
	}

	@Then("correct default count size should be displayed")
	public void correct_default_count_size_should_be_displayed() {
		ItemPage itemPage = new ItemPage();
		assertEquals("1", itemPage.count.getAttribute("value"));
		assertEquals("S", itemPage.size().getFirstSelectedOption().getText());
	}

}













