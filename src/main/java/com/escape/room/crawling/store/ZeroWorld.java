package com.escape.room.crawling.store;

import com.escape.room.crawling.Crawling;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class ZeroWorld implements Crawling {

    @Override
    public void crawling(String url){

        Connection conn = Jsoup.connect(url);

        try{
            Document document = conn.get();
            Elements elements = document.getElementsByClass("hover2");

            System.out.println(elements);

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}

