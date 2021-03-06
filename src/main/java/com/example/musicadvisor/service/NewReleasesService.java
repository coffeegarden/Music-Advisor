package com.example.musicadvisor.service;

import com.example.musicadvisor.http.ApiFacade;
import com.example.musicadvisor.model.albums.Albums;
import com.example.musicadvisor.model.pagination.Pagination;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
@AllArgsConstructor
public class NewReleasesService {
    private ApiFacade api;
    private PaginationBuilder createPagination;

    public void fetchDataToModel(Model model, int page) {
        Albums newReleases = api.getNewReleases(page);
        Pagination pagination = createPagination.createPagination(newReleases);
        model.addAttribute("albums", newReleases.getAlbums());
        model.addAttribute("pagination", pagination);
    }
}
