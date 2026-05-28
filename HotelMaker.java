public class HotelMaker {
    public static Hotel createHotel(int choice) {
        if (choice == 1) {
            return new Hotel("Budget Hotel", 80);
        } else if (choice == 2) {
            return new Hotel("Regular Hotel", 140);
        } else if (choice == 3) {
            return new Hotel("Fancy Hotel", 230);
        } else {
            return new Hotel("Default Hotel", 100);
        }
    }
}
