package com.example.System_G_Portal;

import com.example.System_G_Portal.model.dao.Consumables;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConsumablesTest {

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
    Consumables consumables = new Consumables();
    consumables.setId(id);
    consumables.setOrder_id(orderId);
    consumables.setItem_name(itemName);
    consumables.setQty(qty);
    consumables.setSize(size);
    consumables.setSerial_no(serialNo);
    consumables.setStatus(status);

    // Assert
    assertEquals(id, consumables.getId());
    assertEquals(orderId, consumables.getOrder_id());
    assertEquals(itemName, consumables.getItem_name());
    assertEquals(qty, consumables.getQty());
    assertEquals(size, consumables.getSize());
    assertEquals(serialNo, consumables.getSerial_no());
    assertEquals(status, consumables.getStatus());
  }
}
