import java.util.ArrayList;

public class BudgetCalculator {
    public static double calculateActivityCost(ArrayList<Activity> activities) {
        double total = 0;

        for (int i = 0; i < activities.size(); i++) {
            total += activities.get(i).getCost();
        }

        return total;
    }

    public static double calculateFoodCost(int days) {
        return days * 40;
    }

    public static double calculateTotalCost(Trip trip) {
        double travel = trip.getDestination().getTravelCost();
        double hotel = trip.getHotel().getTotalHotelCost(trip.getDays());
        double food = calculateFoodCost(trip.getDays());
        double activities = calculateActivityCost(trip.getActivities());

        return travel + hotel + food + activities;
    }

    public static double calculateMoneyLeft(Trip trip) {
        return trip.getBudget() - calculateTotalCost(trip);
    }

    public static String getBudgetMessage(Trip trip) {
        double moneyLeft = calculateMoneyLeft(trip);

        if (moneyLeft > 100) {
            return "You are under budget and still have a good amount left!";
        } else if (moneyLeft >= 0) {
            return "You are under budget, but close to the limit.";
        } else {
            return "You are over budget. You may want to remove an activity or pick a cheaper hotel.";
        }
    }
}
