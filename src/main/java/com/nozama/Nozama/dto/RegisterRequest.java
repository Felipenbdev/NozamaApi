package com.nozama.Nozama.dto;

import com.nozama.Nozama.model.UserRole;

public record RegisterRequest(String username, String password, UserRole role) {
}
