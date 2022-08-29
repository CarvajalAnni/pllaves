package co.com.prueba.key.runners;





import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/prueballaves.feature",
        glue = "co/com/prueba/key/stepdefinitions"
)
public class PruebaLlavesRunner {
}
