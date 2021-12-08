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
public class SecretGarden implements Parser {

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

        Elements programElements = document.getElementsByClass("theme_box");

        for (Element programElement : programElements) {
            String title = programElement.select("h3[class=\" h3_theme\"]").text();

            Elements timeElements = programElement.select(".time");
            Elements endTimeElements = programElement.select(".end");
            List<String> availableTimes = new ArrayList<>();
            for (Element timeElement : timeElements) {
                boolean status = true;
                String time = timeElement.text();
                for (Element endTimeElement : endTimeElements) {
                    if(time.equals(endTimeElement.select(".time").text())){
                        status = false;
                        break;
                    }
                }
                if(status) {
                    availableTimes.add(time);
                }
            }
            programInfoList.add(new ProgramInfo(title, availableTimes));
        }

        return programInfoList;
    }
}
