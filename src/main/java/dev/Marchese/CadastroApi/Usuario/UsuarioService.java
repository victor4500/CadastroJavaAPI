package dev.Marchese.CadastroApi.Usuario;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    private UsuarioRepository usuarioRepository;//initializing the layer UserRepository to be able to use her methods

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }


    public List <UsuarioModel> showUser(){//Creat a method to be able for list all user in my database
        return usuarioRepository.findAll();
    }
}
