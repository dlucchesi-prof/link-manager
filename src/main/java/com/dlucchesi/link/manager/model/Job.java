package com.dlucchesi.link.manager.model;

import java.io.Serializable;
import java.util.List;

public interface Job extends Serializable {
    String getName();

    void setName(String name);

    String getVersion();

    void setVersion(String version);

    String getLocalPath();

    void setLocalPath(String localPath);

    List<JobInstance> getInstances();

    void setInstances(List<JobInstance> instances);
}
