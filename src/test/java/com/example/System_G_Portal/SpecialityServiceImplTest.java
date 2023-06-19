package com.example.System_G_Portal;

import com.example.System_G_Portal.model.dao.SpecialityAttachments;
import com.example.System_G_Portal.repository.SpecialityRepo;
import com.example.System_G_Portal.service.SpecialityServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.*;

public class SpecialityServiceImplTest {

  @Mock
  private SpecialityRepo mockSpecialityRepo;

  @InjectMocks
  private SpecialityServiceImpl specialityService;

  @BeforeEach
  public void setup() {
    MockitoAnnotations.openMocks(this);
  }

  @Test
  public void testViewSpeciality() {
    // Arrange
    List<SpecialityAttachments> expectedSpecialityList = Arrays.asList(
      new SpecialityAttachments(1, "ORDER-001", "Item 1", 5, 10, "SN-001", "Available"),
      new SpecialityAttachments(2, "ORDER-001", "Item 2", 3, 8, "SN-002", "Available")
    );

    // Mock the behavior of the repository
    when(mockSpecialityRepo.viewSpecialityById()).thenReturn(expectedSpecialityList);

    // Act
    List<SpecialityAttachments> actualSpecialityList = specialityService.viewSpeciality();

    // Assert
    Assertions.assertEquals(expectedSpecialityList.size(), actualSpecialityList.size());
    Assertions.assertEquals(expectedSpecialityList.get(0).getId(), actualSpecialityList.get(0).getId());
    Assertions.assertEquals(expectedSpecialityList.get(1).getId(), actualSpecialityList.get(1).getId());
    // Add additional assertions for other properties

    // Verify the mock interaction
    verify(mockSpecialityRepo, times(1)).viewSpecialityById();
  }
}
