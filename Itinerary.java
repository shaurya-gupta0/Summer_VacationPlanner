import java.util.ArrayList;

public class Itinerary {
    private Trip trip;
    private ArrayList<String> dailyPlans;

    public Itinerary(Trip trip) {
        this.trip = trip;
        dailyPlans = new ArrayList<String>();
        createItinerary();
    }

    private void createItinerary() {
        ArrayList<Activity> activities = trip.getActivities();

        for (int day = 1; day <= trip.getDays(); day++) {
            String plan = "Day " + day + ": ";

            if (activities.size() == 0) {
                plan += "Explore " + trip.getDestination().getName() + " and relax.";
            } else {
                int activityIndex = (day - 1) % activities.size();
                plan += activities.get(activityIndex).getName() + " at " + trip.getDestination().getName() + ".";
            }

            dailyPlans.add(plan);
        }
    }

    public ArrayList<String> getDailyPlans() {
        return dailyPlans;
    }

    public void printItinerary() {
        System.out.println("\n=================================");
        System.out.println("Itinerary");
        

        for (int i = 0; i < dailyPlans.size(); i++) {
            System.out.println(dailyPlans.get(i));
        }
    }
}
