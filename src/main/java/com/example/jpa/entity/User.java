package com.example.jpa.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "tb_user")
@Data
public class User {
    @Id
    @GenericGenerator(name = "userid",strategy = "uuid")
    @GeneratedValue(generator = "userid")
    private String id;

    @Column(name = "username", unique = true, nullable = false, length = 64)
    private String username;

    @Column(name = "password", nullable = false, length = 64)
    private String password;

    @Column(name="email", length = 64)
    private String email;
}
