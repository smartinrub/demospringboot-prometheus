package com.example.demospringbootprometheus;

import com.codahale.metrics.annotation.Timed;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    private static final String ENDPOINT_A = "/endpointA";
    private static final String ENDPOINT_B = "/endpointB";

    @Timed(name = "endpointA")
    @GetMapping(ENDPOINT_A)
    public String handlerA() throws InterruptedException {

        double delay = Math.random() * 10000;
        logger.info(ENDPOINT_A + " reached in " + delay / 1000  + " seconds ");
        Thread.sleep((long) delay);

        return ENDPOINT_A;
    }

    @Timed(name = "endpointB")
    @GetMapping(ENDPOINT_B)
    public String handlerB() throws InterruptedException {

        double delay = Math.random() * 1000;
        logger.info(ENDPOINT_B + " reached in " + delay / 1000 + " seconds ");
        Thread.sleep((long) delay);

        return ENDPOINT_B;
    }

}
