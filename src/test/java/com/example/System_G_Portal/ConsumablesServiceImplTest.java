package com.example.System_G_Portal;

import com.example.System_G_Portal.model.dao.Consumables;
import com.example.System_G_Portal.repository.ConsumableRepo;
import com.example.System_G_Portal.service.ConsumablesServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.*;

public class ConsumablesServiceImplTest {

  @Mock
  private ConsumableRepo mockConsumableRepo;

  @InjectMocks
  private ConsumablesServiceImpl consumablesService;

  @BeforeEach
  public void setup() {
    MockitoAnnotations.openMocks(this);
  }

  @Test
  public void testViewConsumables() {
    // Arrange
    List<Consumables> expectedConsumables = Arrays.asList(
      new Consumables(1, "ORDER-001", "Item 1", 5, 10, "SN-001", "Available"),
      new Consumables(2, "ORDER-001", "Item 2", 3, 8, "SN-002", "Available")
    );

    // Mock the behavior of the repository
    when(mockConsumableRepo.viewConsumablesById()).thenReturn(expectedConsumables);

    // Act
    List<Consumables> actualConsumables = consumablesService.viewConsumables();

    // Assert
    Assertions.assertEquals(expectedConsumables.size(), actualConsumables.size());
    Assertions.assertEquals(expectedConsumables.get(0).getId(), actualConsumables.get(0).getId());
    Assertions.assertEquals(expectedConsumables.get(1).getId(), actualConsumables.get(1).getId());
    // Add additional assertions for other properties

    // Verify the mock interaction
    verify(mockConsumableRepo, times(1)).viewConsumablesById();
  }
}

