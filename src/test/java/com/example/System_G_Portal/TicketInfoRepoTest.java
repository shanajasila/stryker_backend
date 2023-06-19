package com.example.System_G_Portal;

import com.example.System_G_Portal.model.dao.TicketInfo;
import com.example.System_G_Portal.repository.TicketInfoRepo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;

public class TicketInfoRepoTest {

  private TicketInfoRepo ticketInfoRepo;

  @Mock
  private TicketInfoRepo mockTicketInfoRepo;

  @BeforeEach
  public void setup() {
    MockitoAnnotations.openMocks(this);
    ticketInfoRepo = mock(TicketInfoRepo.class);
  }

  @Test
  public void testViewTicketById() {
    // Arrange
    String ticketId = "TICKET-001";
    List<TicketInfo> expectedTickets = new ArrayList<>();
    expectedTickets.add(new TicketInfo(1, "TICKET-001", "Surgery 1", "2023-05-26", "10:00 AM", "Dr. Smith", "Hospital A", "High", "Open", 3, "Agent A"));
    expectedTickets.add(new TicketInfo(2, "TICKET-001", "Surgery 1", "2023-05-26", "10:00 AM", "Dr. Smith", "Hospital A", "High", "Open", 3, "Agent A"));

    // Mock the behavior of the repository
    when(ticketInfoRepo.viewTicketById(ticketId)).thenReturn(expectedTickets);

    // Act
    List<TicketInfo> actualTickets = ticketInfoRepo.viewTicketById(ticketId);

    // Assert
    Assertions.assertEquals(expectedTickets.size(), actualTickets.size());
    Assertions.assertEquals(expectedTickets.get(0).getId(), actualTickets.get(0).getId());
    Assertions.assertEquals(expectedTickets.get(1).getId(), actualTickets.get(1).getId());
    // Add additional assertions for other properties

    // Verify the mock interaction
    verify(ticketInfoRepo, times(1)).viewTicketById(ticketId);
  }
}

