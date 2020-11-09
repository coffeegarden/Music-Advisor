package com.example.musicadvicor.http;

import com.example.musicadvicor.model.albums.Albums;
import org.springframework.stereotype.Component;

@Component
public interface ApiFacade {
    Albums getNewReleases(int page);
}
