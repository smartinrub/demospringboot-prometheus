package com.example.demospringbootprometheus;

import io.prometheus.client.spring.boot.EnablePrometheusEndpoint;
import io.prometheus.client.spring.boot.EnableSpringBootMetricsCollector;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnablePrometheusEndpoint
@EnableSpringBootMetricsCollector
public class DemospringbootPrometheusApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemospringbootPrometheusApplication.class, args);
	}

}
