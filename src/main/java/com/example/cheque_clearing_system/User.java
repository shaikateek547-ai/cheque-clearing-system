package com.example.cheque_clearing_system;

import jakarta.persistence.*;

@Entity @Table(name="users")
public class User {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 @Column(unique=true, nullable=false) private String username;
 @Column(nullable=false) private String password;
 @Column(nullable=false) private String role;
 private String email;
 public User() {}
 public User(String username,String password,String role){this(username,password,role,username+"@example.com");}
 public User(String username,String password,String role,String email){this.username=username;this.password=password;this.role=role;this.email=email;}
 public Long getId(){return id;} public String getUsername(){return username;} public void setUsername(String v){username=v;}
 public String getPassword(){return password;} public void setPassword(String v){password=v;} public String getRole(){return role;} public void setRole(String v){role=v;}
 public String getEmail(){return email;} public void setEmail(String v){email=v;}
}
