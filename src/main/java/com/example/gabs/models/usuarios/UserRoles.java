package com.example.gabs.models.usuarios;

public enum UserRoles {
    ADMIN("admin"),
    USER("usuario"); // 🔹 CORREÇÃO: Substituir ':' por ';'

    private final String role; // 🔹 CORREÇÃO: Adicionar 'final' (boa prática)

    UserRoles(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }
}
