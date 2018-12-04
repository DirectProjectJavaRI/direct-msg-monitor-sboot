package org.nhindirect.monitor.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = {"org.nhindirect.monitor"})
@SpringBootApplication
@Configuration
@EnableEurekaClient
public class MessageMonitorApplication
{
    public static void main(String[] args) 
    {
        SpringApplication.run(MessageMonitorApplication.class, args);
    }  
}