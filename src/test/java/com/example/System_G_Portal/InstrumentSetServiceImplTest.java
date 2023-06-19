package com.example.System_G_Portal;

import com.example.System_G_Portal.model.dao.InstrumentSet;
import com.example.System_G_Portal.repository.InstrumentSetRepo;
import com.example.System_G_Portal.service.InstrumentSetServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.*;

public class InstrumentSetServiceImplTest {

  @Mock
  private InstrumentSetRepo mockInstrumentSetRepo;

  @InjectMocks
  private InstrumentSetServiceImpl instrumentSetService;

  @BeforeEach
  public void setup() {
    MockitoAnnotations.openMocks(this);
  }

  @Test
  public void testViewInstrumentSet() {
    // Arrange
    List<InstrumentSet> expectedInstrumentSet = Arrays.asList(
      new InstrumentSet(1, "ORDER-001", "Item 1", 5, 10, "SN-001", "Available"),
      new InstrumentSet(2, "ORDER-001", "Item 2", 3, 8, "SN-002", "Available")
    );

    // Mock the behavior of the repository
    when(mockInstrumentSetRepo.viewInstrumentSetById()).thenReturn(expectedInstrumentSet);

    // Act
    List<InstrumentSet> actualInstrumentSet = instrumentSetService.viewInstrumentSet();

    // Assert
    Assertions.assertEquals(expectedInstrumentSet.size(), actualInstrumentSet.size());
    Assertions.assertEquals(expectedInstrumentSet.get(0).getId(), actualInstrumentSet.get(0).getId());
    Assertions.assertEquals(expectedInstrumentSet.get(1).getId(), actualInstrumentSet.get(1).getId());
    // Add additional assertions for other properties

    // Verify the mock interaction
    verify(mockInstrumentSetRepo, times(1)).viewInstrumentSetById();
  }
}
