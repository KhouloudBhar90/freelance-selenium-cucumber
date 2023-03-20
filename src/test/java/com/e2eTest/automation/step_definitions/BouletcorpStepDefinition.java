package com.e2eTest.automation.step_definitions;

import org.openqa.selenium.WebDriver;

import com.e2eTest.automation.page_objects.BouletcorpPage;
import com.e2eTest.automation.utils.ConfigFileReader;
import com.e2eTest.automation.utils.SeleniumUtils;
import com.e2eTest.automation.utils.Setup;
import com.e2eTest.automation.utils.Validations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BouletcorpStepDefinition {

	public BouletcorpPage bouletcorpPage;
	public SeleniumUtils seleniumUtils;
	public ConfigFileReader configFileReader;
	public Validations validation;
	
	
	public BouletcorpStepDefinition() {
		bouletcorpPage = new BouletcorpPage();
		seleniumUtils = new SeleniumUtils();
		validation = new Validations();
		configFileReader = new ConfigFileReader();
	} 

	@Given("J accede a l application bouletcorp.com")
	public void jAccedeALApplicationBouletcorpCom() {
		seleniumUtils.get(configFileReader.getProperties("home.url"));
	}
	@When("Je clique sur Aleatoire")
	public void jeCliqueSurAleatoire() {
		seleniumUtils.click(BouletcorpPage.aleatoire);
	}
	@Then("la page a change {string}")
	public void laPageAChange(String url) {
		validation.assertNotEquals(url, SeleniumUtils.getCurrentUrl(Setup.getDriver()));  
	}
	
	@Then("les widgets facebook twitter et tumblr sont bien affiches")
	public void lesWidgetsFacebookTwitterEtTumblrSontBienAffiches() {
		validation.isElementDisplayed(BouletcorpPage.facebook);
		validation.isElementDisplayed(BouletcorpPage.tumblr);
		validation.isElementDisplayed(BouletcorpPage.twitter);
	}



}
