package com.e2eTest.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2eTest.automation.utils.Setup;

public class BouletcorpPage {
	
	@FindBy(how = How.XPATH, using = "//div[@id='tabvanilla']//a[contains(text(),'Aléatoire')]")
	public static WebElement aleatoire;
	
	@FindBy(how = How.XPATH, using = "//a[@title='Share on Tumblr']")
	public static WebElement tumblr;
	
	@FindBy(how = How.XPATH, using = "//img[@title='Facebook']")
	public static WebElement facebook;
	
	@FindBy(how = How.XPATH, using = "//img[@title='Twitter']")
	public static WebElement twitter;
	
	public BouletcorpPage() {
		PageFactory.initElements(Setup.getDriver(), this);
	}
	
}
