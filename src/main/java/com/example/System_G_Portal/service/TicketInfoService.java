package com.example.System_G_Portal.service;

import com.example.System_G_Portal.model.dao.TicketInfo;

import java.util.List;

public interface TicketInfoService {
    public List<TicketInfo> viewTicketInfo();
    public List<TicketInfo> viewTicketInfoByTicketId(String ticket_Id);
}
