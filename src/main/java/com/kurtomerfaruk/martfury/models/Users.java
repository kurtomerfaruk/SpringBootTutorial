package com.kurtomerfaruk.martfury.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

import java.io.Serial;
import java.sql.Timestamp;

/**
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @version 1.0.0
 * @since 16.07.2024 15:29
 */
@Entity
@Table(name = "users", schema = "martfury", catalog = "")
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Users extends BaseEntity<Long>{
    @Serial
    private static final long serialVersionUID = -896129590636267892L;
    @Basic
    @Column(name = "email")
    private String email;
    @JsonIgnore
    @Basic
    @Column(name = "email_verified_at")
    private Timestamp emailVerifiedAt;
    @JsonIgnore
    @Basic
    @Column(name = "password")
    private String password;
    @JsonIgnore
    @Basic
    @Column(name = "remember_token")
    private String rememberToken;
    @Basic
    @Column(name = "first_name")
    private String firstName;
    @Basic
    @Column(name = "last_name")
    private String lastName;
    @Basic
    @Column(name = "username")
    private String username;
    @Basic
    @Column(name = "avatar_id")
    private Object avatarId;
    @Basic
    @Column(name = "super_user")
    private boolean superUser;
    @Basic
    @Column(name = "manage_supers")
    private boolean manageSupers;
    @Basic
    @Column(name = "permissions")
    private String permissions;
    @Basic
    @Column(name = "last_login")
    private Timestamp lastLogin;


}
