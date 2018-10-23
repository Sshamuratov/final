package com.etsy.step_definitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import javax.management.RuntimeErrorException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.etsy.pages.EtsyHomePage;
import com.prestashop.utilities.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class EtsySearchStepDefs {
//	WebDriver driver;
	
	EtsyHomePage homepage = new EtsyHomePage();
	private String keyword;

	
	@Given("User in on Etsy homepage")
	public void user_in_on_Etsy_homepage() throws Exception {
//		DesiredCapabilities caps = DesiredCapabilities.chrome();
//		caps.setPlatform(Platform.ANY);
//		driver = new RemoteWebDriver(new URL("http://18.221.105.71:4444/wd/hub"), caps);
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	assertEquals((Driver.getDriver().getTitle()),"Etsy.com | Shop for anything from creative people everywhere");
	   
	}

	@When("User searches for {string}")
	public void user_searches_for(String keyword) {
		this.keyword = keyword;
	    homepage.searchField.sendKeys(keyword + Keys.ENTER);
	    System.out.println("SEARCHING FOR " + keyword);
	    
	}

	@Then("Search result should be displayed")
	public void search_result_should_be_displayed() throws Exception {
		if(keyword.contains("pan")) {
			keyword+=1;
		} 
	 assertTrue(Driver.getDriver().getTitle().toLowerCase().contains(keyword));
	}


}
