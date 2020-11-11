package com.example.musicadvisor.model.albums;


import com.example.musicadvisor.model.Artist;
import com.example.musicadvisor.model.ExternalUrls;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.time.LocalDate;
import java.util.List;

@Getter
public class Item {
    private List<Artist> artists;

    @JsonProperty("external_urls")
    private ExternalUrls externalUrls;

    private String name;
    private String id;
    @JsonProperty("release_date")
    private LocalDate releaseDate;
    @JsonProperty("total_tracks")
    private int totalTracks;
}
