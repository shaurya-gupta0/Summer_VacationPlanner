public class DestinationMaker {
    public static Destination createDestination(int choice) {
        if (choice == 1) {
            return new Destination("Sunny Beach", "A relaxing beach vacation with water activities.", 300);
        } else if (choice == 2) {
            return new Destination("Metro City", "A city trip with food, museums, and sightseeing.", 250);
        } else if (choice == 3) {
            return new Destination("Rocky Mountains", "A peaceful mountain trip with hiking and nature.", 220);
        } else if (choice == 4) {
            return new Destination("Adventure Kingdom", "A fun theme park vacation with rides and shows.", 280);
        } else {
            return new Destination("Mystery Place", "A surprise vacation destination.", 200);
        }
    }
}
