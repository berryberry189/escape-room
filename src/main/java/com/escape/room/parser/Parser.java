package com.escape.room.parser;

import com.escape.room.dto.ProgramInfo;

import java.util.List;

public interface Parser {

    List<ProgramInfo> crawlingParser(String url);

}
