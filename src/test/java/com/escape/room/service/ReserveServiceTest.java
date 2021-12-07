package com.escape.room.service;

import com.escape.room.dto.BranchInfoDto;
import com.escape.room.dto.StoreResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ReserveServiceTest {

    @Autowired ReserveService service;

    @Test
    void 전체_방탈출카페_목록(){
        List<StoreResponse> storeList = service.getStoreList();
        for (StoreResponse store : storeList) {
            System.out.println("이름 :" + store.getName());
            for (BranchInfoDto branch : store.getBranchList()) {
                System.out.println(" 지점 :" + branch.getName());
            }
        }

    }

}