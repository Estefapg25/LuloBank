package co.com.retolulobank.questions;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidateDeleteEmployee implements Question<Integer> {



    @Override
    public Integer answeredBy(Actor actor) {
        return SerenityRest.lastResponse().getBody().jsonPath().get("data");
    }

    public static ValidateDeleteEmployee forId(){
        return new ValidateDeleteEmployee();
    }
}
