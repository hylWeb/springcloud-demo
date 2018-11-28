package hyl.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableDiscoveryClient
public class TestApp {
    public static void main(String[] args) {
        SpringApplication.run(TestApp.class, args);
    }

    @GetMapping("/abc/test")
    public String test() {
        return "ok";
    }

}
