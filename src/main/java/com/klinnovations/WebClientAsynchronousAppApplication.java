package com.klinnovations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;

@SpringBootApplication
public class WebClientAsynchronousAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebClientAsynchronousAppApplication.class, args);
		
		WebClient webClent = WebClient.create();
		System.out.println("Request Sending Starts.....");
		                            Mono<String> mono = new Mono<String>();
									mono.block();
		
		System.out.println("Request Sending end.....");
		System.out.println(Response);
		
		
	}

}
