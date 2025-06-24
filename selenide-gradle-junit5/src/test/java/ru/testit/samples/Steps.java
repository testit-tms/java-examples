package ru.testit.samples;

import com.codeborne.selenide.SelenideElement;
import ru.testit.annotations.Step;
import ru.testit.annotations.Title;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Steps {

    @Step
    public void openPage() {
        open("https://testit.software/");
    }

    @Step
    @Title("Search element by xpath")
    public SelenideElement getElementByXpath(String xpath) {
        return $(byXpath(xpath));
    }
}
