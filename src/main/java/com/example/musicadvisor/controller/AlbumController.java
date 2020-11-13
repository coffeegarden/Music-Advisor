package com.example.musicadvisor.controller;

import com.example.musicadvisor.service.AlbumService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class AlbumController {
    private AlbumService service;

    public AlbumController(AlbumService service) {
        this.service = service;
    }

    @GetMapping("/album")
    public String getPlaylist(Model model, @RequestParam("id") Optional<String> album) {
        boolean isSuccess = service.fetchDataToModelForPlaylist(model, album);
        if(!isSuccess){
            return "redirect:/new-releases";
        }
        return "album";
    }
}
