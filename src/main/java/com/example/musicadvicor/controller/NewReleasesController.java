package com.example.musicadvicor.controller;

import com.example.musicadvicor.model.albums.Albums;
import com.example.musicadvicor.service.SpotifyApiService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NewReleasesController {
    private SpotifyApiService service;

    public NewReleasesController(SpotifyApiService service) {
        this.service = service;
    }

    @GetMapping("/new-releases")
    public String getMainPage(Model model) {
        Albums newReleases = service.getNewReleases();
        model.addAttribute("albums",newReleases.getAlbums());
        return "new-releases";
    }
}
