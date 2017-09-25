package uk.co.octafish.spike.target.targetservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class TargetServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(TargetServiceApplication.class, args);
    }

    
}
