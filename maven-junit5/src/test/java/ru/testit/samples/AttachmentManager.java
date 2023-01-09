package ru.testit.samples;

import ru.testit.listener.AdapterListener;
import ru.testit.models.ItemStatus;
import ru.testit.models.TestResult;
import ru.testit.services.Adapter;

public class AttachmentManager implements AdapterListener {

    @Override
    public void beforeTestStop(final TestResult result){
        if(result.getItemStatus().equals(ItemStatus.FAILED)){
            Adapter.addAttachments("Failed", "screenshot.txt");
        }
    }
}
