package br.edu.ifpb.progdist.apirest.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.edu.ifpb.progdist.apirest.service.UsuarioService;
import br.edu.ifpb.progdist.apirest.model.Usuario;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    private UsuarioService userService = new UsuarioService();

    @GetMapping("")
    public List<Usuario> getUsuarios() {
        return userService.getUsuarios();
    }

    @GetMapping("/{codigo}")
    public Usuario getUsuarioPorCodigo(@PathVariable int codigo) {
        return this.userService.getUsuarioPorCodigo(codigo);
    }

    @PostMapping(path = "", consumes = "application/json", produces = "application/json")
    public Integer inserirUsuario(@RequestBody Usuario user) {
        this.userService.inserirUsuario(user);
        return user.getCodigo();
    }

}
