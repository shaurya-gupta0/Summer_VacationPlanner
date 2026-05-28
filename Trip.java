import java.util.ArrayList;

public class Trip {
    private User user;
    private Destination destination;
    private Hotel hotel;
    private int days;
    private double budget;
    private ArrayList<Activity> activities;

    public Trip(User user, Destination destination, Hotel hotel, int days, double budget, ArrayList<Activity> activities) {
        this.user = user;
        this.destination = destination;
        this.hotel = hotel;
        this.days = days;
        this.budget = budget;
        this.activities = activities;
    }

    public User getUser() {
        return user;
    }

    public Destination getDestination() {
        return destination;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public int getDays() {
        return days;
    }

    public double getBudget() {
        return budget;
    }

    public ArrayList<Activity> getActivities() {
        return activities;
    }

    public void printSummary() {
        System.out.println("Traveler: " + user.getName());
        System.out.println("Destination: " + destination.getName());
        System.out.println("Description: " + destination.getDescription());
        System.out.println("Days: " + days);
        System.out.println("Hotel: " + hotel);
        System.out.println("Budget: $" + budget);

        System.out.println("\nActivities:");
        if (activities.size() == 0) {
            System.out.println("No activities selected.");
        } else {
            for (int i = 0; i < activities.size(); i++) {
                System.out.println((i + 1) + ". " + activities.get(i));
            }
        }

        System.out.println("\nTravel Cost: $" + destination.getTravelCost());
        System.out.println("Hotel Cost: $" + hotel.getTotalHotelCost(days));
        System.out.println("Estimated Food Cost: $" + BudgetCalculator.calculateFoodCost(days));
        System.out.println("Activity Cost: $" + BudgetCalculator.calculateActivityCost(activities));
        System.out.println("Total Cost: $" + BudgetCalculator.calculateTotalCost(this));
        System.out.println("Money Left: $" + BudgetCalculator.calculateMoneyLeft(this));
        System.out.println(BudgetCalculator.getBudgetMessage(this));
    }
}
