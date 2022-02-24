package com.personalproject.core.workflows;

import com.adobe.granite.workflow.WorkflowException;
import com.adobe.granite.workflow.WorkflowSession;
import com.adobe.granite.workflow.exec.WorkItem;
import com.adobe.granite.workflow.exec.WorkflowData;
import com.adobe.granite.workflow.metadata.MetaDataMap;
import io.wcm.testing.mock.aem.junit5.AemContext;
import io.wcm.testing.mock.aem.junit5.AemContextExtension;
import org.apache.sling.testing.mock.sling.ResourceResolverType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

@ExtendWith({AemContextExtension.class, MockitoExtension.class})

class CustomWorkflowTest {

    AemContext aemContext = new AemContext(ResourceResolverType.JCR_MOCK);

    @Mock
    CustomWorkflow customWorkflow;

    @Mock
    WorkItem workItem;

    @Mock
    WorkflowSession workflowSession;

    @Mock
    MetaDataMap metaDataMap;

    @Mock
    WorkflowData workflowData;

    @BeforeEach
    void setUp() {
        customWorkflow = aemContext.registerService(new CustomWorkflow());
    }

    @Test
    void execute() throws WorkflowException, NoSuchFieldException {
        CustomWorkflow customWorkflow1 = mock(CustomWorkflow.class);
        doNothing().when(customWorkflow1).execute(workItem,workflowSession,metaDataMap);
        //PrivateAccessor.setField(customWorkflow1,"workflowData",workflowData);
        lenient().when(workItem.getWorkflowData()).thenReturn(workflowData);
        customWorkflow1.execute(workItem,workflowSession,metaDataMap);

    }

}