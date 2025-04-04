package com.ms.usuarios.controllers;

import com.ms.usuarios.models.Usuario;
import com.ms.usuarios.repositories.UsuariosRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private final UsuariosRepository usuariosRepository;

    @GetMapping(value = "/{id}")
    public Usuario findById(@PathVariable long id) {
        try{
            return usuariosRepository.findById(id).get();
        } catch(Exception ex) {
            throw new IllegalArgumentException("Não foi possível encontrar este usuário");
        }
    };
    @GetMapping(value = "/search")
    public Usuario findByEmail(@RequestParam String email) {
        try{
            return usuariosRepository.findByEmail(email);
        } catch(Exception ex) {
            throw new IllegalArgumentException("Não foi possível encontrar este usuário");
        }
    };


}
