package com.profile.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * * My <b>Main</b>.
 * estructura principal del proyecto
 *
 * @SpringBootApplication annotation
 */
@SpringBootApplication
@EnableEurekaClient
public class ProfilesApplication {

  public static void main(String[] args) {
    SpringApplication.run(ProfilesApplication.class, args);
  }
}
