package br.edu.ifpb.progdist.apirest.dao;

import br.edu.ifpb.progdist.apirest.model.Usuario;
import java.util.ArrayList;
import java.util.List;

public class UsuariosDAO {
    private List<Usuario> usuarios = new ArrayList<>();

    public UsuariosDAO() {
        this.usuarios.add(new Usuario(1, "Pedro", 20));
        this.usuarios.add(new Usuario(2, "Suzana", 30));
        this.usuarios.add(new Usuario(3, "Edmundo", 25));
        this.usuarios.add(new Usuario(4, "Lucia", 18));

        this.usuarios.add(new Usuario(5, "Ricardo França Soares", 22));
    }

    public List<Usuario> getUsuarios() {
        return this.usuarios;
    }

    public void inserirUsuario(Usuario user) {
        this.usuarios.add(user);
    }
}
