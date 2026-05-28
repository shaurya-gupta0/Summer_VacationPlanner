public class ActivityMaker {
    public static Activity createActivity(int choice) {
        if (choice == 1) {
            return new Activity("Sightseeing Tour", 25, "Relaxing");
        } else if (choice == 2) {
            return new Activity("Restaurant Visit", 35, "Food");
        } else if (choice == 3) {
            return new Activity("Adventure Activity", 60, "Adventure");
        } else if (choice == 4) {
            return new Activity("Shopping", 45, "Fun");
        } else if (choice == 5) {
            return new Activity("Museum Visit", 20, "Educational");
        } else {
            return new Activity("Free Walk", 0, "Free");
        }
    }
}
