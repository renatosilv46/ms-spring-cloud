package com.ms_folha_pagamento.services;

import com.ms_folha_pagamento.models.Pagamento;
import org.springframework.stereotype.Service;

@Service
public class PagamentoService {

    public Pagamento getPagamento(long idTrabalhador, int dias) {
        return new Pagamento("Bob", 500.0, dias);
    }

}
