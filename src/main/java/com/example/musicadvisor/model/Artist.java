package com.example.musicadvisor.model;

import com.example.musicadvisor.model.ExternalUrls;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class Artist {
    private String name;
    private String href;
    private String id;
    private String type;
    private String uri;
    @JsonProperty("external_urls")
    private ExternalUrls externalUrls;

    @Override
    public String toString() {
        return name;
    }
}
