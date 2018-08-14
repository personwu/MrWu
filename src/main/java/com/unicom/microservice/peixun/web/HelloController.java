package com.unicom.microservice.peixun.web;


import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "com/mrwu")
@Api(value = "com/mrwu")
public class HelloController {

    @RequestMapping(value = "hello",method = RequestMethod.GET)
    public String sayHello(){

        return "你好";
    }


}
