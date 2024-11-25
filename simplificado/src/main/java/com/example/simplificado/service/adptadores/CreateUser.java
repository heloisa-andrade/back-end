package com.example.simplificado.service.adptadores;

import com.example.simplificado.model.Usuario;
import com.example.simplificado.repositroy.UsuarioRepositroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Objects;
import java.util.Optional;

public class CreateUser {
    @Autowired
    private UsuarioRepositroy usuarioRep;

    public ResponseEntity<Object>  save (Usuario usuario){
        String cpf = usuario.getCpf();
        if (cpf.isEmpty()){
            return  ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body("Cpf null!");
        }
        Optional cpf0 = usuarioRep.findById(cpf);
        if (cpf0.isEmpty()){
            return ResponseEntity.status(HttpStatus.CREATED).body(usuarioRep.save(usuario));
        }
        return  ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body("Usuario ja existente");
    }
}
