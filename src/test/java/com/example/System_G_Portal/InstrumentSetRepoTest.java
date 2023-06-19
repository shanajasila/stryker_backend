package com.example.System_G_Portal;

import com.example.System_G_Portal.model.dao.InstrumentSet;
import com.example.System_G_Portal.repository.InstrumentSetRepo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;

public class InstrumentSetRepoTest {

  private InstrumentSetRepo instrumentSetRepo;

  @Mock
  private InstrumentSetRepo mockInstrumentSetRepo;

  @BeforeEach
  public void setup() {
    MockitoAnnotations.openMocks(this);
    instrumentSetRepo = mock(InstrumentSetRepo.class);
  }

  @Test
  public void testViewInstrumentSetById() {
    // Arrange
    List<InstrumentSet> expectedInstrumentSets = new ArrayList<>();
    expectedInstrumentSets.add(new InstrumentSet(1, "ORDER-001", "Item 1", 10, 5, "123456", "Available"));
    expectedInstrumentSets.add(new InstrumentSet(2, "ORDER-002", "Item 2", 5, 3, "789012", "Unavailable"));

    // Mock the behavior of the repository
    when(instrumentSetRepo.viewInstrumentSetById()).thenReturn(expectedInstrumentSets);

    // Act
    List<InstrumentSet> actualInstrumentSets = instrumentSetRepo.viewInstrumentSetById();

    // Assert
    Assertions.assertEquals(expectedInstrumentSets.size(), actualInstrumentSets.size());
    Assertions.assertEquals(expectedInstrumentSets.get(0).getId(), actualInstrumentSets.get(0).getId());
    Assertions.assertEquals(expectedInstrumentSets.get(1).getId(), actualInstrumentSets.get(1).getId());
    // Add additional assertions for other properties

    // Verify the mock interaction
    verify(instrumentSetRepo, times(1)).viewInstrumentSetById();
  }
}
