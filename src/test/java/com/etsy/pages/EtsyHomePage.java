package com.etsy.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.prestashop.utilities.Driver;

public class EtsyHomePage {
	
	public EtsyHomePage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	
	@FindBy(id ="search-query")
	public WebElement searchField;
	
	
	
	@FindBy(xpath ="//button[@value='Search']")
	public WebElement searchButton;

}
