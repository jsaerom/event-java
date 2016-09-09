class Event {
  private String mNumOfGuest;
  private String mFood;
  private String mDrink;
  private String mVenue;
  private String mMusic;
  private boolean mHost;
  private int mHours;

  public Event(String guest, String food, String drink, String venue, String music, boolean host, int hours) {
    mNumOfGuest = guest;
    mFood = food;
    mDrink = drink;
    mVenue = venue;
    mMusic = music;
    mHost = host;
    mHours = hours;
  }

  public String getNumOfGuest(){
    return mNumOfGuest;
  }

  public String getFood(){
    return mFood;
  }

  public String getDrinks(){
    return mDrink;
  }

  public String getVenue(){
    return mVenue;
  }

  public String getMusic(){
    return mMusic;
  }

  public boolean getHost(){
    return mHost;
  }

  public int getHours(){
    return mHours;
  }

  public int calculateCost() {
    int total = 0;
    if (mNumOfGuest == "0-50"){
      total += 300;
    } else if (mNumOfGuest == "51-100"){
      total += 400;
    } else if (mNumOfGuest == "101-150"){
      total += 450;
    } else if (mNumOfGuest == "151-200"){
      total += 500;
    }
    if (mFood == "No Food"){
      total += 0;
    } else if (mFood == "Finger Food"){
      total += 50;
    } else if (mFood == "Tapas"){
      total += 75;
    }
    if (mDrink == "No Drinks"){
      total += 0;
    } else if (mDrink == "Nonalcoholic"){
      total += 50;
    } else if (mDrink == "Full Bar"){
      total += 200;
    }
    if (mVenue == "Bar"){
      total += (100 * mHours);
    } else if (mVenue == "Conference Room"){
      total += (55 * mHours);
    } else if (mVenue == "Ballroom"){
      total += (150 * mHours);
    }
    if (mMusic == "No Music"){
      total += 0;
    } else if (mMusic == "Live Band"){
      total += (125 * mHours);
    } else if (mMusic == "DJ"){
      total += (100 * mHours);
    }
    if (mHost == true){
      total += (60 * mHours);
    } else {
      total += 0;
    }
    return total;
  }
}
