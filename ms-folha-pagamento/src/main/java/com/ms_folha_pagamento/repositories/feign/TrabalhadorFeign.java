package com.ms_folha_pagamento.repositories.feign;

import com.ms_folha_pagamento.models.Trabalhador;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(name = "ms-recursos-humanos", url = "localhost:8001", path = "/trabalhadores")
public interface TrabalhadorFeign {

    @GetMapping("/{id}")
    ResponseEntity<Trabalhador> obterTrabalhadorPeloId(@PathVariable Long id);
}
