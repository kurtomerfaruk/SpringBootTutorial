package com.kurtomerfaruk.martfury.services;

import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @version 1.0.0
 * @since 21.07.2024 12:36
 */
public interface IUserService {
    UserDetailsService userDetailsService();
}
