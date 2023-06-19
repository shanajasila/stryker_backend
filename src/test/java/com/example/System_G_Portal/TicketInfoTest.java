import com.example.System_G_Portal.model.dao.TicketInfo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TicketInfoTest {

  @Test
  void testGettersAndSetters() {
    // Arrange
    int id = 1;
    String ticketId = "TICKET-123";
    String surgeryName = "Appendectomy";
    String date = "2023-05-27";
    String time = "10:00 AM";
    String doctorName = "Dr. Smith";
    String hospitalName = "General Hospital";
    String priority = "High";
    String status = "Pending";
    int itemCount = 3;
    String assignedAgent = "Agent Smith";

    // Act
    TicketInfo ticketInfo = new TicketInfo();
    ticketInfo.setId(id);
    ticketInfo.setTicket_id(ticketId);
    ticketInfo.setSurgery_name(surgeryName);
    ticketInfo.setDate(date);
    ticketInfo.setTime(time);
    ticketInfo.setDoctor_name(doctorName);
    ticketInfo.setHospital_name(hospitalName);
    ticketInfo.setPriority(priority);
    ticketInfo.setStatus(status);
    ticketInfo.setItem_count(itemCount);
    ticketInfo.setAssigned_agent(assignedAgent);

    // Assert
    assertEquals(id, ticketInfo.getId());
    assertEquals(ticketId, ticketInfo.getTicket_id());
    assertEquals(surgeryName, ticketInfo.getSurgery_name());
    assertEquals(date, ticketInfo.getDate());
    assertEquals(time, ticketInfo.getTime());
    assertEquals(doctorName, ticketInfo.getDoctor_name());
    assertEquals(hospitalName, ticketInfo.getHospital_name());
    assertEquals(priority, ticketInfo.getPriority());
    assertEquals(status, ticketInfo.getStatus());
    assertEquals(itemCount, ticketInfo.getItem_count());
    assertEquals(assignedAgent, ticketInfo.getAssigned_agent());
  }
}

