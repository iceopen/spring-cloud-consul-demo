package org.iceinto.cloud.servicewx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Configuration;

/**
 * 
 * @author iceinto
 *
 */
@Configuration
@EnableAutoConfiguration
@EnableDiscoveryClient
@SpringBootApplication
public class ServiceWxApplication {

	/**
	 * @author iceinto
	 * @param args
	 */
    public static void main(String[] args) {
        SpringApplication.run(ServiceWxApplication.class, args);
    }

}

