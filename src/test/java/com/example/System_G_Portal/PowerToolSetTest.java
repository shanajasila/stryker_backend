package com.example.System_G_Portal;

import com.example.System_G_Portal.model.dao.PowerToolSet;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PowerToolSetTest {

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
    PowerToolSet powerToolSet = new PowerToolSet();
    powerToolSet.setId(id);
    powerToolSet.setOrder_id(orderId);
    powerToolSet.setItem_name(itemName);
    powerToolSet.setQty(qty);
    powerToolSet.setSize(size);
    powerToolSet.setSerial_no(serialNo);
    powerToolSet.setStatus(status);

    // Assert
    assertEquals(id, powerToolSet.getId());
    assertEquals(orderId, powerToolSet.getOrder_id());
    assertEquals(itemName, powerToolSet.getItem_name());
    assertEquals(qty, powerToolSet.getQty());
    assertEquals(size, powerToolSet.getSize());
    assertEquals(serialNo, powerToolSet.getSerial_no());
    assertEquals(status, powerToolSet.getStatus());
  }
}
