package com.escape.room.service;

import com.escape.room.dto.BranchInfo;
import com.escape.room.dto.ProgramInfo;
import com.escape.room.dto.StoreResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ReserveServiceTest {

    @Autowired ReserveService service;

    @Test
    void 전체_방탈출카페_목록(){
        List<StoreResponse> storeList = service.getStoreList();
        for (StoreResponse store : storeList) {
            System.out.println("이름 :" + store.getName());
            for (BranchInfo branch : store.getBranchList()) {
                System.out.println(" 지점 :" + branch.getName());
            }
        }
    }

    @Test
    void 지점의_프로그램_시간_목록(){
        List<ProgramInfo> programList = service.getProgramList(1L,1L);
        for (ProgramInfo program : programList) {
            System.out.println("Title : " + program.getTitle());
            for (String time : program.getAvailableTimes()) {
                System.out.println("  Time : " + time);
            }
        }
    }

}