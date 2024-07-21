package com.kurtomerfaruk.martfury.services;

import com.kurtomerfaruk.martfury.requests.SignUpRequest;
import com.kurtomerfaruk.martfury.requests.SigninRequest;
import com.kurtomerfaruk.martfury.responses.JwtAuthenticationResponse;

/**
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @version 1.0.0
 * @since 21.07.2024 12:45
 */
public interface IAuthenticationService {
    JwtAuthenticationResponse signup(SignUpRequest request);

    JwtAuthenticationResponse login(SigninRequest request);
}
