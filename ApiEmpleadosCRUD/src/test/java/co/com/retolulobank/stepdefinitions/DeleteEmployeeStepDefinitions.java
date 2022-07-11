package co.com.retolulobank.stepdefinitions;


import co.com.retolulobank.exceptions.ExceptionError;
import co.com.retolulobank.questions.ValidateDeleteEmployee;
import co.com.retolulobank.tasks.DeleteEmployee;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

import static org.hamcrest.Matchers.equalTo;

public class DeleteEmployeeStepDefinitions {


    @When("^information is removed by$")
    public void informationIsRemovedById(int id) {
        OnStage.theActorInTheSpotlight().attemptsTo(DeleteEmployee.inBD(id));
    }
    @Then("^validate the id in response$")
    public void validateTheIdInResponse(int id) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateDeleteEmployee.forId(), equalTo(id)).orComplainWith(ExceptionError.class));
    }

}
