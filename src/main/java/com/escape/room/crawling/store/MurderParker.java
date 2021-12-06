package com.escape.room.crawling.store;

import com.escape.room.crawling.Crawling;
import com.escape.room.crawling.dto.ProgramResponse;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MurderParker implements Crawling {

    @Override
    public List<ProgramResponse> crawling(String url){

        Connection conn = Jsoup.connect(url);

        return getProgramInfo(conn);
    }

    private List<ProgramResponse> getProgramInfo(Connection conn) {

        List<ProgramResponse> responses = new ArrayList<>();
        try{
            Document document = conn.get();
            Elements programElements = document.getElementsByClass("reservTime");

            for (Element programElement : programElements) {
                ProgramResponse response = new ProgramResponse();
                String title = programElement.select("h3").text();
                response.setProgramTitle(title);
                System.out.println("title = " + title);

                Elements timeElements = programElement.select("li");
                List<String> timeList = new ArrayList<>();
                for (Element timeElement : timeElements) {
                    String status = timeElement.select(".possibility").text();
                    if("예약가능".equals(status)){
                        String time = timeElement.select(".time").text();
                        timeList.add(time);
                        System.out.println(" time = " + time + "/" + status);
                    }
                }
            }
        }catch(IOException e){
            e.printStackTrace();
        }

        return responses;
    }
}
