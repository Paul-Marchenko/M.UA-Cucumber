import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Logout {
    @Given("^User is on Home Page$")
    public void givenStatement() {
        System.out.println("User is on Home Page");

    }

    @When("^User Navigate to LogIn Page$")
    public void whenStatement() {
        System.out.println("User is on Login Page");

    }
    @Then("^Message displayed Login Successfully$")
    public void thenStatement() {
        System.out.println("login success");

    }
}
