package com.personalproject.core.models;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Via;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import javax.inject.Inject;

@Model(
        adaptables = SlingHttpServletRequest.class,
        adapters = HomeBanner.class,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class HomeBannerImpl implements HomeBanner {

//    final protected static String RESOURCE_TYPE = "personalproject/components/content/homebannerarea";

    @Inject
    Resource resource;

    @Inject
    @Via("resource")
    String bio;

    @Inject
    @Via("resource")
    String fullname;

    @ValueMapValue
    String mybutton;

    @ValueMapValue
    String intro;

    @ValueMapValue
    String img;

    @ValueMapValue
    String pathfield;

    @Override
    public String getBio() {
        return bio;
    }

    @Override
    public String getFullName() {
        return fullname;
    }

    @Override
    public String getIntro() {
        return intro;
    }

    @Override
    public String getMyButton() {
        return mybutton;
    }

    @Override
    public String getHeroImage() {
        return img;
    }

    @Override
    public String getPath() {
        return pathfield;
    }
}