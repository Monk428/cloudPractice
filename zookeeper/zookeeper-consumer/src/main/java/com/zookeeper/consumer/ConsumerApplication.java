package com.zookeeper.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class ConsumerApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(ConsumerApplication.class, args);

        Controller controller = new Controller();
        Controller.main(args);

    }
}
