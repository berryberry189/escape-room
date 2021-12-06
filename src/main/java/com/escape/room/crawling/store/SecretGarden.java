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

public class SecretGarden implements Crawling {

    @Override
    public List<ProgramResponse> crawling(String url){

        List<ProgramResponse> responses = new ArrayList<>();

        Connection conn = Jsoup.connect(url);

        try{
            Document document = conn.get();
            Elements programElements = document.getElementsByClass("theme_box");

            for (Element programElement : programElements) {
                String title = programElement.select("h3[class=\" h3_theme\"]").text();
                System.out.println("title = " + title);


                Elements timeElements = programElement.select(".time");
                Elements endTimeElements = programElement.select(".end");
                for (Element timeElement : timeElements) {
                    boolean status = true;
                    String time = timeElement.text();
                    for (Element endTimeElement : endTimeElements) {
                        if(time.equals(endTimeElement.select(".time").text())){
                            status = false;
                            break;
                        }
                    }
                   if(status) System.out.println("  time = " + time);
                }
            }

        }catch(IOException e){
            e.printStackTrace();
        }

        return responses;
    }
}
