package starter.stepdefinitions;

import io.cucumber.core.gherkin.Feature;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.Pages.ContactUs;
import starter.Pages.LifeInsuranceProduct;
import starter.startBrowser.RunDriver;
import starter.startBrowser.Baseclass;

import java.io.IOException;


public class MainPage extends Baseclass {

    LifeInsuranceProduct lifeinsurancep = new LifeInsuranceProduct();
    RunDriver rundriver = new RunDriver();
    ContactUs contactUs = new ContactUs();


    @Given("Enter URL")
    public void setUp(String URL) throws InterruptedException {
        rundriver.setUp(URL);
    }

    @When("I click on Insurance and select Life Insurance")
    public void i_click_on_insurance_and_select_life_insurance() {
        lifeinsurancep.i_click_on_insurance_and_select_life_insurance();
    }

    @Then("click on Get Quote button")
    public void click_on_get_quote_button() {
        lifeinsurancep.click_on_get_quote_button();
    }

    @When("Details are entered")
    public void details_are_entered() {
        lifeinsurancep.details_are_entered();
    }

    @Then("Click get my quote button and submit")
    public void click_get_my_quote_button_and_submit() {
        lifeinsurancep.click_get_my_quote_button_and_submit();
    }

    @And("review quote details")
    public void review_quote_details() throws InterruptedException {
        lifeinsurancep.review_quote_details();
    }

    @Then("click Apply now")
    public void click_apply_now() {
        lifeinsurancep.click_apply_now();
    }

    @Then("close the browser")
    public void close_the_browser() throws IOException, InterruptedException {
        Thread.sleep(2000);
        Baseclass.screenShot("Result"); //will take screen shot of your last step

        Baseclass.Close();
    }

    @Given("Enter URL {string}")
    public void enterURL(String URL) throws InterruptedException {
        rundriver.setUp(URL);
    }

    @When("clicked on Contact Us")
    public void clickedOnContactUs() {
        contactUs.clickedOnContactUs();
    }

    @Then("Select option as {string}")
    public void selectOptionAs(String label) throws InterruptedException {
        contactUs.selectOptionAs(label);
    }

    @And("entered all details {string} {string} {string} and send {string}")
    public void enteredAllDetailsAndSendYourEnquiry(String name, String email, String phone, String enquiryDetails) throws InterruptedException {
        contactUs.enteredAllDetails(name, email, phone, enquiryDetails);
    }
}
