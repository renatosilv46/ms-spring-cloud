package com.ms_recursos_humanos.Mappers;

import com.ms_recursos_humanos.dto.TrabalhadorResponse;
import com.ms_recursos_humanos.models.Trabalhador;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TrabalhadorMapper {
    TrabalhadorResponse toResponse(Trabalhador trabalhador);
}
