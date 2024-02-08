package examples;

import org.junit.*;
import org.junit.runner.RunWith;
import ru.testit.annotations.Description;
import ru.testit.annotations.Step;
import ru.testit.annotations.Title;
import ru.testit.listener.BaseJunit4Runner;

@RunWith(BaseJunit4Runner.class)
public class StepsTests {
    @BeforeClass
    public static void testSetup() {
    }

    @Before
    public void testMethod() {
    }

    @Step
    public void Step01() {
    }

    @Step
    public void Step02(int number) {
    }

    @Test
    public void stepsWithoutAnnotations_success() {
        Step01();
        Step02(2);

        Assert.assertTrue(true);
    }

    @Test
    public void stepsWithoutAnnotations_failed() {
        Step01();
        Step02(2);

        Assert.assertTrue(false);
    }


    @Step
    @Title("Step03 Title")
    public void Step03() {
    }

    @Step
    @Title("Step04 {number} Title")
    public void Step04(int number) {
    }

    @Test
    public void stepsWithTitleAnnotation_success() {
        Step03();
        Step04(3);

        Assert.assertTrue(true);
    }

    @Test
    public void stepsWithTitleAnnotation_failed() {
        Step03();
        Step04(3);

        Assert.assertTrue(false);
    }

    @Step
    @Description("Step05 Description")
    public void Step05() {
    }

    @Step
    @Description("Step06 {number} Description")
    public void Step06(int number) {
    }

    @Test
    public void stepsWithDescriptionAnnotation_success() {
        Step05();
        Step06(3);

        Assert.assertTrue(true);
    }

    @Test
    public void stepsWithDescriptionAnnotation_failed() {
        Step05();
        Step06(3);

        Assert.assertTrue(false);
    }

    @Step
    @Title("Step07 Title")
    @Description("Step07 Description")
    public void Step07() {
    }

    @Step
    @Title("Step08 {number} Title")
    @Description("Step08 {number} Description")
    public void Step08(int number) {
    }

    @Test
    public void stepsWithAllAnnotations_success() {
        Step07();
        Step08(3);

        Assert.assertTrue(true);
    }

    @Test
    public void stepsWithAllAnnotations_failed() {
        Step07();
        Step08(3);

        Assert.assertTrue(false);
    }

    @After
    public void teardownMethod() {
    }

    @AfterClass
    public static void teardownClass() {
    }
}
