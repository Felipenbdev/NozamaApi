package com.nozama.Nozama.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.Objects;

@Data
@Document(collection = "users")
public class User {
    @Id
    private String id;
    private String username;
    private String password;
    private UserRole role;
    private List<CartItem> carrinho;

    public void setRole(UserRole role) {
        // Default role
        this.role = Objects.requireNonNullElse(role, UserRole.USER);
    }
}