class Event {
  private int mNumOfGuest;
  private String mFood;
  private String mDrink;
  private String mVenue;
  private String mMusic;
  private boolean mHost;
  private int mHours;
  private int mCost;

  public Event(int guest, String food, String drink, String venue, String music, boolean host, int hours) {
    mNumOfGuest = guest;
    mFood = food;
    mDrink = drink;
    mVenue = venue;
    mMusic = music;
    mHost = host;
    mHours = hours;
    mCost = 0;
  }

  public int getNumOfGuest(){
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

  public int getHours(){
    return mHours;
  }

  public int getCost(){
    return mCost;
  }

  public boolean getHost(){
    return mHost;
  }

  public int calculateCost() {
    if (mNumOfGuest >= 0 && mNumOfGuest <=100){
      mCost += (mNumOfGuest * 2);
    } else if (mNumOfGuest > 100 && mNumOfGuest <=150){
      mCost += (mNumOfGuest * 2.5);
    } else if (mNumOfGuest > 150 && mNumOfGuest <=200){
      mCost += (mNumOfGuest * 3);
    } else if (mNumOfGuest > 200 && mNumOfGuest <=250){
      mCost += (mNumOfGuest * 3.5);
    }
    if (mFood.equals("No Food")){
      mCost += 0;
    } else if (mFood.equals("Finger Food")){
      mCost += (10 * mNumOfGuest);
    } else if (mFood.equals("Tapas")){
      mCost += (15 * mNumOfGuest);
    }
    if (mDrink.equals("No Drinks")){
      mCost += 0;
    } else if (mDrink.equals("Nonalcoholic")){
      mCost += (3 * mNumOfGuest);
    } else if (mDrink.equals("Full Bar")){
      mCost += (10 * mNumOfGuest);
    }
    if (mVenue.equals("Bar")){
      mCost += (100 * mHours);
    } else if (mVenue.equals("Conference Room")){
      mCost += (55 * mHours);
    } else if (mVenue.equals("Ballroom")){
      mCost += (150 * mHours);
    }
    if (mMusic.equals("No Music")){
      mCost += 0;
    } else if (mMusic.equals("Live Band")){
      mCost += (125 * mHours);
    } else if (mMusic.equals("DJ")){
      mCost += (100 * mHours);
    }
    if (mHost == true){
      mCost += (60 * mHours);
    } else {
      mCost += 0;
    }
    return mCost;
  }
}
