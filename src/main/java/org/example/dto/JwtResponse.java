package org.example.dto;

public class JwtResponse {
    private String token;

    public JwtResponse(String token) {
        this.token = token;
    }

    // Getter and setter
    public String getToken() {
        return token;
    }
}
