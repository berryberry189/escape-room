package com.escape.room.parser;

import com.escape.room.dto.ProgramResponse;

import java.util.List;

public interface Parser {

    List<ProgramResponse> crawling(String url);

}
