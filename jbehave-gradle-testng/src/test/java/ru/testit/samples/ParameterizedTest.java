package ru.testit.samples;

import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import static org.junit.Assert.assertEquals;

public class ParameterizedTest {
    private int result;

    @When("Summing $number+$number")
    public void sum(int left, int right) {
        this.result = left + right;
    }

    @Then("Result is $number")
    public void result(int result) {
        assertEquals(this.result, result);
    }
}
