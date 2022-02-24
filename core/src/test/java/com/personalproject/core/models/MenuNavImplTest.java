package com.personalproject.core.models;

import io.wcm.testing.mock.aem.junit5.AemContext;
import io.wcm.testing.mock.aem.junit5.AemContextExtension;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
@ExtendWith({AemContextExtension.class, MockitoExtension.class})
class MenuNavImplTest {

    private final AemContext aemContext=new AemContext();
    private MenuNav menuNav;
    @BeforeEach
    void setUp() {
        aemContext.addModelsForClasses(MenuNavImpl.class);
        aemContext.load().json("/com/personalproject/core/models/MenuNav.json","/component");
    }

    @Test
    void getTitle() {
        aemContext.currentResource("/component/menuNav");
        MenuNav menuNav = aemContext.request().adaptTo(MenuNav.class);
        final String expected="Home";
        String actual = menuNav.getTitle();
        assertEquals(expected,actual);
    }

    @Test
    void getPath() {
        aemContext.currentResource("/component/menuNav");
        MenuNav menuNav = aemContext.request().adaptTo(MenuNav.class);
        final String expected="/content/personalproject/us/en/home";
        String actual = menuNav.getPath();
        assertEquals(expected,actual);
    }
}

