package br.com.facildespensa.apirest.controller;

import br.com.facildespensa.apirest.model.Despensa;
import br.com.facildespensa.apirest.model.Usuario;
import br.com.facildespensa.apirest.repository.UsuarioRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/api")
@Api(value = "API REST Usuários")
@CrossOrigin(origins = "*")
public class UsuarioController {

    @Autowired
    UsuarioRepository usuarioRepository;

    @GetMapping(value = "/usuarios")
    @ApiOperation(value = "Retornar uma lista de usuários")
    public List<Usuario> listarUsuarios() {
        List<Usuario> usuarios = usuarioRepository.findAll();
        return usuarios;
    }

    @GetMapping(value = "/usuarios/{id}")
    @ApiOperation(value = "Retornar um usuário pelo id")
    public Usuario listarUsuarioPorId(@PathVariable(value = "id") long id) {
        return usuarioRepository.findById(id);
    }

    @PostMapping(value = "/usuarios/salvar")
    @ApiOperation(value = "Criar um usuário")
    public Usuario salvarUsuario(@RequestBody Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @DeleteMapping(value = "/usuarios/deletar")
    @ApiOperation(value = "Deletar um usuário")
    public void deletarUsuario(@RequestBody Usuario usuario) {
        usuarioRepository.delete(usuario);
    }

    @PutMapping(value = "/usuarios/atualizar")
    @ApiOperation(value = "Atualizar um usuário")
    public void atualizarUsuario(@RequestBody Usuario usuario) {
        usuarioRepository.save(usuario);
    }
}
