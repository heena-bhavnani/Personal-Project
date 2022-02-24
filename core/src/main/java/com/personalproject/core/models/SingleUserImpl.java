package com.personalproject.core.models;

import com.personalproject.core.utils.Network;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

import javax.inject.Inject;

@Model(adaptables = Resource.class,
        adapters = SingleUser.class,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)

public class SingleUserImpl implements SingleUser {

    @Inject
    String userid;

    @Override
    public String getUrl(){

        return "https://reqres.in/api/users/"+userid;

    }
    @Override
    public String getMessage() {

        return Network.readJson(getUrl());
    }

}