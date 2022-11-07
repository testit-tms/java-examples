package ru.testit.samples;

import io.cucumber.junit.platform.engine.Cucumber;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;


@Suite
@SelectClasspathResource("ru/testit/samples")
public class CucumberTest {
}
