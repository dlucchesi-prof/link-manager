package com.dlucchesi.link.manager.facade;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

@Service
public class JobFacadeDefault {

    @Value("job.local.install")
    private String                      localInstallPath = "/home/daaraujo/.dlucchesi/link/jobs";

    public boolean installJob(String path){
        boolean ret = false;

        if(validatePath(path)){
            File zipJob = new File(path);


        }

        return ret;
    }

    private boolean validatePath(String path) {
        boolean ret = false;

        if (path != null && path.length() > 0){
            Path tmp = Paths.get(path);
            File tmpFile = tmp.toFile();
            ret = tmpFile.isFile() && tmpFile.canRead();
        }

        return ret;
    }
}
