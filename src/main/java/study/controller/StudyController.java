package study.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudyController {

    @RequestMapping("/hello")
    public String hello(){

        return "hello springboot!";

    }

}
