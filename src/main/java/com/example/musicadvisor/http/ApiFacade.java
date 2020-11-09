package com.example.musicadvisor.http;

import com.example.musicadvisor.model.albums.Albums;
import org.springframework.stereotype.Component;

@Component
public interface ApiFacade {
    Albums getNewReleases(int page);
}
