package com.dlucchesi.link.manager.model.imp;

import com.dlucchesi.link.manager.model.InstanceProperties;
import com.dlucchesi.link.manager.model.JobInstance;

import java.util.Map;

public class InstancePropertiesDefault implements InstanceProperties {

    private String                          name;
    private Map<String, String>             properties;
    private JobInstance                     jobInstance;


    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Map<String, String> getProperties() {
        return properties;
    }

    @Override
    public void setProperties(Map<String, String> properties) {
        this.properties = properties;
    }

    @Override
    public JobInstance getJobInstance() {
        return jobInstance;
    }

    @Override
    public void setJobInstance(JobInstance jobInstance) {
        this.jobInstance = jobInstance;
    }
}
