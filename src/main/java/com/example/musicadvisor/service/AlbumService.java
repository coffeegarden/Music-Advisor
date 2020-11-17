package com.example.musicadvisor.service;

import com.example.musicadvisor.http.ApiFacade;
import com.example.musicadvisor.http.ApiFacadeImpl;
import com.example.musicadvisor.model.album.Album;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.Optional;

@Service
public class AlbumService {
    private ApiFacade api;

    public AlbumService(ApiFacadeImpl api) {
        this.api = api;
    }

    public boolean fetchDataToModelForPlaylist(Model model, Optional<String> album) {
        Optional<Album> albumOpt = api.getAlbum(1, album.get());
        if (albumOpt.isEmpty()) {
            return false;
        }
        model.addAttribute("album", albumOpt.get());
        return true;
    }
}
