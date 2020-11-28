package com.prueba.springboot.app.carrito;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SpringbootServicioCarritoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootServicioCarritoApplication.class, args);
	}

}
