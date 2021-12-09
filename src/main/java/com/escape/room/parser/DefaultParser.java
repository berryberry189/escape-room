package com.escape.room.parser;

import com.escape.room.dto.ProgramInfo;
import lombok.extern.slf4j.Slf4j;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.List;

@Slf4j
public abstract class DefaultParser implements Parser {

    public Document getDocument (String url){
        log.info("##### Jsoup Parser 시작");
        Connection connection = Jsoup.connect(url);
        log.info("URL 연결 성공");
        Document document = null;

        try {
            document = connection.get();
            log.info("전체 문서 획득");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return document;
    }

    public abstract List<ProgramInfo> crawlingParser(String url);
}
