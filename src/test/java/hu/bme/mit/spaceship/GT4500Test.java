package hu.bme.mit.spaceship;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GT4500Test {

  private GT4500 ship;
  private TorpedoStore mockP;
  private TorpedoStore mockS;
  @BeforeEach
  public void init(){
    mockP=mock(TorpedoStore.class);
    mockS=mock(TorpedoStore.class);
    mockP.setTorpedo(10);
    mockS.setTorpedo(10);
    this.ship = new GT4500(mockP,mockS);
  }

  @Test
  public void fireTorpedo_Single_Success(){
    // Arrange
    
    // Act
    boolean result = ship.fireTorpedo(FiringMode.SINGLE);
    
    // Assert
    assertEquals(true, result);
  }

  @Test
  public void fireTorpedo_All_Success(){
    // Arrange

    // Act
    boolean result = ship.fireTorpedo(FiringMode.ALL);

    // Assert
    assertEquals(true, result);
  }

}
