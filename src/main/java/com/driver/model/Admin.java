package com.driver.model;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Entity
@Table(name="admin")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Admin{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
      int adminId;

     String username;
     String password;

    public Admin() {
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



}