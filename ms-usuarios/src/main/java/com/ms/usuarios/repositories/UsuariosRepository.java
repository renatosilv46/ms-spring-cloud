package com.ms.usuarios.repositories;

import com.ms.usuarios.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UsuariosRepository extends JpaRepository<Usuario, Long> {
    Usuario findByEmail(String email);
}
