package com.example.System_G_Portal;

import com.example.System_G_Portal.model.dao.PowerToolSet;
import com.example.System_G_Portal.repository.PowerToolSetRepo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;

public class PowerToolSetRepoTest {

  private PowerToolSetRepo powerToolSetRepo;

  @Mock
  private PowerToolSetRepo mockPowerToolSetRepo;

  @BeforeEach
  public void setup() {
    MockitoAnnotations.openMocks(this);
    powerToolSetRepo = mock(PowerToolSetRepo.class);
  }

  @Test
  public void testViewPowerToolById() {
    // Arrange
    List<PowerToolSet> expectedPowerToolSets = new ArrayList<>();
    expectedPowerToolSets.add(new PowerToolSet(1, "ORDER-001", "Item 1", 10, 5, "123456", "Available"));
    expectedPowerToolSets.add(new PowerToolSet(2, "ORDER-002", "Item 2", 5, 3, "789012", "Unavailable"));

    // Mock the behavior of the repository
    when(powerToolSetRepo.viewPowerToolById()).thenReturn(expectedPowerToolSets);

    // Act
    List<PowerToolSet> actualPowerToolSets = powerToolSetRepo.viewPowerToolById();

    // Assert
    Assertions.assertEquals(expectedPowerToolSets.size(), actualPowerToolSets.size());
    Assertions.assertEquals(expectedPowerToolSets.get(0).getId(), actualPowerToolSets.get(0).getId());
    Assertions.assertEquals(expectedPowerToolSets.get(1).getId(), actualPowerToolSets.get(1).getId());
    // Add additional assertions for other properties

    // Verify the mock interaction
    verify(powerToolSetRepo, times(1)).viewPowerToolById();
  }
}
