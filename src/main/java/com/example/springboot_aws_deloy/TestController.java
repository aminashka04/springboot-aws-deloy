package com.example.springboot_aws_deloy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")

public class TestController {
    @GetMapping("/data")
    public String GetData() {
        return "first message from AWS ECS";
    }
}
