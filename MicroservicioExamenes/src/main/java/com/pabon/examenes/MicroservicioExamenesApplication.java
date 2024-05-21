package com.pabon.examenes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableDiscoveryClient
@ComponentScan({"com.pabon.common.usuario.models.entity"})
@EnableJpaRepositories({"com.pabon.common.usuario.models.entity"})
@EntityScan({"com.pabon.common.usuario.models.entity"})
@SpringBootApplication
public class MicroservicioExamenesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicioExamenesApplication.class, args);
	}

}
