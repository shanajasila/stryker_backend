package com.example.System_G_Portal;

import com.example.System_G_Portal.controller.SpecialityController;
import com.example.System_G_Portal.model.dao.SpecialityAttachments;
import com.example.System_G_Portal.service.SpecialityService;
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

@WebMvcTest(SpecialityController.class)
class SpecialityControllerTest {

  @Autowired
  private MockMvc mockMvc;

  @MockBean
  private SpecialityService specialityService;

  @Test
  void testGetSpeciality() throws Exception {
    // Arrange
    SpecialityAttachments speciality1 = new SpecialityAttachments();
    speciality1.setId(1);
    speciality1.setItem_name("Speciality Attachment 1");

    SpecialityAttachments speciality2 = new SpecialityAttachments();
    speciality2.setId(2);
    speciality2.setItem_name("Speciality Attachment 2");

    List<SpecialityAttachments> specialityList = Arrays.asList(speciality1, speciality2);

    when(specialityService.viewSpeciality()).thenReturn(specialityList);

    // Act & Assert
    mockMvc.perform(MockMvcRequestBuilders.get("/viewSpeciality")
        .contentType(MediaType.APPLICATION_JSON))
      .andExpect(MockMvcResultMatchers.status().isOk())
      .andExpect(MockMvcResultMatchers.jsonPath("$[0].id").value(1))
      .andExpect(MockMvcResultMatchers.jsonPath("$[0].item_name").value("Speciality Attachment 1"))
      .andExpect(MockMvcResultMatchers.jsonPath("$[1].id").value(2))
      .andExpect(MockMvcResultMatchers.jsonPath("$[1].item_name").value("Speciality Attachment 2"));
  }
}
