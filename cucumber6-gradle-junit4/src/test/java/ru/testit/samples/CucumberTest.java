package ru.testit.samples;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        plugin = {
                "ru.testit.listener.BaseCucumber6Listener",
                "progress",
                "summary"
        }
)
public class CucumberTest {
}
