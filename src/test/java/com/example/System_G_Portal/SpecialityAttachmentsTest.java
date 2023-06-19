package com.example.System_G_Portal;

import com.example.System_G_Portal.model.dao.SpecialityAttachments;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SpecialityAttachmentsTest {

  @Test
  void testGettersAndSetters() {
    // Arrange
    int id = 1;
    String orderId = "order-123";
    String itemName = "item-1";
    int qty = 10;
    int size = 5;
    String serialNo = "SN-123";
    String status = "In Stock";

    // Act
    SpecialityAttachments specialityAttachments = new SpecialityAttachments();
    specialityAttachments.setId(id);
    specialityAttachments.setOrder_id(orderId);
    specialityAttachments.setItem_name(itemName);
    specialityAttachments.setQty(qty);
    specialityAttachments.setSize(size);
    specialityAttachments.setSerial_no(serialNo);
    specialityAttachments.setStatus(status);

    // Assert
    assertEquals(id, specialityAttachments.getId());
    assertEquals(orderId, specialityAttachments.getOrder_id());
    assertEquals(itemName, specialityAttachments.getItem_name());
    assertEquals(qty, specialityAttachments.getQty());
    assertEquals(size, specialityAttachments.getSize());
    assertEquals(serialNo, specialityAttachments.getSerial_no());
    assertEquals(status, specialityAttachments.getStatus());
  }
}

