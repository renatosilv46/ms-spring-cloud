package com.ms_folha_pagamento.controllers;

import com.ms_folha_pagamento.dto.PagamentoResponse;
import com.ms_folha_pagamento.mappers.PagamentoMapper;
import com.ms_folha_pagamento.services.PagamentoService;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/pagamentos")
public class PagamentoController {

    private final PagamentoService pagamentoService;
    private final PagamentoMapper pagamentoMapper;

    @CircuitBreaker(name = "obterPagamentosCircuitBreaker", fallbackMethod = "obterPagamentosAlternativo")
    @GetMapping("/{idTrabalhador}/dias/{dias}")
    public ResponseEntity<PagamentoResponse> obterPagamentos(
            @PathVariable Long idTrabalhador,
            @PathVariable Integer dias) {

        var response = this.pagamentoMapper.toResponse(this.pagamentoService.getPagamento(idTrabalhador, dias));
        return ResponseEntity.ok(response);
    }

    public ResponseEntity<PagamentoResponse> obterPagamentosAlternativo(
             Long idTrabalhador,
             Integer dias,
             Throwable t) {
        Double total = Double.parseDouble(String.valueOf(400.0 * dias));
        return ResponseEntity.ok(
                new PagamentoResponse("Cliente alternativo", 400.0, dias,total));
    }

}
