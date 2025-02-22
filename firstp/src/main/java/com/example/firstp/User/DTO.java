package com.example.firstp.User;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class DTO {

    @NotBlank(message = "Fullname không được để trống")
    @Size(min = 3, max = 20, message = "Fullname phải từ 3 đến 20 ký tự")
    private String full_name;

    @NotBlank(message = "Username không được để trống")
    @Size(min = 3, max = 12, message = "Username phải từ 3 đến 12 ký tự")
    private String user_name;

    @NotBlank(message = "Password không được để trống")
    @Size(min = 6, max = 16, message = "Password phải từ 6 đến 16 ký tự")
    private String password;

    @NotBlank(message = "Password không được để trống")
    @Email(message = "Email không hợp lệ")
    private String email;
    
    public String getFull_name() {
        return full_name;
    }
    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getUser_name() {
        return user_name;
    }
    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}