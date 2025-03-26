package com.ms_folha_pagamento.repositories.client;

import com.ms_folha_pagamento.models.Trabalhador;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

@Component
public class TrabalhadorClient {

    private final String host;
    private final RestClient restClient;

    public TrabalhadorClient(
            @Value("${ms-recursos-humanos.host}")
            String host,
            RestClient.Builder restClient)
    {
        this.restClient = restClient.build();
        this.host = host;
    }

    public Trabalhador obterTrabalhador(final String idTrabalhador) {
        String uri = host.concat("/trabalhadores/{id}").replace("{id}",idTrabalhador);
        return restClient.get().uri(uri).retrieve().body(Trabalhador.class);
    }
}
