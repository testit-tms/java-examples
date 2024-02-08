import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.junit5.TextReportExtension;
import com.codeborne.selenide.logevents.SelenideLogger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
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
    public void TestFailed() {
        steps.openPage();

        SelenideElement searchField = steps.getElementByXpath("//h1[contains(@class,'title')]");

        searchField.shouldHave(innerText("Система для управления тестированием"));
    }

    @Test
    public void TestSuccess() {
        steps.openPage();

        SelenideElement searchField = steps.getElementByXpath("//h1[contains(@class,'title')]");

        searchField.shouldHave(innerText("Система управления тестированием"));
    }
}
