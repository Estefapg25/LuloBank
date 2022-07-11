package co.com.retolulobank.tasks;



import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Delete;
import net.serenitybdd.screenplay.rest.interactions.Get;

public class DeleteEmployee implements Task {

    private final int id;


    public DeleteEmployee(int id) {
        this.id = id;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Delete.from("api/v1/delete/" + id).
                with(requestSpecification -> requestSpecification.header("Content-Type",
                        "application/json")));

    }

    public static DeleteEmployee inBD(int id){
        return Tasks.instrumented(DeleteEmployee.class,id);
    }
}
