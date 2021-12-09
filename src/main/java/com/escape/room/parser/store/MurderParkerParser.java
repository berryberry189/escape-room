package com.escape.room.parser.store;

import com.escape.room.dto.ProgramInfo;
import com.escape.room.parser.DefaultParser;
import lombok.extern.slf4j.Slf4j;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class MurderParkerParser extends DefaultParser {

    @Override
    public List<ProgramInfo> crawlingParser(String url){
        return getProgramInfo(getDocument(url));
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
