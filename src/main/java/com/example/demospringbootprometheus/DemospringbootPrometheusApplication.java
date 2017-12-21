package com.example.demospringbootprometheus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class DemospringbootPrometheusApplication extends WebMvcConfigurerAdapter {

	public static void main(String[] args) {
		SpringApplication.run(DemospringbootPrometheusApplication.class, args);
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new RequestCounterInterceptor()).addPathPatterns("/endpointA");
		registry.addInterceptor(new RequestCounterInterceptor()).addPathPatterns("/endpointB");
		registry.addInterceptor(new RequestTimingInterceptor()).addPathPatterns("/endpointA");
		registry.addInterceptor(new RequestTimingInterceptor()).addPathPatterns("/endpointB");
	}
}
