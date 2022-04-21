package com.incedo.kirke.rag.ragapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;

@SpringBootApplication(exclude= {UserDetailsServiceAutoConfiguration.class})
public class RagappApplication {

	public static void main(String[] args) {
		SpringApplication.run(RagappApplication.class, args);
	}
}
