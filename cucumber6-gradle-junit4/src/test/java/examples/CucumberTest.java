package examples;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "examples",
        plugin = {
                "ru.testit.listener.BaseCucumber6Listener",
                "progress",
                "summary"
        }
)
public class CucumberTest {
}
