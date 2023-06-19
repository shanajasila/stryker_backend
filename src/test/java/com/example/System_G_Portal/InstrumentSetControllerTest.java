package com.example.System_G_Portal;

import com.example.System_G_Portal.controller.InstrumentSetController;
import com.example.System_G_Portal.model.dao.InstrumentSet;
import com.example.System_G_Portal.service.InstrumentSetService;
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

@WebMvcTest(InstrumentSetController.class)
class InstrumentSetControllerTest {

  @Autowired
  private MockMvc mockMvc;

  @MockBean
  private InstrumentSetService instrumentSetService;

  @Test
  void testGetInstrumentSet() throws Exception {
    // Arrange
    InstrumentSet instrumentSet1 = new InstrumentSet();
    instrumentSet1.setId(1);
    instrumentSet1.setItem_name("Instrument Set 1");

    InstrumentSet instrumentSet2 = new InstrumentSet();
    instrumentSet2.setId(2);
    instrumentSet2.setItem_name("Instrument Set 2");

    List<InstrumentSet> instrumentSetList = Arrays.asList(instrumentSet1, instrumentSet2);

    when(instrumentSetService.viewInstrumentSet()).thenReturn(instrumentSetList);

    // Act & Assert
    mockMvc.perform(MockMvcRequestBuilders.get("/viewInstrumentSet")
        .contentType(MediaType.APPLICATION_JSON))
      .andExpect(MockMvcResultMatchers.status().isOk())
      .andExpect(MockMvcResultMatchers.jsonPath("$[0].id").value(1))
      .andExpect(MockMvcResultMatchers.jsonPath("$[0].item_name").value("Instrument Set 1"))
      .andExpect(MockMvcResultMatchers.jsonPath("$[1].id").value(2))
      .andExpect(MockMvcResultMatchers.jsonPath("$[1].item_name").value("Instrument Set 2"));
  }
}
