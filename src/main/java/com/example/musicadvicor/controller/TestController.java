package com.example.musicadvicor.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import java.security.Principal;

@RestController
public class TestController {
    private final WebClient webClient;

    public TestController(WebClient webClient) {
        this.webClient = webClient;
    }

    @GetMapping("/tracks")
    public String getFoos(Model model) {
        return this.webClient.get()
                .uri("https://api.spotify.com/v1/me/tracks")
                .retrieve()
                .bodyToMono(String.class)
                .block();
    }

    @GetMapping(value = "/user",produces = "application/json")
    public Principal user(Principal principal) {
        return principal;
    }
}
