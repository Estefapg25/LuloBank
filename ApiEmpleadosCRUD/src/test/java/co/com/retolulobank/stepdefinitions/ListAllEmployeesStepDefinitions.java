package co.com.retolulobank.stepdefinitions;


import co.com.retolulobank.exceptions.ExceptionError;
import co.com.retolulobank.tasks.ListAllEmployees;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.rest.questions.ResponseConsequence;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.hasItems;

public class ListAllEmployeesStepDefinitions {

    @When("^querying the information of all employees$")
    public void queryingTheInformationOfAllEmployees() {
        theActorInTheSpotlight().attemptsTo(ListAllEmployees.ofTheCompany());
    }

    @Then("^The service returns the names of employees such as (.*), (.*), (.*)$")
    public void serviceReturnsEmployees(String employees1, String employees2, String employees3) {
        theActorInTheSpotlight().should(ResponseConsequence.seeThatResponse(
                validatableResponse -> validatableResponse.body("data.employee_name", hasItems(employees1, employees2, employees3))).orComplainWith(ExceptionError.class));
    }

}
