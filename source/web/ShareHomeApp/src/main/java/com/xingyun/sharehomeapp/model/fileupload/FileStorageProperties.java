package com.xingyun.sharehomeapp.model.fileupload;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 自定义配置文件属性值
 * file.upload-dir=./uploads
 * */
@ConfigurationProperties(prefix = "file")
public class FileStorageProperties {
    private String uploadDir;

    public String getUploadDir() {
        return uploadDir;
    }

    public void setUploadDir(String uploadDir) {
        this.uploadDir = uploadDir;
    }
}
