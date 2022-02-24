package com.personalproject.core.schedulers;

import io.wcm.testing.mock.aem.junit5.AemContext;
import io.wcm.testing.mock.aem.junit5.AemContextExtension;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith({AemContextExtension.class, MockitoExtension.class})

class PersonalSchedulerTest {

    private final AemContext aemContext=new AemContext();
        private PersonalScheduler personalScheduler;

    @BeforeEach
    void setUp() {
    }

    @Test
    void activate() {

    }

    @Test
    void deactivate() {
    }

    @Test
    void run() {
    }
}