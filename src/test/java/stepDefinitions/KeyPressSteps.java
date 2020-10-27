package stepDefinitions;

import cucumber.api.java.cs.A;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import functionsLibrary.CommonFunctions;
import functionsLibrary.Constants;
import org.junit.Assert;
import pageObjects.KeyPressPage;

public class KeyPressSteps extends CommonFunctions {

     KeyPressPage keyPressPage = new KeyPressPage(driver);

    @When("^I click the Key presses link$")
    public void i_click_the_Key_presses_link()  {
        keyPressPage.clkLink();
    }

    @When("^I will be in the Key Presses page$")
    public void i_will_be_in_the_Key_Presses_page()  {
        Assert.assertEquals(Constants.KEYPRESS_TEXT,keyPressPage.getTitle());
    }

    @When("^I press four keys one after the other$")
    public void i_press_four_keys_one_after_the_other()  {
        keyPressPage.pressFourKeys();
        
    }

    @Then("^I should be able to validate the displayed text one after the other$")
    public void i_should_be_able_to_validate_the_displayed_text_one_after_the_other()  {
        Assert.assertEquals(Constants.KEYPRESS_ONE,keyPressPage.getKeyOne());
        Assert.assertEquals(Constants.KEYPRESS_TWO,keyPressPage.getKeyTwo());
        Assert.assertEquals(Constants.KEYPRESS_THREE,keyPressPage.getKeyThree());
        Assert.assertEquals(Constants.KEYPRESS_FOUR,keyPressPage.getKeyFour());
    }

}
