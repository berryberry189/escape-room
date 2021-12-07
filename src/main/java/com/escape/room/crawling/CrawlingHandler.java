package com.escape.room.crawling;

import com.escape.room.crawling.store.MurderParker;
import com.escape.room.crawling.store.NextEdition;
import com.escape.room.crawling.store.SecretGarden;
import com.escape.room.dto.ProgramResponse;
import com.escape.room.enums.StoreEnum;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class CrawlingHandler {

    private final Map<Long, Crawling> handlerMappingMap = new HashMap<>();

    public CrawlingHandler(){
        initHandlerMappingMap();
    }

    private void initHandlerMappingMap() {
        handlerMappingMap.put(StoreEnum.NEXT_EDITION.getValue(), new NextEdition());
        handlerMappingMap.put(StoreEnum.SECRET_EDITION.getValue(), new SecretGarden());
        handlerMappingMap.put(StoreEnum.MURDER_PARKER.getValue(), new MurderParker());
    }

    public List<ProgramResponse> getCrawlingData(Long storeId, String url){

        Crawling handler = getHandler(storeId);
        if(handler == null){
            throw new IllegalArgumentException("데이터를 가져올 수 없습니다.");
        }
        return handler.crawling(url);
    }

    private Crawling getHandler(Long storeId) {
        return handlerMappingMap.get(storeId);
    }


}
