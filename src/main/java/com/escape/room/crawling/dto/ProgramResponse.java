package com.escape.room.crawling.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ProgramResponse {

    private Long id;
    private String name;
    private List<String> timeInfoList;
}
