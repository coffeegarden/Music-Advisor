package com.example.musicadvicor.http;

import com.example.musicadvicor.model.albums.Albums;
import com.example.musicadvicor.model.albums.AlbumsRoot;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Optional;

@Service
public class RequestApi {
    private WebClient client;

    public RequestApi(WebClient client) {
        this.client = client;
    }

    public Optional<Albums> getNewReleases() {
        return client.get()
                .uri("https://api.spotify.com/v1/browse/new-releases?country=PL&limit=10")
                .retrieve()
                .bodyToMono(AlbumsRoot.class)
                .blockOptional()
                .map(AlbumsRoot::getAlbums);
    }
}
