package co.com.retolulobank.questions;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidateNewEmployee implements Question<Integer> {

    @Override
    public Integer answeredBy(Actor actor) {

        return SerenityRest.lastResponse().getStatusCode();
    }

    public static ValidateNewEmployee inApi (){
        return new ValidateNewEmployee();
    }
}
