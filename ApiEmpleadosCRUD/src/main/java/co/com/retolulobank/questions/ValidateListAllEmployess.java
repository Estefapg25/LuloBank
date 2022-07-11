package co.com.retolulobank.questions;


import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.List;

import static org.hamcrest.Matchers.hasItems;


public class ValidateListAllEmployess implements Question<Boolean> {


    @Override
    public Boolean answeredBy(Actor actor) {
        return SerenityRest.lastResponse().getBody().jsonPath().get("data.employee_name");


    }
    public static ValidateListAllEmployess inCompany (){
        return new ValidateListAllEmployess();
    }

}
