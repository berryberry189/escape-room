package com.escape.room.parser.store;

import com.escape.room.parser.Parser;
import com.escape.room.dto.ProgramInfo;
import lombok.extern.slf4j.Slf4j;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Slf4j
public class MurderParkerParser implements Parser {

    @Override
    public List<ProgramInfo> crawlingParser(String url){

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

        return getProgramInfo(document);
    }

    private List<ProgramInfo> getProgramInfo(Document document) {

        List<ProgramInfo> programInfoList = new ArrayList<>();

        Elements programElements = document.getElementsByClass("reservTime");

        for (Element programElement : programElements) {
            String title = programElement.select("h3").text();

            Elements timeElements = programElement.select("li");
            List<String> availableTimes = new ArrayList<>();
            for (Element timeElement : timeElements) {
                String status = timeElement.select(".possibility").text();
                if("예약가능".equals(status)){
                    String time = timeElement.select(".time").text();
                    availableTimes.add(time);
                }
            }
            programInfoList.add(new ProgramInfo(title, availableTimes));
        }

        return programInfoList;
    }
}
