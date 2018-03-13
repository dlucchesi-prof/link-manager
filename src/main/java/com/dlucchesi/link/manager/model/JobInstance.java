package com.dlucchesi.link.manager.model;

public interface JobInstance {
    String getName();

    void setName(String name);

    InstanceProperties getProperties();

    void setProperties(InstanceProperties properties);

    Job getJob();

    void setJob(Job job);
}
