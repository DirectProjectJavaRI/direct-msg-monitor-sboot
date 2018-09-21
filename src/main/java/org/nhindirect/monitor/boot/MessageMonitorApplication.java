package org.nhindirect.monitor.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = { "org.nhindirect.monitor.boot", "org.nhindirect.monitor.dao",
		"org.nhindirect.monitor.resources", "org.nhindirect.monitor.streams", "org.nhindirect.monitor.springconfig"})
@SpringBootApplication
@Configuration
public class MessageMonitorApplication
{
    public static void main(String[] args) 
    {
        SpringApplication.run(MessageMonitorApplication.class, args);
    }  
}