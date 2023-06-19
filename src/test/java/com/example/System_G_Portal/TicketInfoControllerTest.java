package com.example.System_G_Portal;

import com.example.System_G_Portal.controller.TicketInfoController;
import com.example.System_G_Portal.model.dao.TicketInfo;
import com.example.System_G_Portal.service.TicketInfoService;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.when;

@WebMvcTest(TicketInfoController.class)
class TicketInfoControllerTest {

  @Autowired
  private MockMvc mockMvc;

  @MockBean
  private TicketInfoService ticketInfoService;

  @Test
  void testGetTicketInfo() throws Exception {
    // Arrange
    TicketInfo ticketInfo1 = new TicketInfo();
    ticketInfo1.setId(1);
    ticketInfo1.setTicket_id("TICKET-001");

    TicketInfo ticketInfo2 = new TicketInfo();
    ticketInfo2.setId(2);
    ticketInfo2.setTicket_id("TICKET-002");

    List<TicketInfo> ticketInfoList = Arrays.asList(ticketInfo1, ticketInfo2);

    when(ticketInfoService.viewTicketInfo()).thenReturn(ticketInfoList);

    // Act & Assert
    mockMvc.perform(MockMvcRequestBuilders.get("/viewTicketInfo")
        .contentType(MediaType.APPLICATION_JSON))
      .andExpect(MockMvcResultMatchers.status().isOk())
      .andExpect(MockMvcResultMatchers.jsonPath("$[0].id").value(1))
      .andExpect(MockMvcResultMatchers.jsonPath("$[0].ticket_id").value("TICKET-001"))
      .andExpect(MockMvcResultMatchers.jsonPath("$[1].id").value(2))
      .andExpect(MockMvcResultMatchers.jsonPath("$[1].ticket_id").value("TICKET-002"));
  }

  @Test
  void testGetTicketInfoByTicketId() throws Exception {
    // Arrange
    TicketInfo ticketInfo1 = new TicketInfo();
    ticketInfo1.setId(1);
    ticketInfo1.setTicket_id("TICKET-001");

    TicketInfo ticketInfo2 = new TicketInfo();
    ticketInfo2.setId(2);
    ticketInfo2.setTicket_id("TICKET-002");

    List<TicketInfo> ticketInfoList = Arrays.asList(ticketInfo1, ticketInfo2);

    String ticketId = "TICKET-001";

    when(ticketInfoService.viewTicketInfoByTicketId(ticketId)).thenReturn(ticketInfoList);

    // Act & Assert
    mockMvc.perform(MockMvcRequestBuilders.get("/viewticketinfoby/{id}", ticketId)
        .contentType(MediaType.APPLICATION_JSON))
      .andExpect(MockMvcResultMatchers.status().isOk())
      .andExpect(MockMvcResultMatchers.jsonPath("$[0].id").value(1))
      .andExpect(MockMvcResultMatchers.jsonPath("$[0].ticket_id").value("TICKET-001"))
      .andExpect(MockMvcResultMatchers.jsonPath("$[1].id").value(2))
      .andExpect(MockMvcResultMatchers.jsonPath("$[1].ticket_id").value("TICKET-002"));
  }
}

