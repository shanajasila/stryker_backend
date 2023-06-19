package com.example.System_G_Portal;

import com.example.System_G_Portal.model.dao.InstrumentSet;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class InstrumentSetTest {

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
    InstrumentSet instrumentSet = new InstrumentSet();
    instrumentSet.setId(id);
    instrumentSet.setOrder_id(orderId);
    instrumentSet.setItem_name(itemName);
    instrumentSet.setQty(qty);
    instrumentSet.setSize(size);
    instrumentSet.setSerial_no(serialNo);
    instrumentSet.setStatus(status);

    // Assert
    assertEquals(id, instrumentSet.getId());
    assertEquals(orderId, instrumentSet.getOrder_id());
    assertEquals(itemName, instrumentSet.getItem_name());
    assertEquals(qty, instrumentSet.getQty());
    assertEquals(size, instrumentSet.getSize());
    assertEquals(serialNo, instrumentSet.getSerial_no());
    assertEquals(status, instrumentSet.getStatus());
  }
}

