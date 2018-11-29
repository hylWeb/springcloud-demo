package hyl.com.controller;

import hyl.com.service.TestServcie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {

    @Autowired
    TestServcie testServcie;

    @GetMapping("/abc/test")
    public String test(String name) {
        return testServcie.getName(name);
    }

    @GetMapping("/list")
    public String list() {
        System.out.println(testServcie.getlist());
        return testServcie.getlist();
    }
}
