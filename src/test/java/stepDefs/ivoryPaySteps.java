package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import ivorypay.BaseUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ivoryPaySteps extends BaseUtil
{
    private final BaseUtil base;
    public ivoryPaySteps(BaseUtil base)
    {
        this.base = base;
    }

    @Given("I am on IvoryPay App home page")
    public void i_am_on_ivory_pay_app_home_page()
    {
        // Write code here that turns the phrase above into concrete actions
        base.driver.manage().window().maximize();
        base.driver.get("https://qa.d1ainun5cjrnni.amplifyapp.com");
    }
    @When("I click on the SignUp link")
    public void i_click_on_the_sign_up_link()
    {
        // Write code here that turns the phrase above into concrete actions
        WebElement signupButton = base.driver.findElement(By.xpath("//a[@href='/register']"));
        signupButton.click();
    }
    @When("I populate all the mandotory fields firstname as {string}, lastname as {string}, email as {string}, businessname as {string}, country as {string}, password and confirmpassword as {string}, and phonenumber as {string}")
    public void i_populate_all_the_mandotory_fields_firstname_as_lastname_as_email_as_businessname_as_country_as_password_and_confirmpassword_as_and_phonenumber_as(String string, String string2, String string3, String string4, String string5, String string6, String string7)
    {
        // Write code here that turns the phrase above into concrete actions

    }
    @When("I click What type of business do you own? as {string} and Are you a developer? as {string}")
    public void i_click_what_type_of_business_do_you_own_as_and_are_you_a_developer_as(String string, String string2)
    {
        // Write code here that turns the phrase above into concrete actions

    }
    @When("I click I have read and agree to IvoryPay’s Privacy policy and Terms&Conditions link")
    public void i_click_i_have_read_and_agree_to_ivory_pay_s_privacy_policy_and_terms_conditions_link()
    {
        // Write code here that turns the phrase above into concrete actions

    }
    @When("I click Submit link")
    public void i_click_submit_link()
    {
        // Write code here that turns the phrase above into concrete actions

    }
    @Then("I should received the message {string}")
    public void i_should_received_the_message(String string)
    {
        // Write code here that turns the phrase above into concrete actions

    }

}
