package br.com.facildespensa.apirest.controller;

import br.com.facildespensa.apirest.model.Usuario;
import br.com.facildespensa.apirest.repository.DespensaRepository;
import br.com.facildespensa.apirest.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/apirest")
public class UsuarioController {

    @Autowired
    UsuarioRepository usuarioRepository;

    @Autowired
    DespensaRepository despensaRepository;


    @GetMapping(value = "/usuarios")
    public List<Usuario> listarUsuarios() {
        List<Usuario> usuarios = usuarioRepository.findAll();
        return usuarios;
    }

}
