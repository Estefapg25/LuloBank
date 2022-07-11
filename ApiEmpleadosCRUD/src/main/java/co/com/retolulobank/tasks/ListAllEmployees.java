package co.com.retolulobank.tasks;



import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Get;
import net.serenitybdd.screenplay.rest.interactions.Post;

import java.io.File;

public class ListAllEmployees implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Get.resource("api/v1/employees"));
    }

    public static ListAllEmployees ofTheCompany(){
        return Tasks.instrumented(ListAllEmployees.class);
    }
}
