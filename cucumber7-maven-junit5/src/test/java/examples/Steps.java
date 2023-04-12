package examples;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import ru.testit.annotations.Description;
import ru.testit.annotations.Title;
import ru.testit.models.LinkType;
import ru.testit.services.Adapter;

import java.util.ArrayList;
import java.util.List;

public class Steps {

    @Then("return true")
    public void returnTrue() {
        Assert.assertTrue(true);
    }

    @Then("return false")
    public void returnFalse() {
        Assert.assertTrue(false);
    }

    @When("get parameters {int} {word}")
    public void getParameters(int number, String value) {
        Assert.assertTrue(true);
    }

    @When("step01")
    public void step01() {
    }

    @When("step02")
    @Title("Step02 Title")
    public void step02() {
    }

    @When("step03")
    @Description("Step03 Description")
    public void step03() {
    }

    @When("step04")
    @Title("Step04 Title")
    @Description("Step04 Description")
    public void step04() {
    }

    @When("add links")
    public void addLinks() {
        Adapter.addLinks("https://test01.example", "Example01", "Example01 description", LinkType.ISSUE);
        Adapter.addLinks("https://test02.example", "Example02", "Example02 description", LinkType.ISSUE);
    }

    @When("add attachments")
    public void addAttachments() {
        Adapter.addAttachments("Content", "file01.txt");
        Adapter.addAttachments("resources/attachments/file02.txt");
        List<String> paths = new ArrayList<>();
        paths.add("resources/attachments/file03.txt");
        paths.add("resources/attachments/file04.txt");
        Adapter.addAttachments(paths);
    }

    @When("add message")
    public void addMessage() {
        Adapter.addMessage("Message");
    }

    @When("add all methods")
    public void addAllMethods() {
        Adapter.addLinks("https://test01.example", "Example01", "Example01 description", LinkType.ISSUE);
        Adapter.addLinks("https://test02.example", "Example02", "Example02 description", LinkType.ISSUE);

        Adapter.addAttachments("Content", "file01.txt");
        Adapter.addAttachments("resources/attachments/file02.txt");
        List<String> paths = new ArrayList<>();
        paths.add("resources/attachments/file03.txt");
        paths.add("resources/attachments/file04.txt");
        Adapter.addAttachments(paths);

        Adapter.addMessage("Message");
    }
}
