package examples;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@Test
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "examples",
        plugin = {
                "ru.testit.listener.BaseCucumber4Listener",
                "progress",
                "summary"
        }
)
public class CucumberTest extends AbstractTestNGCucumberTests {
}
