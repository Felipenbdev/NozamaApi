package com.nozama.Nozama.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "produtos")
public class Product {
    @Id
    private String id;
    private String nome;
    private String descricao;
    private double preco;
    private int quantidade;
    private String foto;
}
