package ru.testit.samples;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {
                "ru.testit.listener.BaseCucumber6Listener",
                "progress",
                "summary"
        },
        features = "src/test/resources/features"
)
public class SerenityRunnerTest {
}