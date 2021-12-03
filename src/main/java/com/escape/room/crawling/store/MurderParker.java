package com.escape.room.crawling.store;

import com.escape.room.crawling.Crawling;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class MurderParker implements Crawling {

    @Override
    public void crawling(String url){
        Connection conn = Jsoup.connect(url);

        try{
            Document document = conn.get();
            Elements programElements = document.getElementsByClass("reservTime");

            for (Element programElement : programElements) {
                String title = programElement.select("h3").text();
                System.out.println("title = " + title);

                Elements timeElements = programElement.select("li");
                for (Element timeElement : timeElements) {
                    String status = timeElement.select(".possibility").text();
                    if("예약가능".equals(status)){
                        String time = timeElement.select(".time").text();
                        System.out.println(" time = " + time + "/" + status);
                    }
                }
            }

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
