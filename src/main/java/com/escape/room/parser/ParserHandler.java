package com.escape.room.parser;

import com.escape.room.parser.store.MurderParkerParser;
import com.escape.room.parser.store.NextEditionParser;
import com.escape.room.parser.store.SecretGarden;
import com.escape.room.dto.ProgramInfo;
import com.escape.room.enums.StoreEnum;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class ParserHandler {

    private final Map<Long, Parser> handlerMappingMap = new HashMap<>();

    public ParserHandler(){
        initHandlerMappingMap();
    }

    private void initHandlerMappingMap() {
        handlerMappingMap.put(StoreEnum.NEXT_EDITION.getValue(), new NextEditionParser());
        handlerMappingMap.put(StoreEnum.SECRET_EDITION.getValue(), new SecretGarden());
        handlerMappingMap.put(StoreEnum.MURDER_PARKER.getValue(), new MurderParkerParser());
    }

    public List<ProgramInfo> getCrawlingData(Long storeId, String url){

        Parser handler = getHandler(storeId);
        if(handler == null){
            throw new IllegalArgumentException("데이터를 가져올 수 없습니다.");
        }
        return handler.crawlingParser(url);
    }

    private Parser getHandler(Long storeId) {
        return handlerMappingMap.get(storeId);
    }


}
