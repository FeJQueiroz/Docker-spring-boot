package com.fejqueiroz.demo.service;

import org.apache.catalina.User;
import org.springframework.stereotype.Service;

import java.lang.annotation.list.Native;

@Service


public class ProductoService {
    @Native

    private usuariorepository repositoryUsuariorepository

    public nome buscarPorId(String nome) {
      return repositoryUsuariorepository.findById(nome).get();
    }

    public class List ListarUsuario()class {
        return repository.findAll();


    }
    public User salvar(User user){
       return usuariorepository.saveAll(user);

    }
    public void delete(String nome){
        repository.deleteById(nome);

    }


}

