package com.ms_folha_pagamento.services;

import com.ms_folha_pagamento.models.Pagamento;
import com.ms_folha_pagamento.models.Trabalhador;
import com.ms_folha_pagamento.repositories.client.TrabalhadorClient;
import com.ms_folha_pagamento.repositories.feign.TrabalhadorFeign;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class PagamentoService {

    private final TrabalhadorFeign trabalhadorFeign;

    public Pagamento getPagamento(long idTrabalhador, int dias) {
        Trabalhador trabalhador = this.trabalhadorFeign.obterTrabalhadorPeloId(idTrabalhador).getBody();
        return new Pagamento(trabalhador.getNome(), trabalhador.getDiaria(), dias);
    }

}
