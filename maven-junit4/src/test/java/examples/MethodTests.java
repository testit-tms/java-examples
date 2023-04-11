package examples;


import org.junit.Assert;
import org.junit.Test;
import ru.testit.models.LinkType;
import ru.testit.services.Adapter;

import java.util.ArrayList;
import java.util.List;

public class MethodTests {
    @Test
    public void addLinks_success() {
        Adapter.addLinks("https://test01.example", "Example01", "Example01 description", LinkType.ISSUE);
        Adapter.addLinks("https://test02.example", "Example02", "Example02 description", LinkType.ISSUE);

        Assert.assertTrue(true);
    }

    @Test
    public void addLinks_failed() {
        Adapter.addLinks("https://test01.example", "Example01", "Example01 description", LinkType.ISSUE);
        Adapter.addLinks("https://test02.example", "Example02", "Example02 description", LinkType.ISSUE);

        Assert.assertTrue(false);
    }

    @Test
    public void addAttachments_success() {
        Adapter.addAttachments("Content", "file01.txt");
        Adapter.addAttachments("resources/attachments/file02.txt");
        List<String> paths = new ArrayList<>();
        paths.add("resources/attachments/file03.txt");
        paths.add("resources/attachments/file04.txt");
        Adapter.addAttachments(paths);

        Assert.assertTrue(true);
    }

    @Test
    public void addAttachments_failed() {
        Adapter.addAttachments("Content", "file01.txt");
        Adapter.addAttachments("resources/attachments/file02.txt");
        List<String> paths = new ArrayList<>();
        paths.add("resources/attachments/file03.txt");
        paths.add("resources/attachments/file04.txt");
        Adapter.addAttachments(paths);

        Assert.assertTrue(false);
    }

    @Test
    public void addMessage_success() {
        Adapter.addMessage("Message");

        Assert.assertTrue(true);
    }

    @Test
    public void addMessage_failed() {
        Adapter.addMessage("Message");

        Assert.assertTrue(false);
    }

    @Test
    public void allMethods_success() {
        Adapter.addLinks("https://test01.example", "Example01", "Example01 description", LinkType.ISSUE);
        Adapter.addLinks("https://test02.example", "Example02", "Example02 description", LinkType.ISSUE);

        Adapter.addAttachments("Content", "file01.txt");
        Adapter.addAttachments("resources/attachments/file02.txt");
        List<String> paths = new ArrayList<>();
        paths.add("resources/attachments/file03.txt");
        paths.add("resources/attachments/file04.txt");
        Adapter.addAttachments(paths);

        Adapter.addMessage("Message");

        Assert.assertTrue(true);
    }

    @Test
    public void allMethods_failed() {
        Adapter.addLinks("https://test01.example", "Example01", "Example01 description", LinkType.ISSUE);
        Adapter.addLinks("https://test02.example", "Example02", "Example02 description", LinkType.ISSUE);

        Adapter.addAttachments("Content", "file01.txt");
        Adapter.addAttachments("resources/attachments/file02.txt");
        List<String> paths = new ArrayList<>();
        paths.add("resources/attachments/file03.txt");
        paths.add("resources/attachments/file04.txt");
        Adapter.addAttachments(paths);

        Adapter.addMessage("Message");

        Assert.assertTrue(false);
    }
}
