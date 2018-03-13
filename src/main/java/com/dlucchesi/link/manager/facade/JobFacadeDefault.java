package com.dlucchesi.link.manager.facade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

@Service("jobFacade")
public class JobFacadeDefault {

    Logger logger = LoggerFactory.getLogger("jobFacade");

    @Value("job.local.install")
    private String                                  localInstallPath;

    public boolean installJob(String path){
        boolean ret = false;

        if(validatePath(path)){
            File zipJob = new File(path);
            try {
                decompressJob(zipJob);
            } catch (IOException e) {
                logger.error("Error on decompress file: " + zipJob.getAbsolutePath());
            }

        }

        return ret;
    }

    private void decompressJob(File file) throws IOException {
        byte[] buffer = new byte[1024];

        ZipInputStream ZIn = new ZipInputStream(new FileInputStream(file));
        ZipEntry zipEntry : ZIn.getNextEntry();
        while (zipEntry != null){
            String fileName = zipEntry.getName();
            File newFile = new File(localInstallPath + File.separator + fileName);

            logger.debug("file unzip : "+ newFile.getAbsoluteFile());

            //create all non exists folders
            //else you will hit FileNotFoundException for compressed folder
            new File(newFile.getParent()).mkdirs();

            FileOutputStream fos = new FileOutputStream(newFile);

            int len;
            while ((len = ZIn.read(buffer)) > 0) {
                fos.write(buffer, 0, len);
            }

            fos.close();
            zipEntry = ZIn.getNextEntry();
        }
        ZIn.closeEntry();
        ZIn.close();
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
