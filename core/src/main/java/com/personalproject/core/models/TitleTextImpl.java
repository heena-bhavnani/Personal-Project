package com.personalproject.core.models;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Via;

import javax.inject.Inject;

@Model(
        adaptables = SlingHttpServletRequest.class,
        adapters = TitleText.class,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class TitleTextImpl implements TitleText {

//    final protected static String RESOURCE_TYPE = "personalproject/components/content/titletext";

    @Inject
    Resource resource;

    @Inject
    @Via("resource")
    String title;

    @Inject
    @Via("resource")
    String info;

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getInfo() {
        return info;
    }
}