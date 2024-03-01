package br.edu.ifpb.progdist.apirest.service;

import java.util.List;
import java.util.Optional;

import br.edu.ifpb.progdist.apirest.dao.UsuariosDAO;
import br.edu.ifpb.progdist.apirest.model.Usuario;

public class UsuarioService {
    private UsuariosDAO usuariosDAO = new UsuariosDAO();

    public List<Usuario> getUsuarios() {
        return usuariosDAO.getUsuarios();
    }

    public Usuario getUsuarioPorCodigo(int codigo) {
        Optional<Usuario> userOpt = usuariosDAO.getUsuarios()
                .stream()
                .filter(user -> user.getCodigo() == codigo)
                .findFirst();

        return userOpt.orElse(null);
    }

    public void inserirUsuario(Usuario user) {
        this.usuariosDAO.inserirUsuario(user);
    }
}
