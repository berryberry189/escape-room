package com.escape.room.parser.store;

import com.escape.room.parser.Parser;
import com.escape.room.dto.ProgramResponse;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SecretGardenParser implements Parser {

    @Override
    public List<ProgramResponse> crawling(String url){

        Connection conn = Jsoup.connect(url);

        return getProgramInfo(conn);
    }

    private List<ProgramResponse> getProgramInfo(Connection conn) {

        List<ProgramResponse> responses = new ArrayList<>();
        try{
            Document document = conn.get();
            Elements programElements = document.getElementsByClass("theme_box");

            for (Element programElement : programElements) {
                ProgramResponse response = new ProgramResponse();
                String title = programElement.select("h3[class=\" h3_theme\"]").text();
                response.setTitle(title);
                //System.out.println("title = " + title);

                Elements timeElements = programElement.select(".time");
                Elements endTimeElements = programElement.select(".end");
                List<String> timeList = new ArrayList<>();
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
                        timeList.add(time);
                        //System.out.println("  time = " + time);
                    }
                }
                response.setTimeInfoList(timeList);
                responses.add(response);
            }

        }catch(IOException e){
            e.printStackTrace();
        }

        return responses;
    }
}
