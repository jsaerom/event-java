import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();
    System.out.println("Welcome to JA's Event Planning Company!");
    System.out.println("Provide us with some basic information and we will estimate the cost for your event");
    System.out.println("How many people will be attending your event? If you plan on having more than 250 guests at your event, please call us at 123-456-7890 for a consultation");
    int inputGuestNum = Integer.parseInt(myConsole.readLine());
    System.out.println("Awesome! Next--what type of food do you expect to serve at your event? Finger Food, Tapas, or No Food");
    String inputFood = myConsole.readLine();
    System.out.println("What type of beverages do you plan on serving at your event? Nonalcoholic, Full Bar, No Drinks");
    String inputDrinks = myConsole.readLine();
    System.out.println("Where would you like to hold your event? Bar, Conference Room, Ballroom");
    String inputVenue = myConsole.readLine();
    System.out.println("What sort of music would you like at your event? Live Band, DJ, No Music");
    String inputMusic = myConsole.readLine();
    System.out.println("Would you like a host to run the event? Yes or No");
    String stringInputHost = myConsole.readLine();
    boolean inputHost = false;
    if (stringInputHost.equalsIgnoreCase("Yes")){
      inputHost = true;
    } else {
      inputHost = false;
    }
    System.out.println("How many hours will your event be?");
    int inputHours = Integer.parseInt(myConsole.readLine());

    Event newEvent = new Event(inputGuestNum, inputFood, inputDrinks, inputVenue, inputMusic, inputHost, inputHours);
    newEvent.calculateCost();
    System.out.println("Here's the estimated cost for your event: $" + newEvent.getCost());
    System.out.println("Details:");
    System.out.println("-----------");
    System.out.println("Number of Guests: " + newEvent.getNumOfGuest());
    System.out.println("Venue option: " + newEvent.getVenue());
    System.out.println("Food option: " + newEvent.getFood());
    System.out.println("Drink option: " + newEvent.getDrinks());
    System.out.println("Music option: " + newEvent.getMusic());
    System.out.println("Would you like a host? " + stringInputHost);
    System.out.println("Your event will be for " + inputHours + " hours");
    System.out.println("If you're interested in booking this event, please contact us at 123-456-7890. Have a wonderful day!");
  }
}
