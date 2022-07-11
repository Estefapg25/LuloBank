package co.com.retolulobank.questions;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidateBodyCreateEmployee implements Question<Boolean> {

    private final String message;

    public ValidateBodyCreateEmployee(String message) {
        this.message = message;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String messageService= SerenityRest.lastResponse().getBody().jsonPath().get("message").toString();


        return messageService.contains(message);
    }

    public static ValidateBodyCreateEmployee inMessage (String message){
        return new ValidateBodyCreateEmployee(message);
    }
}
