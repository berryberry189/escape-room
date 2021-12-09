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
public class SecretGarden extends DefaultParser {

    @Override
    public List<ProgramInfo> crawlingParser(String url){
        return getProgramInfo(getDocument(url));
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
