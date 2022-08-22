package com.proyectoIntegrador.portfolioLAM;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class PortfolioLamApplication {

	public static void main(String[] args) {
		SpringApplication.run(PortfolioLamApplication.class, args);
	}
        @Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("**").allowedOrigins("https://localhost:4200").allowedMethods("*").allowedHeaders("*");
			}
		};
	}

}