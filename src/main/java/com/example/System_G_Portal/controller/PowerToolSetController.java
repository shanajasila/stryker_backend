package com.example.System_G_Portal.controller;

import com.example.System_G_Portal.model.dao.PowerToolSet;
import com.example.System_G_Portal.model.dao.TicketInfo;
import com.example.System_G_Portal.service.PowerToolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PowerToolSetController {
    @Autowired
    private PowerToolService powerToolService;

    @CrossOrigin("*")
    @GetMapping("/viewPowerToolSet")
    public List<PowerToolSet> getPowerTool() {
        return powerToolService.viewPowerToolSet();
    }
}
