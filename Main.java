import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.println("Summer Vacation Planner");
        
        

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        User user = new User(name);
        ArrayList<Activity> chosenActivities = new ArrayList<Activity>();

        System.out.println("\nHi " + user.getName() + "! Let's plan your vacation.");

        System.out.println("\nChoose a destination type:");
        System.out.println("1. Beach");
        System.out.println("2. City");
        System.out.println("3. Mountains");
        System.out.println("4. Theme Park");
        System.out.print("Enter choice: ");
        int destinationChoice = input.nextInt();
        input.nextLine();

        Destination destination = DestinationMaker.createDestination(destinationChoice);

        System.out.print("\nHow many days is your trip? ");
        int days = input.nextInt();

        System.out.print("What is your total budget? $");
        double budget = input.nextDouble();

        System.out.println("\nChoose a hotel level:");
        System.out.println("1. Budget Hotel ($80 per night)");
        System.out.println("2. Regular Hotel ($140 per night)");
        System.out.println("3. Fancy Hotel ($230 per night)");
        System.out.print("Enter choice: ");
        int hotelChoice = input.nextInt();

        Hotel hotel = HotelMaker.createHotel(hotelChoice);

        boolean addingActivities = true;

        while (addingActivities) {
            System.out.println("\nChoose an activity to add:");
            System.out.println("1. Sightseeing ($25)");
            System.out.println("2. Restaurant Visit ($35)");
            System.out.println("3. Adventure Activity ($60)");
            System.out.println("4. Shopping ($45)");
            System.out.println("5. Museum ($20)");
            System.out.println("6. Stop adding activities");
            System.out.print("Enter choice: ");

            int activityChoice = input.nextInt();

            if (activityChoice == 6) {
                addingActivities = false;
            } else {
                Activity activity = ActivityMaker.createActivity(activityChoice);
                chosenActivities.add(activity);
                System.out.println(activity.getName() + " added!");
            }
        }

        Trip trip = new Trip(user, destination, hotel, days, budget, chosenActivities);

        System.out.println("\n=================================");
        System.out.println("Trip Summary");
        
        trip.printSummary();

        Itinerary itinerary = new Itinerary(trip);
        itinerary.printItinerary();

        System.out.println("\nWould you like to save this trip to a file?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        System.out.print("Enter choice: ");
        int saveChoice = input.nextInt();

        if (saveChoice == 1) {
            TripSaver.saveTrip(trip, itinerary);
        } else {
            System.out.println("Trip was not saved.");
        }

        System.out.println("\nThank you for using us!");
        input.close();
    }
}
