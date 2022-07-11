package co.com.retolulobank.stepdefinitions;

import co.com.retolulobank.exceptions.ExceptionError;
import co.com.retolulobank.questions.ValidateBodyCreateEmployee;
import co.com.retolulobank.questions.ValidateNewEmployee;
import co.com.retolulobank.tasks.NewEmployee;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import static org.hamcrest.Matchers.*;

public class NewEmployeeStepDefinitions {

    @When("^the user sends the body of the request in the (.*) json file to add new employee$")
    public void theUserSendsTheBodyOfTheRequestInTheCREATEPOSTEmployeeJsonFileToAddNewEmployee(String request) {
        OnStage.theActorInTheSpotlight().attemptsTo(NewEmployee.withRequest(request));
    }

    @Then("^response status code is (.*)$")
    public void responseStatusCodeIs(Integer code) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateNewEmployee.inApi(), equalTo(code)).orComplainWith(ExceptionError.class));
    }
    @Then("^the answer in the body is message (.*)$")
    public void theAnswerInTheBodyIsMessageSuccessfully(String message) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateBodyCreateEmployee.inMessage(message)).orComplainWith(ExceptionError.class));
    }

}
