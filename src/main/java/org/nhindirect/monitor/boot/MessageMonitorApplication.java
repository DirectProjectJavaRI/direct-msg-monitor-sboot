package org.nhindirect.monitor.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = {"org.nhindirect.monitor"})
@SpringBootApplication
@Configuration
public class MessageMonitorApplication
{
    public static void main(String[] args) 
    {
        SpringApplication.run(MessageMonitorApplication.class, args);
    }  
}