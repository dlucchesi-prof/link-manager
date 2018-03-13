package com.dlucchesi.link.manager.model.imp;

import com.dlucchesi.link.manager.model.InstanceProperties;
import com.dlucchesi.link.manager.model.Job;
import com.dlucchesi.link.manager.model.JobInstance;

public class JobInstanceDefault implements JobInstance {

    private String                      name;
    private InstanceProperties          properties;
    private Job                         job;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public InstanceProperties getProperties() {
        return properties;
    }

    @Override
    public void setProperties(InstanceProperties properties) {
        this.properties = properties;
    }

    @Override
    public Job getJob() {
        return job;
    }

    @Override
    public void setJob(Job job) {
        this.job = job;
    }
}
