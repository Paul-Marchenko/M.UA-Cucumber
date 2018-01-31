import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {

    @Given("^User is on Home Page$")
    public void givenStatement() {
        System.out.println("User is on Home Page");

    }

    @When("^User Navigate to LogIn Page$")
    public void whenStatement() {
        System.out.println("User is on Login Page");

    }

    @And("^User enters UserName and Password$")
    public void andStatement() {
        System.out.println("Success UserName");
        System.out.println("Success Pass");

    }

    @Then("^Message displayed Login Successfully$")
    public void thenStatement() {
        System.out.println("login success");

    }
    /*Given User is on Home Page
    When User Navigate to LogIn Page
    And User enters UserName and Password
    Then Message displayed Login Successfully*/
}
