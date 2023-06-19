package com.example.System_G_Portal.controller;

import com.example.System_G_Portal.model.dao.InstrumentSet;
import com.example.System_G_Portal.model.dao.TicketInfo;
import com.example.System_G_Portal.service.InstrumentSetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class InstrumentSetController {

    @Autowired
    private InstrumentSetService instrumentSetService;
    @CrossOrigin(origins = "*")
    @GetMapping("/viewInstrumentSet")
    public List<InstrumentSet> getInstrumentSet() {
      return instrumentSetService.viewInstrumentSet();
    }
}
