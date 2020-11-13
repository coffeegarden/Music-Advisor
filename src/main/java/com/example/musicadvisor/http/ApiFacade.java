package com.example.musicadvisor.http;

import com.example.musicadvisor.model.album.Album;
import com.example.musicadvisor.model.albums.Albums;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public interface ApiFacade {
    Albums getNewReleases(int page);

    Optional<Album> getAlbum(int page, String id);
}
