package com.escape.room;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.util.Iterator;

@SpringBootApplication
public class RoomApplication {

	public static void main(String[] args) {
		SpringApplication.run(RoomApplication.class, args);

		final String url = "https://www.nextedition.co.kr/shops/NextEdition%20Gangnam";

		Connection conn = Jsoup.connect(url);

		try{
			Document document = conn.get();
			Elements elements = document.select("h2[class=\" mb5 font700\"]");

			for (Element element : elements) {
				System.out.println("element = " + element.text());
			}

		}catch(IOException e){
			e.printStackTrace();
		}

	}


}
