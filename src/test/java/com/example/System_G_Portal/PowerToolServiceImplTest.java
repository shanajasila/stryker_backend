package com.example.System_G_Portal;

import com.example.System_G_Portal.model.dao.PowerToolSet;
import com.example.System_G_Portal.repository.PowerToolSetRepo;
import com.example.System_G_Portal.service.PowerToolServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.*;

public class PowerToolServiceImplTest {

  @Mock
  private PowerToolSetRepo mockPowerToolSetRepo;

  @InjectMocks
  private PowerToolServiceImpl powerToolService;

  @BeforeEach
  public void setup() {
    MockitoAnnotations.openMocks(this);
  }

  @Test
  public void testViewPowerToolSet() {
    // Arrange
    List<PowerToolSet> expectedPowerToolSet = Arrays.asList(
      new PowerToolSet(1, "ORDER-001", "Item 1", 5, 10, "SN-001", "Available"),
      new PowerToolSet(2, "ORDER-001", "Item 2", 3, 8, "SN-002", "Available")
    );

    // Mock the behavior of the repository
    when(mockPowerToolSetRepo.viewPowerToolById()).thenReturn(expectedPowerToolSet);

    // Act
    List<PowerToolSet> actualPowerToolSet = powerToolService.viewPowerToolSet();

    // Assert
    Assertions.assertEquals(expectedPowerToolSet.size(), actualPowerToolSet.size());
    Assertions.assertEquals(expectedPowerToolSet.get(0).getId(), actualPowerToolSet.get(0).getId());
    Assertions.assertEquals(expectedPowerToolSet.get(1).getId(), actualPowerToolSet.get(1).getId());
    // Add additional assertions for other properties

    // Verify the mock interaction
    verify(mockPowerToolSetRepo, times(1)).viewPowerToolById();
  }
}
