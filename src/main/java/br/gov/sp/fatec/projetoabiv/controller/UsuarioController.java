package br.gov.sp.fatec.projetoabiv.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.sp.fatec.projetoabiv.entity.Usuario;
import br.gov.sp.fatec.projetoabiv.service.SegurancaService;

@RestController
@CrossOrigin
@RequestMapping(value = "/usuario")
public class UsuarioController {

    @Autowired
    private SegurancaService segurancaService;

    @GetMapping
    public List<Usuario> todoUsuarios() {
        return segurancaService.ListarTodosUsuarios();
    }

    @GetMapping(value = "/{id}")
    public Usuario buscarPeloId(@PathVariable("id")long id){
        return segurancaService.BuscarUsuarioPorId(id);
    }

    @PostMapping
    public Usuario novUsuario(@RequestBody Usuario usuario){
        return segurancaService.novoUsuario(usuario);
    }
}
