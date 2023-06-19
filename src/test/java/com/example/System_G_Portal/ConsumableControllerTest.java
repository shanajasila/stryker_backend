package com.example.System_G_Portal;

import com.example.System_G_Portal.controller.ConsumableController;
import com.example.System_G_Portal.model.dao.Consumables;
import com.example.System_G_Portal.service.ConsumableService;
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

@WebMvcTest(ConsumableController.class)
class ConsumableControllerTest {

  @Autowired
  private MockMvc mockMvc;

  @MockBean
  private ConsumableService consumableService;

  @Test
  void testGetConsumables() throws Exception {
    // Arrange
    Consumables consumable1 = new Consumables();
    consumable1.setId(1);
    consumable1.setItem_name("Item 1");

    Consumables consumable2 = new Consumables();
    consumable2.setId(2);
    consumable2.setItem_name("Item 2");

    List<Consumables> consumablesList = Arrays.asList(consumable1, consumable2);

    when(consumableService.viewConsumables()).thenReturn(consumablesList);

    // Act & Assert
    mockMvc.perform(MockMvcRequestBuilders.get("/viewConsumables")
        .contentType(MediaType.APPLICATION_JSON))
      .andExpect(MockMvcResultMatchers.status().isOk())
      .andExpect(MockMvcResultMatchers.jsonPath("$[0].id").value(1))
      .andExpect(MockMvcResultMatchers.jsonPath("$[0].item_name").value("Item 1"))
      .andExpect(MockMvcResultMatchers.jsonPath("$[1].id").value(2))
      .andExpect(MockMvcResultMatchers.jsonPath("$[1].item_name").value("Item 2"));
  }
}

