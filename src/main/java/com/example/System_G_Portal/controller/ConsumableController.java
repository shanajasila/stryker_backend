package com.example.System_G_Portal.controller;

import com.example.System_G_Portal.model.dao.Consumables;
import com.example.System_G_Portal.model.dao.TicketInfo;
import com.example.System_G_Portal.service.ConsumableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ConsumableController {
    @Autowired
    private ConsumableService consumableService;
    @CrossOrigin("*")
    @GetMapping("/viewConsumables")
    public List<Consumables> getConsumables() {
//        System.out.println(ticket_id);
        return consumableService.viewConsumables();
    }
}
