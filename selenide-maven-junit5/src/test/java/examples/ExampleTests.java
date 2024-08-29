package examples;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.junit5.TextReportExtension;
import com.codeborne.selenide.logevents.SelenideLogger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import ru.testit.annotations.*;
import ru.testit.models.LinkType;
import ru.testit.selenide.SelenideListener;

import static com.codeborne.selenide.Condition.innerText;

@ExtendWith(TextReportExtension.class)
public class ExampleTests {

    private Steps steps;

    @BeforeEach
    public void setUp() {
        SelenideLogger.addListener(
                "TmsSelenide",
                new SelenideListener()
                        .saveScreenshots(true)
                        .savePageSource(true)
                        .includeSelenideSteps(true));

        steps = new Steps();
    }

    @Test
    @ExternalId("withAllAnnotations_failed")
    @DisplayName("withAllAnnotations_failed DisplayName")
    @Title("withAllAnnotations_failed Title")
    @Description("withAllAnnotations_failed")
    @Labels({"Label1", "Label2"})
    @WorkItemIds({"26449", "321"})
    @Links(links = {
            @Link(url = "https://test01.example", title = "Example01", description = "Example01 description", type = LinkType.ISSUE),
            @Link(url = "https://test02.example", title = "Example02", description = "Example01 description", type = LinkType.ISSUE)}
    )
    public void TestFailed() {
        steps.openPage();

        SelenideElement searchField = steps.getElementByXpath("//h1[contains(@class,'title')]");

        searchField.shouldHave(innerText("Система для управления тестированием"));
    }

    @Test
    @ExternalId("withAllAnnotations_success")
    @DisplayName("withAllAnnotations_success DisplayName")
    @Title("withAllAnnotations_success Title")
    @Description("withAllAnnotations_success")
    @Labels({"Label1", "Label2"})
    @WorkItemIds({"26449", "26450"})
    @Links(links = {
            @Link(url = "https://test01.example", title = "Example01", description = "Example01 description", type = LinkType.ISSUE),
            @Link(url = "https://test02.example", title = "Example02", description = "Example01 description", type = LinkType.ISSUE)}
    )
    public void TestSuccess() {
        steps.openPage();

        SelenideElement searchField = steps.getElementByXpath("//h1[contains(@class,'title')]");

        searchField.shouldHave(innerText("Система управления тестированием"));
    }
}
