import java.util.List;
import java.util.ArrayList;

class Event {
  private String mNumberOfGuest;
  private String mFood;
  private String mDrink;
  private String mVenue;
  private String mMusic;
  private boolean mHost;
  private int mHours;

  public Event(String guest, String food, String drink, String venue, String music, boolean host, int hours) {
    mNumberOfGuest = guest;
    mFood = food;
    mDrink = drink;
    mVenue = venue;
    mMusic = music;
    mHost = host;
    mHours = hours;
  }

  public int calculateCost() {
    int total = 0;
    return total;
  }
}
