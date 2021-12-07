package com.escape.room.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ProgramResponse {

    private Long id;
    private String title;
    private List<String> timeInfoList;
}
