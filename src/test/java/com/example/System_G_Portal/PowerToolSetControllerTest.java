package com.example.System_G_Portal;

import com.example.System_G_Portal.controller.PowerToolSetController;
import com.example.System_G_Portal.model.dao.PowerToolSet;
import com.example.System_G_Portal.service.PowerToolService;
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

@WebMvcTest(PowerToolSetController.class)
class PowerToolSetControllerTest {

  @Autowired
  private MockMvc mockMvc;

  @MockBean
  private PowerToolService powerToolService;

  @Test
  void testGetPowerTool() throws Exception {
    // Arrange
    PowerToolSet powerTool1 = new PowerToolSet();
    powerTool1.setId(1);
    powerTool1.setItem_name("Power Tool Set 1");

    PowerToolSet powerTool2 = new PowerToolSet();
    powerTool2.setId(2);
    powerTool2.setItem_name("Power Tool Set 2");

    List<PowerToolSet> powerToolList = Arrays.asList(powerTool1, powerTool2);

    when(powerToolService.viewPowerToolSet()).thenReturn(powerToolList);

    // Act & Assert
    mockMvc.perform(MockMvcRequestBuilders.get("/viewPowerToolSet")
        .contentType(MediaType.APPLICATION_JSON))
      .andExpect(MockMvcResultMatchers.status().isOk())
      .andExpect(MockMvcResultMatchers.jsonPath("$[0].id").value(1))
      .andExpect(MockMvcResultMatchers.jsonPath("$[0].item_name").value("Power Tool Set 1"))
      .andExpect(MockMvcResultMatchers.jsonPath("$[1].id").value(2))
      .andExpect(MockMvcResultMatchers.jsonPath("$[1].item_name").value("Power Tool Set 2"));
  }
}

