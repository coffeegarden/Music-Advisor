package com.example.musicadvicor.service;

import com.example.musicadvicor.http.RequestApi;
import com.example.musicadvicor.model.albums.Albums;
import org.springframework.stereotype.Service;

@Service
public class SpotifyApiService {
    private RequestApi requestApi;

    public SpotifyApiService(RequestApi requestApi) {
        this.requestApi = requestApi;
    }

    public Albums getNewReleases() {
        return requestApi.getNewReleases().orElse(Albums.empty());
    }
}
