package ru.testit.samples;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import ru.testit.models.LinkType;
import ru.testit.services.Adapter;

import static org.junit.Assert.assertTrue;


public class SampleTests {
    @Given("I authorize on the portal")
    public void authorization() {
        assertTrue(setLogin("User_1"));
        assertTrue(setPassword("Pass123"));
    }

    private boolean setLogin(String login) {
        return login.equals("User_1");
    }

    private boolean setPassword(String password) {
        return password.equals("Pass123");
    }

    @When("I create a project")
    public void createProject() {
        assertTrue(true);
    }

    @When("I open the project")
    public void enterProject() {
        assertTrue(true);
    }

    @When("I create a section")
    public void createSection() {
        assertTrue(true);
    }

    @When("I create a section - failed")
    public void createFailedSection() {
        assertTrue(false);
    }

    @Then("I create a test case")
    public void createTestCase() {
        Adapter.addLinks("https://testit.ru/", "Test 1", "Desc 1", LinkType.ISSUE);
        assertTrue(true);
    }

    @Then("I check something")
    public void requiredAnnotationsTest() {
        assertTrue(true);
    }

    @Then("I check something - failed")
    public void requiredAnnotationsFailedTest() {
        assertTrue(false);
    }
}
