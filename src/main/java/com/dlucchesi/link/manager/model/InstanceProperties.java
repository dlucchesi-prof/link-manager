package com.dlucchesi.link.manager.model;

import java.util.Map;

public interface InstanceProperties {
    String getName();

    void setName(String name);

    Map<String, String> getProperties();

    void setProperties(Map<String, String> properties);

    JobInstance getJobInstance();

    void setJobInstance(JobInstance jobInstance);
}
