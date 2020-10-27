package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import functionsLibrary.CommonFunctions;
import pageObjects.FormAuthenticationPage;

public class FormAuthenticationSteps extends CommonFunctions {

    FormAuthenticationPage formAuthenticationPage = new FormAuthenticationPage(driver);

    @Given("^I navigate to the provided Url$")
    public void i_navigate_to_the_provided_Url()  {
        formAuthenticationPage.openUrl();
    }

    @When("^I click the Form Authentication Link$")
    public void i_click_the_Form_Authentication_Link()  {
        formAuthenticationPage.clkAuthenticationLink();
    }

    @When("^I ll taken to the Form Authentication page$")
    public void i_ll_taken_to_the_Form_Authentication_page()  {
        formAuthenticationPage.validateLoginPage();
    }

    @When("^I enter the Username as \"(.*?)\"$")
    public void i_enter_the_Username_as(String userName)  {
        formAuthenticationPage.setUsername(userName);
    }

    @When("^I enter the Password as \"(.*?)\"$")
    public void i_enter_the_Password_as(String password)  {
        formAuthenticationPage.setPassword(password);
    }

    @When("^I click the Submit button$")
    public void i_click_the_Submit_button()  {
        formAuthenticationPage.clkLogin();
    }

    @Then("^I should not be allowed to login with wrong password$")
    public void i_should_not_be_allowed_to_login_with_wrong_password()  {
        formAuthenticationPage.validateWithWrongPassword();
    }
    @Then("^I should not be allowed to login with wrong Username$")
    public void i_should_not_be_allowed_to_login_with_wrong_Username()  {
        formAuthenticationPage.validateWithWrongUserName();
    }
    @When("^I should be allowed to login Successfully$")
    public void i_should_be_allowed_to_login_Successfully() {
        formAuthenticationPage.validateWithValidData();
        }

    @When("^I should be able to click Logout$")
    public void i_should_be_able_to_click_Logout() {
        formAuthenticationPage.clkLogout();
        }

    @Then("^I should be able to logout successfully$")
    public void i_should_be_able_to_logout_successfully() {
        formAuthenticationPage.validateLogoutPage();
        }
}
