package com.example.demospringbootprometheus;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @GetMapping("/endpointA")
    public String handlerA() throws InterruptedException {
        logger.info("/endpointA ");
        Thread.sleep((long)(Math.random() * 1000));
        return "/endpointA";
    }

    @GetMapping("/endpointB")
    public String handlerB() throws InterruptedException {
        logger.info("/endpointB ");
        Thread.sleep((long)(Math.random() * 1000));
        return "/endpointB";
    }

}
