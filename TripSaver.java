import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class TripSaver {
    public static void saveTrip(Trip trip, Itinerary itinerary) {
        try {
            FileWriter writer = new FileWriter("savedTrip.txt");

            writer.write("VoyageVault Vacation Plan\n");
            writer.write("=========================\n");
            writer.write("Traveler: " + trip.getUser().getName() + "\n");
            writer.write("Destination: " + trip.getDestination().getName() + "\n");
            writer.write("Days: " + trip.getDays() + "\n");
            writer.write("Hotel: " + trip.getHotel().getName() + "\n");
            writer.write("Budget: $" + trip.getBudget() + "\n");
            writer.write("Total Cost: $" + BudgetCalculator.calculateTotalCost(trip) + "\n");
            writer.write("Money Left: $" + BudgetCalculator.calculateMoneyLeft(trip) + "\n");

            writer.write("\nActivities:\n");
            ArrayList<Activity> activities = trip.getActivities();

            if (activities.size() == 0) {
                writer.write("No activities selected.\n");
            } else {
                for (int i = 0; i < activities.size(); i++) {
                    writer.write((i + 1) + ". " + activities.get(i).toString() + "\n");
                }
            }

            writer.write("\nItinerary:\n");
            ArrayList<String> plans = itinerary.getDailyPlans();

            for (int i = 0; i < plans.size(); i++) {
                writer.write(plans.get(i) + "\n");
            }

            writer.close();
            System.out.println("Trip saved to savedTrip.txt!");
        } catch (IOException e) {
            System.out.println("There was an error saving the trip.");
        }
    }
}
