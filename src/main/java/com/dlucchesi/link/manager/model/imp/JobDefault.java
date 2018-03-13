package com.dlucchesi.link.manager.model.imp;

import com.dlucchesi.link.manager.model.Job;
import com.dlucchesi.link.manager.model.JobInstance;

import java.util.List;

public class JobDefault implements Job {

    private String                      name;
    private String                      version;
    private String                      localPath;
    private List<JobInstance>           instances;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getVersion() {
        return version;
    }

    @Override
    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String getLocalPath() {
        return localPath;
    }

    @Override
    public void setLocalPath(String localPath) {
        this.localPath = localPath;
    }

    @Override
    public List<JobInstance> getInstances() {
        return instances;
    }

    @Override
    public void setInstances(List<JobInstance> instances) {
        this.instances = instances;
    }
}
