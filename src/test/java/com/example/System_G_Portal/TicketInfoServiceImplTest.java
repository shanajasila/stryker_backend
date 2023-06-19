package com.example.System_G_Portal;

import com.example.System_G_Portal.model.dao.TicketInfo;
import com.example.System_G_Portal.repository.TicketInfoRepo;
import com.example.System_G_Portal.service.TicketInfoServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.*;

public class TicketInfoServiceImplTest {

  @Mock
  private TicketInfoRepo mockTicketInfoRepo;

  @InjectMocks
  private TicketInfoServiceImpl ticketInfoService;

  @BeforeEach
  public void setup() {
    MockitoAnnotations.openMocks(this);
  }

  @Test
  public void testViewTicketInfo() {
    // Arrange
    List<TicketInfo> expectedTicketInfoList = Arrays.asList(
      new TicketInfo(1, "TICKET-001", "Surgery 1", "2023-05-26", "10:00 AM", "Doctor 1", "Hospital 1", "High", "Open", 3, "Agent 1"),
      new TicketInfo(2, "TICKET-002", "Surgery 2", "2023-05-27", "11:00 AM", "Doctor 2", "Hospital 2", "Medium", "Closed", 2, "Agent 2")
    );

    // Mock the behavior of the repository
    when(mockTicketInfoRepo.findAll()).thenReturn(expectedTicketInfoList);

    // Act
    List<TicketInfo> actualTicketInfoList = ticketInfoService.viewTicketInfo();

    // Assert
    Assertions.assertEquals(expectedTicketInfoList.size(), actualTicketInfoList.size());
    Assertions.assertEquals(expectedTicketInfoList.get(0).getId(), actualTicketInfoList.get(0).getId());
    Assertions.assertEquals(expectedTicketInfoList.get(1).getId(), actualTicketInfoList.get(1).getId());
    // Add additional assertions for other properties

    // Verify the mock interaction
    verify(mockTicketInfoRepo, times(1)).findAll();
  }

  @Test
  public void testViewTicketInfoByTicketId() {
    // Arrange
    String ticketId = "TICKET-001";
    List<TicketInfo> expectedTicketInfoList = Arrays.asList(
      new TicketInfo(1, "TICKET-001", "Surgery 1", "2023-05-26", "10:00 AM", "Doctor 1", "Hospital 1", "High", "Open", 3, "Agent 1")
    );

    // Mock the behavior of the repository
    when(mockTicketInfoRepo.viewTicketById(ticketId)).thenReturn(expectedTicketInfoList);

    // Act
    List<TicketInfo> actualTicketInfoList = ticketInfoService.viewTicketInfoByTicketId(ticketId);

    // Assert
    Assertions.assertEquals(expectedTicketInfoList.size(), actualTicketInfoList.size());
    Assertions.assertEquals(expectedTicketInfoList.get(0).getId(), actualTicketInfoList.get(0).getId());
    // Add additional assertions for other properties

    // Verify the mock interaction
    verify(mockTicketInfoRepo, times(1)).viewTicketById(ticketId);
  }
}
