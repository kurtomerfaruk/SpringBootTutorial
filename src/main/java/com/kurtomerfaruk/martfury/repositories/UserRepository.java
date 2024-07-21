package com.kurtomerfaruk.martfury.repositories;

import com.kurtomerfaruk.martfury.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @version 1.0.0
 * @since 21.07.2024 12:37
 */
@Repository
public interface UserRepository extends JpaRepository<Users, Integer> {
    // Since email is unique, we'll find users by email
    Optional<Users> findByEmail(String email);
}