package com.ochiengolanga.tuts.reactivebootstandalone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.config.EnableWebFlux;

@EnableWebFlux
@SpringBootApplication
public class ReactivebootstandaloneApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactivebootstandaloneApplication.class, args);
	}
}
