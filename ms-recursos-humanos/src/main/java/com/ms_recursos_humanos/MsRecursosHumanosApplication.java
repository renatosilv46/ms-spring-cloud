package com.ms_recursos_humanos;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@Slf4j
@EnableDiscoveryClient
@SpringBootApplication
public class MsRecursosHumanosApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsRecursosHumanosApplication.class, args);
		log.info("Server inicializado com sucesso na porta: 8001");
	}

}
