package com.example.musicadvisor.controller;

import com.example.musicadvisor.service.PlaylistService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class PlaylistsController {
    private PlaylistService service;

    @GetMapping("/playlist")
    public String getPlaylist(Model model, @RequestParam("id")Optional<String> playlist){
        service.fetchDataToModelForPlaylist(model, playlist);
        return "album";
    }
}
