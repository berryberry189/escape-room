package com.escape.room.crawling.store;

import com.escape.room.crawling.Crawling;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.util.StringUtils;

import java.io.IOException;

public class NextEdition implements Crawling {

    @Override
    public void crawling(String url){

        Connection conn = Jsoup.connect(url);

        try{
            Document document = conn.get();
            Elements programElements = document.getElementsByClass("text-center");

            for (Element programElement : programElements) {
                String title = programElement.select("h2[class=\" mb5 font700\"]").text();
                if(!StringUtils.isEmpty(title)){
                    System.out.println("title = " + title);
                }

                Elements timeElements = programElement.select("div.mb20");
                for (Element timeElement : timeElements) {
                    String status = timeElement.select("span.status").text();
                    if("예약가능".equals(status)){
                        String time = timeElement.select("span.time").text();
                        System.out.println(" time = " + time + "/" + status);
                    }
                }
            }

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
