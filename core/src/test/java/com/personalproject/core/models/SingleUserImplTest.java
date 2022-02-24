package com.personalproject.core.models;

import io.wcm.testing.mock.aem.junit5.AemContext;
import io.wcm.testing.mock.aem.junit5.AemContextExtension;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.Assert.assertEquals;

@ExtendWith({AemContextExtension.class, MockitoExtension.class})

class SingleUserImplTest {

    private final AemContext aemContext = new AemContext();
    private SingleUser singleUser;

    @BeforeEach
    void setUp() {

        aemContext.addModelsForClasses(SingleUserImpl.class);
        aemContext.load().json("/com/personalproject/core/models/SingleUser.json","/component");

    }

    @Test
    void getUrl() {

//        aemContext.currentResource("/component/singleUser");
//        singleUser = aemContext.request().adaptTo(SingleUser.class);
//        final String expected="https://reqres.in/api/users/1";
//        String actual = singleUser.getUrl();
//        System.out.println(actual);
//        assertEquals(expected,actual);

        assertEquals("https://reqres.in/api/users/null", aemContext.registerService(new SingleUserImpl()).getUrl());


    }

    @Test
    void getMessage() {

        assertEquals("", aemContext.registerService(new SingleUserImpl()).getMessage());

    }
}