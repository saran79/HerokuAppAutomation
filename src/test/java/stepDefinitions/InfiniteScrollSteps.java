package stepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import functionsLibrary.CommonFunctions;
import functionsLibrary.Constants;
import org.junit.Assert;
import pageObjects.InfiniteScrollPage;

public class InfiniteScrollSteps  extends CommonFunctions {

    InfiniteScrollPage infiniteScrollPage = new InfiniteScrollPage(driver);
    @When("^I click the infinite scroll link$")
    public void i_click_the_infinite_scroll_link()  {
        infiniteScrollPage.clkScrollLink();
    }
    @Then("^I should be able to view the infinite scroll page$")
    public void i_should_be_able_to_view_the_infinite_scroll_page()  {
        String actualMsg = infiniteScrollPage.getTitle();
        Assert.assertEquals(Constants.INFINITE_TEXT,actualMsg);
    }

    @When("^I scroll down to the Bottom of the page twice$")
    public void i_scroll_down_to_the_Bottom_of_the_page_twice()  {
        infiniteScrollPage.scrollBottom();
    }

    @When("^I Scroll Up to the Top of the page$")
    public void i_Scroll_Up_to_the_Top_of_the_page()  {
        
    }

    @Then("^I should be able to validate the text \"(.*?)\"$")
    public void i_should_be_able_to_validate_the_text(String expectedMsg)  {
        String actualMsg = infiniteScrollPage.getTitle();
        Assert.assertEquals(expectedMsg,actualMsg);

        
    }


}
