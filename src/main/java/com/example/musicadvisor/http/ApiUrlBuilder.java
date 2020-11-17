package com.example.musicadvisor.http;

import org.springframework.stereotype.Repository;

@Repository
public class ApiUrlBuilder {
    public String newReleases(int page) {
        if (page <= 0) return "https://api.spotify.com/v1/browse/new-releases?country=PL&limit=16";
        return "https://api.spotify.com/v1/browse/new-releases?country=PL&limit=16" + "&offset=" + page * 16;
    }

    public String album(String id, int page) {
        if (page <= 0) return "https://api.spotify.com/v1/albums/" + id ;
        return "https://api.spotify.com/v1/albums/" + id + "?limit=" + page * 10;
    }
}
