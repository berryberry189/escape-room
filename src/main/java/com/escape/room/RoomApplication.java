package com.escape.room;

import com.escape.room.crawling.Crawling;
import com.escape.room.crawling.store.MurderParker;
import com.escape.room.crawling.store.NextEdition;
import com.escape.room.crawling.store.SecretGarden;
import com.escape.room.crawling.store.ZeroWorld;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RoomApplication {

	public static void main(String[] args) {
		SpringApplication.run(RoomApplication.class, args);

		String nextEdition =  "https://www.nextedition.co.kr/shops/NextEdition%20Gangnam"; // 강남점
		String zeroWorld =  "https://www.zerogangnam.com/reservation/43"; // 강남점
		String secretGarden =  "http://secretgardenescape.com/reservation.html?k_shopno=9"; // 강남점
		String xPhobia =  "https://www.xphobia.net/reservation/reservation_check.php";
		String murderParker =  "http://murderparker.com/m/sub_02/sub02_1.html?JIJEM=S9"; // 홍대점

		Crawling crawling = new MurderParker();
		crawling.crawling(murderParker);

	}


}
