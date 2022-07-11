package co.com.retolulobank.tasks;



import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Post;

import java.io.File;

public class NewEmployee implements Task {

    private final String request;

    public NewEmployee(String request) {
        this.request = request;
    }



    @Override
    public <T extends Actor> void performAs(T actor) {
        File requestBody = new File("src/test/resources/requests/" + request + ".json");
        actor.attemptsTo(Post.to("api/v1/create").
                with(requestSpecification -> requestSpecification.header("Content-Type",
                        "application/json").body(requestBody)));

    }

    public static NewEmployee withRequest(String request){
        return Tasks.instrumented(NewEmployee.class,request);
    }
}
