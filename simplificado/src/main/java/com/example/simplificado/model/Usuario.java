package com.example.simplificado.model;

import  lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Document(collection = "simplificado")
public class Usuario {
    @Id
    private String cpf;
    private String nome;
    private String email;
    private String senha;


}
