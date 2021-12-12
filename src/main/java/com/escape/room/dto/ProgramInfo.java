package com.escape.room.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class ProgramInfo {

    private String title;
    private List<String> availableTimes;

    public ProgramInfo(String title, List<String> availableTimes) {
        this.title = title;
        this.availableTimes = availableTimes;
    }

}
