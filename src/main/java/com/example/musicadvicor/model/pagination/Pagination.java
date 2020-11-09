package com.example.musicadvicor.model.pagination;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Pagination {
    private int totalPages;
    private int pageSize;
    private int currentPage;
}
