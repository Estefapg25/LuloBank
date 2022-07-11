package co.com.retolulobank.questions;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidateGetEmployee implements Question<Boolean> {

    private final String age;
    private final String name;


    public ValidateGetEmployee(String age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String ageService= SerenityRest.lastResponse().getBody().jsonPath().get("data.employee_age").toString();
        String nameService= SerenityRest.lastResponse().getBody().jsonPath().get("data.employee_name").toString();

        return (ageService.contains(age) && (nameService.contains(name)));
    }

    public static ValidateGetEmployee forId (String age, String name){
        return new ValidateGetEmployee(age, name);
    }
}
