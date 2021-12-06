package com.escape.room.crawling;

import com.escape.room.crawling.dto.ProgramResponse;

import java.util.List;

public interface Crawling {

    List<ProgramResponse> crawling(String url);

}
