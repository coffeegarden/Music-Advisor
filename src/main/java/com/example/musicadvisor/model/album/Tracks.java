package com.example.musicadvisor.model.album;

import lombok.Getter;

import java.util.List;

@Getter
public class Tracks {
    private String href;
    private List<Item> items;
    private Integer limit;
    private Object next;
    private Integer offset;
    private Object previous;
    private Integer total;
}
