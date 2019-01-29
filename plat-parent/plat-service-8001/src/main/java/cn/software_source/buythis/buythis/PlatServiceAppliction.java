package cn.software_source.buythis.buythis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PlatServiceAppliction {

    public static void main(String[] args) {
        SpringApplication.run(PlatServiceAppliction.class,args);
    }
}
