package com.jp.rest.jprestservices;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.jp.rest.jprestservices.resource.DistributorInfo;
 
@Component
public class JerseyConfig extends ResourceConfig
{
    public JerseyConfig()
    {
        register(DistributorInfo.class);
    }
}