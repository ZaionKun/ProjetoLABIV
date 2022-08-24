package br.gov.sp.fatec.projetoabiv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.gov.sp.fatec.projetoabiv.entity.Usuario;

public class UsuarioRepository extends JpaRepository<Usuario, Long> {
    
}
