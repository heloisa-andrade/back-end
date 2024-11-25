package com.example.simplificado.repositroy;

import com.example.simplificado.model.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepositroy extends MongoRepository<Usuario,String> {
}
