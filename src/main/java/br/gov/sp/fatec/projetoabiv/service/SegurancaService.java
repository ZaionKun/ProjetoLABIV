package br.gov.sp.fatec.projetoabiv.service;

import java.util.List;

import br.gov.sp.fatec.projetoabiv.entity.Usuario;

public interface SegurancaService {
    
    public Usuario novoUsuario(Usuario usuario);

    public Usuario novoUsuario(String nome, String senha);

    public List<Usuario> ListarTodosUsuarios();

    public Usuario BuscarUsuarioPorId(long id);
}
