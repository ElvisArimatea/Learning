package runners;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/Features/alugar_filme.feature",
		glue = "steps",
		plugin = "pretty",
		tags = ""
		)
public class Runner {

}
