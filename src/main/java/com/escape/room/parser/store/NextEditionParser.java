package com.escape.room.parser.store;

import com.escape.room.parser.Parser;
import com.escape.room.dto.ProgramResponse;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.util.ObjectUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class NextEditionParser implements Parser {

    @Override
    public List<ProgramResponse> crawling(String url){

        Connection conn = Jsoup.connect(url);

        return getProgramInfo(conn);
    }

    private List<ProgramResponse> getProgramInfo(Connection conn) {
        List<ProgramResponse> responses = new ArrayList<>();
        try{
            Document document = conn.get();
            Elements programElements = document.getElementsByClass("text-center");

            for (Element programElement : programElements) {
                String title = programElement.select("h2[class=\" mb5 font700\"]").text();
                if(!ObjectUtils.isEmpty(title)){
                    ProgramResponse response = new ProgramResponse();
                    response.setTitle(title);
                    System.out.println("title = " + title);
                    Elements timeElements = programElement.select("div.mb20");
                    List<String> timeList = new ArrayList<>();
                    for (Element timeElement : timeElements) {
                        String status = timeElement.select("span.status").text();
                        if("예약가능".equals(status)){
                            String time = timeElement.select("span.time").text();
                            timeList.add(time);
                            System.out.println(" time = " + time + "/" + status);
                        }
                    }
                    response.setTimeInfoList(timeList);
                    responses.add(response);
                }
            }

        }catch(IOException e){
            e.printStackTrace();
        }

        return  responses;

    }
}
