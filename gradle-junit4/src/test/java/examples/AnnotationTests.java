package examples;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import ru.testit.annotations.*;
import ru.testit.listener.BaseJunit4Runner;
import ru.testit.models.LinkType;

@RunWith(BaseJunit4Runner.class)
public class AnnotationTests {

   @Test
   public void withoutAnnotations_success() {
       Assert.assertTrue(true);
   }

   @Test
   public void withoutAnnotations_failed() {
       Assert.assertTrue(false);
   }

   @ExternalId("externalIdAnnotation_success")
   @Test
   public void externalIdAnnotation_success() {
       Assert.assertTrue(true);
   }

   @ExternalId("externalIdAnnotation_failed")
   @Test
   public void externalIdAnnotation_failed() {
       Assert.assertTrue(false);
   }

   @DisplayName("externalIdAnnotation_success DisplayName")
   @Test
   public void displayNameAnnotation_success() {
       Assert.assertTrue(true);
   }

   @DisplayName("displayNameAnnotation_failed DisplayName")
   @Test
   public void displayNameAnnotation_failed() {
       Assert.assertTrue(false);
   }

   @Title("titleAnnotation_success Title")
   @Test
   public void titleAnnotation_success() {
       Assert.assertTrue(true);
   }

   @Title("titleAnnotation_failed Title")
   @Test
   public void titleAnnotation_failed() {
       Assert.assertTrue(false);
   }

   @Description("descriptionAnnotation_success")
   @Test
   public void descriptionAnnotation_success() {
       Assert.assertTrue(true);
   }

   @Description("descriptionAnnotation_failed")
   @Test
   public void descriptionAnnotation_failed() {
       Assert.assertTrue(false);
   }

   @Labels({"Label1", "Label2"})
   @Test
   public void labelsAnnotation_success() {
       Assert.assertTrue(true);
   }

   @Labels({"Label1", "Label2"})
   @Test
   public void labelsAnnotation_failed() {
       Assert.assertTrue(false);
   }

   @Links(links = {
           @Link(url = "https://test01.example", title = "Example01", description = "Example01 description", type = LinkType.ISSUE),
           @Link(url = "https://test02.example", title = "Example02", description = "Example01 description", type = LinkType.ISSUE)}
   )
   @Test
   public void linksAnnotation_success() {
       Assert.assertTrue(true);
   }

   @Links(links = {
           @Link(url = "https://test01.example", title = "Example01", description = "Example01 description", type = LinkType.ISSUE),
           @Link(url = "https://test02.example", title = "Example02", description = "Example01 description", type = LinkType.ISSUE)}
   )
   @Test
   public void linksAnnotation_failed() {
       Assert.assertTrue(false);
   }

   @WorkItemIds({"26020", "26021"})
   @Test
   public void workItemIdsAnnotation_success() {
       Assert.assertTrue(true);
   }

   @WorkItemIds({"1519", "1520"})
   @Test
   public void workItemIdsAnnotation_failed() {
       Assert.assertTrue(false);
   }

   @ExternalId("withAllAnnotations_success")
   @DisplayName("withAllAnnotations_success DisplayName")
   @Title("withAllAnnotations_success Title")
   @Description("withAllAnnotations_success")
   @Labels({"Label1", "Label2"})
   @WorkItemIds({"1521", "1522"})
   @Links(links = {
           @Link(url = "https://test01.example", title = "Example01", description = "Example01 description", type = LinkType.ISSUE),
           @Link(url = "https://test02.example", title = "Example02", description = "Example01 description", type = LinkType.ISSUE)}
   )
   @Test
   public void withAllAnnotations_success() {
       Assert.assertTrue(true);
   }

   @ExternalId("withAllAnnotations_failed")
   @DisplayName("withAllAnnotations_failed DisplayName")
   @Title("withAllAnnotations_failed Title")
   @Description("withAllAnnotations_failed")
   @Labels({"Label1", "Label2"})
   @WorkItemIds({"1521", "1522"})
   @Links(links = {
           @Link(url = "https://test01.example", title = "Example01", description = "Example01 description", type = LinkType.ISSUE),
           @Link(url = "https://test02.example", title = "Example02", description = "Example01 description", type = LinkType.ISSUE)}
   )
   @Test
   public void withAllAnnotations_failed() {
       Assert.assertTrue(false);
   }
}
