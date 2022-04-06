package br.com.facildespensa.apirest.controller;

import antlr.ASTNULLType;
import br.com.facildespensa.apirest.model.Despensa;
import br.com.facildespensa.apirest.model.Usuario;
import br.com.facildespensa.apirest.model.dto.DespensaDTO;
import br.com.facildespensa.apirest.model.dto.UsuarioDTO;
import br.com.facildespensa.apirest.repository.DespensaRepository;
import br.com.facildespensa.apirest.repository.UsuarioRepository;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import net.bytebuddy.description.method.MethodDescription;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.security.krb5.internal.crypto.Des;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/api")
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
