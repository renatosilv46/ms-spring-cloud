package com.ms_folha_pagamento.mappers;

import com.ms_folha_pagamento.dto.PagamentoResponse;
import com.ms_folha_pagamento.models.Pagamento;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PagamentoMapper {
    PagamentoResponse toResponse(Pagamento pagamento);
}
