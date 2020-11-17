package com.example.musicadvisor.http;

import com.example.musicadvisor.model.album.Album;
import com.example.musicadvisor.model.albums.Albums;
import com.example.musicadvisor.model.albums.AlbumsRoot;
import org.springframework.stereotype.Repository;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Optional;

@Repository
public class RequestApi {
    private WebClient client;

    public RequestApi(WebClient client) {
        this.client = client;
    }

    public Optional<Albums> getNewReleases(String url) {
        return client.get()
                .uri(url)
                .retrieve()
                .bodyToMono(AlbumsRoot.class)
                .blockOptional()
                .map(AlbumsRoot::getAlbums);
    }

    public Optional<Album> getAlbum(String url) {
       return client.get()
                .uri(url)
                .retrieve()
                .bodyToMono(Album.class)
                .blockOptional();
    }
}
