import org.junit.*;
import static org.junit.Assert.*;

public class EventTest {

  @Test
  public void calculateCost_addUpCostOfEvent_1715() {
    Event testEvent = new Event("0-50", "Tapas", "Full Bar", "Bar", "Live Band", true, 4);
    int expectedOutput = 1715;
    assertEquals(expectedOutput, testEvent.calculateCost());
  }

  @Test
  public void getNumOfGuest_accuratelyGetsNumOfGuest_String(){
    Event testEvent = new Event("0-50", "Tapas", "Full Bar", "Bar", "Live Band", true, 4);
    String expectedOutput = "0-50";
    assertEquals(expectedOutput, testEvent.getNumOfGuest());
  }

  @Test
  public void getFood_accuratelyGetsFood_String(){
    Event testEvent = new Event("0-50", "Tapas", "Full Bar", "Bar", "Live Band", true, 4);
    String expectedOutput = "Tapas";
    assertEquals(expectedOutput, testEvent.getFood());
  }

  @Test
  public void getDrinks_accuratelyGetsDrinks_String(){
    Event testEvent = new Event("0-50", "Tapas", "Full Bar", "Bar", "Live Band", true, 4);
    String expectedOutput = "Full Bar";
    assertEquals(expectedOutput, testEvent.getDrinks());
  }

  @Test
  public void getVenue_accuratelyGetsVenue_String(){
    Event testEvent = new Event("0-50", "Tapas", "Full Bar", "Bar", "Live Band", true, 4);
    String expectedOutput = "Bar";
    assertEquals(expectedOutput, testEvent.getVenue());
  }

  @Test
  public void getMusic_accuratelyGetsMusic_String(){
    Event testEvent = new Event("0-50", "Tapas", "Full Bar", "Bar", "Live Band", true, 4);
    String expectedOutput = "Live Band";
    assertEquals(expectedOutput, testEvent.getMusic());
  }

  @Test
  public void getHost_accuratelyGetsHostInfo_true(){
    Event testEvent = new Event("0-50", "Tapas", "Full Bar", "Bar", "Live Band", true, 4);
    boolean expectedOutput = true;
    assertEquals(expectedOutput, testEvent.getHost());
  }

  @Test
  public void getHours_accuratelyGetsHours_4(){
    Event testEvent = new Event("0-50", "Tapas", "Full Bar", "Bar", "Live Band", true, 4);
    int expectedOutput = 4;
    assertEquals(expectedOutput, testEvent.getHours());
  }
}
