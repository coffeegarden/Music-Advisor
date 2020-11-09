package com.example.musicadvisor.model.albums;

import com.example.musicadvisor.model.ExternalUrls;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class Artist {
    private String name;
    @JsonProperty("external_urls")
    private ExternalUrls externalUrls;

    @Override
    public String toString() {
        return name;
    }
}
