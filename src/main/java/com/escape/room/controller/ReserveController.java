package com.escape.room.controller;

import com.escape.room.service.ReserveService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequiredArgsConstructor
@RequestMapping("/reserve")
@Controller
public class ReserveController {

    private final ReserveService service;

    @GetMapping("")
    public String index(Model model) {
        model.addAttribute("storeList", service.getStoreList());
        return "/index";
    }
    

}
