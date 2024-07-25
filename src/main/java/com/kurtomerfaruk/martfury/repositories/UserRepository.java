package com.kurtomerfaruk.martfury.repositories;

import com.kurtomerfaruk.martfury.models.User;
import jakarta.persistence.QueryHint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.QueryHints;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @version 1.0.0
 * @since 21.07.2024 12:37
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    @QueryHints({@QueryHint(name = "org.hibernate.cacheable",value = "true")})
    Optional<User> findByEmail(String email);
}