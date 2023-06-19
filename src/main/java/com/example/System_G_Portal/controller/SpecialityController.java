package com.example.System_G_Portal.controller;

import com.example.System_G_Portal.model.dao.SpecialityAttachments;
import com.example.System_G_Portal.model.dao.TicketInfo;
import com.example.System_G_Portal.service.SpecialityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SpecialityController {
    @Autowired
    private SpecialityService specialityService;

    @CrossOrigin("*")
    @GetMapping("/viewSpeciality")
    public List<SpecialityAttachments> getSpeciality() {
        return specialityService.viewSpeciality();
    }
}
