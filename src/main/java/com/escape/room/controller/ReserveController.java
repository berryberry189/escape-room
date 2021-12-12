package com.escape.room.controller;

import com.escape.room.service.ReserveService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequiredArgsConstructor
@RequestMapping("/reserve")
@Controller
public class ReserveController {

    private final ReserveService service;

    /**
     * 전체 방탈출 카페&지점 목록
     *
     * @param model
     * @return
     */
    @GetMapping("")
    public String index(Model model) {
        model.addAttribute("storeList", service.getStoreList());
        return "/index";
    }

    /**
     * 지점의 프로그램 & 예약 가능 시간대 목록
     *
     * @param model
     * @param storeId
     * @param branchId
     * @return
     */
    @GetMapping("/{storeId}/{branchId}")
    public String getProgramList(Model model, @PathVariable Long storeId,
                                     @PathVariable Long branchId){
        model.addAttribute("programList", service.getProgramList(storeId, branchId));
        model.addAttribute("branchInfo", service.getBranchInfo(branchId));
        return "/reserve/list";
    }


}
