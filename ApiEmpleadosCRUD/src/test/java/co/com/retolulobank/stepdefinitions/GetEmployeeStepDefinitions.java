package co.com.retolulobank.stepdefinitions;


import co.com.retolulobank.questions.ValidateBodyCreateEmployee;
import co.com.retolulobank.questions.ValidateGetEmployee;
import co.com.retolulobank.tasks.GetEmployee;
import co.com.retolulobank.tasks.ListAllEmployees;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.rest.questions.ResponseConsequence;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.hasItems;

public class GetEmployeeStepDefinitions {

    @When("^I consult the information by$")
    public void IConsultTheInformationByName(int id) {
        theActorInTheSpotlight().attemptsTo(GetEmployee.inCompany(id));
    }

    @Then("^validate the age (.*) años and name employee (.*) in the response$")
    public void serviceReturnsEmployees(String age, String name) {
        theActorInTheSpotlight().should(seeThat(ValidateGetEmployee.forId(age, name)));

    }

}
