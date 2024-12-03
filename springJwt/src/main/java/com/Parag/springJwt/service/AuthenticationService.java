package com.Parag.springJwt.service;


import com.Parag.springJwt.model.AuthenticationResponse;
import com.Parag.springJwt.model.User;
import com.Parag.springJwt.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    private final UserRepository repository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;
    private final AuthenticationManager authenticationManager;

    @Autowired
    public AuthenticationService(AuthenticationManager authenticationManager, UserRepository repository, PasswordEncoder passwordEncoder, JwtService jwtService) {
        this.authenticationManager = authenticationManager;
        this.repository = repository;
        this.passwordEncoder = passwordEncoder;
        this.jwtService = jwtService;
    }

    public AuthenticationResponse register(User request){
        User user = new User();
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
        user.setUserName(request.getUserName());
        user.setPassword(passwordEncoder.encode(request.getPassword()));

        user.setRole(request.getRole());

        user = repository.save(user);

        String token = jwtService.generateToken(user);

        return new AuthenticationResponse(token);
    }
    public AuthenticationResponse authenticate(User request){
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        request.getUserName(),
                        request.getPassword()
                )
        );

        User user = repository.findByUserName((request.getUserName())).orElseThrow();
        String token = jwtService.generateToken(user);

        return new AuthenticationResponse(token);
    }
}
