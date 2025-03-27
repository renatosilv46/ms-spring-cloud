package com.ms_folha_pagamento;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@Slf4j
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class MsFolhaPagamentoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsFolhaPagamentoApplication.class, args);
		log.info("Servidor inicializado com sucesso na porta: 8101");
	}

}
