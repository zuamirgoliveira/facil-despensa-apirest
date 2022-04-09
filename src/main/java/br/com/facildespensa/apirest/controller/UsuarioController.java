package br.com.facildespensa.apirest.controller;

import br.com.facildespensa.apirest.model.Usuario;
import br.com.facildespensa.apirest.repository.UsuarioRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
@Api(value = "API REST Usuários")
@CrossOrigin(origins = "*")
public class UsuarioController {

    @Autowired
    UsuarioRepository usuarioRepository;

    @GetMapping(value = "/usuarios")
    @ApiOperation(value = "Retorna uma lista de usuários")
    public List<Usuario> listarUsuarios() {
        List<Usuario> usuarios = usuarioRepository.findAll();
        return usuarios;
    }

    @GetMapping(value = "/usuarios/{id}")
    @ApiOperation(value = "Retorna o usuário pelo id")
    public Usuario listarUsuarioPorId(@PathVariable(value = "id") long id) {
        return usuarioRepository.findById(id);
    }

    @PostMapping(value = "/usuarios/salvar")
    @ApiOperation(value = "Salvar usuário")
    public Usuario salvarUsuario(@RequestBody Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

}
