package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    @Given("user is on login page")
    public void user_is_on_login_page() {
        // Write code here that turns the phrase above into concrete actions
System.out.println("Currently in : user is on login page");
    }

    @When("user enters correct password")
    public void user_enters_correct_password() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Currently in : user enters correct password");

    }
    @And("clicks on login button")
    public void clicks_on_login_button() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Currently in : clicks on login button");
    }
    @Then("user navigates to the home page")
    public void user_navigates_to_the_home_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Currently in : user navigates to the home page");
    }
}
