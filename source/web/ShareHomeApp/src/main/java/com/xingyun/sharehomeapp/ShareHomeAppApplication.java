package com.xingyun.sharehomeapp;

import com.xingyun.sharehomeapp.model.fileupload.FileStorageProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({
        FileStorageProperties.class
})
public class SharehomeappApplication {


    public static void main(String[] args) {

        SpringApplication.run(SharehomeappApplication.class, args);
    }
}
