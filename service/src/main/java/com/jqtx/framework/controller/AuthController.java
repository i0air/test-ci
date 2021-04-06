package com.jqtx.framework.controller;

import com.jqtx.framework.model.request.SignIn;
import com.jqtx.framework.security.jwt.JwtUtil;
import com.jqtx.framework.security.service.UserDetailsImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;

@Api(tags = "Authorization")
@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Resource
    AuthenticationManager authenticationManager;

    @Resource
    JwtUtil jwtUtil;

    @ApiOperation("Sign in")
    @PostMapping("/sign-in")
    public ResponseEntity<?> SignIn(@Valid @RequestBody SignIn request) {
        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword()));

        SecurityContextHolder.getContext().setAuthentication(authentication);
        String token = jwtUtil.generateJwtToken(authentication);

        HttpHeaders headers = new HttpHeaders();
        headers.add("Authorization", token);

        return ResponseEntity.ok().headers(headers).body(null);
    }
}
