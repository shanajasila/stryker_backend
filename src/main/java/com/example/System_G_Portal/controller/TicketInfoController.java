package com.example.System_G_Portal.controller;


import com.example.System_G_Portal.model.dao.TicketInfo;
import com.example.System_G_Portal.service.TicketInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLOutput;
import java.util.List;

@RestController

public class TicketInfoController {
    @Autowired
    private TicketInfoService ticketInfoService;

    @CrossOrigin(origins = "*")
    @GetMapping("/viewTicketInfo")
    public List<TicketInfo> getTicketInfo(TicketInfo t){
        return ticketInfoService.viewTicketInfo();
    }


    @CrossOrigin(origins = "*")
    @GetMapping(value = "/viewticketinfoby/{id}")
    public List<TicketInfo> getTicketInfoByTicketId(@PathVariable(value = "id")String ticket_id) {
      System.out.println(ticket_id);
        return ticketInfoService.viewTicketInfoByTicketId(ticket_id);
    }
}
