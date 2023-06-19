package com.example.System_G_Portal.service;

import com.example.System_G_Portal.model.dao.TicketInfo;
import com.example.System_G_Portal.repository.TicketInfoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketInfoServiceImpl implements TicketInfoService {
    @Autowired
    TicketInfoRepo ticketInfoRepo;
    @Override
    public List<TicketInfo> viewTicketInfo() {
        return ticketInfoRepo.findAll();
    }

  @Override
    public List<TicketInfo> viewTicketInfoByTicketId(String ticket_Id) {
        return ticketInfoRepo.viewTicketById(ticket_Id);
    }
}
