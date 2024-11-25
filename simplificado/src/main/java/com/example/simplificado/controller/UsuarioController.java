package com.example.simplificado.controller;

import com.example.simplificado.model.Usuario;
import com.example.simplificado.repositroy.UsuarioRepositroy;
import com.example.simplificado.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {
    @Autowired
    public UsuarioRepositroy usuarioRepositroy;

    @Autowired
    UsuarioService usuarioService;
    @PostMapping("/simplificado")
    public ResponseEntity<Object> salvar(@RequestBody Usuario usuario) {
        return ResponseEntity.status(HttpStatus.CREATED).body(usuarioRepositroy.save(usuario));
    }


}
