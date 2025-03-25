package com.ms_recursos_humanos.controllers;

import com.ms_recursos_humanos.Mappers.TrabalhadorMapper;
import com.ms_recursos_humanos.dto.TrabalhadorResponse;
import com.ms_recursos_humanos.repositories.TrabalhadorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@RestController
@RequestMapping("/trabalhadores")
public class TrabalhadorController {

    private final TrabalhadorRepository trabalhadorRepository;
    private final TrabalhadorMapper trabalhadorMapper;

    @GetMapping()
    public ResponseEntity<List<TrabalhadorResponse>> obterListaTrabalhadores() {
        List<TrabalhadorResponse> trabalhadores = trabalhadorRepository.findAll()
                .stream()
                .map(trabalhadorMapper::toResponse)
                .collect(Collectors.toList());
        return ResponseEntity.ok(trabalhadores);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TrabalhadorResponse> obterTrabalhadorPorID(@PathVariable Long id) {
        TrabalhadorResponse response = this.trabalhadorMapper.toResponse(this.trabalhadorRepository
                .findById(id).orElseThrow());
        return ResponseEntity.ok(response);
    }
}
