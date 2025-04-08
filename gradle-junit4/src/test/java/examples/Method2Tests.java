package examples;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import ru.testit.listener.BaseJunit4Runner;
import ru.testit.models.LinkType;
import ru.testit.services.Adapter;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

@RunWith(BaseJunit4Runner.class)
public class Method2Tests {


    @Test
    public void addLinks_failed() {
        Adapter.addLinks("https://test01.example", "Example01", "Example01 description", LinkType.ISSUE);
        Adapter.addLinks("https://test02.example", "Example02", "Example02 description", LinkType.ISSUE);

        Assert.assertTrue(false);
    }



    @Test
    public void addAttachments_success() {
        Adapter.addAttachments("Content", "file01.txt");
        Assert.assertTrue(true);
    }

    // @Test
    // public void addMessage_failed() {
    //     Adapter.addMessage("Message");

    //     Assert.assertTrue(false);
    // }

    // @Test
    // public void allMethods_failed() {
    //     Adapter.addLinks("https://test01.example", "Example01", "Example01 description", LinkType.ISSUE);
    //     Adapter.addLinks("https://test02.example", "Example02", "Example02 description", LinkType.ISSUE);

    //     Adapter.addAttachments("Content", "file01.txt");
    //     Adapter.addAttachments(getFileFullPath("attachments/file02.txt"));
    //     List<String> paths = new ArrayList<>();
    //     paths.add(getFileFullPath("attachments/file03.txt"));
    //     paths.add(getFileFullPath("attachments/file04.txt"));
    //     Adapter.addAttachments(paths);

    //     Adapter.addMessage("Message");

    //     Assert.assertTrue(false);
    // }

    // private String getFileFullPath(String fileName){
    //     URL url = getClass().getClassLoader().getResource(fileName);
    //     return url != null ? url.getFile() : null;
    // }
}
