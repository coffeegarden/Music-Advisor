package com.example.musicadvicor.service;

import com.example.musicadvicor.model.albums.Albums;
import com.example.musicadvicor.model.pagination.Pagination;
import org.springframework.stereotype.Component;

@Component
public class PaginationBuilder {
    public Pagination createPagination(Albums albums) {
        int limit = albums.getLimit();
        int offset = albums.getOffset();
        int total = albums.getTotal();
        int currentPage = countCurrentPage(offset, limit);
        int totalPages = countTotalPages(total, limit);

        Pagination pagination = new Pagination();
        pagination.setTotalPages(totalPages);
        pagination.setPageSize(limit);
        pagination.setCurrentPage(currentPage);
        return pagination;
    }

    private int countCurrentPage(int offset, int limit) {
        return offset / limit;
    }

    private int countTotalPages(int totalPages, int limit) {
        int pages = totalPages / limit - 1;
        if (totalPages % limit != 0) pages += 1;
        return pages;
    }


}
