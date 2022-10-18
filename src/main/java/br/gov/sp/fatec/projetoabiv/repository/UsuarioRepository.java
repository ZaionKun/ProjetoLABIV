package br.gov.sp.fatec.projetoabiv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.gov.sp.fatec.projetoabiv.entity.Usuario;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import br.gov.sp.fatec.projetolabiv.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    public Usuario findByNome(String nome);

    public List<Usuario> findByNomeContains(String nome);

    public Usuario findByNomeAndSenha(String nome, String senha);

    @Query("select u from Usuario u where u.nome = ?1")
    public Usuario buscarPorNome(String nome);

    @Query("select u from Usuario u where u.nome = ?1 and u.senha = ?2")
    public Usuario buscarPorNomeESenha(String nome, String senha);
    
}
