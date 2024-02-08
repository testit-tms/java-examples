package ru.testit.samples;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "ru.testit.samples",
        plugin = {
                "ru.testit.listener.BaseCucumber7Listener",
                "progress",
                "summary"
        }
)
public class CucumberTest {
}
