package com.ms_folha_pagamento.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
public class Pagamento implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    @Setter
    @Getter
    private String nome;
    @Setter
    @Getter
    private Double diaria;
    @Setter
    @Getter
    private Integer dias;

    public double getTotal() {
        return dias * diaria;
    }
}
