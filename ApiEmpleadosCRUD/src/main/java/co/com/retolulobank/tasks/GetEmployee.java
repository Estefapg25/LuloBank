package co.com.retolulobank.tasks;



import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Get;
import net.serenitybdd.screenplay.rest.interactions.Post;

import java.io.File;

public class GetEmployee implements Task {

    private final int id;

    public GetEmployee(int id) {
        this.id = id;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Get.resource("api/v1/employee/" + id).
                with(requestSpecification -> requestSpecification.header("Content-Type",
                        "application/json")));

    }

    public static GetEmployee inCompany(int id){
        return Tasks.instrumented(GetEmployee.class,id);
    }
}
