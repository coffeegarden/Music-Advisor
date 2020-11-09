package com.example.musicadvisor.http;

import org.springframework.stereotype.Repository;

@Repository
public class ApiUrlBuilder {
    public String newReleases(int page) {
        if (page <= 0) return "https://api.spotify.com/v1/browse/new-releases?country=PL&limit=10";
        return "https://api.spotify.com/v1/browse/new-releases?country=PL&limit=10" + "&offset=" + page * 10;
    }
}
