package com.kurtomerfaruk.martfury.services.impl;

import com.kurtomerfaruk.martfury.models.User;
import com.kurtomerfaruk.martfury.repositories.UserRepository;
import com.kurtomerfaruk.martfury.requests.SignUpRequest;
import com.kurtomerfaruk.martfury.requests.SigninRequest;
import com.kurtomerfaruk.martfury.responses.JwtAuthenticationResponse;
import com.kurtomerfaruk.martfury.services.IAuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @version 1.0.0
 * @since 21.07.2024 12:46
 */
@Service
@RequiredArgsConstructor
public class AuthenticationService implements IAuthenticationService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;
    private final AuthenticationManager authenticationManager;

    @Override
    public JwtAuthenticationResponse signup(SignUpRequest request) {
        var user = User.builder().firstName(request.getFirstName()).lastName(request.getLastName())
                .email(request.getEmail()).password(passwordEncoder.encode(request.getPassword())).build();
        userRepository.save(user);
        var jwt = jwtService.generateToken(user);
        var expirationTime = jwtService.getExpirationTime();
        return JwtAuthenticationResponse.builder()
                .token(jwt)
                .expiresIn(expirationTime)
                .build();
    }

    @Override
    public JwtAuthenticationResponse login(SigninRequest request) {
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getEmail(), request.getPassword()));
        var user = userRepository.findByEmail(request.getEmail())
                .orElseThrow(() -> new IllegalArgumentException("Invalid email or password."));
        var jwt = jwtService.generateToken(user);
        var expirationTime = jwtService.getExpirationTime();
        return JwtAuthenticationResponse.builder()
                .token(jwt)
                .expiresIn(expirationTime)
                .build();
    }
}
