package com.nhnacademy.server1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Server1Application {

  public static void main(String[] args) {
    SpringApplication.run(Server1Application.class, args);
  }

}
