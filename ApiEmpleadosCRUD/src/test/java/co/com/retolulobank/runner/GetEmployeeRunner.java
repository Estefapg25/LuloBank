package co.com.retolulobank.runner;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/get_employee.feature",
        glue = "co.com.retolulobank.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE)
public class GetEmployeeRunner {
}
