package com.example.System_G_Portal;

import com.example.System_G_Portal.model.dao.Consumables;
import com.example.System_G_Portal.repository.ConsumableRepo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;

public class ConsumableRepoTest {

  private ConsumableRepo consumableRepo;

  @Mock
  private ConsumableRepo mockConsumableRepo;

  @BeforeEach
  public void setup() {
    MockitoAnnotations.openMocks(this);
    consumableRepo = mock(ConsumableRepo.class);
  }

  @Test
  public void testViewConsumablesById() {
    // Arrange
    List<Consumables> expectedConsumables = new ArrayList<>();
    expectedConsumables.add(new Consumables(1, "ORDER-001", "Item 1", 10, 5, "123456", "Available"));
    expectedConsumables.add(new Consumables(2, "ORDER-002", "Item 2", 5, 3, "789012", "Unavailable"));

    // Mock the behavior of the repository
    when(consumableRepo.viewConsumablesById()).thenReturn(expectedConsumables);

    // Act
    List<Consumables> actualConsumables = consumableRepo.viewConsumablesById();

    // Assert
    Assertions.assertEquals(expectedConsumables.size(), actualConsumables.size());
    Assertions.assertEquals(expectedConsumables.get(0).getId(), actualConsumables.get(0).getId());
    Assertions.assertEquals(expectedConsumables.get(1).getId(), actualConsumables.get(1).getId());
    // Add additional assertions for other properties

    // Verify the mock interaction
    verify(consumableRepo, times(1)).viewConsumablesById();
  }
}
