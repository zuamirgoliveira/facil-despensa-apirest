package br.com.facildespensa.apirest.controller;

import br.com.facildespensa.apirest.model.Despensa;
import br.com.facildespensa.apirest.repository.DespensaRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
@Api(value = "API REST Despensas")
@CrossOrigin(origins = "*")
public class DespensaController {

    @Autowired
    DespensaRepository despensaRepository;

    @GetMapping(value = "usuarios/despensas/{id}")
    @ApiOperation(value = "Retornar um usuário pelo id")
    public List<Despensa> listarDespensasPorIdUsuario(@PathVariable(value = "id") long id) {
        return despensaRepository.findByUsuarioId(id);
    }

    @PostMapping(value = "usuarios/despensas/salvar")
    @ApiOperation(value = "Criar uma despensa")
    public Despensa salvarDespensa(@RequestBody Despensa despensa    ) {
        return despensaRepository.save(despensa);
    }

    @DeleteMapping(value = "usuarios/despensas/deletar")
    @ApiOperation(value = "Deletar um usuário")
    public void deletarDespensa(@RequestBody Despensa despensa) {
        despensaRepository.delete(despensa);
    }

    @PutMapping(value = "usuarios/despensas/atualizar")
    @ApiOperation(value = "Atualizar um usuário")
    public void atualizarDespensa(@RequestBody Despensa despensa) {
        despensaRepository.save(despensa);
    }
}
