package examples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import ru.testit.annotations.*;
import ru.testit.models.LinkType;

import java.util.stream.Stream;

public class AnnotationTests {

    @Test
    public void withoutAnnotations_success() {
        Assertions.assertTrue(true);
    }

    @Test
    public void withoutAnnotations_failed() {
        Assertions.fail();
    }

    @ExternalId("externalIdAnnotation_success")
    @Test
    public void externalIdAnnotation_success() {
        Assertions.assertTrue(true);
    }

    @ExternalId("externalIdAnnotation_failed")
    @Test
    public void externalIdAnnotation_failed() {
        Assertions.fail();
    }

    @DisplayName("externalIdAnnotation_success DisplayName")
    @Test
    public void displayNameAnnotation_success() {
        Assertions.assertTrue(true);
    }

    @DisplayName("displayNameAnnotation_failed DisplayName")
    @Test
    public void displayNameAnnotation_failed() {
        Assertions.fail();
    }

    @Title("titleAnnotation_success Title")
    @Test
    public void titleAnnotation_success() {
        Assertions.assertTrue(true);
    }

    @Title("titleAnnotation_failed Title")
    @Test
    public void titleAnnotation_failed() {
        Assertions.fail();
    }

    @Description("descriptionAnnotation_success")
    @Test
    public void descriptionAnnotation_success() {
        Assertions.assertTrue(true);
    }

    @Description("descriptionAnnotation_failed")
    @Test
    public void descriptionAnnotation_failed() {
        Assertions.fail();
    }

    @Labels({"Label1", "Label2"})
    @Test
    public void labelsAnnotation_success() {
        Assertions.assertTrue(true);
    }

    @Labels({"Label1", "Label2"})
    @Test
    public void labelsAnnotation_failed() {
        Assertions.fail();
    }

    @Links(links = {
            @Link(url = "https://test01.example", title = "Example01", description = "Example01 description", type = LinkType.ISSUE),
            @Link(url = "https://test02.example", title = "Example02", description = "Example01 description", type = LinkType.ISSUE)}
    )
    @Test
    public void linksAnnotation_success() {
        Assertions.assertTrue(true);
    }

    @Links(links = {
            @Link(url = "https://test01.example", title = "Example01", description = "Example01 description", type = LinkType.ISSUE),
            @Link(url = "https://test02.example", title = "Example02", description = "Example01 description", type = LinkType.ISSUE)}
    )
    @Test
    public void linksAnnotation_failed() {
        Assertions.fail();
    }

    @WorkItemIds({"1523", "1524"})
    @Test
    public void workItemIdsAnnotation_success() {
        Assertions.assertTrue(true);
    }

    @WorkItemIds({"1523", "1524"})
    @Test
    public void workItemIdsAnnotation_failed() {
        Assertions.fail();
    }

    @ExternalId("withAllAnnotations_success")
    @DisplayName("withAllAnnotations_success DisplayName")
    @Title("withAllAnnotations_success Title")
    @Description("withAllAnnotations_success")
    @Labels({"Label1", "Label2"})
    @WorkItemIds({"1525", "1526"})
    @Links(links = {
            @Link(url = "https://test01.example", title = "Example01", description = "Example01 description", type = LinkType.ISSUE),
            @Link(url = "https://test02.example", title = "Example02", description = "Example01 description", type = LinkType.ISSUE)}
    )
    @Test
    public void withAllAnnotations_success() {
        Assertions.assertTrue(true);
    }

    @ExternalId("withAllAnnotations_failed")
    @DisplayName("withAllAnnotations_failed DisplayName")
    @Title("withAllAnnotations_failed Title")
    @Description("withAllAnnotations_failed")
    @Labels({"Label1", "Label2"})
    @WorkItemIds({"1525", "1526"})
    @Links(links = {
            @Link(url = "https://test01.example", title = "Example01", description = "Example01 description", type = LinkType.ISSUE),
            @Link(url = "https://test02.example", title = "Example02", description = "Example01 description", type = LinkType.ISSUE)}
    )
    @Test
    public void withAllAnnotations_failed() {
        Assertions.fail();
    }

    static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of(1, "string1"),
                Arguments.of(2, "string2"),
                Arguments.of(3, "string3")
        );
    }

    @ExternalId("parametrizedTest_success_{number}_{str}")
    @DisplayName("parametrizedTest_success DisplayName {number} {str}")
    @Title("parametrizedTest_success Title {number} {str}")
    @ParameterizedTest
    @MethodSource("arguments")
    public void parametrizedTest_success(int number, String str) {
        Assertions.assertTrue(true);
    }

    @ExternalId("parametrizedTest_success_{number}_{str}")
    @DisplayName("parametrizedTest_success DisplayName {number} {str}")
    @Title("parametrizedTest_success Title {number} {str}")
    @ParameterizedTest
    @MethodSource("arguments")
    public void parametrizedTest_failed(int number, String str) {
        Assertions.fail();
    }
}
